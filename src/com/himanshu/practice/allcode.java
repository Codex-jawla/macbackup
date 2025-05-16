//package com.himanshu.binaryQues;
//
//// problem name ----------------->>>>>>>>>>>>>
////  **** possible smallest character greater then target ****
//// <<<<<<<<<<------------------- end.
//
//public class smallestChar {
//    public static void smallChar(char[] ar, char val){
//        int lo=0;
//        int hi=ar.length-1;
//        char possible_min=ar[0];
//        if (val>=ar[hi]) {
//            System.out.println("Target value must be less than array's maximum value");
//            return;
//        }
//        while (hi>=lo){
//            int mid= lo + (hi-lo)/2;
//            if (ar[mid]==val){
//                possible_min=ar[mid+1];
//                System.out.println("possible smallest character greater target is : "+possible_min);
//            }
//            if (val<ar[mid]){
//                hi=mid-1;
//                possible_min=ar[mid];
//            }else {
//                lo=mid+1;
//            }
//        }
//        System.out.println("possible smallest character greater target is : "+possible_min);
//
//    }
//
//    public static void main(String[] args) {
//        char[] arr =new char[]{'a', 'd', 'g', 'k', 'p', 'r', 'u', 'w', 'y', 'z'};
//        smallChar(arr,'b');
//    }
//}
//package com.himanshu.binaryQues;
//
//public class searchInInfiniteArray {
//
//    public static void infiniteBinarySearch(int ar[],int val){
//        int lo=0;
//        int hi=check(ar,val);
//
//        while (hi>=lo){
//            int mid= lo + (hi-lo)/2;
//            if (ar[mid]==val){
//                System.out.println("Element found at index : "+mid);
//                return;
//            }
//            if (val<ar[mid]){
//                hi=mid-1;
//            }else {
//                lo=mid+1;
//            }
//            if (hi<lo)
//                System.out.println("Element not found");
//        }
//    }
//    public static int check(int arr[],int target){
//        int ans=1;
//        while(arr[ans]<target){
//            ans *= 2;
//        }
//        return ans;
//    }
//
//
//
//    public static void main(String[] args) {
//        int[] myArray = new int[100000];
//
//        for (int i = 0; i < myArray.length; i++) {
//            myArray[i] = i*2; // You can initialize elements with any values you want
//        }
//        infiniteBinarySearch(myArray,58234);
//    }
//}
//package com.himanshu.binaryQues;
//import java.util.*;
//
//public class search2dsorted {
//
//    static int[] search2d(int[][] arr,int val){
//        int r=0;
//        int c=arr[0].length-1;
//        while(r<arr.length && c>=0){
//            if (arr[r][c]==val)
//                return new int[]{r+1,c+1};
//            else if (arr[r][c]>val)
//                c--;
//            else
//                r++;
//        }
//
//        return new int[]{-1,-1};
//    }
//
//    public static void main(String[] args) {
//        int[][] arr2d={
//                {1,2,3,4,5},
//                {6,7,8,9,10},
//                {12,15,18,19,20}
//        };
//        System.out.println(Arrays.toString(search2d(arr2d,19)));
//    }
//}
//package com.himanshu.binaryQues;
//
//
//public class rotatedsortedrecursion {
//
//
//    static int search(int[] arr,int tar){
//        int piv=pivot(arr,tar,0,arr.length-1);
//        if (piv==-1)
//            return recBS(arr,0,arr.length-1,tar);
//        int firsthalf=recBS(arr,0,piv,tar);
//        if (firsthalf!=-1)
//            return firsthalf;
//        return recBS(arr,piv+1,arr.length,tar);
//    }
//    static int recBS(int[] arr,int start,int end,int target){
//        if (start>end)
//            return -1;
//        int mid=start+(end-start)/2;
//        if (target==arr[mid])
//            return mid;
//        if (target<arr[mid])
//            return recBS(arr,start,mid-1,target);
//        else
//            return recBS(arr,mid+1,end,target);
//    }
//
//    private static int pivot(int[] arr, int tar, int start, int end) {
//        if (start>end)
//            return -1;
//
//        int mid = start +(end-start)/2;
//        if(mid<end&&arr[mid]>arr[mid+1])
//            return mid;
//
//        if(mid>start&&arr[mid]<arr[mid-1])
//            return mid-1;
//
//        if(arr[0]>arr[mid]){
//            return pivot(arr,tar,start,mid-1);
//        }else{
//            return pivot(arr,tar,mid+1,end);
//        }
//    }
//    static int search1(int[] arr,int start,int end,int tar){
//        if (start>end)
//            return -1;
//
//        int mid=start+(end-start)/2;
//
//        if (arr[mid]==tar)
//            return mid;
//
//        if (arr[mid]>=arr[start]){
//
//            if (tar>=arr[start]&&tar<arr[mid])
//                return search1(arr,start,mid-1,tar);
//            else
//                return search1(arr,mid+1,end,tar);
//
//        }else {
//
//            if (tar>arr[mid]&&tar<=arr[end])
//                return search1(arr,mid+1,end,tar);
//            else
//                return search1(arr,start,mid-1,tar);
//
//        }
//    }
//
//    public static void main(String[] args) {
//        int arr[] ={5,6,7,1,2,3,4};
//        System.out.println(search(arr,1));
//        System.out.println(search1(arr,0,arr.length-1,1));
//    }
//}
//package com.himanshu.binaryQues;
//
//public class rotatedSorted {
//
//    static boolean searchDRS(int arr[], int l, int h, int key)
//    {
//        if (l > h)
//            return false;
//
//        int mid = l + (h - l) / 2;
//        if (arr[mid] == key)
//            return true;
//        if ((arr[l] == arr[mid])
//                && (arr[h] == arr[mid]))
//        {
//            l++;
//            h--;
//            return searchDRS(arr,l,h,key);
//        }
//        else if (arr[l] <= arr[mid])
//        {
//            if (key >= arr[l] && key <= arr[mid])
//                return searchDRS(arr, l, mid - 1, key);
//            else
//                return searchDRS(arr, mid + 1, h, key);
//        }
//        else if (key >= arr[mid] && key <= arr[h])
//            return searchDRS(arr, mid + 1, h, key);
//
//        return searchDRS(arr, l, mid - 1, key);
//    }
//    public static int Rsorted(int arr[],int target){
//        int pvt=pivot(arr);
//
//        if (pvt==-1)
//            return orderbinarys(arr,target,0,arr.length-1);
//        int firsthalf= orderbinarys(arr,target,0,pvt);
//        if(firsthalf!=-1){
//            return firsthalf;
//        }
//        return orderbinarys(arr,target,pvt+1,arr.length-1);
//    }
//
//    public static int orderbinarys(int ar[],int val,int lo,int hi){
//        boolean isAse=ar[lo]<ar[hi];
//
//        while (hi>=lo){
//            int mid= lo + (hi-lo)/2;
//            if (ar[mid]==val){
//                return mid;
//            }
//            if (isAse){
//                if (val<ar[mid]){
//                    hi=mid-1;
//                }else {
//                    lo=mid+1;
//                }
//            }else {
//                if (val>ar[mid]){
//                    hi=mid-1;
//                }else {
//                    lo=mid+1;
//                }
//            }
//        }
//        return -1;
//    }
//
//    public static int pivot(int arr[]){
//        int start=0;
//        int end=arr.length-1;
//        while(start<=end){
//            int mid = start +(end-start)/2;
//            if(mid<end&&arr[mid]>arr[mid+1])
//                return mid;
//
//            if(mid>start&&arr[mid]<arr[mid-1])
//                return mid-1;
//
//            if(arr[0]>arr[mid]){
//                end=mid-1;
//            }else{
//                start=mid+1;
//            }
//        }
//        return -1;
//    }
//
//    public static void main(String[] args) {
//        int arr[]={13,17,23,29,2,3,5,7,11};
//        int ar[]={4,5,6,7,0,1,2};
//        System.out.println(Rsorted(ar,1));
//    }
//}
//package com.himanshu.binaryQues;
//
//public class foundInMountain {
//
//    static int search(int ar[],int var){
//        int peakidx=peakfind(ar,var);
//        int firsttry=orderDignoisticBinary(ar,var,0,peakidx);
//        if(firsttry!=-1)
//            return firsttry;
//
//        return orderDignoisticBinary(ar,var,peakidx+1,ar.length-1);
//    }
//    static int peakfind(int ar[],int var){
//        int lo=0;
//        int hi=ar.length-1;
//
//        while (hi>lo){
//            int mid= lo + (hi-lo)/2;
//            if(ar[mid+1]<ar[mid]){
//                hi=mid;
//            }else{
//                lo=mid+1;
//            }
//        }
//        return lo;
//    }
//    public static int binarys(int ar[],int val,int start,int end){
//        int lo=start;
//        int hi=end;
//
//        while (hi>lo){
//            int mid= lo + (hi-lo)/2;
//            if (ar[mid]==val){
////                System.out.println("Element found at index : "+mid);
//                return mid;
//            }
//            if (val<ar[mid]){
//                hi=mid-1;
//            }else {
//                lo=mid+1;
//            }
//        }
//        return -1;
//    }
//    public static int orderDignoisticBinary(int ar[],int val,int lo,int hi){
//        boolean isAse=ar[lo]<ar[hi];
//
//        while (hi>=lo){
//            int mid= lo + (hi-lo)/2;
//            if (ar[mid]==val){
//                return mid;
//            }
//            if (isAse){
//                if (val<ar[mid]){
//                    hi=mid-1;
//                }else {
//                    lo=mid+1;
//                }
//            }else {
//                if (val>ar[mid]){
//                    hi=mid-1;
//                }else {
//                    lo=mid+1;
//                }
//            }
//        }
//        return -1;
//    }
//
//    public static void main(String[] args) {
//        int arr[]=new int[]{-2,4,11,85,65,12,5,1,-4};
//        int ar[]=new int[]{0,3,5,12,8,5,4};
//        System.out.println(search(arr,12));
//    }
//}
//package com.himanshu.binaryQues;
//
//public class peakofMountain {
//    static int peakfind(int ar[]){
//        int lo=0;
//        int hi=ar.length-1;
//
//        while (hi>lo){
//            int mid= lo + (hi-lo)/2;
//            if(ar[mid+1]<ar[mid]){
//                hi=mid;
//            }else{
//                lo=mid+1;
//            }
//        }
//        return lo;
//    }
//
//    public static void main(String[] args) {
//        int arr[]=new int[]{-2,4,11,85,65,12,5,1,-4};
//        int ar[]=new int[]{0,3,5,12,8,5,4};
//        System.out.println(peakfind(ar));
//    }
//}
//package com.himanshu.binaryQues;
//
//// problem name ----------------->>>>>>>>>>>>>
////  **** possible maximum element less or equal to target ****
//// <<<<<<<<<<------------------- end.
//
//public class floor_of_num {
//
//    public static int floorQues(int ar[],int val){
//        int lo=0;
//        int hi=ar.length-1;
//        int possible_min=ar[0];
//        if (val<ar[0]) {
//            System.out.println("Target value must be greter than array's minimum value");
//            return Integer.MIN_VALUE;
//        }
//        while (hi>=lo){
//            int mid= lo + (hi-lo)/2;
//            if (ar[mid]==val){
//                possible_min=ar[mid];
//                return possible_min;
//            }
//            if (val<ar[mid]){
//                hi=mid-1;
//            }else {
//                lo=mid+1;
//                possible_min=ar[mid];
//            }
//        }
//        return possible_min;
//    }
//    public static void main(String[] args) {
//        int arr[]=new int[]{2,4,6,9,11,12,14,20,36,44};
//        int am=floorQues(arr,31);
//        System.out.println("possible maximum element less or equal to target is : "+am);
//    }
//}
//package com.himanshu.binaryQues;
//
//import java.util.Arrays;
//
//public class FirstandLastIndex {
//
//    public static int[] searchRange(int[] nums, int target) {
//
//        int[] ans = {-1, -1};
//        ans[0] = search(nums, target, true);
//        if (ans[0] != -1) {
//            ans[1] = search(nums, target, false);
//        }
//        return ans;
//    }
//
//    // this function just returns the index value of target
//    static int search(int[] nums, int target, boolean findStartIndex) {
//        int ans = -1;
//        int start = 0;
//        int end = nums.length - 1;
//        while(start <= end) {
//            int mid = start + (end - start) / 2;
//
//            if (target < nums[mid]) {
//                end = mid - 1;
//            } else if (target > nums[mid]) {
//                start = mid + 1;
//            } else {
//                ans = mid;
//                if (findStartIndex) {
//                    end = mid - 1;
//                } else {
//                    start = mid + 1;
//                }
//            }
//        }
//        return ans;
//    }
//
//    public static void main(String[] args) {
//        int arr[]=new int[]{5,7,7,8,8,10};
//        int ans[]=searchRange(arr,7);
//        System.out.println(Arrays.toString(ans));
//    }
//
//}
//package com.himanshu.binaryQues;
//
//public class countRotation {
//
//    public static int countrotation(int arr[]){
//        int start=0;
//        int end=arr.length-1;
//
//        while(start<end){
//            int mid=start+(end-start)/2;
//            if (mid<end && arr[mid]>arr[mid+1])
//                return mid+1;
//            if (mid>start && arr[mid]<arr[mid-1])
//                return mid;
//            if (arr[0]>arr[mid])
//                end=mid-1;
//            else
//                start=mid+1;
//        }
//        return 0;
//    }
//    public static void main(String[] args) {
//
//        int ar[]={2,3,5,7,11,17,23,29};
//        System.out.println(countrotation(ar));
//
//    }
//}
//package com.himanshu.binaryQues;
//
//// problem name ----------------->>>>>>>>>>>>>
////  **** possible minimum element greater or equal to target ****
//// <<<<<<<<<<------------------- end.
//
//public class ceiling_of_num {
//    public static int ceilingQues(int ar[],int val){
//        int lo=0;
//        int hi=ar.length-1;
//        int possible_min=ar.length;
//        if (val>ar[hi-1]) {
//            System.out.println("Target value must be less than array's maximum value");
//            return Integer.MIN_VALUE;
//        }
//        while (hi>=lo){
//            int mid= lo + (hi-lo)/2;
//            if (ar[mid]==val){
//                possible_min=ar[mid];
//                return possible_min;
//            }
//            if (val<ar[mid]){
//                hi=mid-1;
//                possible_min=ar[mid];
//            }else {
//                lo=mid+1;
//            }
//        }
//        return possible_min;
//    }
//    public static void main(String[] args) {
//        int arr[]=new int[]{2,4,6,9,11,12,14,20,36,44};
//        int val=16;
//        int am=ceilingQues(arr,val);
//        System.out.println("possible minimum element greater or equal to "+ val+" is : "+am);
//
//    }
//}
//package com.himanshu.dsa;
//
//import java.util.Arrays;
//
//public class mergeSort {
//
//    static void divide(int arr[],int si,int li){
//        if(si>=li)
//            return;
//        int mid=si+ (li-si)/2;
//        divide(arr,si,mid);
//        divide(arr,mid+1,li);
//        conquer(arr,si,mid,li);
//    }
//
//    static void conquer(int[] arr, int si, int mid, int li) {
//        int merge[] =new int[li-si+1];
//        int idx1=si;
//        int idx2=mid+1;
//        int x=0;
//
//        while (idx1<=mid&&idx2<=li){
//            if (arr[idx1]<=arr[idx2]){
//                merge[x++]=arr[idx1++];
//            }else {
//                merge[x++]=arr[idx2++];
//            }
//        }
//
//        while (idx1<=mid){
//            merge[x++]=arr[idx1++];
//        }
//        while (idx2<=li){
//            merge[x++]=arr[idx2++];
//        }
//        for (int i=0,j=si;i< merge.length;i++,j++){
//            arr[j]=merge[i];
//        }
//    }
//
//    static int[] sort(int[] arr){
//        if (arr.length==1)
//            return arr;
//
//        int mid = arr.length/2;
//        int[] left= sort(Arrays.copyOfRange(arr,0,mid));
//        int[] right= sort(Arrays.copyOfRange(arr,mid,arr.length));
//
//        return merge(left,right);
//    }
//
//    static int[] merge(int[] left,int[] right){
//        int mix[]=new int[left.length+ right.length];
//        int i=0,j=0,k=0;
//        while (i< left.length&&j< right.length){
//            if (left[i]<right[j]){
//                mix[k]=left[i];
//                i++;
//            }else{
//                mix[k]=right[j];
//                j++;
//            }
//            k++;
//        }
//        while (i< left.length){
//            mix[k]=left[i];
//            i++;
//            k++;
//        }
//        while (j< right.length){
//            mix[k]=right[j];
//            j++;
//            k++;
//        }
//        return mix;
//    }
//
//    public static void main(String[] args) {
//        int[] arr={5,9,6,4,2,3,15,65,25,12};
//        int n = arr.length-1;
////        System.out.println(Arrays.toString(sort(arr)));
//        divide(arr,0, arr.length-1);
//        System.out.println(Arrays.toString(arr));
//    }
//
//}
//package com.himanshu.dsa;
//
//import java.util.Scanner;
//
//import static com.himanshu.dsa.LL.mergeInBetween;
//import static com.himanshu.dsa.LL.rotateRight;
//
//public class Main {
//
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
////        System.out.println("Select Linked List type -- ");
////        System.out.println("Press 1 for singly or 2 for doubly or 3 for circular ");
////        int a=sc.nextInt();
////        int a=1;
////        if (a==1){
//        LL list1=new LL();
//
//        list1.add(0);
//        list1.add(1);
//        list1.add(2);
//        list1.print();
////        LL list=new LL();
////        list.add(10000);
////        list.add(10001);
////        list.add(10002);
////        list.add(10003);
////        list.print();
//        rotateRight(list1.headrt(),4);
//        list1.print();
//
////    mergeInBetween(list1.headrt(),a,b,list.headrt());
//
////        list1.add(5);
////        list1.add(7);
////        list1.add(5);
////        list1.add(3);
////        list1.add(8);
////        list1.add(9);
////        list1.add(0);
////        list1.add(6);
////        list1.add(5);
////        list1.add(9);
////        list1.add(6);
////        list1.add(9);
////        list1.add(2);
////        list1.add(1);
////        list1.add(3);
////        list1.add(0);
////        list1.add(8);
////        list1.add(8);
////        list1.add(4);
////        list1.add(8);
////        list1.add(9);
////        list1.add(0);
////        list1.add(3);
////        list1.add(5);
////        list1.add(6);
////        list1.add(8);
////        list1.add(9);
////        list1.add(0);
////        list1.add(1);
////        list1.add(0);
////        list1.add(9);
////        list1.add(8);
////        list1.add(6);
////        list1.add(5);
////        list1.add(3);
////        list1.add(0);
////        list1.add(9);
////        list1.add(8);
////        list1.add(4);
////        list1.add(8);
////        list1.add(8);
////        list1.add(0);
////        list1.add(3);
////        list1.add(1);
////        list1.add(2);
////        list1.add(9);
////        list1.add(6);
////        list1.add(9);
////        list1.add(5);
////        list1.add(6);
////        list1.add(0);
////        list1.add(9);
////        list1.add(8);
////        list1.add(3);
////        list1.add(5);
////        list1.add(7);
////        list1.add(5);
////        list1.add(1);
////        list1.add(2);
////        list1.add(2);
////        list1.add(1);
////        LL.Node head = list1.headrt();
////            System.out.println(list1.isPalindrome(head));
////        int i=1;
////        do {
////            System.out.println("Enter choice");
////            System.out.println("For sequential data 'addition' press 1");
////            System.out.println("For specific position data 'addition' press 2");
////            System.out.println("For sequential data 'deletion' press 3");
////            System.out.println("For specific position data 'deletion' press 4");
////            System.out.println("For data 'Updation' press 5");
////            System.out.println("To print linkedlist press 6");
////            System.out.println("To print size of Linkedlist press 7");
////            System.out.println("To reverse linked List press 8");
////            System.out.println("To exit press 0");
////            int ans= sc.nextInt();
////            int data,pos;
////            i=ans;
////            switch (i){
////                case 1:
////                    System.out.println("Enter data to add : ");
////                    data=sc.nextInt();
////                    list1.add(data);
////                    break;
////                case 2:
////                    System.out.println("Enter data and position to add : ");
////                    data=sc.nextInt();
////                    pos=sc.nextInt();
////                    list1.add(data,pos);
////                    break;
////                case 3:
////                    list1.remove();
////                    break;
////                case 4:
////                    System.out.println("Enter position to delete data : ");
////                    pos=sc.nextInt();
////                    list1.remove(pos);
////                    break;
////                case 5:
////                    System.out.println("Enter new data value and position to update : ");
////                    data=sc.nextInt();
////                    pos=sc.nextInt();
////                    list1.update(data,pos);
////                    break;
////                case 6:
////                    list1.print();
////                    break;
////                case 7:
////                    list1.Size();
////                    break;
////                case 8:
////                    list1.reversell();
////                    break;
////                case 0:
////                    break;
////                default:
////                    System.out.println("Invalid input");
////                    System.out.println("Invalid input");
////                    break;
////            }
////        }while(i!=0);
////    } else if (a==2) {
////            DLL list1=new DLL();
////            list1.add(1);
////            list1.add(2);
////            list1.add(3);
////            list1.add(33);
////            list1.add(6);
////            int i=1;
////            do {
////                System.out.println("Enter choice");
////                System.out.println("For sequential data 'addition' press 1");
////                System.out.println("For specific position data 'addition' press 2");
////                System.out.println("For sequential data 'deletion' press 3");
////                System.out.println("For specific position data 'deletion' press 4");
////                System.out.println("For data 'Updation' press 5");
////                System.out.println("To print linkedlist press 6");
////                System.out.println("To print size of Linkedlist press 7");
////                System.out.println("To exit press 0");
////                int ans= sc.nextInt();
////                int data,pos;
////                i=ans;
////                switch (i){
////                    case 1:
////                        System.out.println("Enter data to add : ");
////                        data=sc.nextInt();
////                        list1.add(data);
////                        break;
////                    case 2:
////                        System.out.println("Enter data and position to add : ");
////                        data=sc.nextInt();
////                        pos=sc.nextInt();
////                        list1.add(data,pos);
////                        break;
////                    case 3:
////                        list1.remove();
////                        break;
////                    case 4:
////                        System.out.println("Enter position to delete data : ");
////                        pos=sc.nextInt();
////                        list1.remove(pos);
////                        break;
////                    case 5:
////                        System.out.println("Enter new data value and position to update : ");
////                        data=sc.nextInt();
////                        pos=sc.nextInt();
////                        list1.update(data,pos);
////                        break;
////                    case 6:
////                        list1.print();
////                        break;
////                    case 7:
////                        list1.Size();
////                        break;
////                    case 0:
////                        break;
////                    default:
////                        System.out.println("Invalid input");
////                        System.out.println("Invalid input");
////                        break;
////                }
////            }while(i!=0);
////        } else if (a==3) {
////            CLL list1=new CLL();
////            list1.add(1);
////            list1.add(2);
////            list1.add(3);
////            list1.add(33);
////            list1.add(6);
////            int i=1;
////            do {
////                System.out.println("Enter choice");
////                System.out.println("For sequential data 'addition' press 1");
////                System.out.println("For specific position data 'addition' press 2");
////                System.out.println("For sequential data 'deletion' press 3");
////                System.out.println("For specific position data 'deletion' press 4");
////                System.out.println("For data 'Updation' press 5");
////                System.out.println("To print linkedlist press 6");
////                System.out.println("To print size of Linkedlist press 7");
////                System.out.println("To exit press 0");
////                int ans= sc.nextInt();
////                int data,pos;
////                i=ans;
////                switch (i){
////                    case 1:
////                        System.out.println("Enter data to add : ");
////                        data=sc.nextInt();
////                        list1.add(data);
////                        break;
////                    case 2:
////                        System.out.println("Enter data and position to add : ");
////                        data=sc.nextInt();
////                        pos=sc.nextInt();
////                        list1.add(data,pos);
////                        break;
////                    case 3:
////                        list1.remove();
////                        break;
////                    case 4:
////                        System.out.println("Enter position to delete data : ");
////                        pos=sc.nextInt();
////                        list1.remove(pos);
////                        break;
////                    case 5:
////                        System.out.println("Enter new data value and position to update : ");
////                        data=sc.nextInt();
////                        pos=sc.nextInt();
////                        list1.update(data,pos);
////                        break;
////                    case 6:
////                        list1.print();
////                        break;
////                    case 7:
////                        list1.Size();
////                        break;
////                    case 0:
////                        break;
////                    default:
////                        System.out.println("Invalid input");
////                        System.out.println("Invalid input");
////                        break;
////                }
////            }while(i!=0);
////        } else {
////            System.out.println("Invalid input !");
////        }
//    }
//
//}package com.himanshu.dsa;
//
//import java.util.Scanner;
//
//public class LL {
//    private Node head;
//    private Node tail;
//    private int size;
//
//    LL() {
//        this.size = 0;
//    }
//
//    static class Node {
//        private Node next;
//        private int data;
//
//        Node(int data) {
//            this.data = data;
//        }
//    }
//    public  Node reverseList(Node head) {
//        Node pre =null;
//        Node curr = head;
//        while(curr!=null){
//            Node next = curr.next;
//            curr.next =pre;
//            pre=curr;
//            curr=next;
//        }
//        return pre;
//    }
//    public static Node mergeInBetween(Node list1, int a, int b, Node list2) {
//        int count=0;
//        Node t1=list1;
//        Node t2=list1;
//        while(t1!=null){
//            count++;
//            if(count==a){
//                t2=t1;
//                if(a==b)
//                    t1=t1.next;
//                else
//                    t1=t1.next.next;
//                t2.next=list2;
//                while(t2.next!=null){
//                    t2=t2.next;
//                }
//                continue;
//            }
//            if(a==b&&count==a){
//                a--;
//                count--;
//            }
//
//            if(count==b){
//                t2.next=t1.next;
//                t2=t2.next;
//                t1=t2;
//                break;
//
//            }
//            t1=t1.next;
//        }
//        return list1;
//    }
//
//    public static Node rotateRight(Node head, int k) {
//        if(head==null||head.next==null||k==0)
//            return head;
//        Node temp=head;
//        Node tail;
//        int count=1;
//        while(temp.next!=null){
//            count++;
//            temp=temp.next;
//        }
//        tail=temp;
//        temp=head;
//        if(k<count)
//            count=count-k-1;
//        else{
//            count=k%count;
//        }
//        while(count>0){
//            temp=temp.next;
//            count--;
//        }
//        tail.next=head;
//        head=temp.next;
//        temp.next=null;
//
//        return head;
//    }
//
//    public  boolean isPalindrome(Node head) {
//        if(head.next==null)
//            return true;
//        long num1=0;
//        Node temp=head;
//        num1+=temp.data;
//        temp=temp.next;
//        while(temp!=null){
//            num1*=10;
//            num1+=temp.data;
//            temp=temp.next;
//        }
//        temp=reverseList(head);
//        long num2=0;
//        num2+=temp.data;
//        temp=temp.next;
//        while(temp!=null){
//            num2*=10;
//            num2+=temp.data;
//            temp=temp.next;
//        }
//        if(num1==num2)
//            return true;
//        else
//            return false;
//    }
//    public Node headrt(){
//        return head;
//    }
//
//    public void insertFront(int data) {
//        Node nd = new Node(data);
//        if (head != null)
//            nd.next = head;
//        head = nd;
//        if (tail == null)
//            tail = head;
//        size++;
//    }
//
//    public void reversell(){
//        if (size<=1)
//            return;
//        if (size==2){
//            head.next.next=head;
//            head.next=null;
//            return;
//        }
//        Node pre = head;
//        Node curr = head.next;
//        Node nxt = curr.next;
//
//        do {
//            curr.next=pre;
//            pre=curr;
//            curr=nxt;
//            nxt=nxt.next;
//        }while (nxt!=null);
//
//        curr.next=pre;
//        pre=curr;
//        tail=head;
//        head.next=null;
//        head=pre;
//    }
//
//    public void deleteFront() {
//        head = head.next;
//        if (head == null)
//            tail = null;
//        size--;
//    }
//
//    public void insertBetween(int data, int pos) {
//        Node nd = new Node(data);
//        Node temp = head;
//        int i = 1;
//        while (i < pos - 1) {
//            temp = temp.next;
//            i++;
//        }
//        nd.next = temp.next;
//        temp.next = nd;
//        size++;
//    }
//
//    public void deleteBetween(int pos) {
//        Node temp = head;
//        int i = 1;
//        while (i < pos - 1) {
//            temp = temp.next;
//            i++;
//        }
//        Node temp2 = temp.next;
//        temp.next = temp.next.next;
//        temp2 = null;
//        size--;
//    }
//
//    public void insertEnd(int data) {
//        Node nd = new Node(data);
//        tail.next = nd;
//        tail = nd;
//        size++;
//    }
//
//    public void deleteEnd() {
//        Node temp = head;
//        while (temp.next != tail) {
//            temp = temp.next;
//        }
//        temp.next = null;
//        tail = temp;
//        size--;
//    }
//
//    public void add(int data) {
//        if (tail == null)
//            insertFront(data);
//        else
//            insertEnd(data);
//    }
//
//    public void remove() {
//        deleteEnd();
//    }
//
//    public void add(int data, int pos) {
//        if (pos == 1) {
//            insertFront(data);
//        } else if (pos == size + 1) {
//            insertEnd(data);
//        } else {
//            insertBetween(data, pos);
//        }
//    }
//
//    public void remove(int pos) {
//        if (pos == 1) {
//            deleteFront();
//        } else if (pos == size + 1) {
//            deleteEnd();
//        } else {
//            deleteBetween(pos);
//        }
//    }
//
//    public void update(int newdata, int pos) {
//        Node temp = head;
//        int i = 1;
//        while (i < pos) {
//            temp = temp.next;
//            i++;
//        }
//        temp.data = newdata;
//    }
//
//    public void print() {
//        Node temp = head;
//        while (temp != null) {
//            System.out.print(temp.data + " --> ");
//            temp = temp.next;
//        }
//        System.out.println("NULL");
//    }
//
//    public void findAndDeleteLastNth(int n){
//        Node temp =head;
//        int i = size-n-1;
//        int j=0;
//        while(j<i){
//            temp=temp.next;
//        }
//    }
//
//    public void Size() {
//        System.out.println(size);
//    }
//
//}
//
//class DLL {
//    private NodeD head;
//    private NodeD tail;
//    private int size;
//
//    DLL() {
//        this.size = 0;
//    }
//
//    static class NodeD {
//        private NodeD next;
//        private NodeD pre;
//        private int data;
//
//        NodeD(int data) {
//            this.data = data;
//        }
//    }
//
//    public void insertFront(int data) {
//        NodeD nd = new NodeD(data);
//        if (head != null) {
//            nd.next = head;
//            head.pre = nd;
//        }
//        head = nd;
//        if (tail == null)
//            tail = head;
//        size++;
//    }
//
//    public void deleteFront() {
//        head = head.next;
//        head.pre = null;
//        if (head == null)
//            tail = null;
//        size--;
//    }
//
//    public void insertBetween(int data, int pos) {
//        NodeD nd = new NodeD(data);
//        NodeD temp = head;
//        int i = 1;
//        while (i < pos) {
//            temp = temp.next;
//            i++;
//        }
//        temp.pre.next = nd;
//        nd.next = temp;
//        nd.pre = temp.pre;
//        temp.pre = nd;
//        size++;
//    }
//
//    public void deleteBetween(int pos) {
//        NodeD temp = head;
//        int i = 1;
//        while (i < pos) {
//            temp = temp.next;
//            i++;
//        }
//        temp.pre.next = temp.next;
//        temp.next.pre = temp.pre;
//        size--;
//    }
//
//    public void insertEnd(int data) {
//        NodeD nd = new NodeD(data);
//        tail.next = nd;
//        nd.pre = tail;
//        tail = nd;
//        size++;
//    }
//
//    public void deleteEnd() {
//
//        tail = tail.pre;
//        tail.next = null;
//        size--;
//    }
//
//    public void add(int data) {
//        if (tail == null)
//            insertFront(data);
//        else
//            insertEnd(data);
//    }
//
//    public void remove() {
//        deleteEnd();
//    }
//
//    public void add(int data, int pos) {
//        if (pos == 1) {
//            insertFront(data);
//        } else if (pos == size + 1) {
//            insertEnd(data);
//        } else {
//            insertBetween(data, pos);
//        }
//    }
//
//    public void remove(int pos) {
//        if (pos == 1) {
//            deleteFront();
//        } else if (pos == size + 1) {
//            deleteEnd();
//        } else {
//            deleteBetween(pos);
//        }
//    }
//
//    public void update(int newdata, int pos) {
//        NodeD temp = head;
//        int i = 1;
//        while (i < pos) {
//            temp = temp.next;
//            i++;
//        }
//        temp.data = newdata;
//    }
//
//    public void print() {
//        NodeD temp = head;
//        while (temp != null) {
//            System.out.print(temp.data + " <--> ");
//            temp = temp.next;
//        }
//        System.out.println("NULL");
//    }
//
//    public void Size() {
//        System.out.println(size);
//    }
//}
//
//class CLL {
//    private NodeC head;
//    private NodeC tail;
//    private int size;
//
//    CLL() {
//        this.size = 0;
//    }
//
//    static class NodeC {
//        private NodeC next;
//        private int data;
//
//        NodeC(int data) {
//            this.data = data;
//        }
//    }
//
//    public void insertFront(int data) {
//        NodeC nd = new NodeC(data);
//        if (head == null) {
//            head = tail = nd;
//            nd.next = nd;
//            return;
//        }
//
//        tail.next = nd;
//        nd.next = head;
//        head = nd;
//        size++;
//    }
//
//    public void deleteFront() {
//        tail.next = head.next;
//        head = tail.next;
//        size--;
//    }
//
//    public void insertBetween(int data, int pos) {
//        NodeC nd = new NodeC(data);
//        NodeC temp = head;
//        int i = 1;
//        while (i < pos - 1) {
//            temp = temp.next;
//            i++;
//        }
//        nd.next = temp.next;
//        temp.next = nd;
//        size++;
//    }
//
//    public void deleteBetween(int pos) {
//        NodeC temp = head;
//        int i = 1;
//        while (i < pos - 1) {
//            temp = temp.next;
//            i++;
//        }
//        temp.next = temp.next.next;
//        size--;
//    }
//
//    public void insertEnd(int data) {
//        NodeC nd = new NodeC(data);
//        tail.next = nd;
//        nd.next = head;
//        tail = nd;
//        size++;
//    }
//
//    public void deleteEnd() {
//        NodeC temp = head;
//        while (temp.next != tail) {
//            temp = temp.next;
//
//        }
//        temp.next = head;
//        temp = tail;
//        size--;
//    }
//
//    public void print() {
//        NodeC temp = head;
//        while (temp != tail) {
//            System.out.print(temp.data + " --> ");
//            temp = temp.next;
//        }
//        System.out.println(head.data);
//    }
//
//    public void add(int data) {
//        if (tail == null)
//            insertFront(data);
//        else
//            insertEnd(data);
//    }
//
//    public void remove() {
//        deleteEnd();
//    }
//
//    public void add(int data, int pos) {
//        if (pos == 1) {
//            insertFront(data);
//        } else if (pos == size + 1) {
//            insertEnd(data);
//        } else {
//            insertBetween(data, pos);
//        }
//    }
//
//    public void remove(int pos) {
//        if (pos == 1) {
//            deleteFront();
//        } else if (pos == size + 1) {
//            deleteEnd();
//        } else {
//            deleteBetween(pos);
//        }
//    }
//
//    public void update(int newdata, int pos) {
//        NodeC temp = head;
//        int i = 1;
//        while (i < pos) {
//            temp = temp.next;
//            i++;
//        }
//        temp.data = newdata;
//    }
//
//    public void Size() {
//        System.out.println(size);
//    }
//
//
//}
//
//package com.himanshu.dsa;
//
//import java.util.Arrays;
//
//
//public class InsertionSort {
//    static void swap(int[] ar,int firstidx,int secondidx){
//        int temp=ar[firstidx];
//        ar[firstidx]=ar[secondidx];
//        ar[secondidx]=temp;
//    }
//    static void insertsort(int[] arr) {
//        for(int i=0;i<arr.length-1;i++){
//            int j=i+1;
//            while (j>0){
//                if (arr[j-1]<=arr[j]){
//                    break;}
//                if (arr[j-1]>arr[j])
//                    swap(arr,j-1,j);
//
//                j--;
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        int[] arr={1,4,4,9,3,3,13,10,0};
//        int[] ar={1,3,4,5,7,9,10};
//        int[] a={6,5,3,2,1,2,1,0};
//        System.out.println(Arrays.toString(arr));
//        insertsort(arr);
//        System.out.println(Arrays.toString(arr));
//    }
//
//
//}
//package com.himanshu.dsa;
//
//import java.util.Arrays;
//import java.util.Scanner;
//
//
//public class linearSearch {
//
//    public static int findmin(int []arr){
//        int min =arr[0];
//        for (int i=0;i<arr.length;i++) {
//            if (arr[i] < min){
//                min=arr[i];
//            }
//        }
//        return min;
//    }
//    public static int findmax(int []arr){
//        int min =arr[0];
//        for (int i=0;i<arr.length;i++) {
//            if (arr[i] > min){
//                min=arr[i];
//            }
//        }
//        return min;
//    }
//    public static void linearsearch(int ar[],int val){
//        for (int i=0;i<ar.length;i++) {
//            if (ar[i] == val){
//                System.out.println("Element found at index " + i);
//                return;
//            }
//        }
//        System.out.println("Element not found ");
//    }
//    public static void linearsearch2d(int ar[][],int val){
//        for (int i=0;i<ar.length;i++) {
//            for (int j=0;j<ar[i].length;j++) {
//                if (ar[i][j] == val) {
//                    System.out.println("Element found in row " + (i+1)+" and col "+(j+1));
//                    return;
//                }
//            }
//        }
//        System.out.println("Element not found ");
//    }
//    public static void linearsearchString(String ar[],String val){
//        for (int i=0;i<ar.length;i++) {
//            if (ar[i].equals(val)){
//                System.out.println("Element found at index " + i);
//                return;
//            }
//        }
//        System.out.println("Element not found ");
//    }
//    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
//        int arr[] =new int[]{25,65,35,48,96,52,14,67,23,101,16,9,25,31};
//        int[][] arr2d= new int[][]{
//                {2,4,6,12},
//                {43,3,74,23},
//                {56,48,25,36}
//        };
//        String str[] =new String[]{"hello","vansh","jawla","himanshu","jaat","harsh","mansi","babli","chaudhary","chotu","gudya"};
//
//        System.out.println("Enter element to search in 1d int array : ");
//        int a= sc.nextInt();
//        linearsearch(arr,a);
//        System.out.println("Enter element to search in 2d int array: ");
//        int b= sc.nextInt();
//        linearsearch2d(arr2d,b);
//        System.out.println("Enter name to search in 1d string array: ");
//        String s= sc.next();
//        linearsearchString(str,s);
//
//        System.out.println("Minimum element in array : "+ findmin(arr));
//        System.out.println("Maximum element in array : "+ findmax(arr));
//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(str));
//        System.out.println(15/2);
//    }
//}
//package com.himanshu.dsa;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//public class CyclicSort {
//
//    static void cyclicsort(int[] arr){//    >>>>> 1 to n >>>>>>
//        for (int i=0;i<arr.length;i++) {
//            if (arr[i] != i + 1) {
//                int temp = arr[arr[i] - 1];
//                arr[arr[i] - 1] = arr[i];
//                arr[i] = temp;
//                i--;
//            }
//        }
//    }
//    static void cyclicsort1(int[] arr){//    >>>>> 0 to n >>>>>>
//        int i=0;
//        while (i<arr.length) {
//            if (arr[i] != i) {
//                int temp = arr[i];
//                arr[i] = arr[temp];
//                arr[temp] = temp;
//            }else
//                i++;
//        }
//    }
//    static int missing(int[] arr){//    >>>>> 0 to n >>>>>>
//        int i=0;
//        while (i<arr.length) {
//            if (arr[i] != i) {
//                if (arr[i]== arr.length) {
//                    i++;
//                    continue;
//                }else{int temp = arr[i];
//                    arr[i] = arr[temp];
//                    arr[temp] = temp;}
//            }else
//                i++;
//        }
//        i=0;
//        while (i< arr.length){
//            if (arr[i]==i)
//                i++;
//            else {
////                System.out.println("Missing element is : " + i);
//                break;
//            }
//        }
//        return i;
//    }
//    static List<Integer> missingMulti(int[] arr){//    >>>>> 1 to n >>>>>>
//        int i=0;
//        ArrayList<Integer> l=new ArrayList<>();
//        while (i<arr.length) {
//            if (arr[i] != arr[arr[i] - 1]) {
//                int temp = arr[arr[i] - 1];
//                arr[arr[i] - 1] = arr[i];
//                arr[i] = temp;
//            }else
//                i++;
//        }
//        i=0;
//        while (i< arr.length){
//            if (arr[i]==i+1)
//                i++;
//            else {
//                l.add(i+1);
//                i++;
//            }
//        }
//        return l;
//    }
//
//    static List<Integer> duplicate(int[] arr){//    >>>>> 1 to n >>>>>>
//        ArrayList<Integer> l=new ArrayList<>();
//        for (int i=0;i<arr.length;i++) {
//            if (arr[i] != arr[arr[i] - 1]) {
//                int temp = arr[arr[i] - 1];
//                arr[arr[i] - 1] = arr[i];
//                arr[i] = temp;
//                i--;
//            }
//        }
//        int i=0;
//        while (i< arr.length){
//            if (arr[i]==i+1)
//                i++;
//            else {
//                l.add(arr[i]);
//                i++;
//            }
//        }
//        return l;
//    }
//    static int [] setMismatch(int[] arr){//    >>>>> 1 to n >>>>>>
//        for (int i=0;i<arr.length;i++) {
//            if (arr[i] != arr[arr[i] - 1]) {
//                int temp = arr[arr[i] - 1];
//                arr[arr[i] - 1] = arr[i];
//                arr[i] = temp;
//                i--;
//            }
//        }
//        int i=0;
//        while (i< arr.length){
//            if (arr[i]==i+1)
//                i++;
//            else {
//                return new int[]{arr[i],i+1};
//            }
//        }
//        return new int[]{-1,-1};
//    }
//    static int firstMissingPositve(int[] arr){
//        int i=0;
//        while (i<arr.length) {
//            if (arr[i]<1){
//                i++;
//                continue;
//            } else if (arr[i]>=arr.length) {
//                i++;
//                continue;
//            } else if (arr[i] != arr[arr[i] - 1]) {
//                int temp = arr[arr[i] - 1];
//                arr[arr[i] - 1] = arr[i];
//                arr[i] = temp;
//            }else
//                i++;
//        }
//        i=0;
//        while (i< arr.length){
//            if (arr[i]==i+1)
//                i++;
//            else {
//                return i+1;
//            }
//        }
//        return arr.length+1;
//    }
//
//
//    public static void main(String[] args) {
//        int[] a={6,8,4,7,2,5,1,0,3};
//        int[] b={6,8,7,1,5,3,3,5};
//        int[] c={1,1};
//        int[] d={3,1,3,0,4,2};
//        int[] e={7,8,1,9,10,11};
//        int[] f={1,2};
//        int l = firstMissingPositve(f);
//        System.out.println(l);
//
////    System.out.println(Arrays.toString(setMismatch(d)));
////    int n =duplicate(d);
////    System.out.println(n);
////    List<Integer> list=new ArrayList<>();
////    list=missingMulti(b);
////    System.out.println(list);
////    cyclicsort1(a);
////    int m=missing(b);
////    System.out.println(m);
//    }
//}
//package com.himanshu.dsa;
//
//import java.util.Arrays;
//
//public class BubbleSort {
//
//    static void bubbleSort(int arr[]){
//        for (int i=0;i<arr.length;i++){
//            boolean swap=false;
//            for (int j=0;j<arr.length-i-1;j++){
//                if (arr[j]>arr[j+1]) {
//                    int temp = arr[j + 1];
//                    arr[j + 1] = arr[j];
//                    arr[j] = temp;
//                    swap=true;
//                }
//            }
//            if (!swap)
//                break;
//        }
//    }
//
//    public static void main(String[] args) {
//        int[] arr={1,4,4,9,3,3,13,10,0};
//        int[] ar={1,3,4,5,7,9,10};
//        int[] a={6,5,4,3,2,1,2,1,0};
//        System.out.println(Arrays.toString(a));
//        bubbleSort(a);
//        System.out.println(Arrays.toString(a));
//    }
//}
//package com.himanshu.dsa;
//
//public class binarysearch {
//
//    public static void binarys(int ar[],int val){
//        int lo=0;
//        int hi=ar.length;
//
//        while (hi>lo){
//            int mid= lo + (hi-lo)/2;
//            if (ar[mid]==val){
//                System.out.println("Element found at index : "+mid);
//                return;
//            }
//            if (val<ar[mid]){
//                hi=mid-1;
//            }else {
//                lo=mid+1;
//            }
//            if (hi<lo)
//                System.out.println("Element not found");
//        }
//    }
//
//    public static void main(String[] args) {
//        int arr[]=new int[]{2,4,6,9,11,12,14,20,36,44};
//        binarys(arr,15);
//
//
//    }
//}
//package com.himanshu.dsa;
//import java.util.LinkedList;
//import java.util.Queue;
//
//public class Tree {
//    static class Node{
//        int data;
//        Node left;
//        Node right;
//
//        Node(int data){
//            this.data=data;
//            this.left=null;
//            this.right=null;
//        }
//    }
//    static class BinaryTree{
//        int idx=-1;
//        public  Node buildtree(int[] values){
//            idx++;
//            if (values[idx]==-1){
//                return null;
//            }
//            Node newnode = new Node(values[idx]);
//            newnode.left=buildtree(values);
//            newnode.right=buildtree(values);
//
//            return newnode;
//        }
//
//    }
//
//    static void preorder(Node root){
//        if (root==null){
//            return;
//        }
//        System.out.print(root.data+" ");
//        preorder(root.left);
//        preorder(root.right);
//    }
//
//    static void inorder(Node root){
//        if (root==null){
//            return;
//        }
//        inorder(root.left);
//        System.out.print(root.data+" ");
//        inorder(root.right);
//    }
//
//    static void postorder(Node root){
//        if (root==null){
//            return;
//        }
//        postorder(root.left);
//        postorder(root.right);
//        System.out.print(root.data+" ");
//    }
//
//    static void levelorder(Node root){
//        Queue<Node> q =new LinkedList<>();
//        q.add(root);
//        q.add(null);
//        while(!q.isEmpty()){
//            Node currnode =q.remove();
//            if (currnode==null){
//                System.out.println();
//                if (q.isEmpty()){
//                    break;
//                }else {
//                    q.add(null);
//                }
//            }else{
//                System.out.print(currnode.data+" ");
//                if (currnode.left!=null){
//                    q.add(currnode.left);
//                }
//                if (currnode.right!=null){
//                    q.add(currnode.right);
//                }
//            }
//        }
//
//    }
//    static void no_of_node(Node root){
//
//    }
//
//    public static void main(String[] args) {
//        int value[]= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
//        int t2[] ={1,2,4,5,-1,-1,6,-1,-1,-1,3,7,8,-1,9,-1,-1,-1,-1};
//        BinaryTree tree1=new BinaryTree();
//        BinaryTree tree2=new BinaryTree();
//        Node root1=tree1.buildtree(value);
//        Node root2=tree2.buildtree(t2);
//        System.out.println(root2.data);
//        preorder(root1);
//        System.out.println("preorder");
//        inorder(root1);
//        System.out.println("inorder");
//        postorder(root1);
//        System.out.println("postorder");
//        levelorder(root1);
//        System.out.println("levelorder");
//        System.out.println();
//        preorder(root2);
//        System.out.println("preorder");
//        inorder(root2);
//        System.out.println("inorder");
//        postorder(root2);
//        System.out.println("postorder");
//        levelorder(root2);
//        System.out.println("levelorder");
//    }
//}
//package com.himanshu.dsa;
//
//import java.util.Arrays;
//
//public class Test {
//    public static int[] twoSum(int[] nums, int target) {
//        int sum =0;
//        for (int i=0;i<nums.length-1;i++){
//            for (int j=i+1;j<nums.length;j++){
//                sum=nums[i]+nums[j];
//                if (target==sum)
//                    return new int[]{i,j};
//            }
//        }
//
//        return new int[]{0,0};
//    }
//
//    public static void main(String[] args) {
//
//        int []nums = {3,2,4};
//        System.out.println(Arrays.toString(twoSum(nums,6)));
//
//    }
//}
//package com.himanshu.dsa;
//import java.util.ArrayList;
//
//class stack<t>{
//
//    private int top=-1,size;
//    private ArrayList<t> st= new ArrayList<>();
//    stack(int siz){
//        this.size=siz;
//    }
//
//    public void push(t data){
//        if(top+1==size) {
//            System.out.println("Stack overflow !!!");
//        }else {
//            top++;
//            st.add(top,data);
//            System.out.println(st.get(top)+" Pushed successfully");
//        }
//    }
//
//    public void pop(){
//        if(top==-1) {
//            System.out.println("Stack underflow !!!");
//        }else {
//            System.out.println(st.get(top)+ " Popped successfully");
//            st.remove(top);
//            top--;
//        }
//    }
//
//    public void printst(){
//        System.out.println(st);
//    }
//}
//
//class queue<t>{
//
//    private int front=0,rear=0,size;
//    private ArrayList<t> qe= new ArrayList<>();
//    queue(int siz){
//        this.size=siz;
//    }
//
//    public void enqueue(t data){
//        if(rear==size) {
//            System.out.println("Queue overflow !!!");
//        }else {
//            qe.add(rear,data);
//            System.out.println(qe.get(rear)+" Pushed successfully");
//            rear++;
//        }
//    }
//
//    public void dequeue(){
//        if(rear==-1) {
//            System.out.println("Queue underflow !!!");
//        }else {
//            System.out.println(qe.get(front)+ " Removed successfully");
//            qe.remove(front);
//            rear--;
//        }
//    }
//
//    public void printqe(){
//        System.out.println(qe);
//    }
//}
//
//public class Stack_Queue {
//    public static void main(String[] args) {
//        stack<Integer> st = new stack<>(5);
//        st.push(2);
//        st.push(4);
//        st.push(6);
//        st.push(8);
//        st.push(10);
//        st.push(12);
//        st.printst();
//        st.pop();
//        st.pop();
//        st.pop();
//        st.pop();
//        st.pop();
//        st.pop();
//        st.pop();
//        queue<Integer> qe = new queue<>(5);
//        qe.enqueue(2);
//        qe.enqueue(4);
//        qe.enqueue(6);
//        qe.enqueue(8);
//        qe.enqueue(10);
//        qe.enqueue(12);
//        qe.printqe();
//        qe.dequeue();
//        qe.dequeue();
//        qe.dequeue();
//        qe.dequeue();
//        qe.dequeue();
//        qe.dequeue();
//        qe.dequeue();
//    }
//}
//package com.himanshu.dsa;
//
//import java.util.Arrays;
//
//public class SelectionSort {
//    static void seletsort(int[] ar){
//        boolean swap=false;
//        for (int i=0;i<ar.length;i++){
//            int small=i;
//            for (int j=i+1;j<ar.length;j++){
//                if(ar[j]<ar[small]) {
//                    small = j;
//                    swap = true;
//                }
//            }
//            if (swap){
//                int temp=ar[i];
//                ar[i]=ar[small];
//                ar[small]=temp;
//            }
//        }
//
//    }
//
//    public static void main(String[] args) {
//        int[] arr={1,4,4,9,3,3,13,10};
//        int[] ar={1,3,4,5,7,9,10};
//        int[] a={6,5,4,3,2,1,2,1,0};
//        System.out.println(Arrays.toString(arr));
//        seletsort(arr);
//        System.out.println(Arrays.toString(arr));
//    }
//}
//package com.himanshu.dsa;
//
//public class recursionBinarySearch {
//
//    static int recBS(int[] arr,int start,int end,int target){
//        if (start>end)
//            return -1;
//        int mid=start+(end-start)/2;
//        if (target==arr[mid])
//            return mid;
//        if (target<arr[mid])
//            return recBS(arr,start,mid-1,target);
//        else
//            return recBS(arr,mid+1,end,target);
//    }
//
//    public static void main(String[] args) {
//
//        int[] arr={0,3,5,12,14,20};
//        int ans=recBS(arr,0, arr.length -1,12);
//        System.out.println(ans);
//
//    }
//}
//package com.himanshu.dsa;
//
//import java.util.Arrays;
//
//public class QuickSort {
//
//    static void quickSort(int[] arr,int si,int ei){
//        if(si<ei){
//            int lo=si;
//            int hi=ei;
//            int mid=lo+(hi-lo)/2;
//            int pivot=arr[mid];
//
//            while (lo<=hi){
//                while (arr[lo]<pivot)
//                    lo++;
//
//                while (arr[hi]>pivot)
//                    hi--;
//
//                if (lo<=hi){
//                    int temp=arr[lo];
//                    arr[lo]=arr[hi];
//                    arr[hi]=temp;
//                    hi--;
//                    lo++;
//                }
//
//            }
//            quickSort(arr,si,hi);
//            quickSort(arr,lo,ei);
//        }
//    }
//
//    public static void main(String[] args) {
////        int[] arr ={7,3,8,4,5,6,1};
//        int arr[]= {10,5,3,6,4,9,2,14,1,8};
//        quickSort(arr,0,arr.length-1);
//        System.out.println("Quick Sort");
//        System.out.println(Arrays.toString(arr));
//    }
//}
//package com.himanshu.dsaSheet;
//
//import java.util.Arrays;
//
//public class reverseArray {
//
//    static void reverse(int[] arr){
//        int start=0,end=arr.length-1;
//        while(start<end){
//            int temp =arr[start];
//            arr[start]=arr[end];
//            arr[end]=temp;
//
//            start++;
//            end--;
//        }
//    }
//
//    public static void main(String[] args) {
//        int[] arr={4,5,1,2};
//        int[] arr2={3,6,4,7,2};
//        System.out.println("Before reverse : "+Arrays.toString(arr2));
//        reverse(arr2);
//        System.out.println("After reverse : "+Arrays.toString(arr2));
//    }
//
//}
//package com.himanshu.dsaSheet;
//
//import java.util.Arrays;
//
//class pair{
//    int min,max;
//
//    void getminmax(int[] arr){
//        Arrays.sort(arr);
//        this.min=arr[0];
//        this.max=arr[arr.length-1];
//    }
//}
//
//public class minmax {
//    public static void main(String[] args) {
//        int arr[]={5,9,3,25,41,65,25,75,41,0,-56,-25,98};
//        pair p=new pair();
//        p.getminmax(arr);
//        System.out.println("minimum element in arr:"+p.min+"\nmaximum element in arr:"+p.max);
//    }
//}
//package com.himanshu.dsaSheet;
//
//public class maximumSumSubarray {
//    static int maxsum(int[] arr){
//        int maxisum=0,sum=Integer.MIN_VALUE;
//        for(int n:arr){
//            maxisum+=n;
//            if (maxisum>sum)
//                sum=maxisum;
//            if (maxisum<0)
//                maxisum=0;
//        }
//        return sum;
//    }
//
//
//
//    public static void main(String[] args) {
//        int[] arr={-2,1,-3,4,-1,-2,1,-5,4};
//        System.out.println(maxsum(arr));
//    }
//}
//package com.himanshu.practice;
//
//public class recursion {
//    static int rev=0;
//
//    static void n_To_1(int n){
//        if (n==1){
//            System.out.print(n);
//            return;
//        }
//        System.out.print(n+" ");
//        n_To_1(n-1);
//    }
//
//    static void a1_To_n(int n){
//        if (n==1){
//            System.out.print(n);
//            return;
//        }
//        a1_To_n(n-1);
//        System.out.print(" "+n);
//    }
//
//    static int fact(int n){
//        if (n<=1)
//            return 1;
//
//        return n*fact(n-1);
//    }
//
//    static int sum_N(int n){
//        if (n==0)
//            return 0;
//        return n+sum_N(n-1);
//    }
//
//    static int sum_Digit(int n){
//        if (n==0)
//            return 0;
//        return n%10+sum_Digit(n/10);
//    }
//
//    static int product_Digit(int n){
//        if (n%10==n)
//            return n;
//        return n%10*product_Digit(n/10);
//    }
//
//    static void reverse_number(int n){
//        if(n==0)
//            return;
//        int rem=n%10;
//        rev= rev*10+rem;
//        reverse_number(n/10);
//    }
//
//    static boolean checkpalindrom(int n){
//        reverse_number(n);
//        if (n==rev)
//            return true;
//        return false;
//    }
//
//    static int countzero(int i){
//        if (i==0)
//            return rev;
//        int rem=i%10;
//        if (rem==0)
//            rev++;
//        return countzero(i/10);
//    }
//
//    static boolean checkSorted(int ar[]){
//
//        return helper(ar,0);
//    }
//    static boolean helper(int ar[],int idx){
//        if (idx==ar.length-2)
//            return true;
//
//        return ((ar[idx]<ar[idx+1])&&(helper(ar,idx+1)));
//    }
//
//    static int linear(int arr[],int target){
//        return helperlinear(arr,target,0);
//    }
//
//    static int helperlinear(int[] arr,int tar,int idx){
//        if (idx==arr.length)
//            return -1;
//        if (arr[idx]==tar)
//            return idx;
//        else
//            return helperlinear(arr,tar,idx+1);
//
//    }
//
//    static void pattern(int r,int c){
//        if (r==0)
//            return;
//        if (c<r){
//            pattern(r,c+1);
//            System.out.print("* ");
//        }else {
//            pattern(r - 1, 0);
//            System.out.println();
//        }
//    }
//
//    static void printfibo(int first,int second,int n){
//        if (count==n-2)
//            return;
//        count++;
//        int third=first+second;
//        System.out.print(","+third);
//        printfibo(second,third,n);
//    }
//
//    static int pow(int n,int x){
//        if (x==1)
//            return n;
//
//        if (x%2==0)
//            return pow(n,x/2)*pow(n,x/2);
//        else
//            return pow(n,x/2)*pow(n,x/2)* n;
//    }
//
//    static void reverseprint(String s,int siz){
//        if (siz<=0)
//            return;
//        System.out.print(s.charAt(siz-1));
//        reverseprint(s,siz-1);
//
//    }
//    static void moveend(String s,int siz,int count,String res){
//        if (siz==s.length()){
//            for (int i=0;i<count;i++)
//                res+='x';
//            System.out.println(res);
//            return;
//        }
//
//        if (s.charAt(siz)=='x'){
//            count++;
//            moveend(s,siz+1,count,res);
//        }else {
//            res+=s.charAt(siz);
//            moveend(s,siz+1,count,res);
//        }
//    }
//
//    static void removeduplicate(String s,int idx,String res){
//        if (idx==s.length()){
//            System.out.println(res);
//            return;
//        }
//        String ss="";
//        char ans= s.charAt(idx);
//        ss+=ans;
//        if (res.contains(ss)){
//            removeduplicate(s,idx+1,res);
//        }else {
//            res+=ans;
//            removeduplicate(s,idx+1,res);
//        }
//    }
//
//    static void checksorted(int arr[],int idx){
//        if (idx==arr.length-1){
//            System.out.println("Strictly sorted");
//            return;
//        }
//        if (arr[idx]>arr[idx+1]){
//            System.out.println("unsorted");
//            return;
//        }
//        if (arr[idx]==arr[idx+1]){
//            System.out.println("Strictly unsorted");
//            return;
//        }
//        checksorted(arr,idx+1);
//    }
//
//    static int count=0;
//    public static void main(String[] args) {
//        String s="abcabdecbdae";
//        removeduplicate(s,0,"");
////        String s="abxjkxxhkxj";
////        moveend(s,0,0,"");
////        int[] arr={1,2,3,4,5,59,54,65,75,95,654,852,3256};
////        checksorted(arr,0);
////        String s="abcd";
////        reverseprint(s,s.length());
////        System.out.print(0+","+1);
////        printfibo(0,1,10);
////        System.out.println(pow(2,10));
////        n_To_1(10);
////        System.out.println();
////        a1_To_n(10);
////        System.out.println();
////        System.out.println(fact(5));
////        System.out.println(sum_N(5));
////        System.out.println(sum_Digit(1764));
////        System.out.println(product_Digit(208));
////        int n=2048;
////        reverse_number(n);
////        System.out.println(rev);
////        int n=2048402;
////        System.out.println(checkpalindrom(n));
////        System.out.println(countzero(6020504));
////        int[] arr={1,2,3,4,9,6,8,10};
////        System.out.println(checkSorted(arr));
////        int[] arr={154,12,355,34,9,62,8,10};
////        System.out.println(linear(arr,9));
////        pattern(4,0);
//    }
//
//}
//import javax.swing.*;
//        import java.util.*;
////public class practical implements EventListener{
////
////    public static void main(String[] args) {
////       Scanner sc=new Scanner(System.in);
////}
////}
////
////import java.util.concurrent.ExecutorService;
////import java.util.concurrent.Executors;
////
////class Customer implements Runnable {
////    private final String name;
////
////    public Customer(String name) {
////        this.name = name;
////    }
////
////    public void run() {
////        System.out.println(name + " is placing an order.");
////        try {
////            Thread.sleep(10000);  // Simulating time taken to place an order
////        } catch (InterruptedException e) {
////            e.printStackTrace();
////        }
////        System.out.println(name + "'s order is ready.");
////    }
////}
////
////public class practical {
////    public static void main(String[] args) {
////        ExecutorService executor = Executors.newFixedThreadPool(3);  // Create a thread pool with 3 baristas
////
////        // Create multiple customers
////        Customer customer1 = new Customer("JAAT SHAB");
////        Customer customer2 = new Customer("Alice");
////        Customer customer3 = new Customer("Bob");
////
////        // Submit customer orders to the thread pool for processing
////        executor.submit(customer1);
////        executor.submit(customer2);
////        executor.submit(customer3);
////
////        // Shutdown the executor
////        executor.shutdown();
////    }
////}
//
//
//
//
////reverse number
///*
//System.out.print("Enter Number to Reverse : ");
//        int a=sc.nextInt();
//        int res=0;
//        while (a>0){
//            res= (res*10)+ a%10;
//            a=a/10;
//        }
//        System.out.println("Number after reverse : "+res);
//*/
//
////Sum of digits of number
///*
//System.out.print("Enter Number to sum of its digits : ");
//        int a=sc.nextInt();
//        int res=0;
//        while (a>0){
//            res= res+ a%10;
//            a=a/10;
//        }
//        System.out.println("Sum of entered number : "+res);
//*/
//
////Sum of even and product of odd digits of a number
///*
//System.out.print("Enter Number : ");
//        int a=sc.nextInt();
//        int res=0,SEven=0,POdd=1;
//        while (a>0){
//            res=a%10;
//            if ((res%2)==0){
//                SEven +=res;
//            }else{
//                POdd *=res;
//            }
//            a=a/10;
//        }
//        System.out.println("Sum of Even : "+SEven +" Product of Odd : "+POdd);
// */
//
////Check palindrome
///*
//System.out.print("Enter Number to check palindrome : ");
//        int a=sc.nextInt();
//        int pal=a;
//        int res=0;
//        while (a>0){
//            res= (res*10)+ a%10;
//            a=a/10;
//        }
//        if (pal==res) {
//            System.out.println("Entered number is palindrome");
//        }else{
//            System.out.println("Entered number is not palindrome");
//        }
// */
//
////prime check
///*
//  System.out.println("Enter number to check prime : ");
//        int n= sc.nextInt();
//        int count=0,i=2;
//        while(i<n) {
//            if (n % i == 0) {
//                count += 1;
//            }
//            i++;
//        }
//        if (count==0){
//            System.out.println("Entered number is prime");
//        }else {
//            System.out.println("Entered number is not prime");
//        }
// */
//
////Prime b/w 1 to 100
///*
//System.out.println("Prime b/w 1 to 100 : ");
//        for (int i=1;i<100;i++){
//        int count=0;
//            for (int j=1;j<i;j++){
//            if (i % j == 0) {
//                count += 1;
//            }
//
//            }
//        if (count==1){
//            System.out.print(i+", ");
//        }
//        }
// */
//
//
////Armstrong number
///*
//int count=0;
//        System.out.print("Enter number to check armstrong number : ");
//        int num = sc.nextInt();
//        int numc=num;
//        while (numc>0){
//            count++;
//            numc/=10;
//        }
//        numc=num;
//        int res=0,result=0;
//       while (numc>0){
//           res=numc%10;
//           result += (int) pow(res,count);
//           numc/=10;
//       }
//       if (result==num){
//           System.out.println("Number is armstrong ");
//       }else {
//           System.out.println("Not armstrong");
//       }
// */
//
//// Fibonacci series
//
///*
//System.out.print("Enter number till fibonacci series printed : ");
//        int n= sc.nextInt();
//        int ft=0,st=1,tt;
//        System.out.print(ft+" ,"+st);
//        for (int i=2;i<n;i++){
//            tt=ft+st;
//            System.out.print(" ,"+tt);
//            ft=st;
//            st=tt;
//        }
// */
//
////Down right angle pattern
///*
//int n=5;
//        for (int i=n;i>0;i--){
//            for (int j=i;j>0;j--){
//                System.out.print("Content to be printed");
//            }
//            System.out.println("");
//        }
// */
//
////Right angle pattern
///*
//int n=5;
//        for (int i=1;i<=n;i++){
//            for (int j=1;j<=i;j++){
//                System.out.print("Content to be printed");
//            }
//            System.out.println("");
//        }
// */
//
////Pyramid pattern
///*
// int n=5;
//        for (int i=1;i<=n;i++){
//            for (int j=1;j<=n-i;j++){
//                System.out.print(" ");
//            }
//            for (int k=1;k<=(2*i-1);k++){
//                System.out.print("*");
//            }
//            System.out.println("");
//        }
// */
//
////Down Pyramid pattern
///*
// int n=5;
//        for (int i=n;i>0;i--){
//            for (int j=1;j<=n-i;j++){
//                System.out.print(" ");
//            }
//            for (int k=1;k<=(2*i-1);k++){
//                System.out.print("*");
//            }
//            System.out.println("");
//        }
// */package com.himanshu.practice;
//
//import java.util.HashSet;
//import java.util.Set;
//
//class student {
//    private int roll;
//    private String name;
//    private float marks;
//    static int no_of_student;
//    student(int rl,String nm,float mks){
//        this.roll=rl;
//        this.name=nm;
//        this.marks=mks;
//        student.no_of_student += 1 ;
//    }
//}
//public class PIJ {
//    public static void main(String[] args) {
//        Set<Integer> t =new HashSet<>();
//        t.add(7);
//        t.add(10);
////        System.out.println(t);
//        t.remove(27);
////        System.out.println(t);
//        student Kanishq =new student(1,"Kanishq ",80.2f);
//        student Aditya =new student(2,"Aditya ",84.5f);
//        student Tushar =new student(4,"Tushar ",82.4f);
//        student Khalid =new student(5,"Khalid ",72.6f);
//        student Piyush =new student(6,"Piyush ",80.8f);
//        student Hardik =new student(7,"Hardik ",76.6f);
//        student Manish =new student(8,"Manish ",85.5f);
//        student Dhruv =new student(9,"Dhurv ",73.9f);
//        student Sandeep =new student(10,"Sandeep ",88.3f);
//        student himanshu =new student(11,"Himanshu Jawla",70.2f);
//        student Harsh =new student(12,"Harsh ",95.7f);
//        student Raj =new student(13,"Raj ",74.1f);
//
////        System.out.println(student.no_of_student);
//
//        int[][] ar2d={
//                {1,3,5},
//                {2,4,6},
//                {1,2,3,4,5,6}
//        };
//
//        for (int i=0;i< ar2d.length;i++){
//            for (int j=0;j< ar2d[i].length;j++){
//                if(ar2d[i][j]==6)
//                    break;
//                System.out.print(ar2d[i][j]+", ");
//            }
//            System.out.println();
//        }
//
//
//    }
//}
//package com.himanshu.practice;
//
//public class patterns {
//
//    static void pattern1(int n){                                   //*****
//        for (int i=1;i<=5;i++){                                    //*****
//            for (int j=1;j<=i;j++){                                //*****
//                System.out.print("*");                             //*****
//            }                                                      //*****
//            System.out.println();
//        }
//    }
//    static void pattern2(int n){                                   //*
//        for (int i=1;i<=5;i++){                                    //**
//            for (int j=1;j<=i;j++){                                //***
//                System.out.print("*");                             //****
//            }                                                      //*****
//            System.out.println();
//        }
//    }
//    static void pattern3(int n){                                   //*****
//        for (int i=n;i>=1;i--){                                    //****
//            for (int j=1;j<=i;j++){                                //***
//                System.out.print("*");                             //**
//            }                                                      //*
//            System.out.println();
//        }
//    }
//    static void pattern4(int n){                                   //1
//        for (int i=1;i<=5;i++){                                    //12
//            for (int j=1;j<=i;j++){                                //123
//                System.out.print(j+" ");                           //1234
//            }                                                      //12345
//            System.out.println();
//        }
//    }
//    static void pattern5(int n){                                   //*
//        for (int i=1;i<=5;i++){                                    //**
//            for (int j=1;j<=i;j++){                                //***
//                System.out.print("*");                             //****
//            }                                                      //*****
//            System.out.println();                                  //****
//        }                                                          //***
//        for (int i=n-1;i>=1;i--){                                  //**
//            for (int j=1;j<=i;j++) {                               //*
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//
//    static void pattern6(int n){
//        //    *
//        for (int i=n-1;i>=0;i--){                                   //   **
//            int m=0;                                                //  ***
//            for (int j=1;j<=i;j++){                                 // ****
//                System.out.print(" ");                              //*****
//                m++;
//            }
//            for (int j=1;j<=n-m;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//
//    static void pattern7(int n){
//        //*****
//        for (int i=n;i>=1;i--){                                     // ****
//            for (int j=1;j<=n-i;j++){                               //  ***
//                System.out.print(" ");                              //   **
//            }                                                       //    *
//            for (int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//
//    static void pattern8(int n){
//        //    *
//        for (int i=n-1;i>=0;i--){                                   //   ***
//            //  *****
//            for (int j=1;j<=i;j++){                                 // *******
//                System.out.print(" ");                              //*********
//
//            }
//            for (int j=1;j<=n-i;j++){
//                System.out.print("*");
//            }
//            for (int j=2;j<=n-i;j++){
//                System.out.print("*");
//            }
//            for (int j=1;j<=i;j++){
//                System.out.print(" ");
//
//            }
//
//            System.out.println();
//        }
//    }
//
//    static void pattern28(int n){
//        //    *
//        for (int i=n-1;i>=0;i--) {                                  //   * *
//            //  * * *
//            for (int j = 1; j <= i; j++) {                          // * * * *
//                System.out.print(" ");                              //* * * * *
//                // * * * *
//            }                                                       //  * * *
//            for (int j = 1; j <= n - i; j++) {                      //   * *
//                System.out.print("* ");                             //    *
//            }
//            System.out.println();
//        }
//        for (int i=n-1;i>=1;i--){
//            for (int j=1;j<=n-i;j++){
//                System.out.print(" ");
//            }
//            for (int j=1;j<=i;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//
//
//    }
//
//
//
//    public static void main(String[] args) {
//
////        pattern1(5);
////        pattern2(5);
////        pattern3(5);
////        pattern4(5);
////        pattern5(5);
////        pattern6(5);
////        pattern7(5);
////        pattern8(5);
//        pattern28(5);
//    }
//}
//package com.himanshu.practice;
//
////
////public class com.himanshu.practice.Main{
////    int n,j;
////    void getdata(int i){
////        n=i;
////        j=i;
////    }
////    void reverse(){
////        int rev=0;
////        while(n>0){
////            rev=(rev*10)+n%10;
////            n=n/10;
////        }
////        System.out.println("REVERSE of "+j+" is : "+rev);
////    }
////
////        public static void main(String[] args){
////            Scanner sc = new Scanner(System.in);
////            com.himanshu.practice.Main mn= new com.himanshu.practice.Main();
////            System.out.println("Enter no. to reverse");
////            int input= sc.nextInt();
////            mn.getdata(input);
////            mn.reverse();
////
////    }
////    }
//
//
////public class com.himanshu.practice.Main{
////    int n;
////    void getdata(int i){
////        n=i;
////    }
////    void checkPrime(){
////        int count=0;
////        for(int i=2;i<n;i++){
////            if(n%i==0){
////                count++;
////            }
////        }
////        if(count==0){
////            System.out.println(n+" is prime number");
////        }else{
////            System.out.println(n+" is not a prime number");
////        }
////    }
////    public static void main(String[] args){
////        Scanner sc = new Scanner(System.in);
////        com.himanshu.practice.Main mn= new com.himanshu.practice.Main();
////        System.out.println("Enter no. to check prime");
////        int input= sc.nextInt();
////        mn.getdata(input);
////        mn.checkPrime();
////    }
////}
//
////public class com.himanshu.practice.Main{
////    int rollno;
////    String name;
////    static String clgname="MAIT";
////    com.himanshu.practice.Main(int a,String b){
////        rollno=a;
////        name=b;
////    }
////    void display(){
////        System.out.println("NAME : "+ name+"\nROll No. : "+rollno+"\nCOLLAGE NAME : "+clgname+"\n");
////    }
////    public static void main(String[] args){
////
////        Scanner sc = new Scanner(System.in);
////        com.himanshu.practice.Main sd1= new com.himanshu.practice.Main(11,"Himanshu Jawla");
////        com.himanshu.practice.Main sd2= new com.himanshu.practice.Main(6,"Piyush Thakur");
////        com.himanshu.practice.Main sd3= new com.himanshu.practice.Main(13,"Raj Kumar");
////        System.out.println("Student derails : ");
////        sd1.display();
////        sd2.display();
////        sd3.display();
////    }
////}
//
//
//
////class first{
////    int a,b;
////    void input(){
////        Scanner sc = new Scanner(System.in);
////        System.out.println("Enter values of a and b :");
////        a =sc.nextInt();
////        b =sc.nextInt();
////    }
////    void add(int x,int y){
////        System.out.println("Sum is : "+(x+y));
////    }
////}
////class second extends first{
////    void modulus(int x, int y){
////        System.out.println("Modulas is : "+(x%y));
////    }
////}
////class third extends second{
////void subtract(int x,int y){
////    System.out.println("Difference is : "+(x-y));
////}
////void multiply(int x,int y){
////    System.out.println("Product is : "+(x*y));
////}
////}
////public class com.himanshu.practice.Main{
////    public static void main(String[] args){
////        third bs= new third();
////        bs.input();
////        int a1= bs.a;
////        int b1= bs.b;
////        bs.add(a1,b1);
////        bs.subtract(a1,b1);
////        bs.multiply(a1,b1);
////        bs.modulus(a1,b1);
////    }
////}
//
//
////class Animal {
////    public void eat() {
////        System.out.println("The animal is eating.");
////    }
////}
////
////class Dog extends Animal {
////    public void bark() {
////        System.out.println("The dog is barking.");
////    }
////}
////
////public class com.himanshu.practice.Main {
////    public static void main(String args[]) {
////        Dog myDog = new Dog();
////        myDog.eat();
////        myDog.bark();
////    }
////}
////class stack{
////    static int top = -1;
////    static int stak[] = new int[50];
////    int siz = stak.length - 1;
////    void push(int data) {
////        if (top==siz) {
////            System.out.println("Stack overflow !!!");
////            return;
////        } else {
////            top++;
////            stak[top] = data;
////        }
////    }
////    void pop() {
////        if (top ==-1) {
////            System.out.println("Stack underflow !!!");
////            return;
////        } else {
////            top--;
////        }
////    }
////    void seek() {
////        if (top==-1) {
////            System.out.println("Stack underflow !!!");
////            return;
////        }
////        System.out.println("Top element in Stack : " + stak[top]);
////    }
////}
////public class com.himanshu.practice.Main {
////    public static void main(String[] args) {
////        stack sk=new stack();
////        sk.push(5);
////        sk.push(17);
////        sk.push(13);
////        sk.seek();
////        sk.pop();
////        sk.seek();
////        sk.push(32);
////        sk.seek();
////    }
////}
//
////
////class Queue{
////    static int rear = 0;
////    static int front=0;
////    static int queue[] = new int[50];
////    int siz = queue.length - 1;
////    void enqueue(int data) {
////        if (rear==siz) {
////            System.out.println("Queue overflow !!!");
////            return;
////        } else {
////            queue[rear] = data;
////            rear++;
////        }
////    }
////    void dequeue() {
////        if (front==rear) {
////            System.out.println("Queue underflow !!!");
////            return;
////        } else {
////            for (int i=0;i<rear-1;i++){
////                queue[i]=queue[i+1];
////            }
////            rear--;
////        }
////    }
////    void print() {
////        if (front==rear) {
////            System.out.println("Queue underflow !!!");
////            return;
////        }else {
////         for (int i=0;i<rear;i++){
////             System.out.print(queue[i]+", ");
////         }
////            System.out.println();
////        }
////        }
////}
////public class com.himanshu.practice.Main {
////    public static void main(String[] args) {
////        Queue q=new Queue();
////        q.enqueue(5);
////        q.enqueue(17);
////        q.enqueue(13);
////        q.print();
////        q.dequeue();
////        q.print();
////        q.enqueue(32);
////        q.print();
////    }
////}
//
////interface addition{
////    void add(int a,int b);
////}
////interface subtraction{
////    void diff(int a,int b);
////}
////class product{
////    void prod(int a,int b){
////        System.out.println("Product of a,b is : "+(a*b));
////    }
////}
////class exp8 extends product implements addition,subtraction{
////    public void add(int a,int b){
////        System.out.println("Sum of a,b is :"+(a+b));
////    }
////    public void diff(int a,int b){
////        System.out.println("Difference of a,b is :"+(a-b));
////    }
////}
////public class Main{
////public static void main(String[]args){
////        exp8 aa=new exp8();
////        aa.add(25,18);
////        aa.diff(18,11);
////        aa.prod(15,6);
////        }
////}
//
////public class Main {
////    static boolean checkpalindrome(String s){
////        int st=0,end=s.length()-1;
////        while(st<=end){
////            if(s.charAt(st)!=s.charAt(end))
////            return false;
////
////            st++;
////            end--;
////        }
////        return true;
////    }
////    public static void main(String[] args) {
////        String s=new String("HImaNshu jawla");
////        System.out.println(s.hashCode());
////        s=s+"h";
////        System.out.println(s.hashCode());
////        String a="nittrtin";
////        System.out.println(checkpalindrome(a));
////    }
////}
//
//public class Main {
//
////    static int findunique(int arr[]){
////        int unique=0;
////        for(int n :arr){
////            unique^=n;
////        }
////        return unique;
////    }
//
//
////    static int rightsetbit(int num){
////        int count=0;
////        while (true){
////            count++;
////            int ans=num&1;
////            if (ans==0)
////                num=num>>1;
////            else
////                break;
////
////        }
////        return count;
////    }
//
////    static int findbit(int num, int i){
////        int ans=num&(1<<i-1);
////        if (ans==0)
////            return 0;
////        else
////            return 1;
////    }
//
////    static int candy(int[] ratings) {
////        int ans=1,a=1;
////        for(int i=1;i<ratings.length-1;i++){
////            if(ratings[i]<ratings[i+1]||ratings[i]>ratings[i-1]){
////                ans+=a+1;
////                a++;
////            }else{
////                ans++;
////                a=1;
////            }
////        }
////        if(ratings[ratings.length-1]<ratings[ratings.length-2])
////            ans++;
////        else
////            ans+=2;
////        return ans;
////    }
////    static int magicnumber(int num){
////        int magic=0,ans,i=1;
////        while(num!=0){
////            ans=num&1;
////            magic+=(int) (Math.pow(5,i)*ans);
////            num=num>>1;
////            i++;
////        }
////        return magic;
////    }
//
//    static float sqrt(int num,int p){
//        float ans=0;
//        int lo=0,hi=num;
//        while(lo<hi){
//            int mid=lo+(hi-lo)/2;
//            if (mid*mid==num)
//                return mid;
//            if (mid*mid>num)
//                hi=mid-1;
//            else {
//                lo = mid + 1;
//                ans = mid;
//            }
//        }
//        double inc=0.1;
//        for (int i=0;i<p;i++){
//            while (ans*ans<num) {
//                ans += inc;
//            }
//            ans-=inc;
//            inc/=10;
//        }
//        return ans;
//    }
//
//    public static void main(String[] args) {
////        int[] arr={2,3,4,3,2,5,4,6,6};
////        System.out.println(findunique(arr));
////        System.out.println(findbit(20,4));
////        System.out.println(rightsetbit(8));
////        int arr[]={1,2,87,87,87,2,1};
////        int arr2[]={1,0,2};
////        System.out.println(candy(arr));
////        System.out.println(magicnumber(6));
//        System.out.printf("%.3f",sqrt(40,3));
//
//    }
//}
//
//
//
//
//package com.himanshu.practice;
//
//import java.util.ArrayList;
//
//class stack<t>{
//
//    private int top=-1,size;
//    private ArrayList<t> st= new ArrayList<>();
//    stack(int siz){
//        this.size=siz;
//    }
//
//    public void push(t data){
//        if(top+1==size) {
//            System.out.println("Stack overflow !!!");
//        }else {
//            top++;
//            st.add(top,data);
//            System.out.println(st.get(top)+" Pushed successfully");
//        }
//    }
//
//    public void pop(){
//        if(top==-1) {
//            System.out.println("Stack underflow !!!");
//        }else {
//            System.out.println(st.get(top)+ " Popped successfully");
//            st.remove(top);
//            top--;
//        }
//    }
//
//    public void printst(){
//        System.out.println(st);
//    }
//}
//
//class queue<t>{
//
//    private int front=0,rear=0,size;
//    private ArrayList<t> qe= new ArrayList<>();
//    queue(int siz){
//        this.size=siz;
//    }
//
//    public void enqueue(t data){
//        if(rear==size) {
//            System.out.println("Queue overflow !!!");
//        }else {
//            qe.add(rear,data);
//            System.out.println(qe.get(rear)+" Pushed successfully");
//            rear++;
//        }
//    }
//
//    public void dequeue(){
//        if(rear==-1) {
//            System.out.println("Queue underflow !!!");
//        }else {
//            System.out.println(qe.get(front)+ " Removed successfully");
//            qe.remove(front);
//            rear--;
//        }
//    }
//
//    public void printst(){
//        System.out.println(qe);
//    }
//}
//
//public class lineardsa {
//    public static void main(String[] args) {
//
////        ArrayList<Integer> li=new ArrayList<>();
////        li.
//    }
//}
//package com.himanshu.practice;
//
//import java.util.Arrays;
//
//class arraylist<t>{
//    private Object[] arlist;
//    private int defaultSize=10;
//    private int size=0;
//
//    arraylist() {
//        arlist = new Object[defaultSize];
//    }
//
//    public boolean isEmpty(){
//        if (size==defaultSize)
//            return true;
//
//        return false;
//    }
//    private void doublelist(){
//        Object temp[]= new Object[arlist.length*2];
//        for (int i=0;i< arlist.length;i++){
//            temp[i]=arlist[i];
//        }
//        arlist=temp;
//    }
//
//    public void add(t value){
//        if (isEmpty()){
//            doublelist();
//        }
//        arlist[size++]=value;
//    }
//
//    public void remove(int idx){
//        if (isEmpty()){
//            System.out.println("List is empty !! ");
//        }
//        for (int i=idx;i<size;i++){
//            arlist[i]=arlist[i+1];
//        }
//        size--;
//    }
//    public void set(int idx ,t value){
//        arlist[idx]=value;
//    }
//    public Object get(int idx){
//        return arlist[idx];
//    }
//    public int size(){
//        return size;
//    }
//
//    @Override
//    public String toString() {
//        return "arlist=" + Arrays.toString(arlist);
//    }
//}
//public class arrlist {
//    public static void main(String[] args) {
//        arraylist<Integer> li  =new arraylist<>();
//        li.add(10);
//        li.add(15);
//        li.add(20);
//        li.add(25);
//        li.add(30);
//        li.add(35);
//        li.add(40);
//        li.add(45);
//        li.add(50);
//        li.add(55);
//        li.add(60);
//        li.add(65);
//        li.add(70);
//        System.out.println(li);
//        li.remove(4);
//        li.remove(11);
//        System.out.println(li);
//        System.out.println(li.get(5));
//        System.out.println(li.size());
//        li.set(8,54);
//        System.out.println(li);
//
//    }
//}
//package com.himanshu.practice;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import java.util.Scanner;
//class func{
//    Scanner sc=new Scanner(System.in);
//    int siz,key,row,col;
//    int ar[];
//    int arr[][];
//    void get2dArr(){
//        System.out.println("Enter row and column of array.");
//        row=sc.nextInt();
//        col=sc.nextInt();
//        arr=new int[row][col];
//        System.out.println("Enter elements of array : ");
//        for(int i=0;i<row;i++){
//            for(int j=0;j<col;j++){
//                arr[i][j]=sc.nextInt();
//            }
//        }
//    }
//    void getArr(){
//        System.out.println("Enter the size of array.");
//        siz = sc.nextInt();
//        ar=new int[siz];
//        System.out.println("Enter elements of array : ");
//        for(int i=0;i<siz;i++) {
////            System.out.print("Enter " + i + "th element :");
//            ar[i] = sc.nextInt();
//        }
//    }
//    void takeKey(){
//        System.out.println("Enter element to find ");
//        key= sc.nextInt();
//    }
//    void print2d(){
//        for(int i=0;i<row;i++){
//            for(int j=0;j<col;j++){
//                System.out.print(arr[i][j]+", ");
//            }
//            System.out.println();
//        }
//    }
//    void print(){
//        for(int i=0;i<siz;i++){
//            System.out.print(ar[i]+", ");
//        }
//        System.out.println();
//    }
//    void sumArray(){
//        int n= ar.length;
//        int sum=0;
//        for(int i=0;i<n;i++){
//            sum+=ar[i];
//        }
//        System.out.println("Sum of array elements is : "+sum);
//    }
//    void linerSearch(){
//        int count=0;
//        int n= ar.length;
//        for(int i=0;i<n;i++){
//            if(ar[i]==key){
//                System.out.println("Element found at index "+i);
//                count++;
//                break;
//            }
//        }
//        if (count==0){
//            System.out.println("Element not found");
//        }
//    }
//    void selectionSort(){
//        System.out.println("array sorted using selection sort....");
//        for(int i=0;i<siz-1;i++){
//            for(int j=i+1;j<siz;j++){
//                if(ar[i]>ar[j]){
//                    int temp=ar[i];
//                    ar[i]=ar[j];
//                    ar[j]=temp;
//                }
//            }
//        }
//    }
//    void bubbleSort(){
//        System.out.println("Array sorted using bubble sort.....");
//        for(int i=0;i<siz;i++){
//            for(int j=0;j<siz-i-1;j++){
//                if(ar[j]>ar[j+1]){
//                    int temp=ar[j];
//                    ar[j]=ar[j+1];
//                    ar[j+1]=temp;
//                }
//            }
//        }
//    }
//    void insertionSort(){
//        System.out.println("Array sorted using insertion sort.....");
//        for (int i=0;i<siz-1;i++){
//            int j=i+1;
//            while (j>0){
//                if (ar[j-1]>ar[j]){
//                    int temp=ar[j];
//                    ar[j]=ar[j-1];
//                    ar[j-1]=temp;
//                }
//                j--;
//            }
//        }
//
//    }
//    void binarySearch(){
//        int lo=0;
//        int hi=ar.length;
//        int mid;
//        while(hi>=lo){
//            mid=(hi+lo)/2;
//            if(ar[mid]==key){
//                System.out.println("Element found at position : "+(mid+1));
//                return;
//            }
//            if (key>ar[mid]){
//                lo=mid+1;
//            }else {
//                hi=mid-1;
//            }
//            if (lo>hi){
//                System.out.println("Element is not found!");
//            }
//        }
//    }
//
//    void freqency() {
//        int count = 0;
//        for (int i = 0; i < siz; i++) {
//            if (ar[i] == key)
//                count++;
//        }
//        System.out.println(key + " found " + count + " times in array.");
//        if (count == 0) {
//            System.out.println("Element not present in array");
//        }
//    }
//    public func add2darr(func a){
//        if ((a.row != this.row)&&(a.col != this.col)){
//            System.out.println("addition not possible");
//            return null;
//        }
//        int addrow=a.row;
//        int addcol=a.col;
//        int add[][]=new int[addrow][addcol];
//        for(int i=0;i<addrow;i++){
//            for(int j=0;j<addcol;j++){
//                add[i][j]=a.arr[i][j]+this.arr[i][j];
//            }
//        }
//        System.out.println("Addition of 1 and 2");
//        for(int i=0;i<addrow;i++){
//            for(int j=0;j<addcol;j++){
//                System.out.print(add[i][j]+", ");
//            }
//            System.out.println();
//        }
//        return null;
//    }
//    public func sub2darr(func a){
//        if ((a.row != this.row)&&(a.col != this.col)){
//            System.out.println("subtraction not possible");
//            return null;
//        }
//        int subrow=a.row;
//        int subcol=a.col;
//        int sub[][]=new int[subrow][subcol];
//        for(int i=0;i<subrow;i++){
//            for(int j=0;j<subcol;j++){
//                sub[i][j]=a.arr[i][j]-this.arr[i][j];
//            }
//        }
//        System.out.println("subtraction of 1 and 2");
//        for(int i=0;i<subrow;i++){
//            for(int j=0;j<subcol;j++){
//                System.out.print(sub[i][j]+", ");
//            }
//            System.out.println();
//        }
//        return null;
//    }
//}
//
//public class arrays  {
//    public static int[] shuffle(int[] nums, int n) {
//        int ans[]=new int[nums.length];
//        int a=0;
//        for(int i=0;i<nums.length;i++){
//
//            if(i%2==0){
//                ans[i]=nums[a++];
//            }else{
//                ans[i]=nums[n];
//                n++;
//            }
//        }
//
//        return ans;
//    }
//
//    static List<Boolean> find(int [] arr, int extra){
//        List<Boolean> li=new ArrayList<>();
//        int maxval= 0;
//        for (int i=0;i<arr.length;i++){
//            if (arr[i]>maxval)
//                maxval=arr[i];
//        }
//        for (int i=0;i<arr.length;i++){
//            int check=arr[i]+extra;
//            if(check>=maxval)
//                li.add(true);
//            else
//                li.add(false);
//        }
//        return li;
//    }
//    public static void main(String[] args) {
//
//        int arr[]={2,3,5,1,3};
//        List<Boolean> li=new ArrayList<>();
//        li= find(arr,3);
//        System.out.println(li);
////        System.out.println(Arrays.toString(am));
//
////        func f1=new func();
////        func f2=new func();
////        f1.get2dArr();
////        f2.get2dArr();
////        System.out.println("first matrix");
////        f1.print2d();
////        System.out.println("second matrix");
////        f2.print2d();
////        f1.add2darr(f2);
////        f2.sub2darr(f1);
//
//
//    }
//}
////2 4 8 10 12 14 16 18 20
////1 3 5 7 9 11 13 15 17
////2 4 6 8 10 12
////3 6 9 12 15 18
//package com.pratice;
//import java.util.ArrayList;
//import java.util.HashSet;
//import java.util.Iterator;
//import java.util.List;
//
//public class ds {
////    Tower of Hanoi ***************************************************************************************************************************
////    public static void towerhanoi(int n, String src,String help,String dest){
////        if (n==1){
////            System.out.println("Disk "+n+" transfered form "+src+" to "+dest);
////            return;
////        }
////        towerhanoi(n-1,src,dest,help);
////        System.out.println("Disk "+n+" transfered form "+src+" to "+dest);
////        towerhanoi(n-1,help,src,dest);
////
////    }
////    reverse string **************************************************************************************************************************
////    public static void reversestr(String s ,int i){
////        if(i==-1)
////            return;
////        System.out.print(s.charAt(i));
////        reversestr(s,i-1);
////    }
////    First and last occurence ***************************************************************************************************************
////    public static int first=-1;
////    public static int last=-1;
////    public static void flo(String s, char c,int i){
////        if (i==s.length()){
////            System.out.println("first and last occurence are : "+first+" ,"+last);
////            return;
////        }
////        if (first==-1 && s.charAt(i)==c){
////            first=i;
////            last=i;
////        } else if (s.charAt(i)==c) {
////            last=i;
////        }
////        flo(s,c,i+1);
////    }
////    check sorted array strictly incresing ***************************************************************************************************
////    public static int c=-1;
////    public static void checksorted(int[] arr,int i){
////        if (i==arr.length-1){
////            c=0;
////            System.out.println("Array strictly sorted in ascending order : "+ Arrays.toString(arr));
////            return;
////        }
////        if (arr[i]<arr[i+1])
////            checksorted(arr,i+1);
////        if (i==0 && c==-1)
////            System.out.println("Array is not strictly sorted");
////    }
////    moveall x at end of string ***************************************************************************************************************
////    public static void moveall(String s,String ns,int i, int c){
////        if (i==s.length()){
////            for (int j=0;j<c;j++)
////                ns+='x';
////            System.out.println("Old String is :"+s);
////            System.out.println("New String is :"+ns);
////            return;
////        }
////        char currchar=s.charAt(i);
////        if (currchar=='x'){
////            c++;
////            moveall(s,ns,i+1,c);
////        }else {
////            ns+=currchar;
////            moveall(s,ns,i+1,c);
////        }
////    }
////      remove duplicate from string **********************************************************************************************************
////    public static boolean[] b=new boolean[26];
////    public static void removeduplicate(int i,String s ,String ns){
////        if (i==s.length()){
////            System.out.println(ns);
////            return;
////        }
////        char currc=s.charAt(i);
////        int idx = currc-'a';
////        if (b[idx]==true)
////            removeduplicate(i+1,s,ns);
////        else {
////            ns+=currc;
////            b[idx]=true;
////            removeduplicate(i+1,s,ns);
////        }
////    }
////    Uniqe Subsequence of a string ************************************************************************************************************
////    public static void usubseq(String s, int i,String ns,HashSet hs){
////        if (i==s.length()){
////            if (hs.contains(ns))
////                return;
////            else {
////                hs.add(ns);
////                System.out.println(ns);
////                return;
////            }
////        }
////        char currc = s.charAt(i);
////        usubseq(s,i+1,ns+currc,hs);
////        usubseq(s,i+1,ns,hs);
////    }
////    Subsequence of a string ****************************************************************************************************************
////    public static void subseq(String s, int i,String ns){
////        if (i==s.length()) {
////            System.out.println(ns);
////            return;
////        }
////        char currc = s.charAt(i);
////        subseq(s,i+1,ns+currc);
////        subseq(s,i+1,ns);
////    }
////    numpad combination **********************************************************************************************************************
////    public static String[] keypad = {".","abc","def","ghi","jkl","mno","pqr","stu","vwx","yz"};
////    public static void keycomb(String s,int idx,String comb){
////        if (idx==s.length()){
////            System.out.println(comb);
////            return;
////        }
////        char curr = s.charAt(idx);
////        String map = keypad[curr-'0'];
////        for (int i=0;i<map.length();i++){
////            keycomb(s,idx+1,comb+map.charAt(i));
////        }
////    }
////    parmutation of stirng *******************************************************************************************************************
////    public static void permutation(String s,String perm){
////        if (s.length()==0){
////            System.out.println(perm);
////            return;
////        }
////        for (int i=0;i<s.length();i++){
////            char curr = s.charAt(i);
////            String news = s.substring(0,i)+s.substring(i+1);
////            permutation(news,perm+curr);
////        }
////    }
////    count path to reach from 0,0 to n,m in a grid********************************************************************************************
////    public  static int countpath(int i,int j,int n,int m){
////        if(i==n || j==m)
////            return 0;
////        if (i==n-1 && j==m-1)
////            return 1;
////        int rightp = countpath(i,j+1,n,m);
////        int leftp = countpath(i+1,j,n,m);
////        return rightp+leftp;
////    }
////    count number of way to place tiles in n*m area tile of size is 1*m **********************************************************************
////    public  static int counttile(int n,int m){
////        if(n==m)
////            return 2;
////        if (n<m)
////            return 1;
////        int horizontalp = counttile(n-m,m);
////        int verticalp = counttile(n-1,m);
////        return horizontalp+verticalp;
////    }
////    count number of way to invite members single or pair ***********************************************************************************
////    public  static int invite(int n){
////        if(n<=0)
////            return 1;
////        int single = invite(n-1);
////        int pair = (n-1) * invite(n-2);
////        return single+pair;
////    }
////    print subset of first n natural numbers ************************************************************************************************
////    public static void subset(int n, ArrayList<Integer> a){
////        if(n==0){
////            System.out.println(a);
////            return;
////        }
////        a.add(n);
////        subset(n-1,a);
////        a.remove(a.size()-1);
////        subset(n-1,a);
////    }
//
//
//    public static void permutation(String s ,String perm, ArrayList<String> hs){
//        if (s.length()==0){
//            hs.add(perm);
//            return;
//        }
//
//        for (int i=0;i<s.length();i++){
//            char curr = s.charAt(i);
//            String newS = s.substring(0,i)+s.substring(i+1);
//            permutation(newS,perm+curr,hs);
//        }
//    }
//    public static boolean checkInclusion(String s1, String s2) {
//        if (s1.equals(s2))
//            return true;
//
//        if (s1.length()>s2.length())
//            return false;
//        ArrayList<String> list = new ArrayList<>();
//        permutation(s1,"",list);
//        for (int i=0;i<list.size();i++){
//            if(s2.contains(list.get(i)))
//                return true;
//        }
//        return false;
//    }
//
//
//    public static boolean checkinc(String s1, String s2){
//        if (s1.length()>s2.length())
//            return false;
//
//        int[] crr = new int[26];
//        for (int i=0;i<s1.length();i++)
//            crr[s1.charAt(i)-'a']++;
//
//        for (int i=0;i<s2.length()-s1.length()+1;i++){
//            for (int j=0;j<s1.length();j++)
//                crr[s2.charAt(j+i)-'a']--;
//            if (checkzero(crr))
//                return true;
//            for (int j=0;j<s1.length();j++)
//                crr[s2.charAt(j+i)-'a']++;
//        }
//        return false;
//    }
//
//    public static boolean checkzero(int[] crr){
//        for (int i=0;i< crr.length;i++){
//            if (crr[i]!=0)
//                return false;
//        }
//        return true;
//    }
//
//    public static void main(String[] args) {
////        int n=4;
////        towerhanoi(n,"S","H","D");
//
////        String s= "abcddfsfsfaadfv";
////        reversestr(s,s.length()-1);
//
////        String s = "hlo my name is himanshu jawla ";
////        flo(s,'w',0);
//
////        int[] arr={2,4,6,8,8};
////        checksorted(arr,0);
//
////        String s = "axbcxxjkxhxuiklsbxjhdxxjksx";
////        moveall(s,"",0,0);
//
////        String s = "aabbcdeefggh";
////        removeduplicate(0,s,"");
//
////        HashSet<String> hs=new HashSet<>();
////        String s = "aaa";
////        usubseq(s,0,"",hs);
////
////        String s = "abc";
////        subseq(s,0,"");
//
////        String s = "454";
////        keycomb(s,0,"");
//
//
////        String s= "abc";
////        permutation(s,"");
//
////        int n=3,m=4;
////        System.out.println(countpath(0,0,n,m));
//
////        int n=3,m=4;
////        System.out.println(counttile(n,m));
//
////        int n=4;
////        System.out.println(invite(n));
//
////        int n=3;
////        ArrayList<Integer> a = new ArrayList<>();
////        subset(n,a);
//
////        String  s1s = "ab", s2s = "eidbaooo";
////        System.out.println(checkInclusion(s1s,s2s));
////        String  s1 = "prosperity", s2 = "properties";
////        System.out.println(checkInclusion(s1,s2));
////        String  sa1 = "ab", sa2 = "ab";
////        System.out.println(checkInclusion(sa1,sa2));
////        String  as1 = "islander", as2 = "islander";
////        System.out.println(checkInclusion(as1,as2));
////        String  ss1 = "ab", ss2 = "ba";
////        System.out.println(checkInclusion(ss1,ss2));
//        System.out.println("helllloooolololololoo");
//        String  h1s = "ab", h2s = "eidbaooo";
//        System.out.println(checkinc(h1s,h2s));
//        String  fh1s = "ab", fh2s = "eidboaoo";
//        System.out.println(checkinc(fh1s,fh2s));
//        String  hsa1 = "acd", hsa2 = "dcda";
//        System.out.println(checkinc(hsa1,hsa2));
////        String  has1 = "islander", has2 = "islander";
////        System.out.println(checkinc(has1,has2));
////        String  hss1 = "ab", hss2 = "ba";
////        System.out.println(checkinc(hss1,hss2));
////        String  hs1 = "prosperity",hs2 = "properties";
////        System.out.println(checkinc(hs1,hs2));
//    }
//}package com.pratice;
//
//import java.util.Arrays;
//
//public class mergeSort {
//
//    public static void mergesort(int arr[],int st,int end){
//        divide(arr, st, end);
//    }
//
//    public static void divide(int arr[],int st,int end){
//        if (st<end){
//            int mid = (end+st)/2;
//            divide(arr,st,mid);
//            divide(arr, mid+1,end);
//            merge(arr,st,mid,end);
//        }
//    }
//    public static void merge(int arr[],int st,int mid,int end){
//        int n1=st;
//        int n2=mid+1;
//        int ar[]=new int[arr.length];
//        int x=st;
//        while (n1<=mid&&n2<=end){
//            if (arr[n1]<arr[n2]){
//                ar[x]=arr[n1];
//                n1++;
//                x++;
//            }else{
//                ar[x]=arr[n2];
//                n2++;
//                x++;
//            }
//        }
//        while (n1<=mid){
//            ar[x]=arr[n1];
//            n1++;
//            x++;
//        }
//        while (n2<=end){
//            ar[x]=arr[n2];
//            n2++;
//            x++;
//        }
//        for (int i=st;i<=end;i++){
//            arr[i]=ar[i];
//        }
//    }
//
//
//    public static void main(String[] args) {
//        int arr[]= {10,5,3,6,4,9,2,14,1,8};
//        mergesort(arr,0, arr.length-1);
//        System.out.println("Merge Sort");
//        System.out.println(Arrays.toString(arr));
//
//
//    }
//}
//package com.pratice;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.List;
//import java.util.function.IntPredicate;
//
//public class practice {
//
//
////    ques 485
//
//    public static int findMaxConsecutiveOnes(int[] nums) {
//        int maxcons=0;
//        int count=0;
//        for(int i=0;i<nums.length;i++){
//            if(nums[i]==1)
//                count++;
//            else
//                count=0;
//
//            if(maxcons<count)
//                maxcons=count;
//        }
//        return maxcons;
//    }
//
//
////      ques2
//
//    public static int findNumbers(int[] nums) {
//        int count=0;
//        for (int i=0;i<nums.length;i++){
//            int numcount=0;
//            int n=nums[i];
//            while (n>0){
//                n/=10;
//                numcount++;
//            }
//            if(numcount%2==0)
//                count++;
//        }
//        return count;
//    }
//
////    ques 3
//
//    public static int[] sortedSquares(int[] nums) {
//        int arr[] = new int[nums.length];
//        for(int i=0;i<nums.length;i++){
//            arr[i]=nums[i]*nums[i];
//        }
//        Arrays.sort(arr);
//        return arr;
//    }
//
////    ques 4
//
//    public static void duplicateZeros(int[] arr) {
//        int length = arr.length;
//
//        for (int i = 0; i < length ; i++)
//        {
//            if (arr[i] == 0 && i+1 < length)
//            {
//                for (int j = length - 1; j > i+1; j--)
//                {
//                    arr[j] = arr[j-1];
//                }
//                arr[i+1] = 0;
//                i++;
//            }
//        }
//
//    }
//
////    ques 5
//
//
////    public static void merge1(int[] nums1, int m, int[] nums2, int n) {
////
////        for(int i=m,j=0;i<nums1.length;i++,j++)
////                nums1[i]=nums2[j];
////        for (int i = 0; i < nums1.length-1; i++){
////            for (int j = i+1; j < nums1.length ; j++){
////                if (nums1[i]>nums1[j]){
////                    int temp=nums1[i];
////                    nums1[i]=nums1[j];
////                    nums1[j]=temp;
////                }
////            }
////        }
////
////    }
//
////    ques  6
//
////    public static int removeElement(int[] nums, int val) {
////        int k=0;
////        for (int i = 0; i < nums.length; i++) {
////            if (nums[i]==val){
////                k++;
////                nums[i]=Integer.MAX_VALUE;
////            }
////        }
////        Arrays.sort(nums);
////        return nums.length-k;
////    }
//
////ques 7
//
////    public static int removeDuplicates(int[] nums) {
////        int k=0;
////        for (int i = 0; i < nums.length-1; i++) {
////            if (nums[i]==nums[i+1]){
////                k++;
////                nums[i]=Integer.MAX_VALUE;
////            }
////        }
////        Arrays.sort(nums);
////        return nums.length-k;
////    }
//
////    ques 8
//
////    public static boolean checkIfExist(int[] arr) {
////
////        for (int i = 0; i < arr.length; i++) {
////            for (int j = 0; j < arr.length; j++) {
////                if(i==j)
////                    continue;
////
////                if (arr[i]==2*arr[j])
////                    return true;
////            }
////        }
////        return false;
////    }
//
////    ques 9
//
////    public static boolean validMountainArray(int[] arr) {
////
////        if (arr.length==1||arr.length==2||arr[0]>=arr[1]||arr[arr.length-1]>=arr[arr.length-2])
////            return false;
////        int peak=0;
////        for (int i = 0; i < arr.length-1; i++) {
////            if (arr[i]<arr[i+1]&& peak<arr[i+1])
////                peak=i+1;
////            else if (arr[i]==arr[i+1]) {
////                return false;
////            }
////        }
////        for (int i =0; i < peak; i++) {
////            if (arr[i]>arr[i+1])
////                return false;
////        }
////        for (int i =peak; i < arr.length-1; i++) {
////            if (arr[i]<arr[i+1])
////                return false;
////        }
////
////        return  true;
////    }
//
////    ques 10
//
////    public static int[] replaceElements(int[] arr) {
////        int max=-1;
////        for (int i = arr.length-1; i >=0 ; i--) {
////            if (arr[i]>max){
////                int temp=max;
////                max=arr[i];
////                arr[i]=temp;
////            }else
////                arr[i]=max;
////        }
////        return arr;
////    }
//
////    ques 11
//
////    public static void moveZeroes(int[] nums) {
////        if (nums.length==1)
////            return;
////        int nonzero=0;
////        for (int i = 0; i < nums.length; i++) {
////            if (nums[i]!=0){
////                nums[nonzero]=nums[i];
////                nonzero++;
////            }
////        }
////        while (nonzero< nums.length){
////            nums[nonzero]=0;
////            nonzero++;
////        }
////    }
//
////    ques 12
//
////    public static int[] sortArrayByParity(int[] nums) {
////
////        if (nums.length==1)
////            return nums;
////
////        for (int i = 0; i < nums.length-1; i++) {
////            for (int j = i+1; j < nums.length; j++) {
////                if (nums[i]%2!=0&&nums[j]%2==0){
////                    int temp=nums[i];
////                    nums[i]=nums[j];
////                    nums[j]=temp;
////                }
////            }
////        }
////
////        return nums;
////    }
//
////    ques13
//
////    public static int heightChecker(int[] heights) {
////        int[] expected = new int[heights.length];
////
////        for (int i = 0; i < expected.length; i++) {
////            expected[i]=heights[i];
////        }
////        Arrays.sort(expected);
////        int count=0;
////        for (int i = 0; i < heights.length; i++) {
////            if (heights[i]!=expected[i])
////                count++;
////        }
////        return count;
////    }
//
////    ques 14
//
////    public static int thirdMax(int[] nums) {
////        Integer max1 = null;
////        Integer max2 = null;
////        Integer max3 = null;
////        for (Integer n : nums) {
////            if (n.equals(max1) || n.equals(max2) || n.equals(max3)) continue;
////            if (max1 == null || n > max1) {
////                max3 = max2;
////                max2 = max1;
////                max1 = n;
////            } else if (max2 == null || n > max2) {
////                max3 = max2;
////                max2 = n;
////            } else if (max3 == null || n > max3) {
////                max3 = n;
////            }
////        }
////        return max3 == null ? max1 : max3;
////    }
//
////    ques 15
//
////    public static List<Integer> findDisappearedNumbers(int[] nums) {
////        List<Integer> ls =new ArrayList<>();
////
////        for (int i = 0; i < nums.length; i++) {
////            while (nums[i]!=nums[nums[i]-1]){
////                int temp = nums[nums[i]-1];
////                nums[nums[i]-1] = nums[i];
////                nums[i] = temp;
////            }
////        }
////
////        for (int i = 0; i < nums.length; i++) {
////            if (nums[i]!=i+1)
////                ls.add(i+1);
////        }
////        return ls;
////    }
//
////    ques 1  string
//
////    public static int dominantIndex(int[] nums) {
////        if(nums.length<2)
////            return -1;
////        int arr[] = new int[nums.length];
////        for (int i = 0; i < nums.length; i++) {
////            arr[i]=nums[i];
////        }
////        int value=-1;
////        Arrays.sort(nums);
////        if (nums[nums.length-1]>=(2*nums[nums.length-2]))
////            value=nums[nums.length-1];
////
////        for (int i = 0; i < nums.length; i++) {
////            if (arr[i]==value)
////                return i;
////        }
////
////        return -1;
////    }
//
////    ques 2
//
////    public static int pivotIndex(int[] nums) {
////        int rightsum=0,leftsum=0;
////        for (int i : nums)
////            rightsum+=i;
////
////        for (int i = 0; i < nums.length; i++) {
////            rightsum-=nums[i];
////            if (rightsum==leftsum)
////                return i;
////            leftsum+=nums[i];
////
////        }
////        return -1;
////    }
//
////    ques 3
//
////    public static int[] plusOne(int[] digits) {
////
////        for (int i = digits.length-1; i >=0 ; i--) {
////            int sum =digits[i]+1;
////            if (sum>=10)
////                digits[i]=sum%10;
////            else {
////                digits[i]=sum;
////                return digits;
////            }
////        }
////        int newarr[]= new int[digits.length+1];
////        if (digits[0]==0){
////            newarr[0]=1;
////            for (int i = 0; i < digits.length; i++) {
////                newarr[i+1]=digits[i];
////            }
////        }
////        return newarr;
////    }
//
////    ques 4
//
////    public static int[] findDiagonalOrder(int[][] mat) {
////        if (mat.length==0||mat[0].length==0)
////            return new int[0];
////
////        int m=mat.length,n=mat[0].length;
////        int arr[]= new int[m*n];
////        int r=0,c=0,i=0;
////        Boolean d=true;
////
////        while (r<m&&c<n){
////            if (d){
////                while (r>0&&c<n-1){
////                    arr[i++]=mat[r][c];
////                    r--;
////                    c++;
////                }
////                arr[i++]=mat[r][c];
////                if (c==n-1){
////                    r++;
////                }else {
////                    c++;
////                }
////            }else {
////                while (r<m-1&&c>0){
////                    arr[i++]=mat[r][c];
////                    c--;
////                    r++;
////                }
////                arr[i++]=mat[r][c];
////                if (r==m-1){
////                    c++;
////                }else {
////                    r++;
////                }
////            }
////            d=!d;
////        }
////        return arr;
////    }
//
////    ques 5
//
////    public static List<Integer> spiralOrder(int[][] matrix) {
////        List<Integer> ls = new ArrayList<>();
////        if (matrix.length==0&&matrix[0].length==0)
////            return ls;
////
////        int r=0,c=0;
////        int m=matrix.length,n=matrix[0].length;
////
////        while (r<m&&c<n){
////            for (int i = c; i <n ; i++) {
////                ls.add(matrix[r][i]);
////            }
////            r++;
////            for (int i = r; i < m; i++) {
////                ls.add(matrix[i][n-1]);
////            }
////            n--;
////            for (int i = n-1; i >=c ; i--) {
////                ls.add(matrix[m-1][i]);
////            }
////            m--;
////            for (int i = m-1; i >=r ; i--) {
////                ls.add(matrix[i][c]);
////            }
////            c++;
////        }
////
////        return ls;
////    }
//
////    ques 6
//
////    public static void reverse(int nums[] , int s,int e){
////        while (s<e){
////            int temp =nums[s];
////            nums[s]=nums[e];
////            nums[e]=temp;
////            s++;
////            e--;
////        }
////    }
////    public static void rotate(int[] nums, int k) {
////        if (nums.length==0||k==0)
////            return;
////        k%= nums.length;
////        reverse(nums,0, nums.length-1);
////        reverse(nums,0,k-1);
////        reverse(nums,k, nums.length-1);
////
////
////    }
//
////    ques 7
//
////    public static void reverseString(char[] s) {
////        if(s.length==1)
////            return;
////
////        int i=0,j=s.length-1;
////        while(i<j){
////            char temp =s[i];
////            s[i]=s[j];
////            s[j]=temp;
////
////            i++;
////            j--;
////        }
////
////    }
//
////    ques 8
//
////    public static int strStr(String haystack, String needle) {
////        int j=0;
////        for (int i = 0; i < haystack.length(); i++) {
////            if (haystack.charAt(i)==needle.charAt(j)){
////                j++;
////                if (j==needle.length())
////                    return i-(needle.length()-1);
////            }else {
////                i-=j;
////                j = 0;
////            }
////        }
////        return -1;
////    }
//
//
////    ques 9
//
////    public static String longestCommonPrefix(String[] strs) {
////        if (strs.length==1)
////            return strs[0];
////        int slen=Integer.MAX_VALUE,sidx=0;
////        for (int i = 0; i <strs.length; i++) {
////            if (strs[i].length()==0)
////                return "";
////            if (strs[i].length()<slen){
////                slen=strs[i].length();
////                sidx=i;
////            }
////        }
////        int range=Integer.MAX_VALUE;
////        for (int j = 0; j < strs.length; j++) {
////            int l = 0;
////            if (sidx==j)
////                continue;
////            for (int i = 0; i < strs[sidx].length(); i++) {
////                if (strs[j].charAt(i) == strs[sidx].charAt(i))
////                    l++;
////                else
////                    break;
////            }
////            if (l < range)
////                range = l;
////        }if (range==Integer.MAX_VALUE)
////            return "";
////        return strs[0].substring(0,range);
////    }
//
////    ques 10
//
////    public static String addBinary(String a, String b) {
////        int sum,carry=0;
////        int i=a.length()-1,j=b.length()-1;
////        StringBuilder sb =new StringBuilder();
////        while (i>=0||j>=0){
////            sum=carry;
////            if (i>=0)
////                sum+=a.charAt(i)-'0';
////            if (j>=0)
////                sum+=b.charAt(j)-'0';
////
////            sb.append(sum%2);
////            carry= sum/2;
////            i--;
////            j--;
////        }
////        if (carry!=0)
////            sb.append(1);
////
////        return sb.reverse().toString();
////    }
//
////    ques 11
//
////    public static List<List<Integer>> generate(int numRows) {
////        List<List<Integer>> list=new ArrayList<>();
////        for (int i = 0; i < numRows; i++) {
////            List<Integer> ls=new ArrayList<>();
////            ls.add(1);
////            for (int j = 1; j < i; j++)
////                ls.add(list.get(i-1).get(j-1)+list.get(i-1).get(j));
////            if (i!=0)
////                ls.add(1);
////
////            list.add(ls);
////        }
////
////        return list;
////    }
//
////    ques 12
//
////    public static String reverseWords(String s) {
////        StringBuilder revS =new StringBuilder();
////        String ans ="";
////        for (int i = 0; i < s.length(); i++) {
////            if (s.charAt(i)!=' '||i==s.length()-1)
////                revS.append(s.charAt(i));
////            if (s.charAt(i) == ' '|| i==s.length()-1) {
////                ans+= revS.reverse();
////                revS = new StringBuilder();
////                if (i!=s.length()-1)
////                    ans+=' ';
////            }
////        }
////        return ans;
////    }
//
////    ques 13
//
////    public static String reverseWords(String s) {
////
////        int st =s.length()-1;
////        int end = s.length();
////        StringBuilder ans=new StringBuilder();
////
////        for (int i = s.length()-1; i >=0; i--) {
////            if (s.charAt(i)!=' '&& i!=0)
////                st--;
////            else if (s.charAt(i) == ' '||i==0) {
////                if (i!=0)
////                    st++;
////                ans.append(s.substring(st,end));
////                st=i-1;
////                end=i;
////                if (i!=0)
////                    ans.append(' ');
////            }
////            else if(s.charAt(i)==' '&& s.charAt(i+1)==' '){
////                st=i-1;
////                end=i;
////            }
////        }
////        for (int i = 0; i < ans.length()-1; i++) {
////            if (ans.charAt(i)==' '&&ans.charAt(i+1)==' '){
////                ans.delete(i,i+1);
////                i--;
////            }
////
////        }
////        if (ans.charAt(0)==' ')
////            ans.replace(0,1,"");
////        if (ans.charAt(ans.length()-1)==' ')
////            ans.replace(ans.length()-1,ans.length(),"");
////
////        return ans.toString();
////    }
//
////    ques 14
//
////    public static int minSubArrayLen(int target, int[] nums) {
////        int ans = Integer.MAX_VALUE;
////        int s=0,sum=0;
////        for (int i = 0; i < nums.length; i++) {
////            sum+=nums[i];
////            while (sum>=target){
////                ans=Integer.min(ans,i-s+1);
////                sum-=nums[s];
////                s++;
////            }
////        }
////        return ans==Integer.MAX_VALUE ? 0 : ans;
////    }
//
//    public static void patter1(int n){
//        int count=1;
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(count+" ");
//                count++;
//            }
//            System.out.println();
//        }
//    }
//
//    public static void patter2(int n){
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n-i-1; j++) {
//                System.out.print("  ");
//            }
//            for (int j = 0; j < 2*i+1; j++) {
//                System.out.print("* ");
//
//            }
//            for (int j = 0; j < n-i-1; j++) {
//                System.out.print("  ");
//            }
//            System.out.println();
//        }
//    }
//    public static void patter3(int n){
//        for (int i = n-1; i >= 0; i--) {
//            for (int j = 0; j < n-i-1; j++) {
//                System.out.print("  ");
//            }
//            for (int j = 0; j < 2*i+1; j++) {
//                System.out.print("* ");
//
//            }
//            for (int j = 0; j < n-i-1; j++) {
//                System.out.print("  ");
//            }
//            System.out.println();
//        }
//    }
//
//    public static void patter4(int n){
//        for (int i = 1; i <= 2*n-1; i++) {
//
//            if(i<n){
//                for (int j = 1; j <= i; j++) {
//                    System.out.print("* ");
//                }
//            }else{
//                for (int j = 1; j <= 2*n-i; j++) {
//                    System.out.print("* ");
//                }
//            }
//            System.out.println();
//        }
//    }
//
//    public static void patter5(int n){
//        for (int i = 1; i <= n; i++) {
//
//            for (int j = 1; j <= i; j++) {
//                System.out.print(j+" ");
//            }
//            for (int j = 1; j <= 2*(n-i); j++) {
//                System.out.print("  ");
//            }
//            for (int j = i; j >=1; j--) {
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }
//    }
//
//    public static void patter6(int n){
//        char ch = 'A';
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(ch + " ");
//            }
//            ch++;
//            System.out.println();
//        }
//    }
//
//    public static void patter7(int n){
//        for (int i = 0; i < n; i++) {
//            char ch ='A';
//            for (int j = 0; j < n-i-1; j++) {
//                System.out.print("  ");
//            }
//            for (int j = 0; j < 2*i+1; j++) {
//                System.out.print(ch+" ");
//                if (((2*i+1)/2)>j)
//                    ch++;
//                else
//                    ch--;
//
//            }
//            for (int j = 0; j < n-i-1; j++) {
//                System.out.print("  ");
//            }
//            System.out.println();
//        }
//    }
//
//    public static void pattern8(int n){
//        char ch= (char) ('A'+(n-1));
//        for (int i = 0; i < n; i++) {
//            char c=(char)(ch-i);
//            for (int j = 0; j <= i; j++) {
//                System.out.print(c+" ");
//                c++;
//            }
//            System.out.println();
//        }
//    }
//
//    public static void main(String[] args) {
//
//
//        pattern8(5);
//
//
////        int nums[] = {1,1,0,1,1,1};
////        int nums1[] = {1,0,1,1,0,1};
////        System.out.println(findMaxConsecutiveOnes(nums));
////        System.out.println(findMaxConsecutiveOnes(nums1));
//
////        int nums[] = {555,901,482,1771};
////        System.out.println(findNumbers(nums));
//
////        int nums[] = {-7,-3,2,3,11};
////        System.out.println(Arrays.toString(sortedSquares(nums)));
//
////        int nums1[] ={8,4,5,0,0,0,0,7};
////        duplicateZeros(nums1);
////        System.out.println(Arrays.toString(nums1));
//
////        int nums[] ={1};
////        int nums2[]={};
////        merge1(nums,1,nums2,0);
////        System.out.println(Arrays.toString(nums));
//
////        int nums[] = {3,2,2,3};
////        System.out.println(removeElement(nums,3));
//
////        int nums[]={0,0,1,1,1,2,2,3,3,4};
////        System.out.println(removeDuplicates(nums));
//
////        int nums[]={-2,0,10,-19,4,6,-8};
////        System.out.println(checkIfExist(nums));
//
////        int nums[] ={1,2,4,6,5,3,2};
////        System.out.println(validMountainArray(nums));
//
////        int nums1[] ={56903,18666,60499,57517,26961};
////        System.out.println(Arrays.toString(replaceElements(nums1)));
//
////        int nums[] ={0,1,0,3,5,2};
////        moveZeroes(nums);
////        System.out.println(Arrays.toString(nums));
//
////        int nums[]={3,4,1,2};
////        System.out.println(Arrays.toString(sortArrayByParity(nums)));
//
////        int[] nums={1,1,4,2,1,3};
////        System.out.println(heightChecker(nums));
//
////        int[] nums ={1,2147483647,-2147483648};
////        System.out.println(thirdMax(nums));
//
////        int[] nums ={5,4,6,7,9,3,10,9,5,6};
////        System.out.println(findDisappearedNumbers(nums));
//
////        int nums[]= {0,0,0,1};
////        System.out.println(dominantIndex(nums));
//
////        int nums[]={2,-1,1};
////        System.out.println(pivotIndex(nums));
//
////        int nums[]={6,7,8,9};
////        System.out.println(Arrays.toString(plusOne(nums)));
//
////        int nums[][]={{1,2,3},{4,5,6},{7,8,9}};
////        System.out.println(Arrays.toString(findDiagonalOrder(nums)));
//
//
////        int nums[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
////        System.out.println(spiralOrder(nums));
//
////        int nums[]={-1,-100,3,99};
////        rotate(nums,2);
////        System.out.println(Arrays.toString(nums));
//
////        char[] s={'h','e','l','l','o'};
////        reverseString(s);
////        System.out.println(Arrays.toString(s));
//
////        String haystack = "ississiputr", needle = "issip";
////        System.out.println(strStr(haystack,needle));
//
////        String str[] ={"flower","flow","flight"};
////        System.out.println(longestCommonPrefix(str));
//
////        System.out.println(addBinary("1101","110"));
//
////        List<List<Integer>> list=generate(5);
////        System.out.println(list);
//
//
////        String s ="let's take leetcode contest";
////        System.out.println(reverseWords(s));
//
////        String s ="a good   example";
////        StringBuilder sb = new StringBuilder("   world   hello");
////        for (int i = 0; i < sb.length(); i++) {
////            if (sb.charAt(i)==' ')
////                sb.delete(i,i+1);
////        }
////        System.out.println(sb);
////        System.out.println(reverseWords(s));
//
////        int arr[] ={1,5,8,6,4};
////        System.out.println(minSubArrayLen(4,arr));
//
////        int [][] arr= {{1,4},{3,5},{2,4},{7,4}};
////        System.out.println(Arrays.toString(arr));
//
//
//
//    }
//}
//package com.pratice;
//
//import java.util.ArrayList;
//import java.util.HashSet;
//
//public class recursion {
//    public static String skipChar(String st){
//        if (st.isEmpty())
//            return "";
//
//        char c=st.charAt(0);
//        if (c=='a'|| c==' '){
//            return skipChar(st.substring(1));
//        }else
//            return c + skipChar(st.substring(1));
//    }
//
//    static void subseq(String ans,String st){
//        if (st.isEmpty()){
//            System.out.print(ans+" ");
//            return;
//        }
//        char c=st.charAt(0);
//
//        subseq(ans+c,st.substring(1));
//        subseq(ans,st.substring(1));
//    }
//
//    static ArrayList<String> subset(String ans,String st){
//        if (st.isEmpty()){
//            ArrayList<String> list =new ArrayList<>();
//            list.add(ans);
//            return list;
//        }
//        char c=st.charAt(0);
//
//        ArrayList<String> left = subset(ans+c,st.substring(1));
//        ArrayList<String> right = subset(ans,st.substring(1));
//
//        left.addAll(right);
//        return left;
//    }
//
//
//    public static void main(String[] args) {
//        System.out.println(skipChar("apple and app"));
//        subseq("","abc");
//        System.out.println();
//        ArrayList<String> ar=subset("","abbc");
//        HashSet<String> hs = HashSet.newHashSet(ar.size());
//        for (String sg:ar) {
//            hs.add(sg);
//        }
//        System.out.println(hs);
////        System.out.println(subset("","abbc"));
//
//    }
//}
//package com.himanshu.leetCodeQues;
//
//import java.lang.reflect.Array;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//public class leetcodeQues66 {
//
//    static int[] plusOne(int[] digits) {
//        int s=digits.length-1;
//        if(digits[0]==9){
//            int ans[]=new int[s+2];
//            while(s>=0&&digits[s]==9){
//                digits[s]=0;
//                ans[s+1]=digits[s];
//                s--;
//            }
//            s++;
//            digits[s]+=1;
//            ans[s]=digits[s];
//            return ans;
//        }
//        s=digits.length-1;
//        while(s>=0&&digits[s]==9){
//            digits[s]=0;
//            s--;
//        }
//
//        digits[s]+=1;
//
//        return digits;
//    }
//
//    public static void main(String[] args) {
//        int[] ar={9};
//        int[] arr={1,2,3};
//        System.out.println(Arrays.toString(plusOne(arr)));
//    }
//}
//package com.himanshu.leetCodeQues;
//
//public class leetcodeQues55 {
//
//    static int canJump(int[] nums) {
//        int maxJump=0,count=0;
//        for(int i=0; i<nums.length; i++){
//            if(maxJump<i||nums.length==1){
//                return 0;
//            }
//            if(maxJump<i+nums[i]){
//                maxJump=i+nums[i];
//                count++;
//            }
//            if(maxJump>=nums.length-1)
//                break;
//        }
//        return count;
//    }
//
//    public static void main(String[] args) {
//        int[] arr={7,0,9,6,9,6,1,7,9,0,1,2,9,0,3};
//        int[] arr1={1,2,3};
//        int[] arr2={0,1};
//        System.out.println(canJump(arr));
////        System.out.println(canJump(arr1));
////        System.out.println(canJump(arr2));
//    }
//}

