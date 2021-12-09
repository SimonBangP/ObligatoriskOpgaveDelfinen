// Author @ Mohammad Stack

package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class FileManagerRegMember {

    File regMemberFile = new File("RegMember.txt");

    public void readRegMemberFile(ArrayList<MemberRegular> regMembers, File regMemberFile) throws FileNotFoundException {
        Scanner read = new Scanner(regMemberFile);

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
            int swimsPerWeek = lineScan.nextInt();
            String favouriteDiscipline = lineScan.next();

            MemberRegular newRegMember = new MemberRegular(firstName,lastName,age,phoneNumber,email,activityform,subscriptionamount, swimsPerWeek, favouriteDiscipline );

            regMembers.add(newRegMember);

        }
    }

    public void writeRegMemberToFile(ArrayList<MemberRegular> regMember, File regMemberFile) throws FileNotFoundException {

        PrintStream writeToMembersFile = new PrintStream(regMemberFile);

        for (int i = 0; i < regMember.size(); i++) {

            String firstName = regMember.get(i).firstName;
            String lastName = regMember.get(i).lastName;
            int age = regMember.get(i).age;
            int phoneNumber = regMember.get(i).phoneNumber;
            String email = regMember.get(i).email;
            String activityform = regMember.get(i).activityForm;
            int subscriptionamount = regMember.get(i).subscriptionAmount;
            int swimsPerWeek = regMember.get(i).swimsPerWeek;
            String favouriteDiscipline = regMember.get(i).favouriteDiscipline;


            writeToMembersFile.println(firstName + " " + lastName + " " + age + " " + phoneNumber + " " +
                    email + " " + activityform + " " + subscriptionamount + " " +  swimsPerWeek + " " + favouriteDiscipline );
        }
    }
}
