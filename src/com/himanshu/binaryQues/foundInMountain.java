package com.himanshu.binaryQues;

public class foundInMountain {

    static int search(int ar[],int var){
        int peakidx=peakfind(ar,var);
        int firsttry=orderDignoisticBinary(ar,var,0,peakidx);
        if(firsttry!=-1)
            return firsttry;

        return orderDignoisticBinary(ar,var,peakidx+1,ar.length-1);
    }
    static int peakfind(int ar[],int var){
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
    public static int binarys(int ar[],int val,int start,int end){
        int lo=start;
        int hi=end;

        while (hi>lo){
            int mid= lo + (hi-lo)/2;
            if (ar[mid]==val){
//                System.out.println("Element found at index : "+mid);
                return mid;
            }
            if (val<ar[mid]){
                hi=mid-1;
            }else {
                lo=mid+1;
            }
        }
        return -1;
    }
    public static int orderDignoisticBinary(int ar[],int val,int lo,int hi){
        boolean isAse=ar[lo]<ar[hi];

        while (hi>=lo){
            int mid= lo + (hi-lo)/2;
            if (ar[mid]==val){
                return mid;
            }
            if (isAse){
            if (val<ar[mid]){
                hi=mid-1;
            }else {
                lo=mid+1;
            }
        }else {
                if (val>ar[mid]){
                    hi=mid-1;
                }else {
                    lo=mid+1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]=new int[]{-2,4,11,85,65,12,5,1,-4};
        int ar[]=new int[]{0,3,5,12,8,5,4};
        System.out.println(search(arr,12));
    }
}
