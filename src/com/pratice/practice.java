package com.pratice;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.IntPredicate;
import static java.lang.Math.min;
public class practice {

//    ques 485
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

//    ques 5


//    public static void merge1(int[] nums1, int m, int[] nums2, int n) {
//
//        for(int i=m,j=0;i<nums1.length;i++,j++)
//                nums1[i]=nums2[j];
//        for (int i = 0; i < nums1.length-1; i++){
//            for (int j = i+1; j < nums1.length ; j++){
//                if (nums1[i]>nums1[j]){
//                    int temp=nums1[i];
//                    nums1[i]=nums1[j];
//                    nums1[j]=temp;
//                }
//            }
//        }

//    }

//    ques  6

//    public static int removeElement(int[] nums, int val) {
//        int k=0;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i]==val){
//                k++;
//                nums[i]=Integer.MAX_VALUE;
//            }
//        }
//        Arrays.sort(nums);
//        return nums.length-k;
//    }

//ques 7

//    public static int removeDuplicates(int[] nums) {
//        int k=0;
//        for (int i = 0; i < nums.length-1; i++) {
//            if (nums[i]==nums[i+1]){
//                k++;
//                nums[i]=Integer.MAX_VALUE;
//            }
//        }
//        Arrays.sort(nums);
//        return nums.length-k;
//    }

//    ques 8

//    public static boolean checkIfExist(int[] arr) {
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length; j++) {
//                if(i==j)
//                    continue;
//
//                if (arr[i]==2*arr[j])
//                    return true;
//            }
//        }
//        return false;
//    }

//    ques 9

//    public static boolean validMountainArray(int[] arr) {
//
//        if (arr.length==1||arr.length==2||arr[0]>=arr[1]||arr[arr.length-1]>=arr[arr.length-2])
//            return false;
//        int peak=0;
//        for (int i = 0; i < arr.length-1; i++) {
//            if (arr[i]<arr[i+1]&& peak<arr[i+1])
//                peak=i+1;
//            else if (arr[i]==arr[i+1]) {
//                return false;
//            }
//        }
//        for (int i =0; i < peak; i++) {
//            if (arr[i]>arr[i+1])
//                return false;
//        }
//        for (int i =peak; i < arr.length-1; i++) {
//            if (arr[i]<arr[i+1])
//                return false;
//        }
//
//        return  true;
//    }

//    ques 10

//    public static int[] replaceElements(int[] arr) {
//        int max=-1;
//        for (int i = arr.length-1; i >=0 ; i--) {
//            if (arr[i]>max){
//                int temp=max;
//                max=arr[i];
//                arr[i]=temp;
//            }else
//                arr[i]=max;
//        }
//        return arr;
//    }

//    ques 11

//    public static void moveZeroes(int[] nums) {
//        if (nums.length==1)
//            return;
//        int nonzero=0;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i]!=0){
//                nums[nonzero]=nums[i];
//                nonzero++;
//            }
//        }
//        while (nonzero< nums.length){
//            nums[nonzero]=0;
//            nonzero++;
//        }
//    }

//    ques 12

//    public static int[] sortArrayByParity(int[] nums) {
//
//        if (nums.length==1)
//            return nums;
//
//        for (int i = 0; i < nums.length-1; i++) {
//            for (int j = i+1; j < nums.length; j++) {
//                if (nums[i]%2!=0&&nums[j]%2==0){
//                    int temp=nums[i];
//                    nums[i]=nums[j];
//                    nums[j]=temp;
//                }
//            }
//        }
//
//        return nums;
//    }

//    ques13

//    public static int heightChecker(int[] heights) {
//        int[] expected = new int[heights.length];
//
//        for (int i = 0; i < expected.length; i++) {
//            expected[i]=heights[i];
//        }
//        Arrays.sort(expected);
//        int count=0;
//        for (int i = 0; i < heights.length; i++) {
//            if (heights[i]!=expected[i])
//                count++;
//        }
//        return count;
//    }

//    ques 14

//    public static int thirdMax(int[] nums) {
//        Integer max1 = null;
//        Integer max2 = null;
//        Integer max3 = null;
//        for (Integer n : nums) {
//            if (n.equals(max1) || n.equals(max2) || n.equals(max3)) continue;
//            if (max1 == null || n > max1) {
//                max3 = max2;
//                max2 = max1;
//                max1 = n;
//            } else if (max2 == null || n > max2) {
//                max3 = max2;
//                max2 = n;
//            } else if (max3 == null || n > max3) {
//                max3 = n;
//            }
//        }
//        return max3 == null ? max1 : max3;
//    }

//    ques 15

//    public static List<Integer> findDisappearedNumbers(int[] nums) {
//        List<Integer> ls =new ArrayList<>();
//
//        for (int i = 0; i < nums.length; i++) {
//            while (nums[i]!=nums[nums[i]-1]){
//                int temp = nums[nums[i]-1];
//                nums[nums[i]-1] = nums[i];
//                nums[i] = temp;
//            }
//        }
//
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i]!=i+1)
//                ls.add(i+1);
//        }
//        return ls;
//    }

