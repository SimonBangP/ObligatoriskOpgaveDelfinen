package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class FileManagerCompMember {

    File compMemberFile = new File("CompMember.txt");

        public void writeCompetitiveToFile (ArrayList<Competitive> competitive, File compMemberFile) throws FileNotFoundException{

            PrintStream writeToCompetitive = new PrintStream(compMemberFile);

            for(int i = 0; i < competitive.size(); i++) {

                String firstName = competitive.get(i).firstName;
                String lastName = competitive.get(i).lastName;
                int age = competitive.get(i).age;
                int phoneNumber = competitive.get(i).phoneNumber;
                String email = competitive.get(i).email;
                String activityform = competitive.get(i).activityForm;
                int subscriptionamount = competitive.get(i).subscriptionAmount;
                String discipline = competitive.get(i).discipline;
                double besttime = competitive.get(i).bestTime;
                String date = competitive.get(i).date;
                int distance = competitive.get(i).distance;
                //ArrayList<String> besttimes = competitive.get(i).bestTimes;

                writeToCompetitive.println(firstName + " " + lastName + " " + age + " " + phoneNumber + " " +
                        email + " " + activityform + " " + subscriptionamount + " " + discipline + " " + besttime +
                        " " + date + " " + distance);
            }

        }

    public void readCompetitiveFile (ArrayList<Competitive> competitive, File competitiveFile) throws FileNotFoundException {
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
            String discipline = lineScan.next();
            double besttime = lineScan.nextDouble();
            String date = lineScan.next();
            int distance = lineScan.nextInt();
            //ArrayList<Result> besttimes =



            Competitive newCompetitve = new Competitive(firstName,lastName,age,phoneNumber,email,activityform,subscriptionamount,discipline,distance,besttime,date);

            competitive.add(newCompetitve);

        }
    }
}
