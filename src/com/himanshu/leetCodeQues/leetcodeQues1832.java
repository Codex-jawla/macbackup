package com.himanshu.leetCodeQues;

import java.util.HashSet;

public class leetcodeQues1832 {

    static boolean checkPangram(String sentence){
        HashSet<String> h = new HashSet<String>();
        for (int i=0;i<sentence.length();i++){
            char c=sentence.charAt(i);
            String s= Character.toString(c);
            if (s.equals(" ")){
                continue;
            }else {
                h.add(s);
            }
        }
        if (h.size()==26)
            return true;

        return false;
    }

    public static void main(String[] args) {
        String s=new String("himanshu jawla");
        String s1=new String("thequickbrownfoxjumpsoverthelazydog");
        System.out.println(checkPangram(s1));
        System.out.println(s.length());
    }
}
