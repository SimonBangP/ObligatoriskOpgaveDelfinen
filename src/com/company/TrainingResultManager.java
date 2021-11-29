package com.company;

import java.util.*;

public class TrainingResultManager {
// tilføj at forloopet også indhenter gamle bedste tid. Mellem mellem "+'er"
    public void updateBestTime(Scanner console,ArrayList<Competitive> newCompMember){
        //Scanner scan = new Scanner(System.in);
        for(int i = 0; i < newCompMember.size(); i++){
            System.out.println((i+ 1)+": "+newCompMember.get(i).getFirstName()+
                    newCompMember.get(i).getLastName()+newCompMember.get(i).getDiscipline()+
                    newCompMember.get(i).getDistance());
        }
        //Tilføj System.out.print og bed brugeren indtaste hvilken medlem der skal ændres.

        int indexOfCompetitive = console.nextInt();
        System.out.println(newCompMember.get(indexOfCompetitive - 1));

        System.out.println("Enter new BestTime");
        double bestTime = console.nextDouble();

        System.out.println("Enter the date");
        String date = console.next();

        newCompMember.get(indexOfCompetitive - 1).setBestTime(bestTime);
        newCompMember.get(indexOfCompetitive - 1).setDate(date);

        System.out.println(newCompMember.get(indexOfCompetitive - 1));




    }
}
