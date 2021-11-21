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
    private LocalDate StartDate;
    private LocalDate Duration;
    private String MembershipType;
    private String CurrentTournaments;
    private String PastTournaments;
    private String UpcomingTournaments;

    public Membership(LocalDate StartDate, LocalDate Duration, String MembershipType, String PastTournaments,
                      String CurrentTournaments, String UpcomingTournaments) {

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
