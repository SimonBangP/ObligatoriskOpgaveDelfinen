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
                "\n\n");

        System.out.println(" ******************");
        System.out.println("| ENTER FIRST NAME |");
        System.out.println(" ******************");

        String firstName = console.next();

        System.out.println(" ******************");
        System.out.println("| ENTER LAST NAME |");
        System.out.println(" ******************");
        String lastName = console.next();


        System.out.println(" ******************");
        System.out.println("|    ENTER AGE     |");
        System.out.println(" ******************");
            age = console.nextInt();


            while ( !(age > 0 && age < 120)) {
                System.out.println("The age is not valid, please enter age again");
                age = console.nextInt();

        }

        System.out.println(" ********************");
        System.out.println("| ENTER PHONE NUMBER |");
        System.out.println(" ********************");
        int phoneNumber = console.nextInt();

        System.out.println(" ******************");
        System.out.println("|    ENTER EMAIL   |");
        System.out.println(" ******************");
        String email = console.next();

        int subscriptionAmount = 0;

        System.out.println(" *********************");
        System.out.println("| ENTER ACTIVITY FORM |");
        System.out.println("| 'PASSIVE OR ACTIVE' |");
        System.out.println(" *********************");
        String activityForm = console.next();

        while (!(activityForm.equalsIgnoreCase("active")) && !(activityForm.equalsIgnoreCase("passive"))){
            System.out.println("The entered activity form is not valid. Pleaser enter the word active or passive");
            activityForm = console.next();

        }

        if (activityForm.equalsIgnoreCase("passive")){
            subscriptionAmount = 500;

        }
        if (activityForm.equalsIgnoreCase("active")) {

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
        System.out.println(" ************************");
        System.out.println("|   ENTER SWIMMER TYPE   |");
        System.out.println("| REGULAR OR COMPETITIVE |");
        System.out.println(" ************************");
        String swimmerAnswer = console.next();

        while (!(swimmerAnswer.equalsIgnoreCase("regular"))&& !(swimmerAnswer.equalsIgnoreCase("competitive"))){
            System.out.println("The entered is not a membertype\n" + "Enter 1 if the member is a regular swimmer\n"
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
            System.out.println(" ******************************");
            System.out.println("| ENTER THE APPROXIMATELY TIME |");
            System.out.println("| THE SWIMMER IS GOING TO SWIM |");
            System.out.println("|           PER WEEK           |");
            System.out.println(" ******************************");
            int swimPerWeek = console.nextInt();

            System.out.println(" ******************");
            System.out.println("| ENTER FAVOURITE |");
            System.out.println("|    DISCIPLINE   |");
            System.out.println(" ******************");
            String favouriteDiscipline = console.next();


        Regular createRegMember = new Regular(firstName, lastName, age, phoneNumber, email, activityForm, subscriptionAmount, swimPerWeek, favouriteDiscipline);
        newRegMember.add(createRegMember);



        } else if (swimmerAnswer.equals("competitive")){
            System.out.println(" ********************* ");
            System.out.println("|    ENTER CURRENT    |");
            System.out.println("| SWIMMING DISCIPLINE |");
            System.out.println(" ********************* ");
            String dicipline = console.next();

            System.out.println(" ******************");
            System.out.println("|  ENTER SWIMMING  |");
            System.out.println("|    DISTANCE      |");
            System.out.println(" ******************");
            int distance = console.nextInt();

            //@Har udkommenteret de to fields da, de nu bliver udskrevet i en liste over resultater
            System.out.println(" *******************");
            System.out.println("|  ENTER BEST TIME  |");
            System.out.println("|     EX: 02.35     |");
            System.out.println(" *******************");
            double bestTime = console.nextDouble();


            System.out.println(" *************************");
            System.out.println("| ENTER DATE OF BEST TIME |");
            System.out.println(" *************************");
            String date = console.next();

            Competitive createCompMember = new Competitive(firstName, lastName, age, phoneNumber, email, activityForm, subscriptionAmount, dicipline, distance, bestTime, date);
            newCompMember.add(createCompMember);

        } //else {
            //System.out.println("The entered are not correct, please try again");
            //swimmerAnswer = console.next();

        //}
    }
    public void changeMember (Scanner console, ArrayList<Member> member, ArrayList<Regular> regMember, ArrayList<Competitive> compMember){
        System.out.println("You have chosen that you want to change some information on a member.");

        System.out.println("Please enter which type of member you want to change" +
                "Enter regular or competitive");
        String memberType = console.next();


         if (memberType.equals("regular")){
            for (int i = 0; i < regMember.size(); i++){
                System.out.println("member number" + (i + 1) + " " + regMember.get(i));

                System.out.println("Which member to you want to make changes on? Enter the member number ");
                int changeAnswer = console.nextInt();
                System.out.println(regMember.get(changeAnswer-1));

                System.out.println("Which information do you want change? " +
                        "If you want to change first name, please enter 1 \n" +
                        "If you want to change last name, please enter 2 \n +" +
                        "If you want to change age, please enter 3 \n + " +
                        "If you want to change phone number, please enter 4 \n + " +
                        "If you want to change email, please enter 5 \n + " +
                        "If you want to change activity form, please enter 6 " +
                        "IF you want to change favourite discipline, please enter 7" +
                        "If you want to change approximately swims per week, please enter 8 ");

                int changeInformation = console.nextInt();

                switch (changeInformation){

                    case 1:
                        System.out.println("Please enter the new first name ");
                        String firstName = console.next();
                        regMember.get(changeAnswer - 1).setFirstName(firstName);

                        break;

                    case 2:
                        System.out.println("Please enter the new last name");
                        String lastName = console.next();
                        regMember.get(changeAnswer - 1).setLastName(lastName);
                        break;

                    case 3:
                        System.out.println("Please enter the new age");
                        int age = console.nextInt();
                        regMember.get(changeAnswer - 1).setAge(age);
                        if (age < 18){
                            regMember.get(changeAnswer - 1).setSubscriptionAmount(1000);
                        }else if (age > 18 && age <60){
                            regMember.get(changeAnswer - 1).setSubscriptionAmount(1600);
                        }else if (age > 60){
                            regMember.get(changeAnswer - 1).setSubscriptionAmount((1600/100)*75);

                        }

                        break;

                    case 4:
                        System.out.println("Please enter the new phone number");
                        int phoneNumber = console.nextInt();
                        regMember.get(changeAnswer - 1).setSubscriptionAmount(phoneNumber);
                        break;

                    case 5:
                        System.out.println("Please enter the new Email");
                        String email = console.next();
                        regMember.get(changeAnswer - 1 ).setEmail(email);
                        break;

                    case 6:
                        System.out.println("Please enter the new activity form");
                        String activityForm = console.next();
                        while (!(activityForm.equals("active")&& !(activityForm.equals("passive")))){
                            System.out.println("The entered activity form is not valid, please enter again");
                            activityForm = console.next();
                        }
                        if (activityForm.equals("passive")){
                            regMember.get(changeAnswer - 1).setSubscriptionAmount(500);

                        }  else {
                           regMember.get(changeAnswer - 1).setActivityForm("Passive");
                        }


                        break;

                    case 7:
                        System.out.println("Please enter the new favourite discipline");
                        String favouriteDiscipline = console.next();
                        regMember.get(changeAnswer - 1).setFavouriteDiscipline(favouriteDiscipline);

                        break;

                    case 8:
                        System.out.println("Please enter the new approximately swims per week");
                        int swimsPerWeek = console.nextInt();
                        regMember.get(changeAnswer - 1).setSwimsPerWeek(swimsPerWeek);

                        break;

                    default:

                        break;


                }

            }



        } else if (memberType.equals("competitive")){
            for (int i = 0; i < compMember.size(); i++){
                System.out.println("member number" + (i + 1) + " " + compMember.get(i));

                System.out.println("Which member to you want to make changes on? Enter the member number ");
                int changeAnswer = console.nextInt();
                System.out.println(compMember.get(changeAnswer-1));

                System.out.println("Which information do you want change? " +
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
                        compMember.get(changeAnswer - 1).setFirstName(firstName);

                        break;

                    case 2:
                        System.out.println("Please enter the new last name");
                        String lastName = console.next();
                        compMember.get(changeAnswer - 1).setLastName(lastName);
                        break;

                    case 3:
                        System.out.println("Please enter the new age");
                        int age = console.nextInt();
                        compMember.get(changeAnswer - 1).setAge(age);
                        if (age < 18){
                            compMember.get(changeAnswer - 1).setSubscriptionAmount(1000);
                        }else if (age > 18 && age <60){
                            compMember.get(changeAnswer - 1).setSubscriptionAmount(1600);
                        }else if (age > 60){
                            compMember.get(changeAnswer - 1).setSubscriptionAmount((1600/100)*75);

                        }

                        break;

                    case 4:
                        System.out.println("Please enter the new phone number");
                        int phoneNumber = console.nextInt();
                        compMember.get(changeAnswer - 1).setSubscriptionAmount(phoneNumber);
                        break;

                    case 5:
                        System.out.println("Please enter the new Email");
                        String email = console.next();
                        compMember.get(changeAnswer - 1 ).setEmail(email);
                        break;

                    case 6:
                        /*System.out.println("Please enter the new activity form");
                        String activityForm = console.next();
                        while (!(activityForm.equals("active")&& !(activityForm.equals("passive")))){
                            System.out.println("The entered activity form is not valid, please enter again");
                            activityForm = console.next();
                        }
                        if (activityForm.equals("passive")){
                            compMember.get(changeAnswer - 1).setSubscriptionAmount(500);

                        }*/


                        break;

                    default:

                        break;


                }
            }

        }


        /*System.out.println("Which member to you want to make changes on? Enter the member number ");
        int changeAnswer = console.nextInt();
        System.out.println(member.get(changeAnswer-1));

        System.out.println("Which information do you want change? " +
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


        }*/

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
