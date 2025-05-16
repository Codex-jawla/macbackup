package com.himanshu.leetCodeQues;

public class leetcodeQues1886 {

    static boolean findRotation(int[][] mat,int[][] tar){

        boolean a=false;
        for (int i=0;i<mat.length;i++){
            int count10=0,count20=0,count11=0,count21=0;
            for (int j=0;j<mat.length;j++){
                if (mat[i][j]==0)
                    count10++;
                if (tar[i][j]==0)
                    count20++;
                if (mat[i][j]==1)
                    count11++;
                if (tar[i][j]==1)
                    count21++;
            }
            if ((count10==count20)||(count11==count21)||(count10==count21)||(count11==count20))
                a=true;
            else {
                a = false;
                break;
            }
        }
        if (a)
            return true;

        return false;
    }

    public static void main(String[] args) {
        int[][] mat={{0,0,0},{0,1,0},{1,1,1}};
        int[][] tar={{1,1,1},{0,1,0},{0,0,0}};
        System.out.println(findRotation(mat,tar));
    }
}
