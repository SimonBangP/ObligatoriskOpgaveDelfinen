//Author @ Nikolaj Skibsted

package com.company;

import java.util.ArrayList;

public class SubscriptionManager {

    private int sum1, sum2 = 0;

    public int getSubscriptionSum(ArrayList<MemberCompetitive> newCompMember, ArrayList<MemberRegular> newRegMember) {


        for (int i = 0; i < newCompMember.size(); i++) {
            int b = newCompMember.get(i).getSubscriptionAmount();
            sum1 += b;
        }
        for (int i = 0; i < newRegMember.size(); i++) {
            int c = newRegMember.get(i).getSubscriptionAmount();
            sum2 += c;
        }
        return sum1 + sum2;
    }
}
