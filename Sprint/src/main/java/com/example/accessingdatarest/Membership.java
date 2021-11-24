package com.example.accessingdatarest;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Membership {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @OneToOne
    private Person person;
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
    @OneToOne
    private MembershipType membershipType;
    @ManyToOne
    private CurrentTournament currentTournament;
    @ManyToOne
    private PastTournament pastTournament;
    @ManyToOne
    private UpcomingTournament upcomingTournament;

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

    public MembershipType getMembershipType() {
        return membershipType;
    }

    public void setMembershipType(MembershipType membershipType) {
        this.membershipType = membershipType;
    }

    public CurrentTournament getCurrentTournament() {
        return currentTournament;
    }

    public void setCurrentTournament(CurrentTournament currentTournament) {
        this.currentTournament = currentTournament;
    }

    public PastTournament getPastTournament() {
        return pastTournament;
    }

    public void setPastTournament(PastTournament pastTournament) {
        this.pastTournament = pastTournament;
    }

    public UpcomingTournament getUpcomingTournament() {
        return upcomingTournament;
    }

    public void setUpcomingTournament(UpcomingTournament upcomingTournament) {
        this.upcomingTournament = upcomingTournament;
    }
}
