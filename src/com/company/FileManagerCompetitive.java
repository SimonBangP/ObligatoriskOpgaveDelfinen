package com.company;

import java.io.*;
import java.util.*;

public class FileManagerCompetitive {

    //jeg oprettede filen i File-manageren for Competitive
    //Den fil indholder oplysninger som er relevant for træneren når har vil udtage svømmere
    //oplyninger bliver gemt i ArrayList'er som indeholder resultater og kun resultater
        File competitiveMembersFile = new File("CompetitiveMembersFile");

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

    public void readFromFile(File competitiveMembersFile)throws FileNotFoundException{}
}
