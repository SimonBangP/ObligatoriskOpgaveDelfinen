package com.company;

public class Member {

protected String firstName;
protected String lastName;
protected int age;
protected int phoneNumber;
protected String email;
protected int subscriptionAmount;

public Member(String surName, String lastName, int age, int phoneNumber, String email, int subscriptionAmount){
this.firstName = surName;
this.lastName = lastName;
this.age = age;
this.phoneNumber = phoneNumber;
this.email = email;
this.subscriptionAmount = subscriptionAmount;
}

    @Override
    public String toString() {
        return "surName= " + firstName +
                ", lastName= '" + lastName +
                ", age= " + age +
                ", phoneNumber= " + phoneNumber +
                ", email= " + email +
                ", subscriptionAmount= " + subscriptionAmount;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getSubscriptionAmount() {
        return subscriptionAmount;
    }

    public void setSubscriptionAmount(int subscriptionAmount) {
        this.subscriptionAmount = subscriptionAmount;
    }
}



