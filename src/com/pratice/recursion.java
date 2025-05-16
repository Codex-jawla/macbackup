package com.pratice;

import java.util.ArrayList;
import java.util.HashSet;

public class recursion {
    public static String skipChar(String st){
        if (st.isEmpty())
            return "";

        char c=st.charAt(0);
        if (c=='a'|| c==' '){
            return skipChar(st.substring(1));
        }else
            return c + skipChar(st.substring(1));
    }

    static void subseq(String ans,String st){
        if (st.isEmpty()){
            System.out.print(ans+" ");
            return;
        }
        char c=st.charAt(0);

        subseq(ans+c,st.substring(1));
        subseq(ans,st.substring(1));
    }

    static ArrayList<String> subset(String ans,String st){
        if (st.isEmpty()){
            ArrayList<String> list =new ArrayList<>();
            list.add(ans);
            return list;
        }
        char c=st.charAt(0);

        ArrayList<String> left = subset(ans+c,st.substring(1));
        ArrayList<String> right = subset(ans,st.substring(1));

        left.addAll(right);
        return left;
    }


    public static void main(String[] args) {
        System.out.println(skipChar("apple and app"));
        subseq("","abc");
        System.out.println();
        ArrayList<String> ar=subset("","abbc");
        HashSet<String> hs = HashSet.newHashSet(ar.size());
        for (String sg:ar) {
            hs.add(sg);
        }
        System.out.println(hs);
//        System.out.println(subset("","abbc"));

    }
}
