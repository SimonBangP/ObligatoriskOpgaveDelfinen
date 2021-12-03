package com.company;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {


public static void main(String[] args) throws FileNotFoundException {

        MemberManager memberManager = new MemberManager();
        ListManager listManager = new ListManager();
        SubscriptionManager subscriptionManager = new SubscriptionManager();
        TrainingResultManager trainingResultManager = new TrainingResultManager();
        FileManager fileManager = new FileManager();


            //File memberFile = new File("Member.txt");
            File regMemberFile = new File("RegMember.txt");
            File competitiveFile = new File("Competitive.txt");
            //FileManagerMemberAL.readMemberFile(listManager.member, memberFile);
            FileManagerRegMember.readMemberFile(listManager.regMember, regMemberFile);
            FileManagerCompMember.writeCompetitiveToFile(listManager.compMember, competitiveFile);



        Competitive Bob = new Competitive("Bob", "Johnson", 33, 34762378, "Bob@lol.com","active",1600,"crawl", 800, 07.10, "11/09-20");
        Member Kim = new Member("Kim", "Larsen",62, 34873847,"Kim@lol.com", "active", 1200);
        Regular Liz = new Regular("Liz","Smith", 35, 34748569, "Liz@lol.com","active", 1600, 3, "crawl");
        Member John = new Member("John", "Smith", 52, 36363636, "John@lol.com","Passive",500);
        Competitive Simon = new Competitive("Simon","Bang",25,22334455,"simon@simon.dk","Active", 1600, "Butterfly", 600, 05.35, "03/12-21");
        Competitive Mo = new Competitive("Mo", "Stacks", 31, 33445566, "mo@mo.dk", "Active", 1600, "Chest", 800, 10.22, "24/12-21");

        listManager.member.add(Kim);
        listManager.compMember.add(Bob);
        listManager.regMember.add(Liz);
        listManager.member.add(John);
        listManager.compMember.add(Simon);
        listManager.compMember.add(Mo);



        Scanner console = new Scanner(System.in);
/*
        //memberManager.memberManager(console, listManager.newMember, listManager.newCompMember, listManager.newRegMember);


        /*System.out.println(subscriptionManager.getSubscriptionSum(listManager.newMember,
            listManager.newCompMember,listManager.newRegMember));*/




        System.out.println("|*******************************************************************************************************|");
        System.out.println("|       ______________                    ______________                      ______________            |");
        System.out.println("|      |   ENTER 1    |                  |   Enter 2    |                    |   ENTER 3    |           |");
        System.out.println("|      |              |                  |              |                    |              |           |");
        System.out.println("|      |   CREATE     |                  |    CHANGE    |                    |    DELETE    |           |");
        System.out.println("|      |    NEW       |                  |    MEMBER    |                    |      A       |           |");
        System.out.println("|      |   MEMBER     |                  |  INFORMATION |                    |    MEMBER    |           |");
        System.out.println("|      |______________|                  |______________|                    |______________|           |");
        System.out.println("|                                                                                                       |");
        System.out.println("|       ______________                    ______________                      ______________            |");
        System.out.println("|      |   Enter 4    |                  |   Enter 5    |                    |   Enter 6    |           |");
        System.out.println("|      |              |                  |              |                    |              |           |");
        System.out.println("|      |     SEE      |                  |   REGISTER   |                    |     SEE      |           |");
        System.out.println("|      |   CURRENT    |                  |     NEW      |                    |     TOP      |           |");
        System.out.println("|      | SUBSCRIPTION |                  |   TRAINING   |                    |     FIVE     |           |");
        System.out.println("|      |    AMOUNT    |                  |    RESULT    |                    |   SWIMMERS   |           |");
        System.out.println("|      |______________|                  |______________|                    |______________|           |");
        System.out.println("|                                                                                                       |");
        System.out.println("|               _______________________________________________________________                         |");
        System.out.println("|              |                            ENTER 7                            |                        |");
        System.out.println("|              |                                                               |                        |");
        System.out.println("|              |                       CLOSE THE PROGRAM                       |                        |");
        System.out.println("|              |                                                               |                        |");
        System.out.println("|*******************************************************************************************************|");


        int answer = console.nextInt();

        while (answer !=7){

       switch (answer){

               case 1:
                  memberManager.createMember(console, listManager.member, listManager.compMember, listManager.regMember);
                        break;

               case 2:
                  memberManager.changeMember(console, listManager.member, listManager.regMember, listManager.compMember);
                        break;

               case 3:
                  memberManager.deleteMember(console, listManager.member, listManager.regMember, listManager.compMember);
                       break;

               case 4:
                  subscriptionManager.getSubscriptionSum(listManager.member, listManager.compMember, listManager.regMember);
                       break;

               case 5:
                  trainingResultManager.updateBestTime(console, listManager.compMember);
                       break;

               case 6:

                       break;


                case 7:
                FileManagerRegMember.writeRegMemberToFile(listManager.regMember, regMemberFile);
                FileManagerCompMember.writeCompetitiveToFile(listManager.compMember, competitiveFile);
                       break;

               default:
                       break;
        }
    }



   /* //Mo's test områdde
  //Create a test member
    //memberManager.memberManager(console, listManager.newMember, listManager.newCompMember, listManager.newRegMember);
    //update his/her results list
    TrainingResultManager resultManager = new TrainingResultManager();
   /* resultManager.updateBestTime(console, listManager.newCompMember);
    resultManager.updateBestTime(console, listManager.newCompMember);
    resultManager.updateBestTime(console, listManager.newCompMember);
    //print to file to see result

    competitiveFileManager.writeToFile(competitiveFileManager.competitiveMembersFile, listManager.newCompMember);

    //competitiveFileManager.readFromFile(competitiveFileManager.competitiveMembersFile, listManager.newCompMember);
*/
   /* FileManagerCompetitive competitiveFileManager = new FileManagerCompetitive();
    //trainingResultManager.updateBestTime(console, listManager.compMember);
        //trainingResultManager.updateBestTime(console, listManager.compMember);
        //trainingResultManager.updateBestTime(console, listManager.compMember);
        //trainingResultManager.updateBestTime(console, listManager.compMember);
        //competitiveFileManager

        competitiveFileManager.readFromFile(competitiveFileManager.competitiveMembersFile, listManager.compMember);

*/

}
}


