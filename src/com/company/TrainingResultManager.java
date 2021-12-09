// Author @ Mohammad Stack

package com.company;

import java.util.*;

public class TrainingResultManager {


    public void updateBestTime(Scanner console, ArrayList<MemberCompetitive> newCompMember) {

        for (int i = 0; i < newCompMember.size(); i++) {

            System.out.print((i + 1) + ": ");
            System.out.print("First Name: " + newCompMember.get(i).getFirstName());
            System.out.print(" Last Name: " + newCompMember.get(i).getLastName());
            System.out.print(" Age: " + newCompMember.get(i).getAge());
            System.out.print(" Discipline: " + newCompMember.get(i).getDiscipline());
            System.out.print(" Distance: " + newCompMember.get(i).getDistance());
            System.out.print(" BestTime: " + newCompMember.get(i).getBestTime());
            System.out.print(" Date: " + newCompMember.get(i).getDate());
            System.out.println();

        }
        System.out.println("\nChoose the swimmer which result you'd like to update!\n");
        int indexOfCompetitive = console.nextInt();


        System.out.println("\nFirstName: " + newCompMember.get(indexOfCompetitive - 1).getFirstName() +
                " BestTime: " + newCompMember.get(indexOfCompetitive - 1).getBestTime() + " " +
                " Date: " + newCompMember.get(indexOfCompetitive - 1).getDate());


        System.out.println("\nEnter new BestTime");
        String bestTime = console.next();


        System.out.println("Enter the date");
        String date = console.next();


        newCompMember.get(indexOfCompetitive - 1).setBestTime(bestTime);
        newCompMember.get(indexOfCompetitive - 1).setDate(date);

        System.out.println("\nFirstName: " + newCompMember.get(indexOfCompetitive - 1).getFirstName() +
                " BestTime: " + newCompMember.get(indexOfCompetitive - 1).getBestTime() + " " +
                " Date: " + newCompMember.get(indexOfCompetitive - 1).getDate());

    }
}
