package com.company;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {


public static void main(String[] args) {





        MemberManager memberManager = new MemberManager();
        ListManager listManager = new ListManager();


        Scanner console = new Scanner(System.in);

        memberManager.createMember(console, listManager.newMember, listManager.newCompMember, listManager.newRegMember);

        memberManager.changeMember(console, listManager.newMember);

    }
}


