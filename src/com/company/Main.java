package com.company;


import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {


public static void main(String[] args) throws FileNotFoundException {

        DisciplineHandler disciplineManager = new DisciplineHandler();

        MemberManager memberManager = new MemberManager();
        ListManager listManager = new ListManager();
        SubscriptionManager subscriptionManager = new SubscriptionManager();
        TrainingResultManager trainingResultManager = new TrainingResultManager();
        FileManager fileManager = new FileManager();
        FileManagerRegMember fileManagerRegMember = new FileManagerRegMember();
        FileManagerCompMember fileManagerCompMember = new FileManagerCompMember();
        Scanner console = new Scanner(System.in);

            fileManagerRegMember.readMemberFile(listManager.regMember, fileManagerRegMember.regMemberFile);
            fileManagerCompMember.readCompetitiveFile(listManager.compMember, fileManagerCompMember.compMemberFile, disciplineManager);



        Competitive Bob = new Competitive("Bob", "Johnson", 33, 34762378, "Bob@lol.com","active",1600, disciplineManager.discipline2, 800, 07.10, "11/09-20");
        Member Kim = new Member("Kim", "Larsen",62, 34873847,"Kim@lol.com", "active", 1200);
        Regular Liz = new Regular("Liz","Smith", 35, 34748569, "Liz@lol.com","active", 1600, 3, "crawl");
        Member John = new Member("John", "Smith", 52, 36363636, "John@lol.com","Passive",500);
        Competitive Simon = new Competitive("Simon","Bang",25,22334455,"simon@simon.dk","Active", 1600, disciplineManager.discipline1, 600, 05.35, "03/12-21");
        Competitive Mo = new Competitive("Mo", "Stacks", 31, 33445566, "mo@mo.dk", "Active", 1600, disciplineManager.discipline4, 800, 10.22, "24/12-21");

        listManager.member.add(Kim);
        listManager.compMember.add(Bob);
        listManager.regMember.add(Liz);
        listManager.member.add(John);
        listManager.compMember.add(Simon);
        listManager.compMember.add(Mo);

    while (true){//fejlen var her, vores while-loop var placeret således at nå vi trykkede 1 første gang
        //så updaterede den vores variable int ans til 1, og dermed var den altid 1 og derfor
        //gik vores while loop ind i case 1 uendeligt og bad os om at oprette ny bruger.
        //Jeg har opretter field Discipline, så vi ændrer vores String discipline, til Object Discipline

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



       switch (answer){

               case 1:
                  memberManager.createMember(console, listManager.member, listManager.compMember, listManager.regMember, disciplineManager);
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
                fileManagerRegMember.writeRegMemberToFile(listManager.regMember, fileManagerRegMember.regMemberFile);
                fileManagerCompMember.writeCompetitiveToFile(listManager.compMember, fileManagerCompMember.compMemberFile);
                       break;

               default:
                       return;
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


