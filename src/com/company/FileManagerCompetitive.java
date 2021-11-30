package com.company;

import java.io.*;
import java.util.*;

public class FileManagerCompetitive {

    File competitiveMembersFile = new File("CompetitiveMembersFile");


    public void writeToFile(File competitiveMembersFile, ArrayList<Competitive> newCompMember)throws FileNotFoundException {
        PrintStream printStream = new PrintStream(competitiveMembersFile);
        for (int i = 0; i < newCompMember.size(); i++) {
            printStream.println("Competitive-Member ");
            printStream.println((i +1)+". "+(i+ 1)+": "+newCompMember.get(i).getFirstName()+" "+
                    newCompMember.get(i).getLastName()+" "+newCompMember.get(i).getDiscipline()+" "+
                    newCompMember.get(i).getDistance());
            for(int j = 0; j < newCompMember.get(i).bestTimes.size(); i++){
                printStream.println(newCompMember.get(i).bestTimes.get(j));//den nye arrayList
            }
        }
    }

    public void readFromFile(File competitiveMembersFile)throws FileNotFoundException{}
}
//changechange change
//change