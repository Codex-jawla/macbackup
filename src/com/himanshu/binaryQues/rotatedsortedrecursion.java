package com.himanshu.binaryQues;


public class rotatedsortedrecursion {


    static int search(int[] arr,int tar){
        int piv=pivot(arr,tar,0,arr.length-1);
        if (piv==-1)
            return recBS(arr,0,arr.length-1,tar);
        int firsthalf=recBS(arr,0,piv,tar);
        if (firsthalf!=-1)
            return firsthalf;
        return recBS(arr,piv+1,arr.length,tar);
    }
    static int recBS(int[] arr,int start,int end,int target){
        if (start>end)
            return -1;
        int mid=start+(end-start)/2;
        if (target==arr[mid])
            return mid;
        if (target<arr[mid])
            return recBS(arr,start,mid-1,target);
        else
            return recBS(arr,mid+1,end,target);
    }

    private static int pivot(int[] arr, int tar, int start, int end) {
        if (start>end)
            return -1;

        int mid = start +(end-start)/2;
        if(mid<end&&arr[mid]>arr[mid+1])
            return mid;

        if(mid>start&&arr[mid]<arr[mid-1])
            return mid-1;

        if(arr[0]>arr[mid]){
            return pivot(arr,tar,start,mid-1);
        }else{
            return pivot(arr,tar,mid+1,end);
        }
    }
    static int search1(int[] arr,int start,int end,int tar){
        if (start>end)
            return -1;

        int mid=start+(end-start)/2;

        if (arr[mid]==tar)
            return mid;

        if (arr[mid]>=arr[start]){

            if (tar>=arr[start]&&tar<arr[mid])
                return search1(arr,start,mid-1,tar);
            else
                return search1(arr,mid+1,end,tar);

        }else {

            if (tar>arr[mid]&&tar<=arr[end])
                return search1(arr,mid+1,end,tar);
            else
                return search1(arr,start,mid-1,tar);

        }
    }

    public static void main(String[] args) {
        int arr[] ={5,6,7,1,2,3,4};
        System.out.println(search(arr,1));
        System.out.println(search1(arr,0,arr.length-1,1));
    }
}
