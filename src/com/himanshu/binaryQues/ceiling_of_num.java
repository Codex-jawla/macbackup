package com.himanshu.binaryQues;

// problem name ----------------->>>>>>>>>>>>>
//  **** possible minimum element greater or equal to target ****
// <<<<<<<<<<------------------- end.

public class ceiling_of_num {
    public static int ceilingQues(int ar[],int val){
        int lo=0;
        int hi=ar.length-1;
        int possible_min=ar.length;
        if (val>ar[hi-1]) {
            System.out.println("Target value must be less than array's maximum value");
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
                possible_min=ar[mid];
            }else {
                lo=mid+1;
            }
        }
        return possible_min;
    }
    public static void main(String[] args) {
        int arr[]=new int[]{2,4,6,9,11,12,14,20,36,44};
        int val=16;
        int am=ceilingQues(arr,val);
        System.out.println("possible minimum element greater or equal to "+ val+" is : "+am);

    }
}
