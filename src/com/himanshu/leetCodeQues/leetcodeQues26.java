package com.himanshu.leetCodeQues;

import java.util.Arrays;

public class leetcodeQues26 {

    static int removeDuplicates(int[] nums) {
        for (int i=0;i<nums.length-1;i++){
            if (nums[i]==nums[i+1])
                nums[i]=Integer.MAX_VALUE;
        }
        Arrays.sort(nums);
        int count=0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]==Integer.MAX_VALUE)
                break;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int []arr={0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(arr));
    }
}
