package com.himanshu.leetCodeQues;

public class leetcodeQues274 {
    static int hIndex(int[] citations) {
        int bucket[]=new int[citations.length+1];
        for(int x:citations)
            if(x<citations.length+1)
                bucket[x]++;
            else
                bucket[citations.length]++;
        int cnt=0;
        for(int i=bucket.length-1;i>=0;i--)
        {
            cnt+=bucket[i];
            if(i<=cnt)
                return i;
        }
        return 0;
    }

    public static void main(String[] args) {
        int arr[]={25,8,5,4,3};
        int ar[]={3,0,6,1,5};
        int a[]={1,3,1};
        System.out.println(hIndex(arr));
    }
}
