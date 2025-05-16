package com.himanshu.leetCodeQues;

import java.util.Arrays;

public class leetcodeQues832 {

    static int[][] flipAndInvertImage(int[][] image) {
        for (int i=0;i<image.length;i++){
            int start=0,temp=0;
            int end= image.length-1;
            while(start<end){
                temp=image[i][start];
                image[i][start]=image[i][end];
                image[i][end]=temp;

                start++;
                end--;
            }
        }
        for (int i=0;i<image.length;i++){
            int j=0;
            while(j<image.length){
                image[i][j]^=1;
                j++;
            }
        }
        return image;
    }

    public static void main(String[] args) {
        int flip2[][]={
                {1,1,0},
                {0,1,0},
                {0,0,0}};
        int flip[][]={
                {1,1,0,0},
                {1,0,0,1},
                {0,1,1,1},
                {1,0,1,0}};

        flipAndInvertImage(flip);
        for (int i = 0; i< flip.length; i++) {
            System.out.print("[ ");
            for (int j = 0; j< flip.length; j++) {
                System.out.print(flip[i][j]+",");
            }
            System.out.print(" ],");
        }
    }
}
