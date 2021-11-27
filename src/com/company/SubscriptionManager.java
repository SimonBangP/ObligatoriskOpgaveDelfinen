//Author @ Nikolaj Skibsted

package com.company;

import java.util.ArrayList;

public class SubscriptionManager {

    private int sum1,sum2,sum3 = 0;

    //traverserer hvert Arraylist og returnerer summen af alle kontingenter
    public int getSubscriptionSum(ArrayList<Member> newMember, ArrayList<Competitive> newCompMember, ArrayList<Regular> newRegMember) {
        for (int i = 0; i < newMember.size(); i++) {
            int a = newMember.get(i).getSubscriptionAmount();
            sum1 += a;
        }
        for (int i = 0; i < newCompMember.size(); i++) {
           int b =  newCompMember.get(i).getSubscriptionAmount();
            sum2 += b;
        }
        for (int i = 0; i < newRegMember.size(); i++) {
            int c =  newRegMember.get(i).getSubscriptionAmount();
            sum3 += c;
        }
        return sum1+sum2+sum3;
    }
}
