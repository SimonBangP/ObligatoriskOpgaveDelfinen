package com.company;

import java.security.PublicKey;

public class Member {

protected String surName;
protected String lastName;
protected int age;
protected int phoneNumber;
protected String email;
protected int subscriptionAmount;

public Member(String surName, String lastName, int age, int phoneNumber, String email, int subscriptionAmount){
this.surName = surName;
this.lastName = lastName;
this.age = age;
this.phoneNumber = phoneNumber;
this.email = email;
this.subscriptionAmount = subscriptionAmount;
}

    @Override
    public String toString() {
        return "surName= " + surName  +
                ", lastName= '" + lastName +
                ", age= " + age +
                ", phoneNumber= " + phoneNumber +
                ", email= " + email +
                ", subscriptionAmount= " + subscriptionAmount;
    }
}



