package com.company;


import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {


public static void main(String[] args) throws FileNotFoundException {

        MemberManager createMember = new MemberManager();
        ListManager listManager = new ListManager();
        SubscriptionManager subscriptionManager = new SubscriptionManager();

        Competitive Bob = new Competitive("Bob", "Johnson", 33, 34762378, "Bob@lol.com","active",1600,"crawl", 800/*, 07.10, "11/09-20"*/);
        Member Kim = new Member("Kim", "Larsen",62, 34873847,"Kim@lol.com", "active", 1200);
        Regular Liz = new Regular("Liz","Smith", 35, 34748569, "Liz@lol.com","active", 1600, 3, "crawl");
        Member John = new Member("John", "Smith", 52, 36363636, "John@lol.com","Passive",500);

        listManager.newMember.add(Kim);
        listManager.newCompMember.add(Bob);
        listManager.newRegMember.add(Liz);
        listManager.newMember.add(John);

        System.out.println(subscriptionManager.getSubscriptionSum(listManager.newMember,
            listManager.newCompMember,listManager.newRegMember));

        Scanner console = new Scanner(System.in);

        //createMember.createMember(console, listManager.newMember, listManager.newCompMember, listManager.newRegMember);







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


