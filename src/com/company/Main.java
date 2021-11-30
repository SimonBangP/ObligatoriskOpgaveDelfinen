package com.company;


import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {


public static void main(String[] args) throws FileNotFoundException {

        MemberManager createMember = new MemberManager();
        ListManager listManager = new ListManager();


        Scanner console = new Scanner(System.in);



        createMember.createMember(console, listManager.newMember, listManager.newCompMember, listManager.newRegMember);







        //Mo's test områdde
    //Create a test member
    createMember.createMember(console, listManager.newMember, listManager.newCompMember, listManager.newRegMember);
    //update his/her results list
    TrainingResultManager resultManager = new TrainingResultManager();
    resultManager.updateBestTime(console, listManager.newCompMember);
    resultManager.updateBestTime(console, listManager.newCompMember);
    resultManager.updateBestTime(console, listManager.newCompMember);
    //print to file to see result
    FileManagerCompetitive competitiveFileManager = new FileManagerCompetitive();
    competitiveFileManager.writeToFile(competitiveFileManager.competitiveMembersFile, listManager.newCompMember);



}
}


