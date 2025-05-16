package com.himanshu.practice;

public class recursion {
    static int rev=0;

    static void n_To_1(int n){
        if (n==1){
            System.out.print(n);
            return;
        }
        System.out.print(n+" ");
        n_To_1(n-1);
    }

    static void a1_To_n(int n){
        if (n==1){
            System.out.print(n);
            return;
        }
        a1_To_n(n-1);
        System.out.print(" "+n);
    }

    static int fact(int n){
        if (n<=1)
            return 1;

        return n*fact(n-1);
    }

    static int sum_N(int n){
        if (n==0)
            return 0;
        return n+sum_N(n-1);
    }

    static int sum_Digit(int n){
        if (n==0)
            return 0;
        return n%10+sum_Digit(n/10);
    }

    static int product_Digit(int n){
        if (n%10==n)
            return n;
        return n%10*product_Digit(n/10);
    }

    static void reverse_number(int n){
        if(n==0)
            return;
        int rem=n%10;
        rev= rev*10+rem;
        reverse_number(n/10);
    }

    static boolean checkpalindrom(int n){
        reverse_number(n);
        if (n==rev)
            return true;
        return false;
    }

    static int countzero(int i){
        if (i==0)
            return rev;
        int rem=i%10;
        if (rem==0)
            rev++;
        return countzero(i/10);
    }

    static boolean checkSorted(int ar[]){

        return helper(ar,0);
    }
    static boolean helper(int ar[],int idx){
        if (idx==ar.length-2)
            return true;

        return ((ar[idx]<ar[idx+1])&&(helper(ar,idx+1)));
    }

    static int linear(int arr[],int target){
        return helperlinear(arr,target,0);
    }

    static int helperlinear(int[] arr,int tar,int idx){
        if (idx==arr.length)
           return -1;
        if (arr[idx]==tar)
            return idx;
        else
            return helperlinear(arr,tar,idx+1);

    }

    static void pattern(int r,int c){
        if (r==0)
            return;
        if (c<r){
        pattern(r,c+1);
        System.out.print("* ");
        }else {
            pattern(r - 1, 0);
            System.out.println();
        }
    }

    static void printfibo(int first,int second,int n){
        if (count==n-2)
            return;
        count++;
        int third=first+second;
        System.out.print(","+third);
        printfibo(second,third,n);
    }

    static int pow(int n,int x){
        if (x==1)
            return n;

        if (x%2==0)
            return pow(n,x/2)*pow(n,x/2);
        else
            return pow(n,x/2)*pow(n,x/2)* n;
    }

    static void reverseprint(String s,int siz){
        if (siz<=0)
            return;
        System.out.print(s.charAt(siz-1));
        reverseprint(s,siz-1);

    }
    static void moveend(String s,int siz,int count,String res){
        if (siz==s.length()){
            for (int i=0;i<count;i++)
                res+='x';
            System.out.println(res);
            return;
        }

        if (s.charAt(siz)=='x'){
            count++;
            moveend(s,siz+1,count,res);
        }else {
            res+=s.charAt(siz);
            moveend(s,siz+1,count,res);
        }
    }

    static void removeduplicate(String s,int idx,String res){
        if (idx==s.length()){
            System.out.println(res);
            return;
        }
        String ss="";
        char ans= s.charAt(idx);
        ss+=ans;
        if (res.contains(ss)){
            removeduplicate(s,idx+1,res);
        }else {
            res+=ans;
            removeduplicate(s,idx+1,res);
        }
    }

    static void checksorted(int arr[],int idx){
        if (idx==arr.length-1){
            System.out.println("Strictly sorted");
            return;
        }
        if (arr[idx]>arr[idx+1]){
            System.out.println("unsorted");
            return;
        }
        if (arr[idx]==arr[idx+1]){
            System.out.println("Strictly unsorted");
            return;
        }
        checksorted(arr,idx+1);
    }

    static int count=0;
    public static void main(String[] args) {
        String s="abcabdecbdae";
        removeduplicate(s,0,"");
//        String s="abxjkxxhkxj";
//        moveend(s,0,0,"");
//        int[] arr={1,2,3,4,5,59,54,65,75,95,654,852,3256};
//        checksorted(arr,0);
//        String s="abcd";
//        reverseprint(s,s.length());
//        System.out.print(0+","+1);
//        printfibo(0,1,10);
//        System.out.println(pow(2,10));
//        n_To_1(10);
//        System.out.println();
//        a1_To_n(10);
//        System.out.println();
//        System.out.println(fact(5));
//        System.out.println(sum_N(5));
//        System.out.println(sum_Digit(1764));
//        System.out.println(product_Digit(208));
//        int n=2048;
//        reverse_number(n);
//        System.out.println(rev);
//        int n=2048402;
//        System.out.println(checkpalindrom(n));
//        System.out.println(countzero(6020504));
//        int[] arr={1,2,3,4,9,6,8,10};
//        System.out.println(checkSorted(arr));
//        int[] arr={154,12,355,34,9,62,8,10};
//        System.out.println(linear(arr,9));
//        pattern(4,0);
    }

}
