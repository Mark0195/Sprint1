package com.example.accessingdatarest;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalTime;


@Entity
public class Tournament {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private LocalTime start;
    private LocalTime end;
    private String location;
    private double fee;
    private double prize;
    private String members;
    private String standings;

//    public Tournament(LocalTime Start, LocalTime End, String Location, double Fee, double Prize,
//                      String Members, String Standings){
//        this.Start = Start;
//        this.End = End;
//        this.Location = Location;
//        this.Fee = Fee;
//        this.Prize = Prize;
//        this.Members = Members;
//        this.Standings = Standings;
//    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalTime getStart() {
        return start;
    }

    public void setStart(LocalTime start) {
        this.start = start;
    }

    public LocalTime getEnd() {
        return end;
    }

    public void setEnd(LocalTime end) {
        this.end = end;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public double getPrize() {
        return prize;
    }

    public void setPrize(double prize) {
        this.prize = prize;
    }

    public String getMembers() {
        return members;
    }

    public void setMembers(String members) {
        this.members = members;
    }

    public String getStandings() {
        return standings;
    }

    public void setStandings(String standings) {
        this.standings = standings;
    }
}
