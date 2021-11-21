package com.example.accessingdatarest;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String FirstName;
    private String LastName;
    private String Address;
    private String Email;
    private int PhoneNum;


    public Person(String FirstName, String LastName, String Address, String Email, int PhoneNum){
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Address = Address;
        this.Email = Email;
        this.PhoneNum = PhoneNum;
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
}
