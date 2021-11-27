package com.company;

import java.util.*;

public class TrainingResultManager {

    public void updateBestTime(ArrayList<Competitive> newCompMember){
        Scanner scan = new Scanner(System.in);
        for(int i = 0; i < newCompMember.size(); i++){
            System.out.println((i+ 1)+": "+newCompMember.get(i).getFirstName()+
                    newCompMember.get(i).getLastName()+newCompMember.get(i).getDiscipline()+
                    newCompMember.get(i).getDistance());
        }
        int indexOfCompetitive = scan.nextInt();
        System.out.println(newCompMember.get(indexOfCompetitive - 1));

        System.out.println("Enter new BestTime");
        double bestTime = scan.nextDouble();

        System.out.println("Enter the date");
        String date = scan.next();

        newCompMember.get(indexOfCompetitive - 1).setBestTime(bestTime);
        newCompMember.get(indexOfCompetitive - 1).setDate(date);

        System.out.println(newCompMember.get(indexOfCompetitive - 1));




    }
}
