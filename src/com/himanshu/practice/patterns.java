package com.himanshu.practice;

public class patterns {

    static void pattern1(int n){                                   //*****
        for (int i=1;i<=5;i++){                                    //*****
            for (int j=1;j<=i;j++){                                //*****
                System.out.print("*");                             //*****
            }                                                      //*****
            System.out.println();
        }
    }
    static void pattern2(int n){                                   //*
        for (int i=1;i<=5;i++){                                    //**
            for (int j=1;j<=i;j++){                                //***
                System.out.print("*");                             //****
            }                                                      //*****
            System.out.println();
        }
    }
    static void pattern3(int n){                                   //*****
        for (int i=n;i>=1;i--){                                    //****
            for (int j=1;j<=i;j++){                                //***
                System.out.print("*");                             //**
            }                                                      //*
            System.out.println();
        }
    }
    static void pattern4(int n){                                   //1
        for (int i=1;i<=5;i++){                                    //12
            for (int j=1;j<=i;j++){                                //123
                System.out.print(j+" ");                           //1234
            }                                                      //12345
            System.out.println();
        }
    }
    static void pattern5(int n){                                   //*
        for (int i=1;i<=5;i++){                                    //**
            for (int j=1;j<=i;j++){                                //***
                System.out.print("*");                             //****
            }                                                      //*****
            System.out.println();                                  //****
        }                                                          //***
        for (int i=n-1;i>=1;i--){                                  //**
            for (int j=1;j<=i;j++) {                               //*
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern6(int n){
                                                                    //    *
        for (int i=n-1;i>=0;i--){                                   //   **
            int m=0;                                                //  ***
            for (int j=1;j<=i;j++){                                 // ****
                System.out.print(" ");                              //*****
                m++;
            }
            for (int j=1;j<=n-m;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern7(int n){
                                                                    //*****
        for (int i=n;i>=1;i--){                                     // ****
            for (int j=1;j<=n-i;j++){                               //  ***
                System.out.print(" ");                              //   **
            }                                                       //    *
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern8(int n){
                                                                    //    *
        for (int i=n-1;i>=0;i--){                                   //   ***
                                                                    //  *****
            for (int j=1;j<=i;j++){                                 // *******
                System.out.print(" ");                              //*********

            }
            for (int j=1;j<=n-i;j++){
                System.out.print("*");
            }
            for (int j=2;j<=n-i;j++){
                System.out.print("*");
            }
            for (int j=1;j<=i;j++){
                System.out.print(" ");

            }

            System.out.println();
        }
    }

    static void pattern28(int n){
                                                                    //    *
        for (int i=n-1;i>=0;i--) {                                  //   * *
                                                                    //  * * *
            for (int j = 1; j <= i; j++) {                          // * * * *
                System.out.print(" ");                              //* * * * *
                                                                    // * * * *
            }                                                       //  * * *
            for (int j = 1; j <= n - i; j++) {                      //   * *
                System.out.print("* ");                             //    *
            }
            System.out.println();
        }
        for (int i=n-1;i>=1;i--){
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }


    }



    public static void main(String[] args) {

//        pattern1(5);
//        pattern2(5);
//        pattern3(5);
//        pattern4(5);
//        pattern5(5);
//        pattern6(5);
//        pattern7(5);
//        pattern8(5);
        pattern28(5);
    }
}
