//Author @ Nikolaj Skibsted

package com.company;

import java.util.ArrayList;

public class SubscriptionManager {

    private int sum2, sum3 = 0;

    public int getSubscriptionSum(ArrayList<MemberCompetitive> newCompMember, ArrayList<MemberRegular> newRegMember) {


        for (int i = 0; i < newCompMember.size(); i++) {
            int b = newCompMember.get(i).getSubscriptionAmount();
            sum2 += b;
        }
        for (int i = 0; i < newRegMember.size(); i++) {
            int c = newRegMember.get(i).getSubscriptionAmount();
            sum3 += c;
        }
        return sum2 + sum3;
    }
}
