package com.himanshu.leetCodeQues;

import java.util.Arrays;

public class leetcodeQues1365 {
    static int[] solution(int[] nums){
        int ans[]=new int[nums.length];
        for (int i=0;i<nums.length;i++){
            int count=0;
            for (int j=0;j<nums.length;j++){
                if (nums[i]==nums[j])
                    continue;
                if (nums[i]>nums[j])
                    count++;
            }
            ans[i]=count;
        }
        return ans;
    }

    public static void main(String[] args) {
        int a[]={8,1,2,2,3};
        int b[]={7,7,7,7,7};
        System.out.println(Arrays.toString(solution(a)));
    }

}
