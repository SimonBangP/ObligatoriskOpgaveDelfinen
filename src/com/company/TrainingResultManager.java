package com.company;

import java.util.*;

public class TrainingResultManager {



    /*//En arraylist over tider/ blev ikke brugt alligevel
    ArrayList<Double> bestTimes = new ArrayList<>();
    ArrayList<String> dates = new ArrayList<>();*/

// tilføj at forloopet også indhenter gamle bedste tid. Mellem mellem "+'er"

    public void updateBestTime(Scanner console,ArrayList<MemberCompetitive> newCompMember){

        //Tilføj System.out.print og bed brugeren indtaste hvilken medlem der skal ændres.
        System.out.println("Choose the swimmer which result you'd like to update!\n");

        //for-loop til at udskrive en liste over alle konkurrence medlemerne, så træneren kan vælge en af dem
        for(int i = 0; i < newCompMember.size(); i++){

            System.out.print((i +1)+": ");
            System.out.print("First Name: " + newCompMember.get(i).getFirstName());
            System.out.print(" Last Name: " + newCompMember.get(i).getLastName());
            System.out.print(" Age: " + newCompMember.get(i).getAge());
            System.out.print(" Discipline: " + newCompMember.get(i).getDiscipline());
            System.out.print(" Distance: " + newCompMember.get(i).getDistance());
            System.out.print(" BestTime: " + newCompMember.get(i).getBestTime());
            System.out.print(" Date: " + newCompMember.get(i).getDate());

        }



        //her vælger brugeren indekset som den svømmer han vil vælge har
        int indexOfCompetitive = console.nextInt();

        //den udskriver svømmerens oplysninger som den henter fra ArrayList newCompMember som indeholder alle konkurrence svømmere
        System.out.println("\nFirstName: "+newCompMember.get(indexOfCompetitive - 1).getFirstName()+
                " BestTime: "+newCompMember.get(indexOfCompetitive - 1).getBestTime()+" "+
                " Date: "+newCompMember.get(indexOfCompetitive - 1).getDate());


        System.out.println("\nEnter new BestTime");
        String bestTime = console.next();

        //kan man evt. bruge local time feature i den sammenhæng???
        System.out.println("Enter the date");
        String date = console.next();

        //I starten havde vi kun muligheden for at tilføje/opdatere ét resultat pr. svømmer
        //nu er de to statments ligegyldige da hver konkurrence svømmer har en hel liste over resultater
        newCompMember.get(indexOfCompetitive - 1).setBestTime(bestTime);
        newCompMember.get(indexOfCompetitive - 1).setDate(date);

        System.out.println("\nFirstName: "+newCompMember.get(indexOfCompetitive - 1).getFirstName()+
                " BestTime: "+newCompMember.get(indexOfCompetitive - 1).getBestTime()+" "+
                " Date: "+newCompMember.get(indexOfCompetitive - 1).getDate());

        //System.out.println(newCompMember.get(indexOfCompetitive - 1));

        //her tager jeg de nye indtastede oplysninger og pakker dem ind i et String object, for gøre håndteringen flydende
        //String result = bestTime+"\t"+date;
    //NY    //Result result = new Result(bestTime, date); NY

        //Her bliver tilføjet til listen BestTimes
        //der bliver tilføjet det nye indtasted resultat
        //og den bliver indtastet til den specifikker svømmer, så er i index, brugeren indtastede
    //NY    //newCompMember.get(indexOfCompetitive - 1).bestTimes.add(result); NY

        //metoden er færdig og har gjort det den skulle, at indtaste et nyt resultat/tid.

    }
}
