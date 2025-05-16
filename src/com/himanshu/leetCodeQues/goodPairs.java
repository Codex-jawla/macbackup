package com.himanshu.leetCodeQues;

public class goodPairs {

    static int goodPair(int[] nums){
        int count=0;
        for (int i=0;i<nums.length-1;i++){
            for (int j=i+1;j<nums.length;j++){
                if (nums[i]==nums[j])
                    count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] a={1,2,3,3,1,1};
        int[] b={1,1,1,1};
        int[] c={2,2,3,3,4,53,5,2,23,3,2,1,2,3,12,4,5,4};
        System.out.println(goodPair(c));
    }
}
