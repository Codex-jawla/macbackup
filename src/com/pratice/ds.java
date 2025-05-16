package com.pratice;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class ds {
//    Tower of Hanoi ***************************************************************************************************************************
//    public static void towerhanoi(int n, String src,String help,String dest){
//        if (n==1){
//            System.out.println("Disk "+n+" transfered form "+src+" to "+dest);
//            return;
//        }
//        towerhanoi(n-1,src,dest,help);
//        System.out.println("Disk "+n+" transfered form "+src+" to "+dest);
//        towerhanoi(n-1,help,src,dest);
//
//    }
//    reverse string **************************************************************************************************************************
//    public static void reversestr(String s ,int i){
//        if(i==-1)
//            return;
//        System.out.print(s.charAt(i));
//        reversestr(s,i-1);
//    }
//    First and last occurence ***************************************************************************************************************
//    public static int first=-1;
//    public static int last=-1;
//    public static void flo(String s, char c,int i){
//        if (i==s.length()){
//            System.out.println("first and last occurence are : "+first+" ,"+last);
//            return;
//        }
//        if (first==-1 && s.charAt(i)==c){
//            first=i;
//            last=i;
//        } else if (s.charAt(i)==c) {
//            last=i;
//        }
//        flo(s,c,i+1);
//    }
//    check sorted array strictly incresing ***************************************************************************************************
//    public static int c=-1;
//    public static void checksorted(int[] arr,int i){
//        if (i==arr.length-1){
//            c=0;
//            System.out.println("Array strictly sorted in ascending order : "+ Arrays.toString(arr));
//            return;
//        }
//        if (arr[i]<arr[i+1])
//            checksorted(arr,i+1);
//        if (i==0 && c==-1)
//            System.out.println("Array is not strictly sorted");
//    }
//    moveall x at end of string ***************************************************************************************************************
//    public static void moveall(String s,String ns,int i, int c){
//        if (i==s.length()){
//            for (int j=0;j<c;j++)
//                ns+='x';
//            System.out.println("Old String is :"+s);
//            System.out.println("New String is :"+ns);
//            return;
//        }
//        char currchar=s.charAt(i);
//        if (currchar=='x'){
//            c++;
//            moveall(s,ns,i+1,c);
//        }else {
//            ns+=currchar;
//            moveall(s,ns,i+1,c);
//        }
//    }
//      remove duplicate from string **********************************************************************************************************
//    public static boolean[] b=new boolean[26];
//    public static void removeduplicate(int i,String s ,String ns){
//        if (i==s.length()){
//            System.out.println(ns);
//            return;
//        }
//        char currc=s.charAt(i);
//        int idx = currc-'a';
//        if (b[idx]==true)
//            removeduplicate(i+1,s,ns);
//        else {
//            ns+=currc;
//            b[idx]=true;
//            removeduplicate(i+1,s,ns);
//        }
//    }
//    Uniqe Subsequence of a string ************************************************************************************************************
//    public static void usubseq(String s, int i,String ns,HashSet hs){
//        if (i==s.length()){
//            if (hs.contains(ns))
//                return;
//            else {
//                hs.add(ns);
//                System.out.println(ns);
//                return;
//            }
//        }
//        char currc = s.charAt(i);
//        usubseq(s,i+1,ns+currc,hs);
//        usubseq(s,i+1,ns,hs);
//    }
//    Subsequence of a string ****************************************************************************************************************
//    public static void subseq(String s, int i,String ns){
//        if (i==s.length()) {
//            System.out.println(ns);
//            return;
//        }
//        char currc = s.charAt(i);
//        subseq(s,i+1,ns+currc);
//        subseq(s,i+1,ns);
//    }
//    numpad combination **********************************************************************************************************************
//    public static String[] keypad = {".","abc","def","ghi","jkl","mno","pqr","stu","vwx","yz"};
//    public static void keycomb(String s,int idx,String comb){
//        if (idx==s.length()){
//            System.out.println(comb);
//            return;
//        }
//        char curr = s.charAt(idx);
//        String map = keypad[curr-'0'];
//        for (int i=0;i<map.length();i++){
//            keycomb(s,idx+1,comb+map.charAt(i));
//        }
//    }
//    parmutation of stirng *******************************************************************************************************************
//    public static void permutation(String s,String perm){
//        if (s.length()==0){
//            System.out.println(perm);
//            return;
//        }
//        for (int i=0;i<s.length();i++){
//            char curr = s.charAt(i);
//            String news = s.substring(0,i)+s.substring(i+1);
//            permutation(news,perm+curr);
//        }
//    }
//    count path to reach from 0,0 to n,m in a grid********************************************************************************************
//    public  static int countpath(int i,int j,int n,int m){
//        if(i==n || j==m)
//            return 0;
//        if (i==n-1 && j==m-1)
//            return 1;
//        int rightp = countpath(i,j+1,n,m);
//        int leftp = countpath(i+1,j,n,m);
//        return rightp+leftp;
//    }
//    count number of way to place tiles in n*m area tile of size is 1*m **********************************************************************
//    public  static int counttile(int n,int m){
//        if(n==m)
//            return 2;
//        if (n<m)
//            return 1;
//        int horizontalp = counttile(n-m,m);
//        int verticalp = counttile(n-1,m);
//        return horizontalp+verticalp;
//    }
//    count number of way to invite members single or pair ***********************************************************************************
//    public  static int invite(int n){
//        if(n<=0)
//            return 1;
//        int single = invite(n-1);
//        int pair = (n-1) * invite(n-2);
//        return single+pair;
//    }
//    print subset of first n natural numbers ************************************************************************************************
//    public static void subset(int n, ArrayList<Integer> a){
//        if(n==0){
//            System.out.println(a);
//            return;
//        }
//        a.add(n);
//        subset(n-1,a);
//        a.remove(a.size()-1);
//        subset(n-1,a);
//    }


public static void permutation(String s ,String perm, ArrayList<String> hs){
    if (s.length()==0){
        hs.add(perm);
        return;
    }

    for (int i=0;i<s.length();i++){
        char curr = s.charAt(i);
        String newS = s.substring(0,i)+s.substring(i+1);
        permutation(newS,perm+curr,hs);
    }
}
    public static boolean checkInclusion(String s1, String s2) {
    if (s1.equals(s2))
        return true;

    if (s1.length()>s2.length())
        return false;
    ArrayList<String> list = new ArrayList<>();
    permutation(s1,"",list);
    for (int i=0;i<list.size();i++){
        if(s2.contains(list.get(i)))
            return true;
    }
    return false;
    }


    public static boolean checkinc(String s1, String s2){
    if (s1.length()>s2.length())
        return false;

    int[] crr = new int[26];
    for (int i=0;i<s1.length();i++)
        crr[s1.charAt(i)-'a']++;

    for (int i=0;i<s2.length()-s1.length()+1;i++){
        for (int j=0;j<s1.length();j++)
            crr[s2.charAt(j+i)-'a']--;
        if (checkzero(crr))
            return true;
        for (int j=0;j<s1.length();j++)
            crr[s2.charAt(j+i)-'a']++;
    }
    return false;
    }

    public static boolean checkzero(int[] crr){
    for (int i=0;i< crr.length;i++){
        if (crr[i]!=0)
            return false;
    }
    return true;
    }

    public static void main(String[] args) {
//        int n=4;
//        towerhanoi(n,"S","H","D");

//        String s= "abcddfsfsfaadfv";
//        reversestr(s,s.length()-1);

//        String s = "hlo my name is himanshu jawla ";
//        flo(s,'w',0);

//        int[] arr={2,4,6,8,8};
//        checksorted(arr,0);

//        String s = "axbcxxjkxhxuiklsbxjhdxxjksx";
//        moveall(s,"",0,0);

//        String s = "aabbcdeefggh";
//        removeduplicate(0,s,"");

//        HashSet<String> hs=new HashSet<>();
//        String s = "aaa";
//        usubseq(s,0,"",hs);
//
//        String s = "abc";
//        subseq(s,0,"");

//        String s = "454";
//        keycomb(s,0,"");


//        String s= "abc";
//        permutation(s,"");

//        int n=3,m=4;
//        System.out.println(countpath(0,0,n,m));

//        int n=3,m=4;
//        System.out.println(counttile(n,m));

//        int n=4;
//        System.out.println(invite(n));

//        int n=3;
//        ArrayList<Integer> a = new ArrayList<>();
//        subset(n,a);

//        String  s1s = "ab", s2s = "eidbaooo";
//        System.out.println(checkInclusion(s1s,s2s));
//        String  s1 = "prosperity", s2 = "properties";
//        System.out.println(checkInclusion(s1,s2));
//        String  sa1 = "ab", sa2 = "ab";
//        System.out.println(checkInclusion(sa1,sa2));
//        String  as1 = "islander", as2 = "islander";
//        System.out.println(checkInclusion(as1,as2));
//        String  ss1 = "ab", ss2 = "ba";
//        System.out.println(checkInclusion(ss1,ss2));
        System.out.println("helllloooolololololoo");
        String  h1s = "ab", h2s = "eidbaooo";
        System.out.println(checkinc(h1s,h2s));
        String  fh1s = "ab", fh2s = "eidboaoo";
        System.out.println(checkinc(fh1s,fh2s));
        String  hsa1 = "acd", hsa2 = "dcda";
        System.out.println(checkinc(hsa1,hsa2));
//        String  has1 = "islander", has2 = "islander";
//        System.out.println(checkinc(has1,has2));
//        String  hss1 = "ab", hss2 = "ba";
//        System.out.println(checkinc(hss1,hss2));
//        String  hs1 = "prosperity",hs2 = "properties";
//        System.out.println(checkinc(hs1,hs2));
    }
}