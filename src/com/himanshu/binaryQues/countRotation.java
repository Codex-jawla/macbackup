package com.himanshu.binaryQues;

public class countRotation {

    public static int countrotation(int arr[]){
        int start=0;
        int end=arr.length-1;

        while(start<end){
            int mid=start+(end-start)/2;
            if (mid<end && arr[mid]>arr[mid+1])
                return mid+1;
            if (mid>start && arr[mid]<arr[mid-1])
                return mid;
            if (arr[0]>arr[mid])
                end=mid-1;
            else
                start=mid+1;
        }
        return 0;
    }
    public static void main(String[] args) {

        int ar[]={2,3,5,7,11,17,23,29};
        System.out.println(countrotation(ar));

    }
}
