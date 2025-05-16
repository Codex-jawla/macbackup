package com.himanshu.leetCodeQues;

import java.util.ArrayList;
import java.util.List;

public class leetcodeQues1773 {

    static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count=0;
        List<String> ll=new ArrayList<>();
        items.forEach((list)  ->
        {   list.forEach((attributes) -> ll.add(attributes));
        }
        );
        int i;
        if (ruleKey.equals("type"))
            i=0;
        else if (ruleKey.equals("color"))
            i=1;
        else
            i=2;

        while(i<ll.size()){
            if(ll.get(i).equals(ruleValue))
                count++;
            i+=3;
        }

        return count;
    }
    public static void main(String[] args) {
        List<List<String>> items= new ArrayList<>();
        List<String> l1=new ArrayList<>();
        l1.add("phone");
        l1.add("blue");
        l1.add("pixel");
        List<String> l2=new ArrayList<>();
        l1.add("computer");
        l1.add("silver");
        l1.add("phone");
        List<String> l3=new ArrayList<>();
        l1.add("phone");
        l1.add("gold");
        l1.add("iphone");
        items.add(0,l1);
        items.add(1,l2);
        items.add(2,l3);
        System.out.println(countMatches(items,"type","phone"));
    }
}
