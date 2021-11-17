package com.example.restservice;

import com.example.accessingdatarest.Membership;
import com.example.repos.MembershipRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

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

    @PostMapping("/people")
    public ResponseEntity<Membership> postMembership(@RequestBody Membership membership) {
        try {
            Membership _Membership = MembershipRepo
                    .save(new Membership(membership.getFirstName(), membership.getLastName(), membership.getEmail(), membership.getPhoneNumber()));
            return new ResponseEntity<>(_membership, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}