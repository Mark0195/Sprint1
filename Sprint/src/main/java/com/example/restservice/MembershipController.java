//package com.example.restservice;
//
//import com.example.accessingdatarest.Membership;
//import com.example.repos.MembershipRepo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.*;
//import java.time.LocalDate;
//
//@CrossOrigin(origins = "http://localhost:3306")
//@RestController
//@RequestMapping("/api")
//public class MembershipController {
//    @Autowired
//    private MembershipRepo membershipRepo;
//
//
//    @GetMapping("/Membership")
//    public ResponseEntity<List<Membership>> getAllByStartDate(@RequestParam(required = false) LocalDate StartDate) {
//        try{
//            List<Membership> membership = new ArrayList<Membership>();
//            if(StartDate == null)
//                membershipRepo.findByStartDate(StartDate).forEach(membership::add);
//            return new ResponseEntity<>(membership, HttpStatus.OK);
//        }catch(Exception e){
//            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }
//
//    @GetMapping("/Membership")
//    public ResponseEntity<List<Membership>> getAllByDuration(@RequestParam(required = false) LocalDate Duration) {
//        try{
//            List<Membership> membership = new ArrayList<Membership>();
//            if(Duration == null)
//                membershipRepo.findByDuration(Duration).forEach(membership::add);
//            return new ResponseEntity<>(membership, HttpStatus.OK);
//        }catch(Exception e){
//            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }
//
//    @GetMapping("/Membership")
//    public ResponseEntity<List<Membership>> getAllMembershipsByMembershipType(@RequestParam(required = false) String MembershipType) {
//        try{
//            List<Membership> membership = new ArrayList<Membership>();
//            if(MembershipType == null)
//                membershipRepo.findByMembershipType(MembershipType).forEach(membership::add);
//            return new ResponseEntity<>(membership, HttpStatus.OK);
//        }catch(Exception e){
//            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }
//
//    @GetMapping("/Membership")
//    public ResponseEntity<List<Membership>> getAllByTournaments(@RequestParam(required = false) String CurrentTournaments, String PastTournaments) {
//        try{
//            List<Membership> membership = new ArrayList<Membership>();
//            if(CurrentTournaments == null & PastTournaments == null)
//                membershipRepo.findAll().forEach(membership::add);
//            else if(CurrentTournaments == null)
//                membershipRepo.findByCurrentTournaments(CurrentTournaments).forEach(membership::add);
//            else
//                membershipRepo.findByPastTournaments(PastTournaments).forEach(membership::add);
//            return new ResponseEntity<>(membership, HttpStatus.OK);
//        }catch(Exception e){
//            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }
//
//    @GetMapping("/Membership")
//    public ResponseEntity<List<Membership>> getAllByUpcomingTournaments(@RequestParam(required = false) String UpcomingTournaments) {
//        try{
//            List<Membership> membership = new ArrayList<Membership>();
//            if(UpcomingTournaments == null)
//                membershipRepo.findByUpcomingTournaments(UpcomingTournaments).forEach(membership::add);
//            return new ResponseEntity<>(membership, HttpStatus.OK);
//        }catch(Exception e){
//            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }
//
//    @PostMapping("/Membership")
//    public ResponseEntity<Membership> postMembership(@RequestBody Membership membership) {
//        try {
//            Membership membership1 = (Membership) membershipRepo
//                    .save(new Membership (membership.getStartDate(), membership.getDuration(), membership.getMembershipType(), membership.getPastTournaments(),
//                            membership.getCurrentTournaments(), membership.getUpcomingTournaments()));
//            return new ResponseEntity<>(membership1, HttpStatus.CREATED);
//        } catch (Exception e) {
//            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }
//
//    @PutMapping("/Membership/{id}")
//    public ResponseEntity<Membership> updatedMembership(@PathVariable("id") long id, @RequestBody Membership membership) {
//        Optional<Membership> membershipInfo = membershipRepo.findById(id);
//        if (membershipInfo.isPresent()) {
//            Membership membership1 = membershipInfo.get();
//            membership1.setStartDate(membership.getStartDate());
//            membership1.setDuration(membership.getDuration());
//            membership1.setMembershipType(membership.getMembershipType());
//            membership1.setCurrentTournaments(membership.getCurrentTournaments());
//            membership1.setPastTournaments(membership.getPastTournaments());
//            membership1.setUpcomingTournaments(membership.getUpcomingTournaments());
//            return new ResponseEntity<>(membershipRepo.save(membership1), HttpStatus.OK);
//        } else {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//    }
//    @DeleteMapping("/Membership/{id}")
//    public ResponseEntity<Membership> deletedMembership(@PathVariable("id") long id){
//        try{
//            membershipRepo.deleteById(id);
//            return new ResponseEntity<>(HttpStatus.OK);
//        }catch(Exception e){
//            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }
//
//}