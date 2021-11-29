package com.example.demo;


import com.example.accessingdatarest.*;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    @Test
    void testConstructorPerson() {
        Person actualPerson = new Person();
        actualPerson.setAddress("12 Trails End");
        actualPerson.setEmail("hammertime@askjeeves.com");
        actualPerson.setFirstName("MC");
        actualPerson.setId(3);
        actualPerson.setLastName("Hammer");
        actualPerson.setPhoneNumber(555 - 5555);
        assertEquals("12 Trails End", actualPerson.getAddress());
        assertEquals("hammertime@askjeeves.com", actualPerson.getEmail());
        assertEquals("MC", actualPerson.getFirstName());
        assertEquals(3, actualPerson.getId());
        assertEquals("Hammer", actualPerson.getLastName());
        assertEquals(555 - 5555, actualPerson.getPhoneNumber());
    }

    @Test
    void testConstructorMembership() {
        Membership actualMembership = new Membership();
        Tournament tournament = new Tournament();
        tournament.setLocation("Location");
        tournament.setStandings("Standings");
        tournament.setId(123L);
        tournament.setEnd(LocalDate.ofEpochDay(1L));
        tournament.setMembers("Members");
        tournament.setFee(10.0);
        tournament.setPrize(10.0);
        tournament.setStart(LocalDate.ofEpochDay(1L));
        CurrentTournament currentTournament = new CurrentTournament();
        currentTournament.setCurrentTournamentDate(LocalDate.ofEpochDay(1L));
        currentTournament.setTournament(tournament);
        currentTournament.setId(123L);
        actualMembership.setCurrentTournament(currentTournament);
        LocalDate ofEpochDayResult = LocalDate.ofEpochDay(1L);
        actualMembership.setDuration(ofEpochDayResult);
        actualMembership.setId(123L);
        Membership membership = new Membership();
        membership.setStartDate(LocalDate.ofEpochDay(1L));
        membership.setMembershipType(new MembershipType());
        membership.setId(123L);
        membership.setDuration(LocalDate.ofEpochDay(1L));
        membership.setUpcomingTournament(new UpcomingTournament());
        membership.setPerson(new Person());
        membership.setPastTournament(new PastTournament());
        membership.setCurrentTournament(new CurrentTournament());
        MembershipType membershipType = new MembershipType();
        membershipType.setMember(membership);
        membershipType.setId(123L);
        membershipType.setFamilyPlan("Family Plan");
        membershipType.setType("Type");
        Tournament tournament1 = new Tournament();
        tournament1.setLocation("Location");
        tournament1.setStandings("Standings");
        tournament1.setId(123L);
        tournament1.setEnd(LocalDate.ofEpochDay(1L));
        tournament1.setMembers("Members");
        tournament1.setFee(10.0);
        tournament1.setPrize(10.0);
        tournament1.setStart(LocalDate.ofEpochDay(1L));
        UpcomingTournament upcomingTournament = new UpcomingTournament();
        upcomingTournament.setTournament(tournament1);
        upcomingTournament.setUpcomingTournamentDate(LocalDate.ofEpochDay(1L));
        upcomingTournament.setId(123L);
        Person person = new Person();
        person.setLastName("Doe");
        person.setEmail("jane.doe@example.org");
        person.setId(123L);
        person.setPhoneNumber(10);
        person.setAddress("42 Main St");
        person.setFirstName("Jane");
        Tournament tournament2 = new Tournament();
        tournament2.setLocation("Location");
        tournament2.setStandings("Standings");
        tournament2.setId(123L);
        tournament2.setEnd(LocalDate.ofEpochDay(1L));
        tournament2.setMembers("Members");
        tournament2.setFee(10.0);
        tournament2.setPrize(10.0);
        tournament2.setStart(LocalDate.ofEpochDay(1L));
        PastTournament pastTournament = new PastTournament();
        pastTournament.setTournament(tournament2);
        pastTournament.setId(123L);
        pastTournament.setPastTournamentDate(LocalDate.ofEpochDay(1L));
        Tournament tournament3 = new Tournament();
        tournament3.setLocation("Location");
        tournament3.setStandings("Standings");
        tournament3.setId(123L);
        tournament3.setEnd(LocalDate.ofEpochDay(1L));
        tournament3.setMembers("Members");
        tournament3.setFee(10.0);
        tournament3.setPrize(10.0);
        tournament3.setStart(LocalDate.ofEpochDay(1L));
        CurrentTournament currentTournament1 = new CurrentTournament();
        currentTournament1.setCurrentTournamentDate(LocalDate.ofEpochDay(1L));
        currentTournament1.setTournament(tournament3);
        currentTournament1.setId(123L);
        Membership membership1 = new Membership();
        LocalDate ofEpochDayResult1 = LocalDate.ofEpochDay(1L);
        membership1.setStartDate(ofEpochDayResult1);
        membership1.setMembershipType(membershipType);
        membership1.setId(123L);
        LocalDate ofEpochDayResult2 = LocalDate.ofEpochDay(1L);
        membership1.setDuration(ofEpochDayResult2);
        membership1.setUpcomingTournament(upcomingTournament);
        membership1.setPerson(person);
        membership1.setPastTournament(pastTournament);
        membership1.setCurrentTournament(currentTournament1);
        MembershipType membershipType1 = new MembershipType();
        membershipType1.setMember(membership1);
        membershipType1.setId(123L);
        membershipType1.setFamilyPlan("Family Plan");
        membershipType1.setType("Type");
        actualMembership.setMembershipType(membershipType1);
        Tournament tournament4 = new Tournament();
        tournament4.setLocation("Location");
        tournament4.setStandings("Standings");
        tournament4.setId(123L);
        tournament4.setEnd(LocalDate.ofEpochDay(1L));
        tournament4.setMembers("Members");
        tournament4.setFee(10.0);
        tournament4.setPrize(10.0);
        tournament4.setStart(LocalDate.ofEpochDay(1L));
        PastTournament pastTournament1 = new PastTournament();
        pastTournament1.setTournament(tournament4);
        pastTournament1.setId(123L);
        pastTournament1.setPastTournamentDate(LocalDate.ofEpochDay(1L));
        actualMembership.setPastTournament(pastTournament1);
        Person person1 = new Person();
        person1.setLastName("Doe");
        person1.setEmail("jane.doe@example.org");
        person1.setId(123L);
        person1.setPhoneNumber(10);
        person1.setAddress("42 Main St");
        person1.setFirstName("Jane");
        actualMembership.setPerson(person1);
        LocalDate ofEpochDayResult3 = LocalDate.ofEpochDay(1L);
        actualMembership.setStartDate(ofEpochDayResult3);
        Tournament tournament5 = new Tournament();
        tournament5.setLocation("Location");
        tournament5.setStandings("Standings");
        tournament5.setId(123L);
        tournament5.setEnd(LocalDate.ofEpochDay(1L));
        tournament5.setMembers("Members");
        tournament5.setFee(10.0);
        tournament5.setPrize(10.0);
        tournament5.setStart(LocalDate.ofEpochDay(1L));
        UpcomingTournament upcomingTournament1 = new UpcomingTournament();
        upcomingTournament1.setTournament(tournament5);
        upcomingTournament1.setUpcomingTournamentDate(LocalDate.ofEpochDay(1L));
        upcomingTournament1.setId(123L);
        actualMembership.setUpcomingTournament(upcomingTournament1);
        assertSame(currentTournament, actualMembership.getCurrentTournament());
        MembershipType membershipType2 = actualMembership.getMembershipType();
        Membership member = membershipType2.getMember();
        assertSame(currentTournament1, member.getCurrentTournament());
        assertSame(ofEpochDayResult, actualMembership.getDuration());
        assertSame(ofEpochDayResult2, member.getDuration());
        assertEquals(123L, actualMembership.getId());
        assertEquals(123L, member.getId());
        assertSame(membershipType1, membershipType2);
        assertSame(membershipType, member.getMembershipType());
        assertSame(pastTournament1, actualMembership.getPastTournament());
        assertSame(pastTournament, member.getPastTournament());
        assertSame(person1, actualMembership.getPerson());
        assertSame(person, member.getPerson());
        assertSame(ofEpochDayResult3, actualMembership.getStartDate());
        assertSame(ofEpochDayResult1, member.getStartDate());
        assertSame(upcomingTournament1, actualMembership.getUpcomingTournament());
        assertSame(upcomingTournament, member.getUpcomingTournament());
    }

    @Test
    void testConstructorMembershipType() {
        MembershipType actualMembershipType = new MembershipType();
        actualMembershipType.setFamilyPlan("Family Plan");
        actualMembershipType.setId(123L);
        MembershipType membershipType = new MembershipType();
        membershipType.setMember(new Membership());
        membershipType.setId(123L);
        membershipType.setFamilyPlan("Family Plan");
        membershipType.setType("Type");
        UpcomingTournament upcomingTournament = new UpcomingTournament();
        upcomingTournament.setTournament(new Tournament());
        upcomingTournament.setUpcomingTournamentDate(LocalDate.ofEpochDay(1L));
        upcomingTournament.setId(123L);
        Person person = new Person();
        person.setLastName("Doe");
        person.setEmail("jane.doe@example.org");
        person.setId(123L);
        person.setPhoneNumber(10);
        person.setAddress("42 Main St");
        person.setFirstName("Jane");
        PastTournament pastTournament = new PastTournament();
        pastTournament.setTournament(new Tournament());
        pastTournament.setId(123L);
        pastTournament.setPastTournamentDate(LocalDate.ofEpochDay(1L));
        CurrentTournament currentTournament = new CurrentTournament();
        currentTournament.setCurrentTournamentDate(LocalDate.ofEpochDay(1L));
        currentTournament.setTournament(new Tournament());
        currentTournament.setId(123L);
        Membership membership = new Membership();
        membership.setStartDate(LocalDate.ofEpochDay(1L));
        membership.setMembershipType(membershipType);
        membership.setId(123L);
        membership.setDuration(LocalDate.ofEpochDay(1L));
        membership.setUpcomingTournament(upcomingTournament);
        membership.setPerson(person);
        membership.setPastTournament(pastTournament);
        membership.setCurrentTournament(currentTournament);
        MembershipType membershipType1 = new MembershipType();
        membershipType1.setMember(membership);
        membershipType1.setId(123L);
        membershipType1.setFamilyPlan("Family Plan");
        membershipType1.setType("Type");
        Tournament tournament = new Tournament();
        tournament.setLocation("Location");
        tournament.setStandings("Standings");
        tournament.setId(123L);
        tournament.setEnd(LocalDate.ofEpochDay(1L));
        tournament.setMembers("Members");
        tournament.setFee(10.0);
        tournament.setPrize(10.0);
        tournament.setStart(LocalDate.ofEpochDay(1L));
        UpcomingTournament upcomingTournament1 = new UpcomingTournament();
        upcomingTournament1.setTournament(tournament);
        upcomingTournament1.setUpcomingTournamentDate(LocalDate.ofEpochDay(1L));
        upcomingTournament1.setId(123L);
        Person person1 = new Person();
        person1.setLastName("Doe");
        person1.setEmail("jane.doe@example.org");
        person1.setId(123L);
        person1.setPhoneNumber(10);
        person1.setAddress("42 Main St");
        person1.setFirstName("Jane");
        Tournament tournament1 = new Tournament();
        tournament1.setLocation("Location");
        tournament1.setStandings("Standings");
        tournament1.setId(123L);
        tournament1.setEnd(LocalDate.ofEpochDay(1L));
        tournament1.setMembers("Members");
        tournament1.setFee(10.0);
        tournament1.setPrize(10.0);
        tournament1.setStart(LocalDate.ofEpochDay(1L));
        PastTournament pastTournament1 = new PastTournament();
        pastTournament1.setTournament(tournament1);
        pastTournament1.setId(123L);
        pastTournament1.setPastTournamentDate(LocalDate.ofEpochDay(1L));
        Tournament tournament2 = new Tournament();
        tournament2.setLocation("Location");
        tournament2.setStandings("Standings");
        tournament2.setId(123L);
        tournament2.setEnd(LocalDate.ofEpochDay(1L));
        tournament2.setMembers("Members");
        tournament2.setFee(10.0);
        tournament2.setPrize(10.0);
        tournament2.setStart(LocalDate.ofEpochDay(1L));
        CurrentTournament currentTournament1 = new CurrentTournament();
        currentTournament1.setCurrentTournamentDate(LocalDate.ofEpochDay(1L));
        currentTournament1.setTournament(tournament2);
        currentTournament1.setId(123L);
        Membership membership1 = new Membership();
        membership1.setStartDate(LocalDate.ofEpochDay(1L));
        membership1.setMembershipType(membershipType1);
        membership1.setId(123L);
        membership1.setDuration(LocalDate.ofEpochDay(1L));
        membership1.setUpcomingTournament(upcomingTournament1);
        membership1.setPerson(person1);
        membership1.setPastTournament(pastTournament1);
        membership1.setCurrentTournament(currentTournament1);
        actualMembershipType.setMember(membership1);
        actualMembershipType.setType("Type");
        assertEquals("Family Plan", actualMembershipType.getFamilyPlan());
        Membership member = actualMembershipType.getMember();
        MembershipType membershipType2 = member.getMembershipType();
        assertEquals("Family Plan", membershipType2.getFamilyPlan());
        assertEquals(123L, actualMembershipType.getId());
        assertEquals(123L, membershipType2.getId());
        assertSame(membership1, member);
        assertSame(membership, membershipType2.getMember());
        assertEquals("Type", actualMembershipType.getType());
        assertEquals("Type", membershipType2.getType());
    }

    @Test
    void testConstructorTournament() {
        Tournament actualTournament = new Tournament();
        LocalDate ofEpochDayResult = LocalDate.ofEpochDay(1L);
        actualTournament.setEnd(ofEpochDayResult);
        actualTournament.setFee(10.0);
        actualTournament.setId(5);
        actualTournament.setLocation("Arizona Applejack");
        actualTournament.setMembers("Frank, Ron, Larry, Moe");
        actualTournament.setPrize(100.0);
        actualTournament.setStandings("1.Ron, 2.Larry, 3.Frank, 4.Moe");
        LocalDate ofEpochDayResult1 = LocalDate.ofEpochDay(1L);
        actualTournament.setStart(ofEpochDayResult1);
        assertSame(ofEpochDayResult, actualTournament.getEnd());
        assertEquals(10.0, actualTournament.getFee());
        assertEquals(5, actualTournament.getId());
        assertEquals("Arizona Applejack", actualTournament.getLocation());
        assertEquals("Frank, Ron, Larry, Moe", actualTournament.getMembers());
        assertEquals(100.0, actualTournament.getPrize());
        assertEquals("1.Ron, 2.Larry, 3.Frank, 4.Moe", actualTournament.getStandings());
        assertSame(ofEpochDayResult1, actualTournament.getStart());
    }

    @Test
    void testConstructorPast() {
        PastTournament actualPastTournament = new PastTournament();
        actualPastTournament.setId(4);
        LocalDate ofEpochDayResult = LocalDate.ofEpochDay(1L);
        actualPastTournament.setPastTournamentDate(ofEpochDayResult);
        Tournament tournament = new Tournament();
        tournament.setLocation("Ron Burgundy Open");
        tournament.setStandings("1.Stuart, 2.Beatrice, 3.Will, 4.Steve");
        tournament.setId(4);
        tournament.setEnd(LocalDate.ofEpochDay(1L));
        tournament.setMembers("Beatrice, Stuart, Steve, Will");
        tournament.setFee(50.0);
        tournament.setPrize(1000.0);
        tournament.setStart(LocalDate.ofEpochDay(1L));
        actualPastTournament.setTournament(tournament);
        assertEquals(4, actualPastTournament.getId());
        assertSame(ofEpochDayResult, actualPastTournament.getPastTournamentDate());
        assertSame(tournament, actualPastTournament.getTournament());
    }

    @Test
    public void testConstructorCurrent() {
        CurrentTournament actualCurrentTournament = new CurrentTournament();
        LocalDate ofEpochDayResult = LocalDate.ofEpochDay(1L);
        actualCurrentTournament.setCurrentTournamentDate(ofEpochDayResult);
        actualCurrentTournament.setId(6);
        Tournament tournament = new Tournament();
        tournament.setLocation("BlimBlam Championship");
        tournament.setStandings("1.Paul, 2.Blart, 3.Dan, 4.Darryl");
        tournament.setId(6);
        tournament.setEnd(LocalDate.ofEpochDay(1L));
        tournament.setMembers("Dan, Paul, Blart, Darryl");
        tournament.setFee(25.0);
        tournament.setPrize(1000000.0);
        tournament.setStart(LocalDate.ofEpochDay(1L));
        actualCurrentTournament.setTournament(tournament);
        assertSame(ofEpochDayResult, actualCurrentTournament.getCurrentTournamentDate());
        assertEquals(6, actualCurrentTournament.getId());
        assertSame(tournament, actualCurrentTournament.getTournament());
    }

    @Test
    void testConstructorUpcoming() {
        UpcomingTournament actualUpcomingTournament = new UpcomingTournament();
        actualUpcomingTournament.setId(11);
        Tournament tournament = new Tournament();
        tournament.setLocation("South Park Post Covid");
        tournament.setStandings("1.Stan, 2.Kenny, 3.Cartman, 4.Kyle");
        tournament.setId(11);
        tournament.setEnd(LocalDate.ofEpochDay(1L));
        tournament.setMembers("Kenny, Stan, Kyle, Cartman");
        tournament.setFee(1000);
        tournament.setPrize(888888);
        tournament.setStart(LocalDate.ofEpochDay(1L));
        actualUpcomingTournament.setTournament(tournament);
        LocalDate ofEpochDayResult = LocalDate.ofEpochDay(1L);
        actualUpcomingTournament.setUpcomingTournamentDate(ofEpochDayResult);
        assertEquals(11, actualUpcomingTournament.getId());
        assertSame(tournament, actualUpcomingTournament.getTournament());
        assertSame(ofEpochDayResult, actualUpcomingTournament.getUpcomingTournamentDate());
    }
}



