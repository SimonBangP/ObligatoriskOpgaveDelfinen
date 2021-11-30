package com.company;

public class Regular extends Member {

    //protected String activityForm;
    protected int swimsPerWeek;
    protected String favouriteDiscipline;


    public Regular(String firstName, String lastName, int age, int phoneNumber, String email, String activityForm, int subscriptionAmount, int swimsPerWeek, String favouriteDicipline) {
        super(firstName, lastName, age, phoneNumber, email, activityForm, subscriptionAmount);

    }

    @Override
    public String toString() {
        return super.toString()
                + "Approximately swims per Week" + swimsPerWeek +
                ", FavouriteDicipline " + favouriteDicipline;
    }

}
