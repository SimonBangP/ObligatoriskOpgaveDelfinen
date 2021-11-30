package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class FileManagerMemberAL {

    File memberFile = new File("Member.txt");
    public void writeMemberToFile(ArrayList<Member> member, File memberFile) throws FileNotFoundException{

        PrintStream writeToMembersFile = new PrintStream(memberFile);

        for (int i = 0; i < member.size(); i++) {

            String firstName = member.get(i).firstName;
            String lastName = member.get(i).lastName;
            int age = member.get(i).age;
            int phoneNumber = member.get(i).phoneNumber;
            String email = member.get(i).email;
            String activityform = member.get(i).activityForm;
            int subscriptionamount = member.get(i).subscriptionAmount;


            writeToMembersFile.println(firstName + " " + lastName + " " + age + " " + phoneNumber + " " +
                    email + " " + activityform + " " + subscriptionamount);
        }
    }
    public void readMemberFile (ArrayList<Member> members, File memberFile) throws FileNotFoundException {
        Scanner read = new Scanner(new File("Member.txt"));

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
