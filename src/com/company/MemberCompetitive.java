//Author @ Nikolaj Skibsted

package com.company;

import java.util.*;

public class MemberCompetitive extends Member{
    protected String discipline;
    protected int distance;
    protected String bestTime;
    protected String date;


    public MemberCompetitive(String firsName, String lastName, int age, int phoneNumber, String email, String activityForm,
                             int subscriptionAmount, String discipline, int distance, String bestTime, String date) {
        super(firsName, lastName, age, phoneNumber, email, activityForm, subscriptionAmount);
        this.discipline = discipline;
        this.distance = distance;
        this.bestTime = bestTime;
        this.date = date;


    }

    @Override
    public String toString() {
        return
                super.toString() + " discipline: " + discipline +
                        ", distance: " + distance  +" Meter" +
                        ", bestTime:= " + bestTime + " MM/SS" + ", date= " + date;

    }
    public String getDiscipline() {
        return discipline;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }

    public String getBestTime() {
        return bestTime;
    }

    public void setBestTime(String bestTime) {
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


}
