package com.himanshu.leetCodeQues;

public class leetcodeQues69 {
    static int findsqrt(int a){
        long ans=1,lo=0,hi=a;
        if(a==0)
            return 0;
        while(lo<=hi){
            long mid=lo+(hi-lo)/2;
             if(mid*mid==a)
                 return (int)mid;
             if (mid*mid<a){
                 lo=mid+1;
                 ans=mid;
             }else
                 hi=mid-1;
        }

        return (int )ans;
    }
    public static void main(String[] args) {
        int a=2147395600;
        int b=0;
        int c=6;
        System.out.println(findsqrt(c));
    }
}
