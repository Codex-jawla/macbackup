package com.himanshu.leetCodeQues;

import static java.lang.Math.abs;

public class leetcodeQues1572 {

    static int diagonalSum(int[][] mat) {
        int sum=0;
        for (int i=0;i<mat.length;i++){
            for (int j=0;j<mat.length;j++){
                if (i==j)
                    sum+=mat[i][j];
            }
        }
        for (int i=mat.length-1;i>=0;i--){
            for (int j=0;j<mat.length;j++){
                if (i+j==mat.length-1)
                    sum+=mat[i][j];
            }
        }
        if(mat.length%2==0)
            return sum;
        else {
            int id=(mat.length-1)/2;
            return sum-mat[id][id];
        }
    }

    public static void main(String[] args) {
        int[][] arr2d= {{6,3,1,10,7,4},
                        {4,10,1,9,5,10},
                        {5,5,7,3,8,5},
                        {2,7,6,4,7,6},
                        {7,9,6,1,8,5},
                        {1,7,9,5,8,4}};
        System.out.println(diagonalSum(arr2d));
    }
}
