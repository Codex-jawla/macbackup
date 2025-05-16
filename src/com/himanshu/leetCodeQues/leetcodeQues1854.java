package com.himanshu.leetCodeQues;

import java.util.ArrayList;
import java.util.List;

public class leetcodeQues1854 {

    static int maxpop(int[][] ar2d){
        int arr[]=new int[ar2d.length*2];
        int a=0;
        for (int i=0;i<ar2d.length;i++){
            for (int j=0;j<2;j++){
                if (j==1) {
                    arr[a] = ar2d[i][j] - 1;
                    a++;
                }else {
                    arr[a] = ar2d[i][j];
                    a++;
                }
            }
        }
        a=0;
        int ans=0;
        for (int i=0;i<arr.length-1;i++) {
            int j = 0, count = 0;
            while (j < arr.length - 1) {
                if (arr[i] >= arr[j] && arr[i] <= arr[j + 1])
                    count++;
                j += 2;
            }
            if (count > a){
                a = count;
                ans = i;
            }
            i++;
        }


        return arr[ans];
    }

    public static void main(String[] args) {
        int[][] test={{1982,1998},{2013,2042},{2010,2035},{2022,2050},{2047,2048}};
        System.out.println(maxpop(test));

    }
}
