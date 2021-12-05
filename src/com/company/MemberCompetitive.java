//Author @ Nikolaj Skibsted

package com.company;

import java.util.*;

public class MemberCompetitive extends Member{
    //protected String discipline;
    protected Discipline discipline;
    //protected double bestTime;
    //protected String date;
    protected Result result;
    protected int distance;
    protected ArrayList<Result> bestTimes;//Hvis en svømmer skal have en liste over mange resultater

    public MemberCompetitive(String firsName, String lastName, int age, int phoneNumber, String email, String activityForm, int subscriptionAmount, Discipline discipline, /*String discipline,*/ int distance /*, double bestTime, String date*/ , Result result) {
        super(firsName, lastName, age, phoneNumber, email, activityForm, subscriptionAmount);
        this.discipline = discipline;
        //this.bestTime = bestTime;
        //this.date = date;
        this.distance = distance;
        this.result = result;
        bestTimes = new ArrayList<Result>();
    }


    public Discipline getDiscipline() {
        return discipline;
    }

    public void setDiscipline(Discipline discipline) {
        this.discipline = discipline;
    }
/*
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
*/
    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return super.toString() +

                "discipline= " + discipline +
                ", distance(Meter)= " + distance  +" Meter "
                + "BestTime " + result.getTime() + " Date: " + result.getRegDate()
                /* +
                ", bestTime(MM/SS)= " + bestTime + "MM/SS" +
                ", date= " + date*/;

    }
}
