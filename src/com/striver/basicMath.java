package com.striver;
import java.util.*;
import java.lang.Math.*;

public class basicMath {
    static int hash[];
    static void swap(int a,int b,int arr[]){
        int temp= arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    static int countdigit(int n){
        int count=0;
        while(n>0){
            n/=10;
            count++;
        }
        return count;
    }
    static int reverseNumber(int n){
        int revnum=0;
        while(n>0){
            int digit = n%10;
            revnum = (revnum*10) +digit;
            n/=10;
        }
        return revnum;
    }
    static boolean palindrome(int n){
        int revnum=0;
        int num=n;
        while(num>0){
            int digit = num%10;
            revnum = (revnum*10) +digit;
            num/=10;
        }
        return revnum==n;
    }
    static boolean armstrong(int n){
        int sum=0;
        int num=n;
        while(num>0){
            int digit = num%10;
            sum += (digit*digit*digit);
            num/=10;
        }
        return sum==n;
    }
    static List<Integer> allDivisor(int n){
        List<Integer> ls = new ArrayList<>();
        for (int i = 1; i*i <= n; i++) {
            if (n%i==0) {
                ls.add(i);
                if ((n / i) != i)
                    ls.add(n / i);
            }
        }
        Collections.sort(ls);
        return ls;
    }
    static boolean checkPrime(int n){
        int count=0;
        for (int i = 2; i*i <= n; i++) {
            if (n%i==0)
                count++;
        }
        if (count==0)
            return true;
        return false;
    }
    static int gcd(int a,int b){
        while(a>0 && b>0){
            if (a>b)
                a %=b;
            else if (b > a) {
                b%=a;
            }
        }
        if (a==0)
            return b;
        else
            return a;
    }
    static int factorial(int n){
        if (n==0||n==1)
            return 1;
        return n*factorial(n-1);
    }
    static void reverseArray(int st, int[] arr){
        int n=(arr.length-st-1);
        if (st>= arr.length/2)
            return;

        int temp=arr[st];
        arr[st] = arr[n];
        arr[n]=temp;
        reverseArray(st+1,arr);
    }
    static boolean stringPalindrome(String st,int idx){
        int idx2=st.length()-1-idx;
        if (idx>=idx2)
            return true;

        if (st.charAt(idx)==st.charAt(idx2))
            return stringPalindrome(st,idx+1);
        else
            return false;
    }
    static int fibonnaci(int n){
        if (n<=1)
            return n;

        return fibonnaci(n-1)+fibonnaci(n-2);
    }
    static void hashing(int arr[]){
        hash = new int[100];
        for (int i = 0; i < arr.length; i++) {
            hash[arr[i]]+=1;
        }
    }
    static int findoccurence(int num,int[] arr){
        hashing(arr);
        return hash[num];
    }
    static void selectionsort(int arr[]){
        for (int i=0;i<arr.length-1;i++){
            int small=i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j]<arr[small])
                    small=j;
            }
            swap(small,i,arr);
        }
    }
    static void bubblesort(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            int count=0;
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j]>arr[j+1]) {
                    count = 1;
                    swap(j, j + 1, arr);
                }
                if (count==0)
                    break;
            }
        }
    }
    static void insertion(int []arr){
        for (int i = 1; i < arr.length; i++) {
            int j=i;
            while(j>0 && arr[j]<arr[j-1]){
                swap(j,j-1,arr);
                j--;
            }
        }
    }
    static void mergeSort(int[] arr){
        divide(arr,0,arr.length-1);
    }
    static void divide(int[] arr,int st,int end){
        if (st>=end)
            return;
        int mid = (end+st)/2;
        divide(arr,st,mid);
        divide(arr,mid+1,end);
        merge(arr,st,mid,end);
    }
    static void merge(int []arr,int st,int mid,int end){
        int n1=st;
        int n2=mid+1;
        int temp[] = new int[arr.length];
        int x=st;

        while(n1<=mid && n2<=end){
            if (arr[n1]<arr[n2]){
                temp[x]=arr[n1];
                n1++;
                x++;
            }else{
                temp[x]=arr[n2];
                n2++;
                x++;
            }
        }
        while(n1<=mid){
            temp[x]=arr[n1];
            n1++;
            x++;
        }
        while(n2<=end){
            temp[x]=arr[n2];
            n2++;
            x++;
        }
        for (int i=st;i<=end;i++){
            arr[i]=temp[i];
        }
    }
    static void quickSort(int[] arr,int st,int end){
        if (st<end){
            int lo=st;
            int hi=end;
            int pivot = arr[st];

            while(lo<=hi){
                while (arr[lo]<pivot)
                    lo++;
                while(arr[hi]>pivot)
                    hi--;

                if (lo<=hi){
                    int temp=arr[lo];
                    arr[lo]=arr[hi];
                    arr[hi]=temp;
                    hi--;
                    lo++;
                }
            }
            quickSort(arr,st,hi);
            quickSort(arr,lo,end);
        }
    }

    public static void main(String[] args) {
//        System.out.println(countdigit(7789));
//        System.out.println((int)(log10(778129)+1));
//        System.out.println(reverseNumber(869400));
//        System.out.println(palindrome(12278721));
//        System.out.println(armstrong(371));
//        System.out.println(allDivisor(36));
//        System.out.println(checkPrime(49));
//        System.out.println(gcd(96,120));
//        System.out.println(factorial(5));
//        int[] arr1={1,2,3,4,5};
//        reverseArray(0,arr1);
//        System.out.println(Arrays.toString(arr1));
//        System.out.println(stringPalindrome("nippin",0));
//        System.out.println(fibonnaci(4));
//        int arr[] ={8,4,5,2,7,9,3,1,6};
//        System.out.println(findoccurence(2,arr));
//        selectionsort(arr);
//        bubblesort(arr);
//        insertion(arr);
//        mergeSort(arr);
//        quickSort(arr,0,arr.length-1);
//        System.out.println(Arrays.toString(arr));


    }

}
