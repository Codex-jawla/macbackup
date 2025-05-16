package com.himanshu.leetCodeQues;

import java.util.Arrays;

public class leetcodeQues121 {

    static  int maxProfit(int[] prices) {
        int buy = prices[0], max_profit = 0;
        for (int i = 1; i < prices.length; i++) {

            // Checking for lower buy value
            if (buy > prices[i])
                buy = prices[i];

                // Checking for higher profit
            else if (prices[i] - buy > max_profit)
                max_profit = prices[i] - buy;
        }
        return max_profit;
    }

    public static void main(String[] args) {
        int[] arr={7,1,5,3,6,4};
        int arr1[]={7,6,4,3,1};
        int[] arr2={1,4,1,4,3,1};
        System.out.println(maxProfit(arr));
        System.out.println(maxProfit(arr1));
        System.out.println(maxProfit(arr2));
    }
}