//    ques 1  string

//    public static int dominantIndex(int[] nums) {
//        if(nums.length<2)
//            return -1;
//        int arr[] = new int[nums.length];
//        for (int i = 0; i < nums.length; i++) {
//            arr[i]=nums[i];
//        }
//        int value=-1;
//        Arrays.sort(nums);
//        if (nums[nums.length-1]>=(2*nums[nums.length-2]))
//            value=nums[nums.length-1];
//
//        for (int i = 0; i < nums.length; i++) {
//            if (arr[i]==value)
//                return i;
//        }
//
//        return -1;
//    }

//    ques 2

//    public static int pivotIndex(int[] nums) {
//        int rightsum=0,leftsum=0;
//        for (int i : nums)
//            rightsum+=i;
//
//        for (int i = 0; i < nums.length; i++) {
//            rightsum-=nums[i];
//            if (rightsum==leftsum)
//                return i;
//            leftsum+=nums[i];
//
//        }
//        return -1;
//    }

//    ques 3

//    public static int[] plusOne(int[] digits) {
//
//        for (int i = digits.length-1; i >=0 ; i--) {
//            int sum =digits[i]+1;
//            if (sum>=10)
//                digits[i]=sum%10;
//            else {
//                digits[i]=sum;
//                return digits;
//            }
//        }
//        int newarr[]= new int[digits.length+1];
//        if (digits[0]==0){
//            newarr[0]=1;
//            for (int i = 0; i < digits.length; i++) {
//                newarr[i+1]=digits[i];
//            }
//        }
//        return newarr;
//    }

//    ques 4

//    public static int[] findDiagonalOrder(int[][] mat) {
//        if (mat.length==0||mat[0].length==0)
//            return new int[0];
//
//        int m=mat.length,n=mat[0].length;
//        int arr[]= new int[m*n];
//        int r=0,c=0,i=0;
//        Boolean d=true;
//
//        while (r<m&&c<n){
//            if (d){
//                while (r>0&&c<n-1){
//                    arr[i++]=mat[r][c];
//                    r--;
//                    c++;
//                }
//                arr[i++]=mat[r][c];
//                if (c==n-1){
//                    r++;
//                }else {
//                    c++;
//                }
//            }else {
//                while (r<m-1&&c>0){
//                    arr[i++]=mat[r][c];
//                    c--;
//                    r++;
//                }
//                arr[i++]=mat[r][c];
//                if (r==m-1){
//                    c++;
//                }else {
//                    r++;
//                }
//            }
//            d=!d;
//        }
//        return arr;
//    }

//    ques 5

//    public static List<Integer> spiralOrder(int[][] matrix) {
//        List<Integer> ls = new ArrayList<>();
//        if (matrix.length==0&&matrix[0].length==0)
//            return ls;
//
//        int r=0,c=0;
//        int m=matrix.length,n=matrix[0].length;
//
//        while (r<m&&c<n){
//            for (int i = c; i <n ; i++) {
//                ls.add(matrix[r][i]);
//            }
//            r++;
//            for (int i = r; i < m; i++) {
//                ls.add(matrix[i][n-1]);
//            }
//            n--;
//            for (int i = n-1; i >=c ; i--) {
//                ls.add(matrix[m-1][i]);
//            }
//            m--;
//            for (int i = m-1; i >=r ; i--) {
//                ls.add(matrix[i][c]);
//            }
//            c++;
//        }
//
//        return ls;
//    }

//    ques 6

//    public static void reverse(int nums[] , int s,int e){
//        while (s<e){
//            int temp =nums[s];
//            nums[s]=nums[e];
//            nums[e]=temp;
//            s++;
//            e--;
//        }
//    }
//    public static void rotate(int[] nums, int k) {
//        if (nums.length==0||k==0)
//            return;
//        k%= nums.length;
//        reverse(nums,0, nums.length-1);
//        reverse(nums,0,k-1);
//        reverse(nums,k, nums.length-1);
//
//
//    }

