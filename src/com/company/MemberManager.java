package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class MemberManager {

    public void createMember (Scanner console, ArrayList<Member> newMember, ArrayList<Competitive> newCompMember, ArrayList<Regular> newRegMember) {
        int age = 0;
        System.out.println("In the following you will be able to add a member to the 'svømmeklubben Delfinen'\n" +
                "You would be asked to enter: Sur name, last name, age, phonenumber and email Account\n\n" +
                "The System will set that amount you should pay in subscription through your age\n" +
                "When you have inserted all information above you should choose if the member is a regular swimmer or competitive\n\n+ " +
                "*****************************\n\n");

        System.out.println("Please enter your first name");
        String firstName = console.next();

        System.out.println("Please enter your last name");
        String lastName = console.next();


            System.out.println("Please enter your age");
            age = console.nextInt();


            while ( !(age > 0 && age < 120)) {
                System.out.println("The age is not valid, please enter age again");
                age = console.nextInt();

        }

        System.out.println("Please enter your Phonenumber");
        int phoneNumber = console.nextInt();

        System.out.println("Please enter your email");
        String email = console.next();

        int subscriptionAmount = 0;

        System.out.println("Please enter your activity form. It could either be active or passive");
        String activityForm = console.next();

        while (!(activityForm.equals("active")) && !(activityForm.equals("passive"))){
            System.out.println("The entered activity form is not valid. Pleaser enter active or passive");
            activityForm = console.next();

        }

        if (activityForm.equals("passive")){
            subscriptionAmount = 500;

        }
        if (activityForm.equals("active")) {

            if (age > 0 && age <18) {
                subscriptionAmount = 1000;

            } else if (age > 18 && age < 60) {
                subscriptionAmount = 1600;

            } else if (age > 60) {
                subscriptionAmount = ((1600 / 100) * 75);

            }

    }

        Member createNewMember = new Member(firstName, lastName, age, phoneNumber, email, activityForm, subscriptionAmount);
        newMember.add(createNewMember);

        System.out.println("Perfect, now you have filled out most of it. Now you should choose if the member is a regular swimmer or a competitive");
        System.out.println("Enter regular or competitive");
        String swimmerAnswer = console.next();

        while (!(swimmerAnswer.equals("regular"))&& !(swimmerAnswer.equals("competitive"))){
            System.out.println("The entered is not a membertype\n" + "Enter 1 is the member is a regular swimmer\n"
                    + " Enter 2 if the member is a competitive swimmer");
            int memberType = console.nextInt();
            if (memberType == 1){
                swimmerAnswer = "regular";
            }
            if (memberType == 2){
                swimmerAnswer = "competitive";
            }

        }


        if (swimmerAnswer.equals("regular")){
            System.out.println("Please enter how many times the member approximately are going to swim per week");
            int swimPerWeek = console.nextInt();

            System.out.println("Please enter which of the four disciplines that is the members favourite");
            String favouriteDiscipline = console.next();


        Regular createRegMember = new Regular(firstName, lastName, age, phoneNumber, email, activityForm, subscriptionAmount, swimPerWeek, favouriteDiscipline);
        newRegMember.add(createRegMember);


        } else if (swimmerAnswer.equals("competitive")){
            System.out.println("Please enter the dicipline that the current swimmer is swimming. Either butterfly, back crawl, breast or crawl");
            String dicipline = console.next();

            System.out.println("Please enter the distance that the swimmer is swimming in the chosed dicipline ");
            int distance = console.nextInt();

            System.out.println("please enter the currently best time the swimmer have been swimming so far (MM/SS) ex. 02.35");
            double bestTime = console.nextDouble();

            System.out.println("Please enter the date where the best time is from (DD/MM/YY");
            String date = console.next();

            Competitive createCompMember = new Competitive(firstName, lastName, age, phoneNumber, email, activityForm, subscriptionAmount, dicipline, distance, bestTime, date);

        } else {
            System.out.println("The entered are not correct, please try again");
            swimmerAnswer = console.next();

        }
    }
    public void changeMember (Scanner console, ArrayList<Member> newMember, ArrayList<Competitive> newCompMember, ArrayList<Regular> newRegMember){
        System.out.println("You have chosen that you want to change some information on a member.");
        for (int i = 0; i < newMember.size(); i++){
            System.out.println("member number" + (i + 1) + " " + newMember.get(i));
        }
        System.out.println("Which member to you want to make changes on? Enter the membernumber ");
        int changeAnswer = console.nextInt();
        System.out.println(newMember.get(changeAnswer-1));



    }

}
