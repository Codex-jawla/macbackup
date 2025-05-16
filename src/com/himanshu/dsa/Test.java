package com.himanshu.dsa;

import java.util.Arrays;

public class Test {
    public static int[] twoSum(int[] nums, int target) {
        int sum =0;
        for (int i=0;i<nums.length-1;i++){
            for (int j=i+1;j<nums.length;j++){
                sum=nums[i]+nums[j];
                if (target==sum)
                    return new int[]{i,j};
            }
        }

        return new int[]{0,0};
    }

    public static void main(String[] args) {

        int []nums = {3,2,4};
        System.out.println(Arrays.toString(twoSum(nums,6)));

    }
}
