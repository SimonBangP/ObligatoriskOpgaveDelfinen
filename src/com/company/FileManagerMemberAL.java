package com.company;

import java.io.File;
import java.io.FileNotFoundException;
//import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class FileManagerMemberAL {

    File memberFile = new File("Members.txt");
    public void writeprivateRentalToFile(ArrayList<Member> members, File memberFile) throws FileNotFoundException{

        PrintStream writeToMembersFile = new PrintStream(memberFile);

        for (int i = 0; i < members.size(); i++) {

            String firstName = members.get(i).firstName;
            String lastName = members.get(i).lastName;
            int age = members.get(i).age;
            int phoneNumber = members.get(i).phoneNumber;
            String email = members.get(i).email;
            String activityform = members.get(i).activityForm;
            int subscriptionamount = members.get(i).subscriptionAmount;


            writeToMembersFile.println(firstName + " " + lastName + " " + age + " " + phoneNumber + " " +
                    email + " " + activityform + " " + subscriptionamount);
        }
    }
    public void readPrivateRentalFile (ArrayList<Member> members, File memberFile) throws FileNotFoundException {
        Scanner read = new Scanner(new File("Members.txt"));

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

            Member newMember = new Member(firstName,lastName,age,phoneNumber,email,activityform,subscriptionamount);

            members.add(newMember);

        }
    }
}
