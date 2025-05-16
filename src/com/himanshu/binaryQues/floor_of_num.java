package com.himanshu.binaryQues;

// problem name ----------------->>>>>>>>>>>>>
//  **** possible maximum element less or equal to target ****
// <<<<<<<<<<------------------- end.

public class floor_of_num {

    public static int floorQues(int ar[],int val){
        int lo=0;
        int hi=ar.length-1;
        int possible_min=ar[0];
        if (val<ar[0]) {
            System.out.println("Target value must be greter than array's minimum value");
            return Integer.MIN_VALUE;
        }
        while (hi>=lo){
            int mid= lo + (hi-lo)/2;
            if (ar[mid]==val){
                possible_min=ar[mid];
                return possible_min;
            }
            if (val<ar[mid]){
                hi=mid-1;
            }else {
                lo=mid+1;
                possible_min=ar[mid];
            }
        }
        return possible_min;
    }
    public static void main(String[] args) {
        int arr[]=new int[]{2,4,6,9,11,12,14,20,36,44};
        int am=floorQues(arr,31);
        System.out.println("possible maximum element less or equal to target is : "+am);
    }
}
