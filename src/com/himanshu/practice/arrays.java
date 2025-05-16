package com.himanshu.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
class func{
    Scanner sc=new Scanner(System.in);
    int siz,key,row,col;
    int ar[];
    int arr[][];
    void get2dArr(){
        System.out.println("Enter row and column of array.");
        row=sc.nextInt();
        col=sc.nextInt();
        arr=new int[row][col];
        System.out.println("Enter elements of array : ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }
    }
    void getArr(){
        System.out.println("Enter the size of array.");
        siz = sc.nextInt();
        ar=new int[siz];
        System.out.println("Enter elements of array : ");
        for(int i=0;i<siz;i++) {
//            System.out.print("Enter " + i + "th element :");
            ar[i] = sc.nextInt();
        }
    }
    void takeKey(){
        System.out.println("Enter element to find ");
        key= sc.nextInt();
    }
    void print2d(){
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+", ");
            }
            System.out.println();
        }
    }
     void print(){
        for(int i=0;i<siz;i++){
            System.out.print(ar[i]+", ");
        }
        System.out.println();
    }
     void sumArray(){
        int n= ar.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=ar[i];
        }
        System.out.println("Sum of array elements is : "+sum);
    }
     void linerSearch(){
        int count=0;
        int n= ar.length;
        for(int i=0;i<n;i++){
            if(ar[i]==key){
                System.out.println("Element found at index "+i);
                count++;
                break;
            }
        }
        if (count==0){
            System.out.println("Element not found");
        }
    }
    void selectionSort(){
        System.out.println("array sorted using selection sort....");
        for(int i=0;i<siz-1;i++){
            for(int j=i+1;j<siz;j++){
                if(ar[i]>ar[j]){
                    int temp=ar[i];
                    ar[i]=ar[j];
                    ar[j]=temp;
                }
            }
        }
    }
    void bubbleSort(){
        System.out.println("Array sorted using bubble sort.....");
        for(int i=0;i<siz;i++){
            for(int j=0;j<siz-i-1;j++){
                if(ar[j]>ar[j+1]){
                    int temp=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;
                }
            }
        }
    }
    void insertionSort(){
        System.out.println("Array sorted using insertion sort.....");
        for (int i=0;i<siz-1;i++){
            int j=i+1;
            while (j>0){
                if (ar[j-1]>ar[j]){
                    int temp=ar[j];
                    ar[j]=ar[j-1];
                    ar[j-1]=temp;
                }
                j--;
            }
        }

    }
    void binarySearch(){
        int lo=0;
        int hi=ar.length;
        int mid;
        while(hi>=lo){
            mid=(hi+lo)/2;
            if(ar[mid]==key){
                System.out.println("Element found at position : "+(mid+1));
                return;
            }
            if (key>ar[mid]){
                lo=mid+1;
            }else {
                hi=mid-1;
            }
            if (lo>hi){
                System.out.println("Element is not found!");
            }
        }
    }

    void freqency() {
        int count = 0;
        for (int i = 0; i < siz; i++) {
            if (ar[i] == key)
                count++;
        }
        System.out.println(key + " found " + count + " times in array.");
        if (count == 0) {
            System.out.println("Element not present in array");
        }
    }
    public func add2darr(func a){
        if ((a.row != this.row)&&(a.col != this.col)){
            System.out.println("addition not possible");
            return null;
        }
        int addrow=a.row;
        int addcol=a.col;
        int add[][]=new int[addrow][addcol];
        for(int i=0;i<addrow;i++){
            for(int j=0;j<addcol;j++){
                add[i][j]=a.arr[i][j]+this.arr[i][j];
            }
        }
        System.out.println("Addition of 1 and 2");
        for(int i=0;i<addrow;i++){
            for(int j=0;j<addcol;j++){
                System.out.print(add[i][j]+", ");
            }
            System.out.println();
        }
        return null;
    }
    public func sub2darr(func a){
        if ((a.row != this.row)&&(a.col != this.col)){
            System.out.println("subtraction not possible");
            return null;
        }
        int subrow=a.row;
        int subcol=a.col;
        int sub[][]=new int[subrow][subcol];
        for(int i=0;i<subrow;i++){
            for(int j=0;j<subcol;j++){
                sub[i][j]=a.arr[i][j]-this.arr[i][j];
            }
        }
        System.out.println("subtraction of 1 and 2");
        for(int i=0;i<subrow;i++){
            for(int j=0;j<subcol;j++){
                System.out.print(sub[i][j]+", ");
            }
            System.out.println();
        }
        return null;
    }
}

public class arrays  {
    public static int[] shuffle(int[] nums, int n) {
        int ans[]=new int[nums.length];
        int a=0;
        for(int i=0;i<nums.length;i++){

            if(i%2==0){
                ans[i]=nums[a++];
            }else{
                ans[i]=nums[n];
                n++;
            }
        }

        return ans;
    }

    static List<Boolean> find(int [] arr, int extra){
        List<Boolean> li=new ArrayList<>();
        int maxval= 0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]>maxval)
                maxval=arr[i];
        }
        for (int i=0;i<arr.length;i++){
            int check=arr[i]+extra;
            if(check>=maxval)
                li.add(true);
            else
                li.add(false);
        }
        return li;
    }
    public static void main(String[] args) {

        int arr[]={2,3,5,1,3};
        List<Boolean> li=new ArrayList<>();
        li= find(arr,3);
        System.out.println(li);
//        System.out.println(Arrays.toString(am));

//        func f1=new func();
//        func f2=new func();
//        f1.get2dArr();
//        f2.get2dArr();
//        System.out.println("first matrix");
//        f1.print2d();
//        System.out.println("second matrix");
//        f2.print2d();
//        f1.add2darr(f2);
//        f2.sub2darr(f1);


    }
}
//2 4 8 10 12 14 16 18 20
//1 3 5 7 9 11 13 15 17
//2 4 6 8 10 12
//3 6 9 12 15 18
