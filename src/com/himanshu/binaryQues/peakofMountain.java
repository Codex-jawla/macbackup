package com.himanshu.binaryQues;

public class peakofMountain {
    static int peakfind(int ar[]){
        int lo=0;
        int hi=ar.length-1;

        while (hi>lo){
            int mid= lo + (hi-lo)/2;
            if(ar[mid+1]<ar[mid]){
                hi=mid;
            }else{
                lo=mid+1;
            }
        }
        return lo;
    }

    public static void main(String[] args) {
        int arr[]=new int[]{-2,4,11,85,65,12,5,1,-4};
        int ar[]=new int[]{0,3,5,12,8,5,4};
        System.out.println(peakfind(ar));
    }
}
