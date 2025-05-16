package com.himanshu.leetCodeQues;

import java.util.ArrayList;
import java.util.List;

public class leetcodeQues867 {

    static  int[][] transpose(int[][] matrix) {
        List<Integer> list=new ArrayList<>();
        int[][] ans=new int[matrix[0].length][matrix.length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                list.add(matrix[i][j]);
            }
        }
        int a=0;
        for(int i=0;i<ans[0].length;i++){
            for(int j=0;j<ans.length;j++){
                ans[j][i]=list.get(a);
                a++;
            }
        }
        return ans;
    }

    static void print(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            System.out.print("[");
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]);
            }
            System.out.print("],");
        }
    }

    public static void main(String[] args) {
        int[][] arr={{1,2,3},
                     {4,5,6}};
        int[][] ans=transpose(arr);
        print(ans);
    }
}
