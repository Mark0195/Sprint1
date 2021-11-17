package com.example.accessingdatarest;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;


@Entity
public class Tournament {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private LocalDate Start;
    private LocalDate End;
    private String Location;
    private double Fee;
    private double Prize;
    private String Members;
    private String Standings;

    public LocalDate getStart() {
        return Start;
    }

    public void setStart(LocalDate start) {
        Start = start;
    }

    public LocalDate getEnd() {
        return End;
    }

    public void setEnd(LocalDate end) {
        End = end;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public double getFee() {
        return Fee;
    }

    public void setFee(double fee) {
        Fee = fee;
    }

    public double getPrize() {
        return Prize;
    }

    public void setPrize(double prize) {
        Prize = prize;
    }

    public String getMembers() {
        return Members;
    }

    public void setMembers(String members) {
        Members = members;
    }

    public String getStandings() {
        return Standings;
    }

    public void setStandings(String standings) {
        Standings = standings;
    }
}
