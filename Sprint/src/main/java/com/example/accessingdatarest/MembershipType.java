package com.example.accessingdatarest;

import javax.persistence.*;

@Entity
public class MembershipType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String type;
    private String familyPlan;
    @ManyToOne
    private Membership member;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFamilyPlan() {
        return familyPlan;
    }

    public void setFamilyPlan(String familyPlan) {
        this.familyPlan = familyPlan;
    }

    public Membership getMember() {
        return member;
    }

    public void setMember(Membership member) {
        this.member = member;
    }
}