//package com.example.restservice;
//
//import com.example.accessingdatarest.Tournament;
//
//import com.example.repos.TournamentRepo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.time.LocalTime;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//
//@CrossOrigin(origins = "http://localhost:3306")
//@RestController
//@RequestMapping("/api")
//
//public class TournamentController {
//    @Autowired
//    private TournamentRepo tournamentRepo;
//
//    @GetMapping("/Tournament")
//    public ResponseEntity<List<Tournament>> getAllTournamentsByTime(@RequestParam(required = false) LocalTime Start, LocalTime End) {
//        try{
//            List<Tournament> tournament = new ArrayList<Tournament>();
//            if(Start == null & End == null)
//                tournamentRepo.findAll().forEach(tournament::add);
//            else if (Start == null)
//                tournamentRepo.findByStart(Start).forEach(tournament::add);
//            else
//                tournamentRepo.findByEnd(End).forEach(tournament::add);
//            return new ResponseEntity<>(tournament, HttpStatus.OK);
//        }catch(Exception e){
//            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }
//
//    @GetMapping("/Tournament")
//    public ResponseEntity<List<Tournament>> getAllTournamentsByLocation(@RequestParam(required = false) String Location) {
//        try{
//            List<Tournament> tournament = new ArrayList<Tournament>();
//            if(Location == null)
//                tournamentRepo.findByLocation(Location).forEach(tournament::add);
//            return new ResponseEntity<>(tournament, HttpStatus.OK);
//        }catch(Exception e){
//            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }
//
//    @GetMapping("/Tournament")
//    public ResponseEntity<List<Tournament>> getAllTournamentsByFee(@RequestParam(required = false) double Fee) {
//        try{
//            List<Tournament> tournament = new ArrayList<Tournament>();
//            if(Fee == 0)
//                tournamentRepo.findByFee(Fee).forEach(tournament::add);
//            return new ResponseEntity<>(tournament, HttpStatus.OK);
//        }catch(Exception e){
//            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }
//
//    @GetMapping("/Tournament")
//    public ResponseEntity<List<Tournament>> getAllTournamentsByPrize(@RequestParam(required = false) double Prize) {
//        try{
//            List<Tournament> tournament = new ArrayList<Tournament>();
//            if(Prize == 0)
//                tournamentRepo.findByPrize(Prize).forEach(tournament::add);
//            return new ResponseEntity<>(tournament, HttpStatus.OK);
//        }catch(Exception e){
//            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }
//
//    @GetMapping("/Tournament")
//    public ResponseEntity<List<Tournament>> getAllTournamentsByMembers(@RequestParam(required = false) String Members) {
//        try{
//            List<Tournament> tournament = new ArrayList<Tournament>();
//            if(Members == null)
//                tournamentRepo.findByMembers(Members).forEach(tournament::add);
//            return new ResponseEntity<>(tournament, HttpStatus.OK);
//        }catch(Exception e){
//            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }
//
//    @GetMapping("/Tournament")
//    public ResponseEntity<List<Tournament>> getAllTournamentsByStandings(@RequestParam(required = false) String Standings) {
//        try{
//            List<Tournament> tournament = new ArrayList<Tournament>();
//            if(Standings == null)
//                tournamentRepo.findByStandings(Standings).forEach(tournament::add);
//            return new ResponseEntity<>(tournament, HttpStatus.OK);
//        }catch(Exception e){
//            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }
//
//    @PostMapping ("/Tournament")
//    public ResponseEntity<Tournament> postTournament(@RequestBody Tournament tournament) {
//        try{
//            Tournament tournament1 = (Tournament) tournamentRepo
//                    .save(new Tournament(tournament.getStart(), tournament.getEnd(), tournament.getLocation(), tournament.getFee(),
//                            tournament.getPrize(), tournament.getMembers(), tournament.getStandings()));
//            return new ResponseEntity<>(tournament1, HttpStatus.CREATED);
//        } catch (Exception e) {
//            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }
//
//    @PutMapping("/Tournament/{id}")
//    public ResponseEntity<Tournament> updatedMembership(@PathVariable("id") long id, @RequestBody Tournament tournament) {
//        Optional<Tournament> tournamentInfo = tournamentRepo.findById(id);
//        if (tournamentInfo.isPresent()) {
//            Tournament tournament1 = tournamentInfo.get();
//            tournament1.setStart(tournament1.getStart());
//            tournament1.setEnd(tournament1.getEnd());
//            tournament1.setLocation(tournament1.getLocation());
//            tournament1.setFee(tournament1.getFee());
//            tournament1.setPrize(tournament1.getPrize());
//            tournament1.setMembers(tournament1.getMembers());
//            tournament1.setStandings(tournament1.getStandings());
//            return new ResponseEntity<>(tournamentRepo.save(tournament1), HttpStatus.OK);
//        } else {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//    }
//    @DeleteMapping("/Tournament/{id}")
//    public ResponseEntity<Tournament> deletedTournament(@PathVariable("id") long id){
//        try{
//            tournamentRepo.deleteById(id);
//            return new ResponseEntity<>(HttpStatus.OK);
//        }catch(Exception e){
//            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }
//}