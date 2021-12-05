package com.company;

import java.util.*;

public class ResultManager {



    /*//En arraylist over tider/ blev ikke brugt alligevel
    ArrayList<Double> bestTimes = new ArrayList<>();
    ArrayList<String> dates = new ArrayList<>();*/

// tilføj at forloopet også indhenter gamle bedste tid. Mellem mellem "+'er"

    public void updateBestTime(Scanner console,ArrayList<MemberCompetitive> newCompMember){

        //Tilføj System.out.print og bed brugeren indtaste hvilken medlem der skal ændres.
        System.out.println("Choose the swimmer which result you'd like to update!");

        //for-loop til at udskrive en liste over alle konkurrence medlemerne, så træneren kan vælge en af dem
        for(int i = 0; i < newCompMember.size(); i++){
            System.out.println((i+ 1)+": "+newCompMember.get(i).getFirstName()+" "+
                    newCompMember.get(i).getLastName()+" "+newCompMember.get(i).getDiscipline()+" "+
                    newCompMember.get(i).getDistance() + " "+newCompMember.get(i).getResult()/*+" "+newCompMember.get(i).getBestTime()+" "+
                    newCompMember.get(i).getDate()*/);
        }



        //her vælger brugeren indekset som den svømmer han vil vælge har
        int indexOfCompetitive = console.nextInt();

        //den udskriver svømmerens oplysninger som den henter fra ArrayList newCompMember som indeholder alle konkurrence svømmere
        System.out.println(newCompMember.get(indexOfCompetitive - 1));


        System.out.println("Enter new BestTime");
        double bestTime = console.nextDouble();

        //kan man evt. bruge local time feature i den sammenhæng???
        System.out.println("Enter the date");
        String date = console.next();

        //I starten havde vi kun muligheden for at tilføje/opdatere ét resultat pr. svømmer
        //nu er de to statments ligegyldige da hver konkurrence svømmer har en hel liste over resultater
       /* newCompMember.get(indexOfCompetitive - 1).setBestTime(bestTime);
        newCompMember.get(indexOfCompetitive - 1).setDate(date);
        newCompMember.get(indexOfCompetitive - 1).result.setTime(bestTime);
        new Result (bestTime, date);
        */
        newCompMember.get(indexOfCompetitive - 1).setResult(new Result (bestTime, date));
        System.out.println(newCompMember.get(indexOfCompetitive - 1));




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
