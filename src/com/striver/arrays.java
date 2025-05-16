package com.striver;

import java.util.*;

public class arrays {
    static void swap(int a,int b,int ar[]){
        ar[a]=ar[a]+ar[b];
        ar[b]=ar[a]-ar[b];
        ar[a]=ar[a]-ar[b];
    }
    static void reverseArray(int arr[],int st,int end){
        while (st<end){
            swap(st,end,arr);
            st++;
            end--;
        }
    }
    static int secondlargest(int arr[]){
        int lagest=arr[0];
        int slargest = Integer.MIN_VALUE;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i]>lagest) {
                slargest = lagest;
                lagest = arr[i];
            }
            if (arr[i]>slargest && arr[i]!=lagest)
                slargest=arr[i];
        }
        return slargest;
    }
    static int secondSmall(int arr[]){
        int small=arr[0];
        int secondsmall=Integer.MAX_VALUE;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i]<small){
                secondsmall=small;
                small=arr[i];
            }
            if (arr[i]<secondsmall && small!=arr[i])
                secondsmall=arr[i];
        }
        return secondsmall;
    }
    static int removeduplicate(int[] arr){
        int i=0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i]!=arr[j]){
                arr[i+1]=arr[j];
                i++;
            }
        }
        return i+1;
    }
    static void leftrotate(int arr[]){
        int temp = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=temp;
    }
    static void rightrotate(int arr[]){
        int temp = arr[arr.length-1];
        for (int i = arr.length - 1; i >0; i--) {
            arr[i]=arr[i-1];
        }
        arr[0]=temp;
    }
    static void leftrotateN(int arr[],int k){
        if (k==0)
            return;
        k%=arr.length;
        reverseArray(arr,0,k-1);
        reverseArray(arr,k,arr.length-1);
        reverseArray(arr,0,arr.length-1);
    }
    static void movezeros(int arr[]){
        int i=-1;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j]==0){
                i=j;
                break;
            }
        }
        if (i==-1)
            return;
        for (int j = i+1; j < arr.length; j++) {
            if (arr[j]!=0) {
                swap(j, i, arr);
                i++;
            }
        }
    }
    static List<Integer> union(int arr1[],int arr2[]){
        int i=0;
        int j=0;
        List<Integer> ls=new ArrayList<>();
        while (i<arr1.length && j<arr2.length){
            if (arr1[i]<=arr2[j]){

                if (ls.size()==0 || ls.get(ls.size()-1)!=arr1[i])
                    ls.add(arr1[i]);
                i++;
            } else if(arr1[i]>arr2[j]){
                if (ls.size()==0 || ls.get(ls.size()-1)!=arr2[j])
                    ls.add(arr2[j]);
                j++;
            }
        }
        while (i<arr1.length){
            if (ls.get(ls.size()-1)!=arr1[i])
                ls.add(arr1[i]);
            i++;
        }
        while (j<arr2.length){
            if (ls.get(ls.size()-1)!=arr2[j])
                ls.add(arr2[j]);
            j++;
        }
        return ls;
    }
    static ArrayList<Integer> intersection(int arr1[],int arr2[]){
        int i=0;
        int j=0;
        ArrayList<Integer> ls=new ArrayList<>();
        while (i<arr1.length){
            if (arr1[i]<arr2[j])
                i++;
            else if (arr1[i]>arr2[j])
                j++;
            else{
                ls.add(arr1[i]);
                j++;
                i++;
            }

        }
        return ls;
    }
    static int missingNumber(int arr[]){
        int xor1 =0,xor2=0;
        for (int i = 0; i < arr.length; i++) {
            xor1= xor1^arr[i];
            xor2= xor2^i+1;
        }
        xor2=xor2^arr.length+1;
        return xor1^xor2;
    }
    static int consecutiveOnes(int arr[]){
        int max=0;
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==1){
                count++;
                if (max<count)
                    max=count;
            }else
                count=0;
        }
        return max;
    }
    static int findonceapper(int arr[]){
        int xor=0;
        for (int i = 0; i < arr.length; i++) {
            xor=xor^arr[i];
        }
        return xor;
    }
    static int logestsumsubarray(int arr[],int k){
        int maxlen=0;
        int left=0,right=0;
        long sum=arr[0];
        while (right<arr.length){
            while(left<=right && sum>k){
                sum-=arr[left];
                left++;
            }
            if (sum==k)
                maxlen=Math.max(maxlen,right-left+1);
            right++;
            if (right<arr.length)
                sum+=arr[right];
        }

        return maxlen;
    }
    static int logestsubarrayall(int arr[],int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        int maxlen=0;
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];

            if (sum==k)
                maxlen=i+1;

            if (map.containsKey(sum-k))
                maxlen = Math.max(maxlen,i-map.get(sum-k));

            if (!map.containsKey(sum))
                map.put(sum,i);
        }
        return maxlen;
    }
    static int[] twosum(int arr[],int k){
        Map<Integer,Integer> map = new HashMap<>();
        map.put(arr[0],0);
        for (int i = 1; i < arr.length; i++) {
            int val=k-arr[i];
            if (map.containsKey(val))
                return new int[]{map.get(val),i};
            else map.put(arr[i],i);
        }
        return new int[]{0,0};
    }
    static void sortzerosones(int arr[]){
        int low=0,mid=0,high=arr.length-1;
        while (mid<=high){
            if (arr[mid]==0){
                swap(low,mid,arr);
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                swap(mid,high,arr);
                high--;
            }
        }
    }
    static int majority(int a[]){
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            int val = map.getOrDefault(a[i],0);
            map.put(a[i],val+1);
        }
        for (Map.Entry<Integer,Integer> it : map.entrySet()){
            if (it.getValue()>a.length/2)
                return it.getKey();
        }
        return -1;
    }
    static public int[] rearrangeArray(int[] nums) {
        int ans[] =new int[nums.length];
        int pos=0,neg=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>0){
                ans[pos*2]=nums[i];
                pos++;
            }else {
                ans[(neg*2)+1]=nums[i];
                neg++;
            }
        }
        return ans;
    }
    static int logestconsecutive(int a[]){
        HashSet<Integer> hs=new HashSet<>();
        int count=0,longest=1;
        for (int i=0;i<a.length;i++){
            hs.add(a[i]);
        }
        for (int st :hs){
            if (!hs.contains(st-1)){
                int k=st;
                while(hs.contains(k)){
                    count++;
                    k++;
                }
            }
            longest=Math.max(longest,count);
            count=0;
        }
        return longest;
    }
    static void setMatrix(int a[][]){
//        int row[]=new int[a.length];     //a[i][0]
//        int col[]=new int[a[0].length];  // a[0][j]
        int col0=1;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j]==0){
                    a[i][0]=0;
                    if (j==0)
                        col0=0;
                    else
                        a[0][j]=0;
                }
            }
        }
        for (int i = 1; i < a.length; i++) {
            for (int j = 1; j < a[i].length; j++) {
                if (a[i][0]==0||a[0][j]==0)
                    a[i][j]=0;
            }
        }
        if (a[0][0]==0)
            for (int j = 1; j < a[0].length; j++)a[0][j]=0;

        if (col0==0)
            for (int i = 0; i < a.length; i++)a[i][0]=0;

    }
    static void rotateMatrix(int a[][]){
        int n=a.length;

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                int temp=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=temp;
            }
        }
        for (int i = 0; i < n; i++) {
            reverseArray(a[i],0,n-1);
        }
    }
    static List<Integer> spiral(int a[][]){
        List<Integer> ls =new ArrayList<>();
        int left=0,top=0,right=a[0].length-1,bottom=a.length-1;
        while(left<=right && top<=bottom){
            for (int i = left; i <= right; i++) ls.add(a[top][i]);
            top++;
            for (int i = top; i <= bottom; i++) ls.add(a[i][right]);
            right--;
            if(top<=bottom){
                for (int i = right; i >= left; i--) ls.add(a[bottom][i]);
                bottom--;
            }
            for (int i = bottom; i >= top; i--) ls.add(a[i][left]);
            left++;
        }
        return ls;
    }
    static int countsubarray(int a[],int k){
        int count=0,sum=0;
        Map <Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for (int i = 0; i < a.length; i++) {
            sum+=a[i];
            count+=map.getOrDefault(sum-k,0);
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
    static int pascalElement(int n,int r){
        n=n-1;
        r=r-1;
        int res=1;
        for (int i = 0; i < r; i++) {
            res *=(n-i);
            res/=i+1;
        }
        return res;
    }
    static List<Integer> pascalRow(int n){
        List<Integer> ls = new ArrayList<>();
        ls.add(1);
        int res=1;
        for (int i = 1; i < n; i++) {
            res*=n-i;
            res/=i;
            ls.add(res);
        }
        return ls;
    }
    static List<List<Integer>> pascaltriangle(int n){
        List<List<Integer>> ls =new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            ls.add(pascalRow(i));
        }
        return ls;
    }
    static public List<Integer> majorityElement(int[] nums) {
        List<Integer> ls= new ArrayList<>();
        int c1=0,c2=0,el1=Integer.MIN_VALUE,el2=Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (c1==0 && nums[i]!=el2){
                c1++;
                el1=nums[i];
            } else if (c2==0 && nums[i]!=el1) {
                c2++;
                el2=nums[i];
            } else if (nums[i] == el1) {
                c1++;
            }else if (nums[i] == el2) {
                c2++;
            }else {
                c1--;
                c2--;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (el1 == nums[i])
                c1++;
            else if (el2==nums[i])
                c2++;
        }
        if (c1>nums.length/3)
            ls.add(el1);
        if (c2>nums.length/3)
            ls.add(el2);
        return ls;
    }
    static List<List<Integer>> sum3(int []nums){
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i>0 && nums[i]==nums[i-1]) continue;
            else {
                int j=i+1,k=nums.length-1;
                while (j<k){
                    int sum = nums[i]+nums[j]+nums[k];
                    if (sum>0)
                        k--;
                    else if (sum < 0)
                        j++;
                    else{
                        List<Integer> ls=new ArrayList<>(Arrays.asList(nums[i],nums[j],nums[k]));
                        ans.add(ls);
                        j++;
                        k--;
                        while(j<k && nums[j]==nums[j-1])j++;
                        while(j<k && nums[k]==nums[k+1])k--;
                    }
                }
            }
        }
        return ans;
    }
    static public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if (i>0 && nums[i]==nums[i-1]) continue;
            for(int j=i+1;j < nums.length;j++) {
                 if (j>i+1 && nums[j]==nums[j-1]) continue;
                 int k=j+1,l=nums.length-1;
                 while (k<l){
                        long sum = nums[i]+nums[j];
                        sum+=nums[k];
                        sum+=nums[l];
                        if (sum==target) {
                            List<Integer> ls = new ArrayList<>();
                            ls.add(nums[i]);
                            ls.add(nums[j]);
                            ls.add(nums[k]);
                            ls.add(nums[l]);
                            ans.add(ls);
                            k++;
                            l--;
                            while (k < l && nums[k] == nums[k - 1]) k++;
                            while (k < l && nums[l] == nums[l + 1]) l--;
                        }else if (sum < target)
                            k++;
                        else
                            l--;
                    }
                }

        }
        return ans;
    }
    static public int solve(ArrayList<Integer> A, int B) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int xor=0;
        int count=0;
        map.put(0,1);
        for(int i=0;i<A.size();i++){
            xor=xor^A.get(i);
            if(map.containsKey(xor^B))
                count+=map.getOrDefault(xor^B,0);
            if (!map.containsKey(xor^B))
                map.put(xor,map.getOrDefault(xor,0)+1);
        }
        return count;
    }
    static void sort2d(int [][] a){
        for (int i = 0; i < a.length-1; i++) {
            for (int j = i+1; j < a.length; j++) {
                if (a[i][0]>a[j][0]){
                    int temp[]=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
    }
    static public int[][] merge(int[][] intervals) {
        sort2d(intervals);
        int [][] ans=new int[intervals.length][2];
        ans[0][0]=intervals[0][0];
        ans[0][1]=intervals[0][1];
        int pointer=0;
        for (int i = 1; i < intervals.length; i++) {
            if (ans[pointer][1]>=intervals[i][0]){
                ans[pointer][1]=intervals[i][1];
            }else{
                pointer++;
                ans[pointer][0]=intervals[i][0];
                ans[pointer][1]=intervals[i][1];
            }
        }
        List<int[]> ls=new ArrayList<>();

        return ls.toArray(new int[ls.size()][]);
    }
    static public void mergesorted(int[] nums1, int m, int[] nums2, int n) {
        if (m==0)
            for (int i=0;i<n;i++)
                nums1[i]=nums2[i];
        int i=0,j=0;
        while (j<n && i<m+j){
            if (nums1[i]<=nums2[j])
                i++;
            else {
                int k=m-1+j;
                while (k>=i){
                    nums1[k+1]=nums1[k];
                    k--;
                }
                nums1[i]=nums2[j];
                i++;
                j++;
            }
        }
        while (j<n){
            nums1[i]=nums2[j];
            i++;j++;
        }
    }
    static public int[] misrepeat(int []a){
        int[] ans=new int[2];
        int hash[]=new int[a.length];
        for (int i = 0; i < a.length; i++) {
            hash[a[i]-1]++;
        }
        for (int i = 0; i < hash.length; i++) {
            if (hash[i]==2)
                ans[0]=i+1;
            if(hash[i]==0)
                ans[1]=i+1;
        }
        return ans;
    }
    static int maxproductsubarray(int[] arr){
        int maxprod=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int prod=1;
            for (int j = i; j < arr.length; j++) {
                prod*=arr[j];
                if (prod>maxprod)
                    maxprod=prod;
            }
        }
        return maxprod;
        
    }
    static int ceil(int arr[],int x){
        int ans=-1;
        int lo=0,hi=arr.length-1;
        while(lo<=hi){
            int mid= lo+(hi-lo)/2;
            if (arr[mid]>=x){
                hi=mid-1;
                ans=mid;
            }else
                lo=mid+1;
        }
        return ans;
    }
    static int floor(int arr[],int x){
        int ans=-1;
        int lo=0,hi=arr.length-1;
        while(lo<=hi){
            int mid= lo+(hi-lo)/2;
            if (arr[mid]>x)
                hi=mid-1;
                else{
                lo=mid+1;
                ans=mid;
            }

        }
        return ans;
    }
    static int[] firstandlast(int[] arr,int k){
        int floor=floor(arr,k);
        if (floor==k)return new int[]{ceil(arr,k),floor};
        return new int[]{-1,-1};
    }
    static int totaloccur(int[] arr,int k){
        int floor=floor(arr,k);
        if (arr[floor]==k)return floor-ceil(arr,k)+1;
        return -1;
    }
    static int rotatedsearch(int[] arr,int k){
        int lo=0,hi=arr.length-1;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if (arr[mid]==k)return mid;
            if (arr[lo]<=arr[mid]){
                if (arr[lo]<=k && k<=arr[mid])
                    hi=mid-1;
                else
                    lo=mid+1;
            }else {
                if (arr[mid]<=k && k<=arr[hi])lo=mid+1;
                else hi=mid-1;
            }
        }
        return -1;
    }
    static int minimuminrotated(int[] arr){
        int ans =Integer.MAX_VALUE,idx=-1;
        int lo=0,hi=arr.length-1;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if (arr[mid]<ans) {
                idx=mid;
                ans = arr[mid];
            }
            if (arr[lo]<=arr[mid]){
                if (arr[lo]<ans) {
                    idx=lo;
                    ans = arr[lo];
                }
                lo=mid+1;
            }else {
                hi=mid-1;
            }
        }
        return idx;
    }
    static int singleInSorted(int[] arr){
        int n=arr.length;
        if (n==1)return arr[0];
        if(arr[0]!=arr[1])return arr[0];
        if(arr[n-1]!=arr[n-2])return arr[n-1];
        int lo=1,hi=arr.length-2;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if (arr[mid]!=arr[mid-1] && arr[mid]!=arr[mid+1])return arr[mid];
            if ((arr[mid]==arr[mid-1] && mid%2==0) || (arr[mid]==arr[mid+1] && mid%2==1))
                hi=mid-1;
            else if ((arr[mid]==arr[mid-1] && mid%2==1) || (arr[mid]==arr[mid+1] && mid%2==0))
                lo=mid+1;
        }
        return -1;
    }
    static int NthRoot(int n, int m) {
        int lo=1,hi=m;
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            int val=value(mid,n);
            if(val==m)return mid;
            if(val<m)
                lo=mid+1;
            else
                hi=mid-1;
        }
        return -1;
    }
    static int value(int mid,int n){
        for (int i = 0; i < n; i++) {
            mid*=mid;
        }
        if(mid==0)return Integer.MAX_VALUE;
        return mid;
    }
    static int longestMountain(int arr[], int n) {
        if(n<3)return 0;
        int ans=0,left=0,right=0;
        for (int i = 1; i < n-1; i++) {
            if(arr[i]>arr[i-1]&&arr[i]>arr[i+1]){
                left=i-1;
                right=i+1;
                while(left>0&&arr[left]>arr[left-1])left--;
                while(right<n-1&&arr[right]>arr[right+1])right++;
                ans=Math.max(ans, right-left+1);
            }
        }
        return ans;
    }
    static int[] arrayChange(int[] nums, int[][] operations) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        for(int i=0;i<operations.length;i++){
            int idx=map.get(operations[i][0]);
            map.remove(operations[i][0]);
            nums[idx]=operations[i][1];
            map.put(operations[i][1],idx);
        }
        return nums;
    }
    static ListNode deleteDuplicates(ListNode head) {
        if(head==null)return head;
        HashMap<Integer,Integer> map=new HashMap<>();
        ListNode curr=head;
        while(curr!=null){
            map.put(curr.val,map.getOrDefault(curr.val,0)+1);
            curr=curr.next;
        }
        curr=head;
        while(curr!=null && map.get(curr.val)>1)
            curr=curr.next;
        head=curr;
        if(curr!=null){
            curr=curr.next;
            ListNode prv=head;
            while(curr!=null){
                while(curr!=null&& map.get(curr.val)>1)
                    curr=curr.next;
                prv.next=curr;
                prv=prv.next;
                if(curr!=null)curr=curr.next;
            }
        }
        return head;
    }
    static ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null)return head;
        ListNode curr=head;
        head=curr.next;
        curr.next=head.next;
        head.next=curr;
        ListNode prv=curr;
        curr=curr.next;
        while(curr!=null && curr.next!=null){
            ListNode temp=curr.next;
            if(temp.next==null)curr.next=null;
            else curr.next=temp.next;
            temp.next=curr;
            prv.next=temp;
            prv=curr;
            if (curr!=null)curr=curr.next;
        }
        return head;
    }
    static void plist(ListNode head){
        ListNode curr=head;
        while(curr!=null){
            System.out.print(curr.val+" --> ");
            curr=curr.next;
        }
    }
    static void swapNodes(ListNode head, int k) {
        if(head==null || head.next==null)return ;
        ListNode curr=head;
        int count=1;
        ListNode prv1=null;
        ListNode next1=null;
        ListNode node1=null;
        while(curr.next!=null&&count<k){
            prv1=curr;
            curr=curr.next;
            node1=curr;
            next1=curr.next;
            count++;
        }
        System.out.println(prv1.val+" ,"+node1.val+" ,"+next1.val);
        while (curr!=null){
            count++;
            curr=curr.next;
        }
        curr=head;
        int count2=1;
        ListNode prv2=null;
        ListNode next2=null;
        ListNode node2=null;
        while (curr.next!=null && count2<count-k){
            prv2=curr;
            curr=curr.next;
            node2=curr;
            next2=curr.next;
            count2++;
        }
        System.out.println(prv2.val+" ,"+node2.val+" ,"+next2.val);

        prv1.next=node2;
        prv2.next=node1;
        node1.next=next2;
        node2.next=next1;
        plist(head);
    }

    static public int myAtoi(String s) {
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        int res=0;
        s=s.trim();
        map.put('0',0);
        map.put('1',1);
        map.put('2',2);
        map.put('3',3);
        map.put('4',4);
        map.put('5',5);
        map.put('6',6);
        map.put('7',7);
        map.put('8',8);
        map.put('9',9);
        if(s.length()==0)return 0;
        int symbol=1;
        if(s.charAt(0)=='-') {
            symbol=-1;
            
            s=s.substring(1);
        }
        if(map.containsKey(s.charAt(0))) {
            for (int i = 0; i < s.length(); i++) {
                if (map.containsKey(s.charAt(i))) {
                    res = res * 10 + map.get(s.charAt(i));
                } else
                    break;
            }
        }
        return res*symbol;
    }


    public static void main(String[] args) {
//        String as="42";
//        System.out.println(myAtoi(as));
//        int arr[]={8,2,3,6,19,23,11,16,1,23,9,20};
//        System.out.println(secondlargest(arr));
//        System.out.println(secondSmall(arr));
//        int arr1[] ={1,1,2,2,2,4,5,5,6,7,7,8};
//        System.out.println(removeduplicate(arr1));
//        leftrotate(arr);
//        rightrotate(arr1);
//        leftrotateN(arr1,5);
//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(arr1));
//        int arr0[] ={ 1,2,0,0,3,4,0,5,0,3,0,6,0,7,9,0,8};
//        movezeros(arr0);
//        System.out.println(Arrays.toString(arr0));
//        int a1[]={1,1,2,3,4,4,9,11,12,12};
//        int a2[]={1,3,3,4,5,6,7,12,12,12};
//        System.out.println(union(a1,a2));
//        System.out.println(intersection(a1,a2));
//        int arrM[]={1,2,4,3,7,8,6,10,5};
//        System.out.println(missingNumber(arrM));
//        int ones[] ={2,3,1,5,0,1,1,3,1,2,1,1,1,1,3,4,1,1,1,1,1,4,3,4,1};
//        System.out.println(consecutiveOnes(ones));
//        int onceapper[] = {1,2,3,4,3,4,2,5,7,5,7};
//        System.out.println(findonceapper(onceapper));
//        int subarray[]={1,2,3,-3,1,1,1,4,2,-3};
//        System.out.println(logestsubarrayall(subarray,9));
//        int zerosones[]={1,1,0,2,1,2,2,0,2,0,1,0,0};
//        sortzerosones(zerosones);
//        System.out.println(Arrays.toString(zerosones));
//        int rearrarnge[]={1,8,-4,-3,-2,10,11,-5,1,-9};
//        System.out.println(Arrays.toString(rearrangeArray(rearrarnge)));
//        int conarr[] = {102,4,100,102,1,100,3,3,1};
//        System.out.println(logestconsecutive(conarr));
//        int [][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
//        setMatrix(matrix);
//        rotateMatrix(matrix);
//        System.out.println(spiral(matrix));
//        for (int[] i :matrix)
//            System.out.println(Arrays.toString(i));
//        System.out.println(countsubarray(subarray,3));
//        System.out.println(pascalElement(9,4));
//        System.out.println(pascalRow(6));
//        System.out.println(pascaltriangle(6));
//        int threesum[] ={-1,0,1,2,-1,-4};
//        System.out.println(sum3(threesum));
//        int []forsum={1,0,-1,0,-2,2};
//        System.out.println(fourSum(forsum,0));
//        Integer interval[][]={{9,11},{2,4},{15,17},{4,6},{14,18},{1,3},{8,9}};
//        int ans[][]=merge(interval);
//        for (int i[]:ans)
//            System.out.print(Arrays.toString(i)+", ");
//        int n1[]={1,2,3,0,0,0};
//        int n2[]={2,5,6};
//        merge(n1,3,n2,3);
//        System.out.println(Arrays.toString(n1));
//        int prodarray[] = {2,3,-2,4};
//        System.out.println(maxproductsubarray(prodarray));
//        int ceilarr[]={1,2,3,5,5,7,8,8,11,12};
//        System.out.println(ceil(ceilarr,0));
//        System.out.println(floor(ceilarr,0));
//        int arr[]={7,8,9,2,3,4,5,6};
//        System.out.println(Arrays.toString(arr));
//        System.out.println(minimuminrotated(arr));
//        System.out.println(NthRoot(6,4096));
//        int[] arr={1,3,1,4,3,1};
//        System.out.println(longestMountain(arr,arr.length));
//        int a[]={1,3,5,2,6};
//        int[][] b={{1,8},{5,1},{1,9}};
//        System.out.println(Arrays.toString(arrayChange(a,b)));
//       ListNode head =new ListNode(1);
//       int arr[]=new int[] {2, 3, 4, 5, 6};
//        System.out.println(arr[3]);
//        System.out.println(head);
//       head.next=new ListNode(2);
//       head.next.next=new ListNode(3);
//       head.next.next.next=new ListNode(4);
//       head.next.next.next.next=new ListNode(5);
//       head.next.next.next.next.next=new ListNode(4);
//       head.next.next.next.next.next.next=new ListNode(5);
//       plist(head);
//       System.out.println();
//       swapNodes(head,2);


    }
    static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }


 }
}