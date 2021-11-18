package com.example.accessingdatarest;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Membership {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String FirstName;
    private String LastName;
    private String Address;
    private String Email;
    private int PhoneNum;
    private LocalDate StartDate;
    private LocalDate Duration;
    private String MembershipType;
    private String CurrentTournaments;
    private String PastTournaments;
    private String UpcomingTournaments;

    public Membership(String FirstName, String LastName, String Address, String Email, int PhoneNum, LocalDate StartDate,
                      LocalDate Duration, String MembershipType, String PastTournaments,
                      String CurrentTournaments, String UpcomingTournaments) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Address = Address;
        this.Email = Email;
        this.PhoneNum = PhoneNum;
        this.StartDate = StartDate;
        this.Duration = Duration;
        this.MembershipType = MembershipType;
        this.PastTournaments = PastTournaments;
        this.CurrentTournaments = CurrentTournaments;
        this.UpcomingTournaments = UpcomingTournaments;
    }

    public Membership() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public int getPhoneNumber() {
        return PhoneNum;
    }

    public void setPhoneNumber(int phoneNum) {
        PhoneNum = phoneNum;
    }

    public LocalDate getStartDate() {
        return StartDate;
    }

    public void setStartDate(LocalDate startDate) {
        StartDate = startDate;
    }

    public LocalDate getDuration() {
        return Duration;
    }

    public void setDuration(LocalDate duration) {
        Duration = duration;
    }

    public String getMembershipType() {
        return MembershipType;
    }

    public void setMembershipType(String membershipType) {
        MembershipType = membershipType;
    }

    public String getCurrentTournaments() {
        return CurrentTournaments;
    }

    public void setCurrentTournaments(String currentTournaments) {
        CurrentTournaments = currentTournaments;
    }

    public String getPastTournaments() {
        return PastTournaments;
    }

    public void setPastTournaments(String pastTournaments) {
        PastTournaments = pastTournaments;
    }

    public String getUpcomingTournaments() {
        return UpcomingTournaments;
    }

    public void setUpcomingTournaments(String upcomingTournaments) {
        UpcomingTournaments = upcomingTournaments;
    }
}
