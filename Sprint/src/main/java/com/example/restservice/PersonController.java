//package com.example.restservice;
//
//
//import com.example.accessingdatarest.Person;
//import com.example.repos.PersonRepo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//
//@CrossOrigin(origins = "http://localhost:3306")
//@RestController
//@RequestMapping("/api")
//public class PersonController {
//    @Autowired
//    PersonRepo personRepo;
//
//    @GetMapping("/Person")
//    public ResponseEntity<List<Person>> getAllByFirstName(@RequestParam(required = false) String name) {
//        try{
//            List<Person> person = new ArrayList<Person>();
//            if(name == null)
//                personRepo.findByFirstName(name).forEach(person::add);
//            return new ResponseEntity<>(person, HttpStatus.OK);
//        }catch(Exception e){
//            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }
//
//    @GetMapping("/Person")
//    public ResponseEntity<List<Person>> getAllByLastName(@RequestParam(required = false) String name) {
//        try{
//            List<Person> person = new ArrayList<Person>();
//            if(name == null)
//                personRepo.findByLastName(name).forEach(person::add);
//            return new ResponseEntity<>(person, HttpStatus.OK);
//        }catch(Exception e){
//            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }
//
//    @GetMapping("/Person")
//    public ResponseEntity<List<Person>> getAllByAddress(@RequestParam(required = false) String address) {
//        try{
//            List<Person> person = new ArrayList<Person>();
//            if(address == null)
//                personRepo.findByAddress(address).forEach(person::add);
//            return new ResponseEntity<>(person, HttpStatus.OK);
//        }catch(Exception e){
//            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }
//
//    @GetMapping("/Person")
//    public ResponseEntity<List<Person>> getAllByEmail(@RequestParam(required = false) String email) {
//        try{
//            List<Person> person = new ArrayList<Person>();
//            if(email == null)
//                personRepo.findByEmail(email).forEach(person::add);
//            return new ResponseEntity<>(person, HttpStatus.OK);
//        }catch(Exception e){
//            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }
//
//    @GetMapping("/Person")
//    public ResponseEntity<List<Person>> getAllByPhoneNum(@RequestParam(required = false) int phoneNum) {
//        try{
//            List<Person> person = new ArrayList<Person>();
//            if(phoneNum == 0)
//                personRepo.findByPhoneNum(phoneNum).forEach(person::add);
//            return new ResponseEntity<>(person, HttpStatus.OK);
//        }catch(Exception e){
//            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }
//
//    @PostMapping("/Person")
//    public ResponseEntity<Person> postPerson(@RequestBody Person person) {
//        try {
//            Person person1 = (Person) personRepo
//                    .save(new Person(person.getFirstName(),person.getLastName(), person.getAddress(), person.getEmail(), person.getPhoneNumber()));
//            return new ResponseEntity<>(person1, HttpStatus.CREATED);
//        } catch (Exception e) {
//            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }
//    @PutMapping("/Person/{id}")
//    public ResponseEntity<Person> updatedPerson(@PathVariable("id") long id, @RequestBody Person person ) {
//        Optional<Person> personInfo = personRepo.findById(id);
//        if (personInfo.isPresent()) {
//            Person membership1 = personInfo.get();
//            membership1.setFirstName(person.getFirstName());
//            membership1.setLastName(person.getLastName());
//            membership1.setAddress(person.getAddress());
//            membership1.setEmail(person.getEmail());
//            membership1.setPhoneNumber(person.getPhoneNumber());
//            return new ResponseEntity<>(personRepo.save(membership1), HttpStatus.OK);
//        } else {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//    }
//
//    @DeleteMapping("/Person/{id}")
//    public ResponseEntity<Person> deletedPerson(@PathVariable("id") long id){
//        try{
//            personRepo.deleteById(id);
//            return new ResponseEntity<>(HttpStatus.OK);
//        }catch(Exception e){
//            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }
//}