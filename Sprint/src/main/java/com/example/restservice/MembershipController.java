package com.example.restservice;

import com.example.accessingdatarest.Membership;
import com.example.repos.MembershipRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.time.LocalDate;

@CrossOrigin(origins = "http://localhost:3306")
@RestController
@RequestMapping("/api")
public class MembershipController {
    @Autowired
    private MembershipRepo membershipRepo;

    @GetMapping("/Membership")
    public ResponseEntity<List<Membership>> getAllMembershipsByName(@RequestParam(required = false) String FirstName, String LastName) {
        try {
            List<Membership> Membership = new ArrayList<Membership>();
            if (LastName == null && FirstName == null)
                membershipRepo.findAll().forEach(Membership::add);
            else if (LastName == null)
                membershipRepo.findByMembershipFirstName(FirstName).forEach(Membership::add);
            else
                membershipRepo.findByMembershipLastName(LastName).forEach(Membership::add);

            if (Membership.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }

            return new ResponseEntity<>(Membership, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/Membership")
    public ResponseEntity<List<Membership>> getAllMembershipsByAddress(@RequestParam(required = false) String Address) {
        try{
            List<Membership> Membership = new ArrayList<Membership>();
            if(Address == null)
                membershipRepo.findByMembershipAddress(Address).forEach(Membership::add);
            return new ResponseEntity<>(Membership, HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/Membership")
    public ResponseEntity<List<Membership>> getAllMembershipsByEmail(@RequestParam(required = false) String Email) {
        try{
            List<Membership> Membership = new ArrayList<Membership>();
            if(Email == null)
                membershipRepo.findByMembershipEmail(Email).forEach(Membership::add);
            return new ResponseEntity<>(Membership, HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/Membership")
    public ResponseEntity<List<Membership>> getAllMembershipsByPhoneNumber(@RequestParam(required = false) int PhoneNumber) {
        try{
            List<Membership> Membership = new ArrayList<Membership>();
            if(PhoneNumber == 0)
                membershipRepo.findByMembershipPhoneNum(PhoneNumber).forEach(Membership::add);
            return new ResponseEntity<>(Membership, HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/Membership")
    public ResponseEntity<List<Membership>> getAllMembershipsByStartDate(@RequestParam(required = false) LocalDate StartDate) {
        try{
            List<Membership> Membership = new ArrayList<Membership>();
            if(StartDate == null)
                membershipRepo.findByMembershipStartDate(StartDate).forEach(Membership::add);
            return new ResponseEntity<>(Membership, HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/Membership")
    public ResponseEntity<List<Membership>> getAllMembershipsByDuration(@RequestParam(required = false) LocalDate Duration) {
        try{
            List<Membership> Membership = new ArrayList<Membership>();
            if(Duration == null)
                membershipRepo.findByMembershipDuration(Duration).forEach(Membership::add);
            return new ResponseEntity<>(Membership, HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/Membership")
    public ResponseEntity<List<Membership>> getAllMembershipsByMembershipType(@RequestParam(required = false) String MembershipType) {
        try{
            List<Membership> Membership = new ArrayList<Membership>();
            if(MembershipType == null)
                membershipRepo.findByMembership(MembershipType).forEach(Membership::add);
            return new ResponseEntity<>(Membership, HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/Membership")
    public ResponseEntity<List<Membership>> getAllMembershipsByTournaments(@RequestParam(required = false) String CurrentTournaments, String PastTournaments) {
        try{
            List<Membership> Membership = new ArrayList<Membership>();
            if(CurrentTournaments == null & PastTournaments == null)
                membershipRepo.findAll().forEach(Membership::add);
            else if(CurrentTournaments == null)
                membershipRepo.findByMembershipCurrentTournaments(CurrentTournaments).forEach(Membership::add);
            else
                membershipRepo.findByMembershipPastTournaments(PastTournaments).forEach(Membership::add);
            return new ResponseEntity<>(Membership, HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/Membership")
    public ResponseEntity<List<Membership>> getAllMembershipsByUpcomingTournaments(@RequestParam(required = false) String UpcomingTournaments) {
        try{
            List<Membership> Membership = new ArrayList<Membership>();
            if(UpcomingTournaments == null)
                membershipRepo.findByMembershipUpcomingTournaments(UpcomingTournaments).forEach(Membership::add);
            return new ResponseEntity<>(Membership, HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/Membership")
    public ResponseEntity<Membership> postMembership(@RequestBody Membership membership) {
        try {
            Membership membership1 = (Membership) membershipRepo
                    .save(new Membership(membership.getFirstName(),membership.getLastName(), membership.getAddress(), membership.getEmail(), membership.getPhoneNumber(),
                            membership.getStartDate(), membership.getDuration(), membership.getMembership(), membership.getPastTournaments(),
                            membership.getCurrentTournaments(), membership.getUpcomingTournaments()));
            return new ResponseEntity<>(membership1, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/Membership/{id}")
    public ResponseEntity<Membership> updatedMembership(@PathVariable("id") long id, @RequestBody Membership membership) {
        Optional<Membership> membershipInfo = membershipRepo.findById(id);
        if (membershipInfo.isPresent()) {
            Membership membership1 = membershipInfo.get();
            membership1.setFirstName(membership.getFirstName());
            membership1.setLastName(membership.getLastName());
            membership1.setAddress(membership.getAddress());
            membership1.setEmail(membership.getEmail());
            membership1.setPhoneNumber(membership.getPhoneNumber());
            membership1.setStartDate(membership.getStartDate());
            membership1.setDuration(membership.getDuration());
            membership1.setMembership(membership.getMembership());
            membership1.setCurrentTournaments(membership.getCurrentTournaments());
            membership1.setPastTournaments(membership.getPastTournaments());
            membership1.setUpcomingTournaments(membership.getUpcomingTournaments());
            return new ResponseEntity<>(membershipRepo.save(membership1), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/Membership/{id}")
    public ResponseEntity<Membership> deletedMembership(@PathVariable("id") long id){
        try{
            membershipRepo.deleteById(id);
            return new ResponseEntity<>(HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}