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
                "When you have inserted all information above you should choose if the member is a regular swimmer or competitive");

        System.out.println("Please enter your first name");
        String firstName = console.next();

        System.out.println("Please enter your last name");
        String lastName = console.next();

        do {
            System.out.println("Please enter your age");
            age = console.nextInt();

        }
            while (age < 0 || age > 120);
            System.out.println("The age is not valid, please enter age again");
            age = console.nextInt();





        System.out.println("Please enter your Phonenumber");
        int phoneNumber = console.nextInt();

        System.out.println("Please enter your email");
        String email = console.next();

        int subscriptionAmount = 0;

        System.out.println("Please enter your activity form. It could either be active or passive");
        String activityForm = console.next();

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

            } /*else {
                System.out.println("Age is not valid, please try again");
                age = console.nextInt();

            }*/

        } else {
            System.out.println("The entered are not valid, please try again");
        }

        Member createNewMember = new Member(firstName, lastName, age, phoneNumber, email, activityForm, subscriptionAmount);
        newMember.add(createNewMember);

        System.out.println("Perfect, now you have filled out most of it. Now you should choose if the member is a regular swimmer or a competitive");
        System.out.println("Enter regular or competitive");
        String swimmerAnswer = console.next();

        if (swimmerAnswer.equals("regular")){
            System.out.println("Please enter the members activity form. It should be either passive or active");
            //String activityForm = console.next();
        Regular createRegMember = new Regular(firstName, lastName, age, phoneNumber, email, activityForm, subscriptionAmount/*, activityForm*/);
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

}
