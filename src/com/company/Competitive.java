//Author @ Nikolaj Skibsted

package com.company;

public class Competitive  extends Member{
    protected String discipline;
    protected double bestTime;
    protected String date;
    protected int distance;

    public Competitive(String surName, String lastName, int age, int phoneNumber, String email, int subscriptionAmount) {
        super(surName, lastName, age, phoneNumber, email, subscriptionAmount);
        this.discipline = discipline;
        this.bestTime = bestTime;
        this.date = date;
        this.distance = distance;
    }


    public String getDiscipline() {
        return discipline;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }

    public double getBestTime() {
        return bestTime;
    }

    public void setBestTime(double bestTime) {
        this.bestTime = bestTime;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        return super.toString() +
                "discipline= " + discipline +
                ", bestTime= " + bestTime +
                ", date= " + date +
                ", distance= " + distance;
    }
}
