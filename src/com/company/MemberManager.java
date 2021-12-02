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
            //indsat else foran if nedunder her
            else if (memberType == 2){
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

            //@Har udkommenteret de to fields da, de nu bliver udskrevet i en liste over resultater
            /*System.out.println("please enter the currently best time the swimmer have been swimming so far (MM/SS) ex. 02.35");
            double bestTime = console.nextDouble();
            System.out.println("Please enter the date where the best time is from (DD/MM/YY");
            String date = console.next();*/

            Competitive createCompMember = new Competitive(firstName, lastName, age, phoneNumber, email, activityForm, subscriptionAmount, dicipline, distance/*, bestTime, date*/);
            newCompMember.add(createCompMember);

        } else {
            System.out.println("The entered are not correct, please try again");
            swimmerAnswer = console.next();

        }
    }
    public void changeMember (Scanner console, ArrayList<Member> member){
        System.out.println("You have chosen that you want to change some information on a member.");
        for (int i = 0; i < member.size(); i++){
            System.out.println("member number" + (i + 1) + " " + member.get(i));
        }
        System.out.println("Which member to you want to make changes on? Enter the membernumber ");
        int changeAnswer = console.nextInt();
        System.out.println(member.get(changeAnswer-1));

        System.out.println("Which information do you want change?+ " +
                "If you want to change first name, please enter 1 \n" +
                "If you want to change last name, please enter 2 \n +" +
                "If you want to change age, please enter 3 \n + " +
                "If you want to change phone number, please enter 4 \n + " +
                "If you want to change email, please enter 5 \n + " +
                "If you want to change activity form, please enter 6  ");

        int changeInformation = console.nextInt();

        switch (changeInformation){

            case 1:
                System.out.println("Please enter the new first name ");
                String firstName = console.next();
                member.get(changeAnswer - 1).setFirstName(firstName);

                break;

            case 2:
                System.out.println("Please enter the new last name");
                String lastName = console.next();
                member.get(changeAnswer - 1).setLastName(lastName);
                break;

            case 3:
                System.out.println("Please enter the new age");
                int age = console.nextInt();
                member.get(changeAnswer - 1).setAge(age);
                if (age < 18){
                    member.get(changeAnswer - 1).setSubscriptionAmount(1000);
                }else if (age > 18 && age <60){
                    member.get(changeAnswer - 1).setSubscriptionAmount(1600);
                }else if (age > 60){
                    member.get(changeAnswer - 1).setSubscriptionAmount((1600/100)*75);

                }

                break;

            case 4:
                System.out.println("Please enter the new phone number");
                int phoneNumber = console.nextInt();
                member.get(changeAnswer - 1).setSubscriptionAmount(phoneNumber);
                break;

            case 5:
                System.out.println("Please enter the new Email");
                String email = console.next();
                member.get(changeAnswer - 1 ).setEmail(email);
                break;

            case 6:
                System.out.println("Please enter the new activity form");
                String activityForm = console.next();
                while (!(activityForm.equals("active")&& !(activityForm.equals("passive")))){
                    System.out.println("The entered activity form is not valid, please enter again");
                    activityForm = console.next();
                }
                if (activityForm.equals("passive")){
                    member.get(changeAnswer - 1).setSubscriptionAmount(500);

                }


                break;

            default:

                break;


        }

    }


    public void deleteMember (Scanner console, ArrayList<Member> member, ArrayList<Regular> regularMember, ArrayList<Competitive> compMember){
        System.out.println("Here you will be able to delete a member from the list and file. You should choose from which membertype you want to delete" +
                "You can choose: member, regular or competitive");

        System.out.println("Please enter the member type you want to delete");
        String memberType = console.next();

        while (!(memberType.toLowerCase().equals("member"))&& !(memberType.equals("regular"))&& !(memberType.equals("competitive"))){
            System.out.println("The entered is not a valid membertype, please try again");
            memberType = console.next();

        }

        if (memberType.toLowerCase().equals("member")){
            for (int i = 0; i < member.size(); i++){
                System.out.println("Member number " + (i + 1) + ": \n" +  member.get(i));

                System.out.println("Please enter the number of the member you want to delete");
                int deleteMember = console.nextInt();

                member.remove((deleteMember - 1));

            }

        } else if (memberType.toLowerCase().equals("regular")){
            System.out.println("Please enter the number of the Regular member you want to delete");
            int deleteMember = console.nextInt();

            regularMember.remove((deleteMember - 1));


        } else {
            System.out.println("Please enter the number of the competitive member you want to delete");
            int deleteMember = console.nextInt();

            compMember.remove((deleteMember - 1));


        }




    }

}
