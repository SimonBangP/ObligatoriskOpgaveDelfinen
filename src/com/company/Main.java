package com.company;


import java.util.ArrayList;

public class Main {


public static void main(String[] args) {
        ArrayList<Member> newMember = new ArrayList<Member>();
        ArrayList<Competitive> newCompMember = new ArrayList<>();
        ArrayList<Regular> newRegMember = new ArrayList<>();

        Member Simon = new Member("Simon", "bang", 25, 12345, "sbp@gagag", 1600);
        Competitive Nikolaj = new Competitive("Nikolaj", "Skibsted", 47, 123456, "Skibstedn@dasdas", 1600, "Crawl", 800, 05.10, "25/11-21" );
        Regular Sille = new Regular("Sille", "løkke", 23, 384920, "sille@lol.com",1600,"Active");
        Member Johnny = new Member("Johnny","Svendsen",65,4545345,"johnSvend@lol.com",1200);
        Competitive Mohammad = new Competitive("Mohammad", "Fadhil", 33, 29346, "MoMo@lol.com", 1600, "Backcrawl", 400,03.05,"22/10-21");
        Regular Mette = new Regular("Mette","Frederiksen",85,23784,"levmeddet@borgen.dk", 500,"passive");

        newMember.add(Simon);
        newCompMember.add(Nikolaj);
        newRegMember.add(Sille);
        newMember.add(Johnny);
        newCompMember.add(Mohammad);
        newRegMember.add(Mette);

        //Opretter et Subscription objekt  og kalder instance metoden getSubscriptionSum på listerne
        SubscriptionManager totalSubscriptions = new SubscriptionManager();
        int S = totalSubscriptions.getSubscriptionSum(newMember, newCompMember, newRegMember);
        System.out.println("Total income from subscriptions : " + S + "Kr");
        //Skriver return værdien(den samlede sum af kontingenter) i konsollen

        TrainingResultManager resultManager = new TrainingResultManager();

        resultManager.updateBestTime(newCompMember);

    }
}


