package com.company;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


public static void main(String[] args) {
        MemberManager memberManager = new MemberManager();
        TrainingResultManager trainingResultManager = new TrainingResultManager();
        SubscriptionManager subscriptionManager = new SubscriptionManager();


        ListManager listManager = new ListManager();
        Scanner console = new Scanner(System.in);


        Member Simon = new Member("Simon", "bang", 25, 12345, "sbp@gagag", "active", 1600);
        Competitive Martin = new Competitive("Martin", "Smith", 38, 123456, "msmith@dasdas", "active", 1600, "Crawl", 800, 05.10, "25/11-21" );
        Regular Mo = new Regular("Mo", "Stack", 32, 988775, "moStack@gam", "passive", 500/*, "Passive"*/);

        listManager.newMember.add(Simon);
        listManager.newCompMember.add(Martin);
        listManager.newRegMember.add(Mo);

        memberManager.createMember(console, listManager.newMember, listManager.newCompMember, listManager.newRegMember);

    }
}