//    ques 7

//    public static void reverseString(char[] s) {
//        if(s.length==1)
//            return;
//
//        int i=0,j=s.length-1;
//        while(i<j){
//            char temp =s[i];
//            s[i]=s[j];
//            s[j]=temp;
//
//            i++;
//            j--;
//        }
//
//    }

//    ques 8

//    public static int strStr(String haystack, String needle) {
//        int j=0;
//        for (int i = 0; i < haystack.length(); i++) {
//            if (haystack.charAt(i)==needle.charAt(j)){
//                j++;
//                if (j==needle.length())
//                    return i-(needle.length()-1);
//            }else {
//                i-=j;
//                j = 0;
//            }
//        }
//        return -1;
//    }


//    ques 9

//    public static String longestCommonPrefix(String[] strs) {
//        if (strs.length==1)
//            return strs[0];
//        int slen=Integer.MAX_VALUE,sidx=0;
//        for (int i = 0; i <strs.length; i++) {
//            if (strs[i].length()==0)
//                return "";
//            if (strs[i].length()<slen){
//                slen=strs[i].length();
//                sidx=i;
//            }
//        }
//        int range=Integer.MAX_VALUE;
//        for (int j = 0; j < strs.length; j++) {
//            int l = 0;
//            if (sidx==j)
//                continue;
//            for (int i = 0; i < strs[sidx].length(); i++) {
//                if (strs[j].charAt(i) == strs[sidx].charAt(i))
//                    l++;
//                else
//                    break;
//            }
//            if (l < range)
//                range = l;
//        }if (range==Integer.MAX_VALUE)
//            return "";
//        return strs[0].substring(0,range);
//    }

//    ques 10

//    public static String addBinary(String a, String b) {
//        int sum,carry=0;
//        int i=a.length()-1,j=b.length()-1;
//        StringBuilder sb =new StringBuilder();
//        while (i>=0||j>=0){
//            sum=carry;
//            if (i>=0)
//                sum+=a.charAt(i)-'0';
//            if (j>=0)
//                sum+=b.charAt(j)-'0';
//
//            sb.append(sum%2);
//            carry= sum/2;
//            i--;
//            j--;
//        }
//        if (carry!=0)
//            sb.append(1);
//
//        return sb.reverse().toString();
//    }

//    ques 11

//    public static List<List<Integer>> generate(int numRows) {
//        List<List<Integer>> list=new ArrayList<>();
//        for (int i = 0; i < numRows; i++) {
//            List<Integer> ls=new ArrayList<>();
//            ls.add(1);
//            for (int j = 1; j < i; j++)
//                ls.add(list.get(i-1).get(j-1)+list.get(i-1).get(j));
//            if (i!=0)
//                ls.add(1);
//
//            list.add(ls);
//        }
//
//        return list;
//    }

//    ques 12

//    public static String reverseWords(String s) {
//        StringBuilder revS =new StringBuilder();
//        String ans ="";
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i)!=' '||i==s.length()-1)
//                revS.append(s.charAt(i));
//            if (s.charAt(i) == ' '|| i==s.length()-1) {
//                ans+= revS.reverse();
//                revS = new StringBuilder();
//                if (i!=s.length()-1)
//                    ans+=' ';
//            }
//        }
//        return ans;
//    }

//    ques 13

//    public static String reverseWords(String s) {
//
//        int st =s.length()-1;
//        int end = s.length();
//        StringBuilder ans=new StringBuilder();
//
//        for (int i = s.length()-1; i >=0; i--) {
//            if (s.charAt(i)!=' '&& i!=0)
//                st--;
//            else if (s.charAt(i) == ' '||i==0) {
//                if (i!=0)
//                    st++;
//                ans.append(s.substring(st,end));
//                st=i-1;
//                end=i;
//                if (i!=0)
//                    ans.append(' ');
//            }
//            else if(s.charAt(i)==' '&& s.charAt(i+1)==' '){
//                st=i-1;
//                end=i;
//            }
//        }
//        for (int i = 0; i < ans.length()-1; i++) {
//            if (ans.charAt(i)==' '&&ans.charAt(i+1)==' '){
//                ans.delete(i,i+1);
//                i--;
//            }
//
//        }
//        if (ans.charAt(0)==' ')
//            ans.replace(0,1,"");
//        if (ans.charAt(ans.length()-1)==' ')
//            ans.replace(ans.length()-1,ans.length(),"");
//
//        return ans.toString();
//    }

