package com.himanshu.dsaSheet;

import java.util.Arrays;

class pair{
    int min,max;

    void getminmax(int[] arr){
        Arrays.sort(arr);
        this.min=arr[0];
        this.max=arr[arr.length-1];
    }
}

public class minmax {
    public static void main(String[] args) {
        int arr[]={5,9,3,25,41,65,25,75,41,0,-56,-25,98};
        pair p=new pair();
        p.getminmax(arr);
        System.out.println("minimum element in arr:"+p.min+"\nmaximum element in arr:"+p.max);
    }
}
