package com.company;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {


public static void main(String[] args) {

        MemberManager createMember = new MemberManager();
        ListManager listManager = new ListManager();


        Scanner console = new Scanner(System.in);



        createMember.createMember(console, listManager.newMember, listManager.newCompMember, listManager.newRegMember);



    }
}


