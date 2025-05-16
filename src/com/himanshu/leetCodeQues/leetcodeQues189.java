package com.himanshu.leetCodeQues;

import java.util.Arrays;

public class leetcodeQues189 {

    static  void rotate2(int[] nums, int k) {
        int i=0,s= nums.length;
        int[] temp=new int[s];
        for (int j=s-k;j<s;j++){
            temp[i]=nums[j];
            i++;
        }
        for (int j=0;j<s-k;j++){
            temp[i]=nums[j];
            i++;
        }
        for (int j=0;j<s;j++){
            nums[j]=temp[j];

        }

    }

    static  void rotate(int[] nums, int k) {
        int i=0;
        while (i<k){
            int temp=nums[nums.length-1];
            for (int j=nums.length-1;j>0;j--){
                nums[j]=nums[j-1];
            }
            nums[0]=temp;
            i++;
        }

    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int ar[]={1,2};
        rotate2(arr,3);
        rotate(ar,3);
        System.out.println(Arrays.toString(ar));
    }
}
