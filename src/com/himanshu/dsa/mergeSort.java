package com.himanshu.dsa;

import java.util.Arrays;

public class mergeSort {

    static void divide(int arr[],int si,int li){
        if(si>=li)
            return;
        int mid=si+ (li-si)/2;
        divide(arr,si,mid);
        divide(arr,mid+1,li);
        conquer(arr,si,mid,li);
    }

    static void conquer(int[] arr, int si, int mid, int li) {
        int merge[] =new int[li-si+1];
        int idx1=si;
        int idx2=mid+1;
        int x=0;

        while (idx1<=mid&&idx2<=li){
            if (arr[idx1]<=arr[idx2]){
                merge[x++]=arr[idx1++];
            }else {
                merge[x++]=arr[idx2++];
            }
        }

        while (idx1<=mid){
            merge[x++]=arr[idx1++];
        }
        while (idx2<=li){
            merge[x++]=arr[idx2++];
        }
        for (int i=0,j=si;i< merge.length;i++,j++){
            arr[j]=merge[i];
        }
    }

    static int[] sort(int[] arr){
        if (arr.length==1)
            return arr;

        int mid = arr.length/2;
        int[] left= sort(Arrays.copyOfRange(arr,0,mid));
        int[] right= sort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);
    }

    static int[] merge(int[] left,int[] right){
        int mix[]=new int[left.length+ right.length];
        int i=0,j=0,k=0;
        while (i< left.length&&j< right.length){
            if (left[i]<right[j]){
                mix[k]=left[i];
                i++;
            }else{
                mix[k]=right[j];
                j++;
            }
            k++;
        }
        while (i< left.length){
            mix[k]=left[i];
            i++;
            k++;
        }
        while (j< right.length){
            mix[k]=right[j];
            j++;
            k++;
        }
        return mix;
    }

    public static void main(String[] args) {
        int[] arr={5,9,6,4,2,3,15,65,25,12};
        int n = arr.length-1;
//        System.out.println(Arrays.toString(sort(arr)));
        divide(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

}
