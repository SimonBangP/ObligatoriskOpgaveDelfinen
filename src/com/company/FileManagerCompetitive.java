package com.company;

import java.io.*;
import java.util.*;
import java.text.*;

public class FileManagerCompetitive {

    //jeg oprettede filen i File-manageren for Competitive
    //Den fil indholder oplysninger som er relevant for træneren når har vil udtage svømmere
    //oplyninger bliver gemt i en ArrayList som indeholder resultater og kun resultater
        File competitiveMembersFile = new File("CompetitiveMembersFile");

    //jeg oprettede efterfølgende en anden fil, der kun indeholder Result-Objekter
        //File resultsStorageFile = new File("ResultStorageFile.txt");

    //I metoden for jeg brug for en liste over konkurrence svømmere og en fil som parameter
    public void writeToFile(File competitiveMembersFile, ArrayList<Competitive> newCompMember)throws FileNotFoundException {

        //Jeg starter med at oprette mit PrintStream object
        PrintStream printStream = new PrintStream(competitiveMembersFile);

        //Jeg vil gerne udskrive i filen iterativt, derfor arbejder jeg ind i et for-Loop
        //det for-loop kører så mange gange som der er konkurrence svømmere, og bliver inkrementeret løbende
        for (int i = 0; i < newCompMember.size(); i++) {

            //det her statement skriver den første sætning i filen: Den sætning fortæller at det er en konkurrence svømmer, og index
            printStream.println("Competitive-Member: "+(i+ 1));

            //det her statement skriver den nogle af svømmerens oplysninger som navn, efternavn, alder og disciplin
            //jeg tager svømmeren der er i index i, fra ArrayList newCompMember
            //Så ved hjælp af getters n setters trækker jeg oplysningerne
            printStream.println(newCompMember.get(i).getFirstName()+" "+
                    newCompMember.get(i).getLastName()+" "+newCompMember.get(i).getAge()+" "+newCompMember.get(i).getDiscipline()+" "+
                    newCompMember.get(i).getDistance());

            //det her statement fortæller hvad det er vi ser på
            printStream.println("Time\tDate");

            //her brugte jeg endnu et for-loop/et nested-for-loop
            //dette for-loop kører så mange gange som medlem på index i, i ArrayList newCompMember har resultater
            //int j, representere index i ArrayList bestTimes
            //ArrayListen bestTimes er del af fields'ne for hver konkurrence svømmer
            //fordi hver konkurrence svømmer har tilknyttet en liste over hans/hendes resultater
            //j bliver inkremnteret for iteration
            for(int j = 0; j < newCompMember.get(i).bestTimes.size(); j++){

                //den tager fat i ArrayList bestTimes og trækker en lang String der hedder result
                //som besår af en tid, og tidens dato
                //under metoden updateBestTime i klassen TrainingResultManager som bliver kaldt fra Main
                printStream.println(newCompMember.get(i).bestTimes.get(j));
            }

            //Statment her udkriver en blank linje for at seperere fra den næste svømmer
            printStream.println();
        }

    }

    //jeg er blevet vejledet til at have en seperat fil som er en test fil
    //I den fil skal der ikke stå informationer, men kun tokens sepereret af ":".
    //De tokens gemmes til ArrayListerne til de forskellige konkurrence svømmere
    public void writeToFileProgrammer(File resultsStorageFile, ArrayList<Competitive> newCompMember)throws FileNotFoundException{

        PrintStream printStream = new PrintStream(resultsStorageFile);

        for (int i = 0; i < newCompMember.size(); i++) {
            for(int j = 0; j < newCompMember.get(i).bestTimes.size(); j++){
                printStream.print(newCompMember.get(i).bestTimes.get(j)+":");
            }
            System.out.println();
        }
    }

    public void readFromFile(File competitiveMembersFile, ArrayList<Competitive> newCompMember)throws FileNotFoundException {

        Scanner read = new Scanner(competitiveMembersFile);
        //int j = 0;
        int i = 0;
        while (read.hasNextLine()){
            //String line = read.nextLine();
            Scanner lineScan = new Scanner(read.nextLine());

            while (lineScan.hasNext()){
                //for (int i = 0; i < newCompMember.size(); i++) {

                    double resTime = read.nextDouble();
                    String resDate = read.next();

                    Result result = new Result(resTime, resDate);
                    newCompMember.get(i).bestTimes.add(result);


            }
            i ++;
           //if(!read.hasNextLine()){break;}
        }


            //String line = read.nextLine();
            //Scanner lineScan = new Scanner(line);



            //String splittingHelp[] = line.split(":");
/*
            for (int i = 0; i < newCompMember.get(j).bestTimes.size(); i++){
                String result = splittingHelp[i];

                System.out.println(result);
                //if(!read.hasNextLine()){
                    break;
                }
            }j ++;*/












        }


/*
        do
        while (read.hasNextLine()) {



            String line = read.nextLine();


            if(line.contentEquals("********************")){
                //change member
                i = i++;
                break;
            }

            String splittingHelp[] = line.split(":", 2);

            String lineTime = splittingHelp[0];
            String lineDate = splittingHelp[1];

            double resTime = Double.parseDouble(lineTime);

            //System.out.println(resTime);
            //System.out.println(lineDate);

            Result r = new Result(resTime, lineDate);

            newCompMember.get(i).bestTimes.add(r);

            for(int j= 0; j < newCompMember.get(i).bestTimes.size(); j++){


                System.out.println(newCompMember.get(i).bestTimes.get(j));
            }






            //System.out.println(line);
            //Scanner lineScan = new Scanner(line);


            //String result = lineScan.nextLine();


            //System.out.println(result);

        }*/


    }

