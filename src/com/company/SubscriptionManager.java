//Author @ Nikolaj Skibsted

package com.company;

import java.util.ArrayList;

public class SubscriptionManager {

    private int sum1,sum2,sum3 = 0;

    //traverserer Arraylist<Member> og returnerer summen af alle kontingenterne
    public int getSubscriptionSum(ArrayList<Member> newMember, ArrayList<MemberCompetitive> newCompMember, ArrayList<MemberRegular> newRegMember) {
        for (int i = 0; i < newMember.size(); i++) {
            int membershipFee = newMember.get(i).getSubscriptionAmount();
            sum1 += membershipFee;
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
