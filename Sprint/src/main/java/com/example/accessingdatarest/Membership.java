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
    private String FirstName;
    private String LastName;
    private String Address;
    private String Email;
    private int PhoneNumber;
    private LocalDate StartDate;
    private LocalDate Duration;
    private String Membership;
    private String CurrentTournaments;
    private String PastTournaments;
    private String UpcomingTournaments;

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
        return PhoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        PhoneNumber = phoneNumber;
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

    public String getMembership() {
        return Membership;
    }

    public void setMembership(String membership) {
        Membership = membership;
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

    public void setUpcomingTournaments(String upcomingtournaments) {
        UpcomingTournaments = upcomingtournaments;
    }
}
