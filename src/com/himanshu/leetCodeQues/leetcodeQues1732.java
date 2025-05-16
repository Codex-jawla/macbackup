package com.himanshu.leetCodeQues;

public class leetcodeQues1732 {

    static int largestAltitude(int[] gain) {
        int[] arr=new int[gain.length+1];
        arr[0]=0;
        int i=1;
        while(i<arr.length){
            arr[i]= arr[i-1]+gain[i-1];
            i++;
        }
        i=0;
        int high=0;
        while(i<arr.length){
            if(arr[i]>high)
                high=arr[i];
            i++;
        }
        return high;
    }

    public static void main(String[] args) {
        int[] gain={-5,1,5,0,-7};
        int[] gain2={-4,-3,-2,-1,4,3,2};
        System.out.println(largestAltitude(gain));

    }
}
