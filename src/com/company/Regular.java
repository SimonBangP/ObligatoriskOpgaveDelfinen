package com.company;

public class Regular extends Member{

    //protected String activityForm;


    public Regular(String firstName, String lastName, int age, int phoneNumber, String email, String activityForm, int subscriptionAmount /*,String activityForm*/) {
        super(firstName, lastName, age, phoneNumber, email, activityForm, subscriptionAmount);
        //this.activityForm = activityForm;
    }

    @Override
    public String toString() {
        return super.toString()+" activityForm=" + activityForm;
    }

    public String getActivityForm() {
        return activityForm;
    }

   /* public void setActivityForm(String activityForm) {
        this.activityForm = activityForm;
    }*/
}
