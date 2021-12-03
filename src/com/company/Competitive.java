//Author @ Nikolaj Skibsted

package com.company;

import java.util.*;

public class Competitive  extends Member{
    protected String discipline;
    protected double bestTime;
    protected String date;
    protected int distance;
    protected ArrayList<Result> bestTimes;//Den er lavet om fra <String> til <Result>
    //Dvs. vi har et object der hedder Result

    public Competitive(String firsName, String lastName, int age, int phoneNumber, String email, String activityForm, int subscriptionAmount, String discipline, int distance/*, double bestTime, String date*/) {
        super(firsName, lastName, age, phoneNumber, email, activityForm, subscriptionAmount);
        this.discipline = discipline;
        this.bestTime = bestTime;
        this.date = date;
        this.distance = distance;
        bestTimes = new ArrayList<Result>();
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
                ", distance(Meter)= " + distance  +"Meter" +
                ", bestTime(MM/SS)= " + bestTime + "MM/SS" +
                ", date= " + date;

    }
}
