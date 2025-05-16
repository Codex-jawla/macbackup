package com.himanshu.binaryQues;
import java.util.*;

public class search2dsorted {

    static int[] search2d(int[][] arr,int val){
        int r=0;
        int c=arr[0].length-1;
        while(r<arr.length && c>=0){
            if (arr[r][c]==val)
                return new int[]{r+1,c+1};
            else if (arr[r][c]>val)
                c--;
            else
                r++;
        }

        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        int[][] arr2d={
                {1,2,3,4,5},
                {6,7,8,9,10},
                {12,15,18,19,20}
        };
        System.out.println(Arrays.toString(search2d(arr2d,19)));
    }
}
