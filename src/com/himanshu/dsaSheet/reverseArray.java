package com.himanshu.dsaSheet;

import java.util.Arrays;

public class reverseArray {

    static void reverse(int[] arr){
        int start=0,end=arr.length-1;
        while(start<end){
            int temp =arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr={4,5,1,2};
        int[] arr2={3,6,4,7,2};
        System.out.println("Before reverse : "+Arrays.toString(arr2));
        reverse(arr2);
        System.out.println("After reverse : "+Arrays.toString(arr2));
    }

}