//    ques 14

//    public static int minSubArrayLen(int target, int[] nums) {
//        int ans = Integer.MAX_VALUE;
//        int s=0,sum=0;
//        for (int i = 0; i < nums.length; i++) {
//            sum+=nums[i];
//            while (sum>=target){
//                ans=Integer.min(ans,i-s+1);
//                sum-=nums[s];
//                s++;
//            }
//        }
//        return ans==Integer.MAX_VALUE ? 0 : ans;
//    }
//
//

    public static void main(String[] args) {

//        int nums[] = {1,1,0,1,1,1};
//        int nums1[] = {1,0,1,1,0,1};
//        System.out.println(findMaxConsecutiveOnes(nums));
//        System.out.println(findMaxConsecutiveOnes(nums1));

//        int nums[] = {555,901,482,1771};
//        System.out.println(findNumbers(nums));

//        int nums[] = {-7,-3,2,3,11};
//        System.out.println(Arrays.toString(sortedSquares(nums)));

//        int nums1[] ={8,4,5,0,0,0,0,7};
//        duplicateZeros(nums1);
//        System.out.println(Arrays.toString(nums1));

//        int nums[] ={1};
//        int nums2[]={};
//        merge1(nums,1,nums2,0);
//        System.out.println(Arrays.toString(nums));

//        int nums[] = {3,2,2,3};
//        System.out.println(removeElement(nums,3));

//        int nums[]={0,0,1,1,1,2,2,3,3,4};
//        System.out.println(removeDuplicates(nums));

//        int nums[]={-2,0,10,-19,4,6,-8};
//        System.out.println(checkIfExist(nums));

//        int nums[] ={1,2,4,6,5,3,2};
//        System.out.println(validMountainArray(nums));

//        int nums1[] ={56903,18666,60499,57517,26961};
//        System.out.println(Arrays.toString(replaceElements(nums1)));

//        int nums[] ={0,1,0,3,5,2};
//        moveZeroes(nums);
//        System.out.println(Arrays.toString(nums));

//        int nums[]={3,4,1,2};
//        System.out.println(Arrays.toString(sortArrayByParity(nums)));

//        int[] nums={1,1,4,2,1,3};
//        System.out.println(heightChecker(nums));

//        int[] nums ={1,2147483647,-2147483648};
//        System.out.println(thirdMax(nums));

//        int[] nums ={5,4,6,7,9,3,10,9,5,6};
//        System.out.println(findDisappearedNumbers(nums));

//        int nums[]= {0,0,0,1};
//        System.out.println(dominantIndex(nums));

//        int nums[]={2,-1,1};
//        System.out.println(pivotIndex(nums));

//        int nums[]={6,7,8,9};
//        System.out.println(Arrays.toString(plusOne(nums)));

//        int nums[][]={{1,2,3},{4,5,6},{7,8,9}};
//        System.out.println(Arrays.toString(findDiagonalOrder(nums)));


//        int nums[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
//        System.out.println(spiralOrder(nums));

//        int nums[]={-1,-100,3,99};
//        rotate(nums,2);
//        System.out.println(Arrays.toString(nums));

//        char[] s={'h','e','l','l','o'};
//        reverseString(s);
//        System.out.println(Arrays.toString(s));

//        String haystack = "ississiputr", needle = "issip";
//        System.out.println(strStr(haystack,needle));

//        String str[] ={"flower","flow","flight"};
//        System.out.println(longestCommonPrefix(str));

//        System.out.println(addBinary("1101","110"));

//        List<List<Integer>> list=generate(5);
//        System.out.println(list);


//        String s ="let's take leetcode contest";
//        System.out.println(reverseWords(s));

//        String s ="a good   example";
//        StringBuilder sb = new StringBuilder("   world   hello");
//        for (int i = 0; i < sb.length(); i++) {
//            if (sb.charAt(i)==' ')
//                sb.delete(i,i+1);
//        }
//        System.out.println(sb);
//        System.out.println(reverseWords(s));

//        int arr[] ={1,5,8,6,4};
//        System.out.println(minSubArrayLen(4,arr));

//        int [][] arr= {{1,4},{3,5},{2,4},{7,4}};
//        System.out.println(Arrays.toString(arr));

    }
}
