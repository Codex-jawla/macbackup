package com.himanshu.binaryQues;

public class searchInInfiniteArray {

    public static void infiniteBinarySearch(int ar[],int val){
        int lo=0;
        int hi=check(ar,val);

        while (hi>=lo){
            int mid= lo + (hi-lo)/2;
            if (ar[mid]==val){
                System.out.println("Element found at index : "+mid);
                return;
            }
            if (val<ar[mid]){
                hi=mid-1;
            }else {
                lo=mid+1;
            }
            if (hi<lo)
                System.out.println("Element not found");
        }
    }
    public static int check(int arr[],int target){
        int ans=1;
        while(arr[ans]<target){
            ans *= 2;
        }
        return ans;
    }



    public static void main(String[] args) {
        int[] myArray = new int[100000];

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = i*2; // You can initialize elements with any values you want
        }
        infiniteBinarySearch(myArray,58234);
    }
}
