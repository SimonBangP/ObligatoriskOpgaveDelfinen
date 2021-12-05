package com.company;

public class Discipline {

    protected String disciplineName;
    //protected int distance;

    public Discipline(String disciplineName /* ,int distance*/) {
        this.disciplineName = disciplineName;
        //this.distance = distance;
    }

    @Override
    public String toString() {
        return disciplineName /*+ " " + distance*/;
    }

    public String getDisciplineName() {
        return disciplineName;
    }

    public void setDisciplineName(String disciplineName) {
        this.disciplineName = disciplineName;
    }
    /*
    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
    */

}
