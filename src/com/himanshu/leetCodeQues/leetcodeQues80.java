package com.himanshu.leetCodeQues;

import java.util.Arrays;

public class leetcodeQues80 {

    static int removeDuplicates(int[] nums) {
        int i=0;
        while (i< nums.length-1){
            int j=i+1,count=1;
            while (j<nums.length&&nums[j]==nums[i]){
                count++;
                if (count>2)
                    nums[j]=Integer.MAX_VALUE;
                j++;
            }
            i=j;
        }
        Arrays.sort(nums);
        i=0;
        int ans=0;
        while (i<nums.length&&nums[i]!=Integer.MAX_VALUE){
            ans++;
            i++;
        }
        return ans;
    }


    public static void main(String[] args) {
       int[] arr={0,0,1,1,1,1,2,3,3};
        int[] arr1={1};
        System.out.println(removeDuplicates(arr1));
    }
}
