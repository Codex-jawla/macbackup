package com.himanshu.leetCodeQues;

import java.util.Arrays;

public class leetcodeQues1389 {
    static int[] createTargetArray(int[] nums, int[] index) {
        int ans[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int a=index[i];

            if(index[i]==0&&i>0){
                for(int j=nums.length-1;j>a;j--)
                    ans[j]=ans[j-1];
                    ans[a]=nums[i];
                    continue;
            }
            if(ans[a]!=0){
                for(int j=nums.length-1;j>a;j--)
                    ans[j]=ans[j-1];
            }
            ans[a]=nums[i];
        }
        return ans;
    }

    public static void main(String[] args) {
//        int a[]={8,1,2,2,3};
//        int b[]={0,1,2,2,1};
        int a[]={1,2,3,4,0};
        int b[]={0,1,2,3,0};
        System.out.println(Arrays.toString((createTargetArray(a,b))));
    }
}
