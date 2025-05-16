package com.himanshu.leetCodeQues;

public class leetcodeQues1295 {

    static int counteven(int arr[]){
        int count=0;
        for (int i=0;i< arr.length;i++){
            int tempcount=0;
            while (arr[i]!=0){
                arr[i]=arr[i]/10;
                tempcount++;
            }
            if (tempcount%2==0)
                count++;
        }

        return count;
    }

    public static void main(String[] args) {
        int[] ar={555,901,482,1771};
        System.out.println(counteven(ar));
    }
}
