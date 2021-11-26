package com.company;


import java.util.ArrayList;

public class Main {


public static void main(String[] args) {
        ArrayList<Member> newMember = new ArrayList<Member>();
        ArrayList<Competitive> newCompMember = new ArrayList<>();
        ArrayList<Regular> newRegMember = new ArrayList<>();

        Member Simon = new Member("Simon", "bang", 25, 12345, "sbp@gagag", 1600);
        Competitive Nikolaj = new Competitive("Nikolaj", "Skibsted", 47, 123456, "Skibstedn@dasdas", 1600, "Crawl", 800, 05.10, "25/11-21" );


        newMember.add(Simon);
        newCompMember.add(Nikolaj);

        TrainingResultManager resultManager = new TrainingResultManager();

        resultManager.updateBestTime(newCompMember);

    }
}


