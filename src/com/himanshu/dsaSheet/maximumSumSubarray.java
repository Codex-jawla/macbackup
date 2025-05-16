package com.himanshu.dsaSheet;

public class maximumSumSubarray {
    static int maxsum(int[] arr){
        int maxisum=0,sum=Integer.MIN_VALUE;
        for(int n:arr){
            maxisum+=n;
            if (maxisum>sum)
                sum=maxisum;
            if (maxisum<0)
                maxisum=0;
        }
        return sum;
    }



    public static void main(String[] args) {
        int[] arr={-2,1,-3,4,-1,-2,1,-5,4};
        System.out.println(maxsum(arr));
    }
}
