package com.himanshu.leetCodeQues;

public class leetcodeQues55 {

    static int canJump(int[] nums) {
        int maxJump=0,count=0;
        for(int i=0; i<nums.length; i++){
            if(maxJump<i||nums.length==1){
                return 0;
            }
            if(maxJump<i+nums[i]){
                maxJump=i+nums[i];
                count++;
            }
            if(maxJump>=nums.length-1)
                break;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr={7,0,9,6,9,6,1,7,9,0,1,2,9,0,3};
        int[] arr1={1,2,3};
        int[] arr2={0,1};
        System.out.println(canJump(arr));
//        System.out.println(canJump(arr1));
//        System.out.println(canJump(arr2));
    }
}
