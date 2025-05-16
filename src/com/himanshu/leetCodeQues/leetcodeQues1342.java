package com.himanshu.leetCodeQues;

public class leetcodeQues1342 {
    static int count=0;

    static int countstep(int n){
        if(n==0)
            return count;
        if (n%2==0){
            count++;
            countstep(n/2);
        }else {
            count++;
            countstep(n-1);
        }
        return count;
    }

    static int step(int n){
        return hepler(n,0);
    }
    static int hepler(int n,int st){
        if(n==0)
            return st;
        if (n%2==0){
            return hepler(n/2,st+1);
        }else {
            return hepler(n-1,st+1);
        }
    }

    public static void main(String[] args) {
        System.out.println(step(14));
    }
}
