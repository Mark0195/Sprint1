package com.example.demo;


import com.example.accessingdatarest.Membership;
import com.example.accessingdatarest.Person;
import com.example.accessingdatarest.Tournament;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    @Test
    void testConstructorPerson() {
        Person actualPerson = new Person();
        actualPerson.setAddress("12 Trails End");
        actualPerson.setEmail("jane.doe@example.org");
        actualPerson.setFirstName("Jane");
        actualPerson.setId(645L);
        actualPerson.setLastName("Doe");
        actualPerson.setPhoneNumber(555-5555);
        assertEquals("12 Trails End", actualPerson.getAddress());
        assertEquals("jane.doe@example.org", actualPerson.getEmail());
        assertEquals("Jane", actualPerson.getFirstName());
        assertEquals(645L, actualPerson.getId());
        assertEquals("Doe", actualPerson.getLastName());
        assertEquals(555-5555, actualPerson.getPhoneNumber());
    }

    @Test
    void testConstructorMembership() {
        Membership actualMembership = new Membership();
        actualMembership.setCurrentTournaments("Champion Of Golf");
        LocalDate ofEpochDayResult = LocalDate.ofEpochDay(1L);
        actualMembership.setDuration(ofEpochDayResult);
        actualMembership.setId(897L);
        actualMembership.setMembershipType("Rookie");
        actualMembership.setPastTournaments("Lesser Champion Of Golf");
        LocalDate ofEpochDayResult1 = LocalDate.ofEpochDay(1L);
        actualMembership.setStartDate(ofEpochDayResult1);
        actualMembership.setUpcomingTournaments("Super Duper Champion Of Golf");
        assertEquals("Champion Of Golf", actualMembership.getCurrentTournaments());
        assertSame(ofEpochDayResult, actualMembership.getDuration());
        assertEquals(897L, actualMembership.getId());
        assertEquals("Rookie", actualMembership.getMembershipType());
        assertEquals("Lesser Champion Of Golf", actualMembership.getPastTournaments());
        assertSame(ofEpochDayResult1, actualMembership.getStartDate());
        assertEquals("Super Duper Champion Of Golf", actualMembership.getUpcomingTournaments());
    }

    @Test
    void testConstructorTournament() {
        Tournament actualTournament = new Tournament();
        LocalTime ofResult = LocalTime.of(5, 15);
        actualTournament.setEnd(ofResult);
        actualTournament.setFee(15.0);
        actualTournament.setId(888L);
        actualTournament.setLocation("Marystown");
        actualTournament.setMembers("Carl, Pete, Mark");
        actualTournament.setPrize(50.0);
        actualTournament.setStandings("Mark, Carl, Pete");
        LocalTime ofResult1 = LocalTime.of(5, 15);
        actualTournament.setStart(ofResult1);
        assertSame(ofResult, actualTournament.getEnd());
        assertEquals(15.0, actualTournament.getFee());
        assertEquals(888L, actualTournament.getId());
        assertEquals("Marystown", actualTournament.getLocation());
        assertEquals("Carl, Pete, Mark", actualTournament.getMembers());
        assertEquals(50.0, actualTournament.getPrize());
        assertEquals("Mark, Carl, Pete", actualTournament.getStandings());
        assertSame(ofResult1, actualTournament.getStart());
    }

    @Test
    void testConstructorTournamentFailTest() {
        Tournament actualTournament = new Tournament();
        LocalTime ofResult = LocalTime.of(5, 15);
        actualTournament.setEnd(ofResult);
        actualTournament.setFee(15.0);
        actualTournament.setId(888L);
        actualTournament.setLocation("Marystown");
        actualTournament.setMembers("Carl, Pete, Mark");
        actualTournament.setPrize(50.0);
        actualTournament.setStandings("Mark, Carl, Pete");
        LocalTime ofResult1 = LocalTime.of(3, 10);
        actualTournament.setStart(ofResult1);
        assertSame(ofResult, actualTournament.getEnd());
        assertNotEquals(13.0, actualTournament.getFee());
        assertNotEquals(828L, actualTournament.getId());
        assertNotEquals("Corbin", actualTournament.getLocation());
        assertNotEquals("Steve, Bart, Peach", actualTournament.getMembers());
        assertNotEquals(58.0, actualTournament.getPrize());
        assertNotEquals("Bob, John, Cliff", actualTournament.getStandings());
        assertSame(ofResult1, actualTournament.getStart());
    }
}
