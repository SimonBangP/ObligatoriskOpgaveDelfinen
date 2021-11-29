package com.company;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {


public static void main(String[] args) {
        MemberManager createMember = new MemberManager();
        Scanner console = new Scanner(System.in);
        ArrayList<Member> newMember = new ArrayList<Member>();
        ArrayList<Competitive> newCompMember = new ArrayList<>();
        ArrayList<Regular> newRegMember = new ArrayList<>();

        Member Simon = new Member("Simon", "bang", 25, 12345, "sbp@gagag", 1600);
        Competitive Martin = new Competitive("Martin", "Smith", 38, 123456, "msmith@dasdas", 1600, "Crawl", 800, 05.10, "25/11-21" );
        Regular Mo = new Regular("Mo", "Stack", 32, 988775, "moStack@gam", 500, "Passive");

        newMember.add(Simon);

        createMember.createMember(console, newMember, newCompMember, newRegMember);



    }
}


