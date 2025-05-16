package com.himanshu.binaryQues;

public class rotatedSorted {

    static boolean searchDRS(int arr[], int l, int h, int key)
    {
        if (l > h)
            return false;

        int mid = l + (h - l) / 2;
        if (arr[mid] == key)
            return true;
        if ((arr[l] == arr[mid])
                && (arr[h] == arr[mid]))
        {
            l++;
            h--;
            return searchDRS(arr,l,h,key);
        }
        else if (arr[l] <= arr[mid])
        {
            if (key >= arr[l] && key <= arr[mid])
                return searchDRS(arr, l, mid - 1, key);
            else
                return searchDRS(arr, mid + 1, h, key);
        }
        else if (key >= arr[mid] && key <= arr[h])
            return searchDRS(arr, mid + 1, h, key);

        return searchDRS(arr, l, mid - 1, key);
    }
        public static int Rsorted(int arr[],int target){
        int pvt=pivot(arr);

        if (pvt==-1)
            return orderbinarys(arr,target,0,arr.length-1);
        int firsthalf= orderbinarys(arr,target,0,pvt);
        if(firsthalf!=-1){
            return firsthalf;
        }
        return orderbinarys(arr,target,pvt+1,arr.length-1);
    }

    public static int orderbinarys(int ar[],int val,int lo,int hi){
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

    public static int pivot(int arr[]){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid = start +(end-start)/2;
            if(mid<end&&arr[mid]>arr[mid+1])
                return mid;

            if(mid>start&&arr[mid]<arr[mid-1])
                return mid-1;

            if(arr[0]>arr[mid]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={13,17,23,29,2,3,5,7,11};
        int ar[]={4,5,6,7,0,1,2};
        System.out.println(Rsorted(ar,1));
    }
}
