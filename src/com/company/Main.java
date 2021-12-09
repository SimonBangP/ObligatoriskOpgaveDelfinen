// Author @ Nikolaj Skibsted
// Author @ Mohammad Stack
// Author @ Sille Lorentzen
// Author @ Simon Bang

package com.company;


import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

public static void main(String[] args) throws FileNotFoundException {

        MemberManager memberManager = new MemberManager();
        ListManager listManager = new ListManager();
        SubscriptionManager subscriptionManager = new SubscriptionManager();
        TrainingResultManager trainingResultManager = new TrainingResultManager();

        FileManagerRegMember fileManagerRegMember = new FileManagerRegMember();
        FileManagerCompMember fileManagerCompMember = new FileManagerCompMember();
             Scanner console = new Scanner(System.in);


            fileManagerRegMember.readRegMemberFile(listManager.regMember, fileManagerRegMember.regMemberFile);
            fileManagerCompMember.readCompetitiveFile(listManager.compMember, fileManagerCompMember.compMemberFile);


    System.out.println(" ooooo      oooo     oooooo      oooo    oooo    oooo      oooooo      oooo  oooo    oooo     oooo  oooo    oooo       oooooo      oooo  oooo ");
    System.out.println(" oooooo    ooooo    oooooooo     oooo    oooo   ooooo    ooooooooo     ooooooooooo ooooooo    ooooooooooo ooooooo     oooooooo     oooooooooooo ");
    System.out.println("  ooooo    oooo    oooooooooo    oooo    oooo  ooooo    ooooooooooo    oooooooooooooooooooo   oooooooooooooooooooo   oooooooooo    oooooooooooo ");
    System.out.println("  oooooo   oooo   oooooooooooo   oooo    oooo ooooo    ooooooooooooo   oooooooooooooooooooo   oooooooooooooooooooo  oooooooooooo   oooooooooooo ");
    System.out.println("  oooooo  oooo    ooooo  ooooo   oooo    oooo ooooo    ooooo   oooooo  oooooo ooooooo ooooo   oooooo ooooooo ooooo  ooooo  ooooo   oooooo ooooo ");
    System.out.println("   ooooo  oooo    oooo    oooo   oooo    ooooooooo     ooooo    ooooo  ooooo  oooooo  ooooo   ooooo  oooooo  ooooo  oooo    oooo   ooooo  ooooo  ");
    System.out.println("   oooooo oooo   ooooooooooooo   oooo    oooooooo     ooooo     ooooo  oooo   ooooo   ooooo   oooo   ooooo   ooooo ooooooooooooo   oooo    oooo  ");
    System.out.println("    ooooooooo    ooooooooooooo   oooo    ooooooooo    ooooo     ooooo  oooo   ooooo   ooooo   oooo   ooooo   ooooo ooooooooooooo   oooo    oooo ");
    System.out.println("    ooooooooo    ooooooooooooo   oooo    oooooooooo   ooooo     ooooo  oooo   ooooo   ooooo   oooo   ooooo   ooooo ooooooooooooo   oooo    oooo ");
    System.out.println("    ooooooooo     ooooo          oooo    oooooooooo    ooooo    ooooo  oooo   ooooo   ooooo   oooo   ooooo   ooooo  ooooo          oooo    oooo  ");
    System.out.println("     ooooooo      oooooo     o   oooo    oooo oooooo   ooooo   oooooo  oooo   ooooo   ooooo   oooo   ooooo   ooooo  oooooo     o   oooo    oooo  ");
    System.out.println("     ooooooo      oooooooooooo   oooo    oooo  oooooo  ooooooooooooo   oooo   ooooo   ooooo   oooo   ooooo   ooooo  oooooooooooo   oooo    oooo ");
    System.out.println("     ooooooo       ooooooooooo   oooo    oooo  ooooooo  ooooooooooo    oooo   ooooo   ooooo   oooo   ooooo   ooooo   ooooooooooo   oooo    oooo ");
    System.out.println("      ooooo         oooooooooo   oooo    oooo   oooooo   ooooooooo     oooo   ooooo   ooooo   oooo   ooooo   ooooo    oooooooooo   oooo    oooo   ");
    System.out.println("                       oooo                                ooooo                                                         oooo                    ");
    System.out.println();
    System.out.println("                                                        ooooooooooooooooo  oooo    oooo");
    System.out.println("                                                        ooooooooooooooooo  oooo    oooo");
    System.out.println("                                                        ooooooooooooooooo          oooo");
    System.out.println("                                                              ooooo        oooo    oooo");
    System.out.println("                                                              ooooo        oooo    oooo");
    System.out.println("                                                              ooooo        oooo    oooo");
    System.out.println("                                                              ooooo        oooo    oooo");
    System.out.println("                                                              ooooo        oooo    oooo");
    System.out.println("                                                              ooooo        oooo    oooo");
    System.out.println("                                                              ooooo        oooo    oooo");
    System.out.println("                                                              ooooo        oooo    oooo");
    System.out.println("                                                              ooooo        oooo    oooo");
    System.out.println("                                                              ooooo        oooo    oooo");
    System.out.println("                                                              ooooo        oooo    oooo");
    System.out.println("                                                              ooooo        oooo    oooo");
    System.out.println();
    System.out.println("  oooooooo                                                                             oooo         oooo                oooo         oooo                                 ");
    System.out.println(" ooooooooo                                                                             oooo         oooo                oooo         oooo                                 ");
    System.out.println(" ooooooooo                                                                             oooo         oooo                oooo         oooo                                 ");
    System.out.println("ooooo                       ooo  oo        oo     oo          oo     oo       oooo     oooo         oooo                oooo  ooo    oooo  ooo        oooo           ooo  ");
    System.out.println("ooooo      oooo    oooo  oooooooooo  oooooooooo oooooo  oooooooooo oooooo   oooooooo   oooo  ooooo  oooo   oooo   oooo  oooooooooo   oooooooooo     oooooooo   oooooooooo ");
    System.out.println(" oooooo    ooooo   oooo ooooooooooo  ooooooooooooooooo  ooooooooooooooooo  ooooooooo   oooo  oooo   oooo   oooo   oooo  ooooooooooo  ooooooooooo   ooooooooo   ooooooooooo ");
    System.out.println(" oooooooo  ooooo   ooo  ooooooooooo  ooooooooooooooooo  ooooooooooooooooo  oooooooooo  oooo oooo    oooo   oooo   oooo  oooooooooooo ooooooooooo  ooooooooooo  ooooooooooo ");
    System.out.println("  oooooooo  ooooo oooo  oooo oooooo  ooooo  ooooo oooo  ooooo  ooooo oooo ooooo  oooo  ooooooooo    oooo   oooo   oooo  ooooo  ooooo ooooo  ooooo ooooo  oooo  ooooo  oooo ");
    System.out.println("   oooooooo ooooo oooo oooooooooooo  oooo   oooo  oooo  oooo   oooo  oooo ooooooooooo  oooooooo     oooo   oooo   oooo  oooo    oooo oooo    oooo ooooooooooo  oooo   oooo ");
    System.out.println("     oooooo  oooo ooo  ooooooooooooo oooo   oooo  oooo  oooo   oooo  oooo ooooooooooo  oooooooo     oooo   oooo   oooo  oooo    oooo oooo    ooooo oooooooooo  oooo   oooo ");
    System.out.println("      ooooo  oooooooo  ooooooo oooo  oooo   oooo  oooo  oooo   oooo  oooo ooooooooooo  ooooooooo    oooo   oooo   oooo  oooo   ooooo oooo   oooooo oooooooooo  oooo   oooo ");
    System.out.println("       oooo  ooooooo   ooooooo oooo  oooo   oooo  oooo  oooo   oooo  oooo ooooo        oooooooooo   oooo   oooo  ooooo  oooo   ooooo oooo   ooooo  ooooo       oooo   oooo ");
    System.out.println("oooo oooooo   oooooo    ooooo ooooo  oooo   oooo  oooo  oooo   oooo  oooo  oooooooooo  oooo ooooo   oooo   ooooooooooo  ooooooooooo  ooooooooooo   oooooooooo  oooo   oooo ");
    System.out.println("ooooooooooo   oooooo    oooooooooo   oooo   oooo  oooo  oooo   oooo  oooo  oooooooooo  oooo  ooooo  oooo   ooooooooooo  ooooooooooo  ooooooooooo   oooooooooo  oooo   oooo ");
    System.out.println("oooooooooo     oooo    ooooooooooo   oooo   oooo  oooo  oooo   oooo  oooo   ooooooooo  oooo  oooooo oooo    oooooooooo  oooooooooo   oooooooooo    ooooooooo   oooo   oooo ");
    System.out.println();
    System.out.println("                                      oooooooooooo                     oooo     oooooooo oooo                                                ");
    System.out.println("                                      ooooooooooooo                    oooo    ooooooooo oooo                                                ");
    System.out.println("                                      ooooooooooooooo                  oooo    ooooo     oooo                                                ");
    System.out.println("                                      ooooooooooooooo                  oooo    ooooo                                                         ");
    System.out.println("                                      oooo     ooooooo     oooooo      oooo  oooooooooo  oooo    oooo  oooo        oooooo      oooo  oooo    ");
    System.out.println("                                      oooo      oooooo    oooooooo     oooo  oooooooooo  oooo    oooooooooooo     oooooooo     oooooooooooo  ");
    System.out.println("                                      oooo       ooooo   oooooooooo    oooo  oooooooooo  oooo    oooooooooooo    oooooooooo    oooooooooooo  ");
    System.out.println("                                      oooo       ooooo  oooooooooooo   oooo  oooooooooo  oooo    oooooooooooo   oooooooooooo   oooooooooooo  ");
    System.out.println("                                      oooo       oooooo ooooo  ooooo   oooo    ooooo     oooo    oooooo ooooo   ooooo  ooooo   oooooo ooooo  ");
    System.out.println("                                      oooo       oooooo oooo    oooo   oooo    ooooo     oooo    ooooo  ooooo   oooo    oooo   ooooo  ooooo  ");
    System.out.println("                                      oooo       ooooo ooooooooooooo   oooo    ooooo     oooo    oooo    oooo  ooooooooooooo   oooo    oooo  ");
    System.out.println("                                      oooo       ooooo ooooooooooooo   oooo    ooooo     oooo    oooo    oooo  ooooooooooooo   oooo    oooo  ");
    System.out.println("                                      oooo       ooooo ooooooooooooo   oooo    ooooo     oooo    oooo    oooo  ooooooooooooo   oooo    oooo  ");
    System.out.println("                                      oooo      oooooo  ooooo          oooo    ooooo     oooo    oooo    oooo   ooooo          oooo    oooo  ");
    System.out.println("                                      oooo    ooooooo   oooooo     o   oooo    ooooo     oooo    oooo    oooo   oooooo     o   oooo    oooo  ");
    System.out.println("                                      ooooooooooooooo   oooooooooooo   oooo    ooooo     oooo    oooo    oooo   oooooooooooo   oooo    oooo  ");
    System.out.println("                                      oooooooooooooo     ooooooooooo   oooo    ooooo     oooo    oooo    oooo    ooooooooooo   oooo    oooo  ");
    System.out.println("                                      oooooooooooo        oooooooooo   oooo    ooooo     oooo    oooo    oooo     oooooooooo   oooo    oooo  ");
    System.out.println("\n\n\n\n");



        int answer = 0;

            while (answer !=7){

        System.out.println("               |*******************************************************************************************************|");
        System.out.println("               |       ______________                    ______________                      ______________            |");
        System.out.println("               |      |   ENTER 1    |                  |   Enter 2    |                    |   ENTER 3    |           |");
        System.out.println("               |      |              |                  |              |                    |              |           |");
        System.out.println("               |      |   CREATE     |                  |    CHANGE    |                    |    DELETE    |           |");
        System.out.println("               |      |    NEW       |                  |    MEMBER    |                    |      A       |           |");
        System.out.println("               |      |   MEMBER     |                  |  INFORMATION |                    |    MEMBER    |           |");
        System.out.println("               |      |______________|                  |______________|                    |______________|           |");
        System.out.println("               |                                                                                                       |");
        System.out.println("               |       ______________                    ______________                      ______________            |");
        System.out.println("               |      |   Enter 4    |                  |   Enter 5    |                    |   Enter 6    |           |");
        System.out.println("               |      |              |                  |              |                    |              |           |");
        System.out.println("               |      |     SEE      |                  |   REGISTER   |                    |     SEE      |           |");
        System.out.println("               |      |    TOTAL     |                  |     NEW      |                    |     TOP      |           |");
        System.out.println("               |      | SUBSCRIPTION |                  |   TRAINING   |                    |     FIVE     |           |");
        System.out.println("               |      |    AMOUNT    |                  |    RESULT    |                    |   SWIMMERS   |           |");
        System.out.println("               |      |______________|                  |______________|                    |______________|           |");
        System.out.println("               |                                                                                                       |");
        System.out.println("               |               _______________________________________________________________                         |");
        System.out.println("               |              |                            ENTER 7                            |                        |");
        System.out.println("               |              |                                                               |                        |");
        System.out.println("               |              |                       CLOSE THE PROGRAM                       |                        |");
        System.out.println("               |              |                                                               |                        |");
        System.out.println("               |*******************************************************************************************************|");


        answer = console.nextInt();

       switch (answer){

               case 1:
                  memberManager.createMember(console, listManager.compMember, listManager.regMember);
                        break;

               case 2:
                  memberManager.changeMember(console, listManager.regMember, listManager.compMember);
                        break;

               case 3:
                  memberManager.deleteMember(console, listManager.regMember, listManager.compMember);
                       break;

               case 4:

                   System.out.print(subscriptionManager.getSubscriptionSum(listManager.compMember, listManager.regMember));

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
                       break;
            }
        }
    }
}


