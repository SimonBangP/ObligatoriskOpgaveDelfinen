package com.company;

public class Regular extends Member {

    //protected String activityForm;
    protected int swimsPerWeek;
    protected String favouriteDiscipline;


    public Regular(String firstName, String lastName, int age, int phoneNumber, String email, String activityForm, int subscriptionAmount, int swimsPerWeek, String favouriteDicipline) {
        super(firstName, lastName, age, phoneNumber, email, activityForm, subscriptionAmount);
    this.swimsPerWeek = swimsPerWeek;
    this.favouriteDiscipline = favouriteDicipline;
    }

    @Override
    public String toString() {
        return super.toString()
                + "Approximately swims per Week" + swimsPerWeek +
                ", Favourite Discipline " + favouriteDiscipline;
    }

    public int getSwimsPerWeek() {
        return swimsPerWeek;
    }

    public void setSwimsPerWeek(int swimsPerWeek) {
        this.swimsPerWeek = swimsPerWeek;
    }

    public String getFavouriteDiscipline() {
        return favouriteDiscipline;
    }

    public void setFavouriteDiscipline(String favouriteDiscipline) {
        this.favouriteDiscipline = favouriteDiscipline;
    }
}
