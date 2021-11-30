package com.company;

import java.io.*;
import java.util.*;

public class FileManagerCompetitive {


    File competitiveMembersFile = new File("CompetitiveMembersFile");


    public void writeToFile(File competitiveMembersFile, ArrayList<Competitive> newCompMember)throws FileNotFoundException {
        PrintStream printStream = new PrintStream(competitiveMembersFile);
        for (int i = 0; i < newCompMember.size(); i++) {

            printStream.println("Competitive-Member: "+(i+ 1));

            printStream.println(newCompMember.get(i).getFirstName()+" "+
                    newCompMember.get(i).getLastName()+" "+newCompMember.get(i).getAge()+" "+newCompMember.get(i).getDiscipline()+" "+
                    newCompMember.get(i).getDistance());
            printStream.println("Time\tDate");
            for(int j = 0; j < newCompMember.get(i).bestTimes.size(); j++){

                printStream.println(newCompMember.get(i).bestTimes.get(j));
            }
            printStream.println();
        }
    }

    public void readFromFile(File competitiveMembersFile)throws FileNotFoundException{}
}
