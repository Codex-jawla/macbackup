package com.himanshu.binaryQues;

// problem name ----------------->>>>>>>>>>>>>
//  **** possible smallest character greater then target ****
// <<<<<<<<<<------------------- end.

public class smallestChar {
    public static void smallChar(char[] ar, char val){
        int lo=0;
        int hi=ar.length-1;
        char possible_min=ar[0];
        if (val>=ar[hi]) {
            System.out.println("Target value must be less than array's maximum value");
            return;
        }
        while (hi>=lo){
            int mid= lo + (hi-lo)/2;
            if (ar[mid]==val){
                possible_min=ar[mid+1];
                System.out.println("possible smallest character greater target is : "+possible_min);
            }
            if (val<ar[mid]){
                hi=mid-1;
                possible_min=ar[mid];
            }else {
                lo=mid+1;
            }
        }
        System.out.println("possible smallest character greater target is : "+possible_min);

    }

    public static void main(String[] args) {
        char[] arr =new char[]{'a', 'd', 'g', 'k', 'p', 'r', 'u', 'w', 'y', 'z'};
        smallChar(arr,'b');
    }
}
