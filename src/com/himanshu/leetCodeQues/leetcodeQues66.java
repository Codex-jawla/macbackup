package com.himanshu.leetCodeQues;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcodeQues66 {

    static int[] plusOne(int[] digits) {
            int s=digits.length-1;
        if(digits[0]==9){
            int ans[]=new int[s+2];
            while(s>=0&&digits[s]==9){
                digits[s]=0;
                ans[s+1]=digits[s];
                s--;
            }
            s++;
            digits[s]+=1;
            ans[s]=digits[s];
            return ans;
        }
        s=digits.length-1;
        while(s>=0&&digits[s]==9){
            digits[s]=0;
            s--;
        }

        digits[s]+=1;

        return digits;
    }

    public static void main(String[] args) {
        int[] ar={9};
        int[] arr={1,2,3};
        System.out.println(Arrays.toString(plusOne(arr)));
    }
}
