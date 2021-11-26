package com.company;

public class Regular extends Member{

    protected String activityForm;


    public Regular(String surName, String lastName, int age, int phoneNumber, String email, int subscriptionAmount, String activityForm) {
        super(surName, lastName, age, phoneNumber, email, subscriptionAmount);
        this.activityForm = activityForm;
    }

    @Override
    public String toString() {
        return super.toString()+" activityForm=" + activityForm;
    }
}
