package com.himanshu.leetCodeQues;

import java.util.ArrayList;
import java.util.List;

public class leetcodeQues1380 {

    static List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> li = new ArrayList<>();
        if (matrix[0].length==0)
            return li;
        if (matrix[0].length==1){
            int lim=0;
            for (int k=0;k<matrix.length-1;k++) {
                for (int j = 0; j < 1; j++) {
                    if (matrix[k][j]>matrix[k+1][j]&& lim < matrix[k][j]) {
                        lim = matrix[k][j];
                    }if (matrix[k][j]<matrix[k+1][j]&& lim < matrix[k+1][j])
                        lim = matrix[k+1][j];
                }
            }
            li.add(lim);
            return li;
        }
        for (int i = 0; i < matrix.length; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < matrix[i].length - 1; j++) {
                if (matrix[i][j] < matrix[i][j + 1] && min > matrix[i][j])
                    min = matrix[i][j];
                else if (matrix[i][j] > matrix[i][j + 1] && min > matrix[i][j + 1])
                    min = matrix[i][j + 1];
            }
            li.add(min);
        }
        int i = 0;
        while (li.size() != 1) {
            if (li.get(i) < li.get(i + 1))
                li.remove(i);
            else
                li.remove(i + 1);
        }
        int lim=0;
        for (int k=0;k<matrix.length;k++) {
            for (int j = 0; j < matrix[k].length; j++) {
                if (li.get(0) == matrix[k][j]) {
                    lim = j;
                }
            }
            }
        for (int k=0;k<matrix.length;k++) {
            for (int j = lim; j < lim+1; j++) {
                if (li.get(0)< matrix[k][j]) {
                    li.remove(0);
                    return li;
                }
        }
        }
        return li;
    }

    public static void main(String[] args) {
        int arr[][]={{1,10,4,2},{9,3,8,7},{15,16,17,12}};
        int ar[][]={{3,6},{7,1},{5,2},{4,8}};
        System.out.println(luckyNumbers(ar));
    }
}
