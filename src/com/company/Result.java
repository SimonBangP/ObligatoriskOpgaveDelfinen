// Author @ Mohammad Stack

package com.company;

public class Result {
    protected double time;
    protected String regDate;


    public Result(double time, String regDate) {
        this.time = time;
        this.regDate = regDate;
    }

    @Override
    public String toString() {
        return time + "\t" + regDate;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }
}
