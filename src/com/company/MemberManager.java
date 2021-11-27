package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class MemberManager {

    public void createMember (Scanner console, ArrayList<Member> newMember, ArrayList<Competitive> newCompMember, ArrayList<Regular> newRegMember){
        int age = 0;
        System.out.println("In the following you will be able to add a member to the 'svømmeklubben Delfinen'\n" +
                "You would be asked to enter: Sur name, last name, age, phonenumber and email Account\n\n" +
        "The System will set that amount you should pay in subscription through your age\n" +
        "When you have inserted all information above you should choose if the member is a regular swimmer or competitive");

        System.out.println("Please enter your first name");
        String firstName = console.next();

        System.out.println("Please enter your last name");
        String lastName = console.next();

        System.out.println("Please enter your age");
        age = console.nextInt();

        System.out.println("Please enter your Phonenumber");
        int phoneNumber = console.nextInt();

        System.out.println("Please enter your email");
        String email = console.next();

        int subscriptionAmount = 0;
        if (age < 18){
            subscriptionAmount = 1000;

        }else if (age > 18 && age < 60){
            subscriptionAmount = 1600;

        } else if (age > 60){
            subscriptionAmount = ((1600 / 100)*75);

        }else {
            System.out.println("Age is not valid, please try again");
            age = console.nextInt();

        }
        //newMember = (firstName, lastName, age,email,subscriptionAmount);
        Member createNewMember = new Member(firstName, lastName, age, phoneNumber, email, subscriptionAmount);
        newMember.add(createNewMember);

    }

}
