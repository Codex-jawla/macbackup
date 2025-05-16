package com.himanshu.leetCodeQues;

public class leetcodeQues122 {

    static  int maxProfit(int[] prices) {
        int buy = prices[0], max_profit = 0, count=0,ans=0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i-1]>prices[i]){
                buy=prices[i];
                count=0;
            } else if (prices[i-1]<prices[i]) {
                if (count>0)
                    ans-=max_profit;
                max_profit=prices[i]-buy;
                ans+=max_profit;
                count++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr={7,1,5,3,6,4};
        int arr1[]={7,6,4,3,1};
        int[] arr2={1,2,3,4,5};
        System.out.println(maxProfit(arr));
        System.out.println(maxProfit(arr1));
        System.out.println(maxProfit(arr2));
    }
}
