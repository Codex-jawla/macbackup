package com.himanshu.leetCodeQues;

public class maxValueOfEquation {
    public static int findMaxValueOfEquation(int[][] points, int k) {
        int ans = Integer.MIN_VALUE, tempans = Integer.MIN_VALUE;
        for (int i = 0; i < points.length - 1; i++) {
                int check = Math.abs(points[i][0] - points[i + 1][0]);
                if (check <= k) {
//                    tempans = points[i][1] + points[i + 1][1] + check;
                    tempans=points[i+1][0] +points[i+1][1] +points[i][1] -points[i][0];
                    if (ans < tempans)
                        ans = tempans;

                    continue;
                }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[][]= {{-19,-12},{-13,-18},{-12,18},{-11,-8},{-8,2},{-7,12},{-5,16},{-3,9},{1,-7},{5,-4},{6,-20},{10,4},{16,4},{19,-9},{20,19}};
       int anss= findMaxValueOfEquation(arr,6);
        System.out.println(anss);
    }
}
