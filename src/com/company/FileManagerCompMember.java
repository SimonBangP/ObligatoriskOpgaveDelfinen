package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class FileManagerCompMember {

    File compMemberFile = new File("CompMember.txt");

        public void writeCompetitiveToFile (ArrayList<MemberCompetitive> memberCompetitive, File compMemberFile) throws FileNotFoundException{

            PrintStream writeToCompetitive = new PrintStream(compMemberFile);

            for(int i = 0; i < memberCompetitive.size(); i++) {

                String firstName = memberCompetitive.get(i).firstName;
                String lastName = memberCompetitive.get(i).lastName;
                int age = memberCompetitive.get(i).age;
                int phoneNumber = memberCompetitive.get(i).phoneNumber;
                String email = memberCompetitive.get(i).email;
                String activityform = memberCompetitive.get(i).activityForm;
                int subscriptionamount = memberCompetitive.get(i).subscriptionAmount;
                Discipline discipline = memberCompetitive.get(i).discipline;
                double besttime = memberCompetitive.get(i).result.getTime();
                String date = memberCompetitive.get(i).result.regDate;
                int distance = memberCompetitive.get(i).distance;
                //ArrayList<String> besttimes = competitive.get(i).bestTimes;

                writeToCompetitive.println(firstName + " " + lastName + " " + age + " " + phoneNumber + " " +
                        email + " " + activityform + " " + subscriptionamount + " " + discipline + " " + besttime +
                        " " + date + " " + distance);//rettelse af rækkefølgen: Disciplin - Distance - bestTime - bestTimeDate
            }

        }

    public void readCompetitiveFile (ArrayList<MemberCompetitive> memberCompetitive, File competitiveFile, DisciplineHandler disciplineManager) throws FileNotFoundException {
        Scanner read = new Scanner(new File("Competitive.txt"));

        while (read.hasNextLine()) {

            String line = read.nextLine();

            Scanner lineScan = new Scanner(line);

            String firstName = lineScan.next();
            String lastName = lineScan.next();
            int age = lineScan.nextInt();
            int phoneNumber = lineScan.nextInt();
            String email = lineScan.next();
            String activityform = lineScan.next();
            int subscriptionamount = lineScan.nextInt();
            String disciplineScan = lineScan.next();
            double besttime = lineScan.nextDouble();
            String date = lineScan.next();
            int distance = lineScan.nextInt();//husk at rette rækkefølgen her også
            //ArrayList<Result> besttimes =
            Discipline discipline = null;
            if(disciplineScan.equalsIgnoreCase("Butterfly")){
                discipline = disciplineManager.discipline1;
            }
            else if(disciplineScan.equalsIgnoreCase("Crawl")){
                discipline = disciplineManager.discipline2;
            }
            else if(disciplineScan.equalsIgnoreCase("Back-Crawl")){
                discipline = disciplineManager.discipline3;
            }
            else if (disciplineScan.equalsIgnoreCase("chest")){
                discipline = disciplineManager.discipline4;}
            else {
                System.out.println("Wrong value try again!");
            }



            MemberCompetitive newCompetitve = new MemberCompetitive(firstName,lastName,age,phoneNumber,email,activityform,subscriptionamount,discipline,distance,new Result(besttime,date));

            memberCompetitive.add(newCompetitve);

        }
    }
}
