package com.example.accessingdatarest;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import org.springframework.format.annotation.DateTimeFormat;

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
    @JsonFormat(pattern = "dd/MM/yyyy")
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonSerialize(using = LocalDateSerializer.class)
    private LocalDate startDate;
    @JsonFormat(pattern = "dd/MM/yyyy")
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonSerialize(using = LocalDateSerializer.class)
    private LocalDate duration;
    private String membershipType;
    private String currentTournaments;
    private String pastTournaments;
    private String upcomingTournaments;

//    public Membership(LocalDate StartDate, LocalDate Duration, String MembershipType, String PastTournaments,
//                      String CurrentTournaments, String UpcomingTournaments) {
//
//        this.startDate = StartDate;
//        this.duration = Duration;
//        this.membershipType = MembershipType;
//        this.pastTournaments = PastTournaments;
//        this.currentTournaments = CurrentTournaments;
//        this.upcomingTournaments = UpcomingTournaments;
//    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getDuration() {
        return duration;
    }

    public void setDuration(LocalDate duration) {
        this.duration = duration;
    }

    public String getMembershipType() {
        return membershipType;
    }

    public void setMembershipType(String membershipType) {
        this.membershipType = membershipType;
    }

    public String getCurrentTournaments() {
        return currentTournaments;
    }

    public void setCurrentTournaments(String currentTournaments) {
        this.currentTournaments = currentTournaments;
    }

    public String getPastTournaments() {
        return pastTournaments;
    }

    public void setPastTournaments(String pastTournaments) {
        this.pastTournaments = pastTournaments;
    }

    public String getUpcomingTournaments() {
        return upcomingTournaments;
    }

    public void setUpcomingTournaments(String upcomingTournaments) {
        this.upcomingTournaments = upcomingTournaments;
    }
}
