package com.pratice;

public class check {
    public static void main(String[] args) {
        int a=2765;
        int count=0;
        while(a>0){
            a/=10;
            count++;
        }
        System.out.println(count);
    }
}
