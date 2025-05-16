package com.himanshu.leetCodeQues;

import java.util.Arrays;

import static java.lang.Math.abs;

public class leetcodeQues88 {

    static void merge(int[] nums1, int m, int[] nums2, int n) {
        int a=0;
        for (int i=m;i<m+n;i++){
            nums1[i]=nums2[a];
            a++;

        }
        Arrays.sort(nums1);
    }

    public static void main(String[] args) {
        int nums1[]={4,0,0,0,0,0};
        int nums2[]={1,2,3,5,6};
        merge(nums1,1,nums2,nums2.length);
        System.out.println(Arrays.toString(nums1));

    }
}
