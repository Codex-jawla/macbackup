package com.pratice;
import java.util.*;
import static java.lang.Math.*;
public class strivercourse {
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
//    public static void patter2(int n){
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n-i-1; j++) {
//                System.out.print("  ");
//            }
//            for (int j = 0; j < 2*i+1; j++) {
//                System.out.print("* ");
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
//            }
//            for (int j = 0; j < n-i-1; j++) {
//                System.out.print("  ");
//            }
//            System.out.println();
//        }
//    }
//    public static void patter4(int n){
//        for (int i = 1; i <= 2*n-1; i++) {
//            if(i<n){
//            for (int j = 1; j <= i; j++) {
//                System.out.print("* ");
//            }
//            }else{
//            for (int j = 1; j <= 2*n-i; j++) {
//                System.out.print("* ");
//            }
//            }
//            System.out.println();
//        }
//    }
//    public static void patter5(int n){
//        for (int i = 1; i <= n; i++) {
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
//            }
//            for (int j = 0; j < n-i-1; j++) {
//                System.out.print("  ");
//            }
//            System.out.println();
//        }
//    }
//    public static void patter8(int n){
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
//    public static void patter9(int n){
//        for (int i = 0; i < n; i++) {
//            for (int j = 1; j <= n-i; j++) {
//                System.out.print(j+" ");
//            }
//            for (int j = 1; j <= 2*(i); j++) {
//                System.out.print("  ");
//            }
//            for (int j = n-i; j >=1; j--) {
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }
//    }
//    public static void patter10(int n){
//        for (int i = 1; i <= 2*n-1; i++) {
//        if (i<=n) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("* ");
//            }
//            for (int j = 1; j <= 2 * (n - i); j++) {
//                System.out.print("  ");
//            }
//            for (int j = i; j >= 1; j--) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }else {
//            for (int j = 1; j <= 2*n-i; j++) {
//                System.out.print("* ");
//            }
//            for (int j = 1; j <=(2*i - 2*n); j++) {
//                System.out.print("  ");
//            }
//            for (int j = 1; j <= 2*n-i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        }
//    }
//    public static void patter11(int n){
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= n; j++) {
//                if(i==1||j==1||i==n||j==n)
//                    System.out.print("* ");
//                else
//                    System.out.print("  ");
//            }
//            System.out.println();
//        }
//    }
//    public static void patter12(int n){
//        for (int i = 0; i < 2*n-1; i++) {
//            for (int j = 0; j < 2*n-1; j++) {
//                int top=i;
//                int left=j;
//                int down=(2*n-2)-i;
//                int right=(2*n-2)-j;
//                System.out.print(n-min(min(top,down),min(right,left))+" ");
//            }
//            System.out.println();
//        }
//    }
//    public static void swapArrelm(int arr[],int i1,int i2){
//        int temp=arr[i1];
//        arr[i1]=arr[i2];
//        arr[i2]=temp;
//    }
//    public static int reverse(int x) {
//        int dup= abs(x);
//        int revnum=0;
//        while(dup>0){
//            int lastdigit=dup%10;
//            revnum =(revnum*10)+lastdigit;
//            dup/=10;
//        }
//        if (x<0)
//            return revnum * -1;
//        else
//            return revnum;
//    }
//    public static int HCF(int n1,int n2){
//        int hcf=1;
//
//        for (int i = min(n1, n2); i >= 1; i--) {
//            if (n1%i==0&&n2%i==0){
//                hcf=i;
//                break;
//            }
//        }
//
//        return hcf;
//    }
//    public static int HCFR(int n1,int n2){
//        if (n1==0)
//            return n2;
//        if (n2==0)
//            return n1;
//
//        if (n1>n2)
//            return HCFR(n1%n2,n2);
//        else
//            return HCFR(n2%n1,n1);
//    }
//    public static void counting(int n){
//        if (n==0)
//            return;
//        System.out.println(n);
//        counting(n-1);
//    }
//    public static void multinames(int n){
//        if (n==0)
//            return;
//        System.out.println("vansh");
//        multinames(--n);
//    }
//    public static int sum(int n){
//        if (n==0)
//            return 0;
//
//        return n+sum(n-1);
//    }
//    public static int fact(int n){
//        if (n==0)
//            return 1;
//
//        return n*fact(n-1);
//    }
//    public static void reveserARR(int[] arr,int s){
//        if(s>=arr.length/2)
//            return;
//
//        int n= arr.length-1;
//        int temp=arr[s];
//        arr[s]=arr[n-s];
//        arr[n-s]=temp;
//        reveserARR(arr ,s+1);
//    }
//    public static boolean palindromeS(String s,int st){
//        if(st>=s.length()/2)
//            return true;
//
//        int n= s.length()-1;
//        if(s.charAt(st)!=s.charAt(n-st))
//            return false;
//
//        return palindromeS(s ,st+1);
//    }
//    public static int fibbonaci(int n){
//        if(n<=1)
//            return n;
//        return fibbonaci(n-1)+fibbonaci(n-2);
//    }
//    static int hasht[]=new int[100000];
//    static int chasht[]=new int[256];
//    public static void hash(int arr[]){
//        for (int i = 0; i < arr.length; i++) {
//            hasht[arr[i]]+=1;
//        }
//    }
//    public static void charhash(String s){
//        for (int i = 0; i < s.length(); i++) {
//            chasht[s.charAt(i)]+=1;
//        }
//    }
//    public static void selectionSort(int[] arr){
//        for (int i = 0; i < arr.length; i++) {
//            int low=i;
//            for (int j = i; j < arr.length; j++) {
//                if (arr[j]<arr[low])
//                    low=j;
//            }
//            swapArrelm(arr,arr[low],arr[i]);
//        }
//    }
//    public static void bubbleSort(int[] arr){
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length-1; j++) {
//                if (arr[j] > arr[j + 1]){
//                    swapArrelm(arr,arr[j],arr[j+1]);
//                }
//            }
//        }
//    }
//    public static void insertionSort(int[] arr){
//        for (int i = 0; i < arr.length; i++) {
//            int j=i;
//            while(j>0&&arr[j-1]>arr[j]) {
//                swapArrelm(arr,arr[j],arr[j-1]);
//                j--;
//            }
//        }
//    }
//    public static void mergeSort(int arr[]){
//        divide(arr,0,arr.length-1);
//    }
//    public static void divide(int arr[],int lo,int hi){
//        if (lo>=hi)
//            return;
//        int mid = (hi+lo)/2;
//        divide(arr,lo,mid);
//        divide(arr,mid+1,hi);
//        merge(arr,lo,mid,hi);
//    }
//    public static void merge(int arr[],int lo,int mid,int hi){
//        int []temp=new int[arr.length];
//        int left=lo;
//        int right=mid+1;
//        int i=lo;
//        while(left<=mid&&right<=hi){
//            if (arr[left]<arr[right]){
//                temp[i]=arr[left];
//                left++;
//                i++;
//            }else{
//                temp[i]=arr[right];
//                right++;
//                i++;
//            }
//        }
//        while(left<=mid){
//                temp[i]=arr[left];
//                left++;
//                i++;
//        }
//        while(right<=hi){
//                temp[i]=arr[right];
//                right++;
//                i++;
//        }
//        i=lo;
//        while(i<=hi){
//            arr[i]=temp[i];
//            i++;
//        }
//    }
//    public static void quicksort(int arr[],int lo,int hi){
//        if(lo<hi){
//            int pidx =pivot(arr,lo,hi);
//            quicksort(arr,lo,pidx-1);
//            quicksort(arr,pidx+1,hi);
//        }
//    }
//    public static int pivot(int arr[],int lo,int hi){
//        int pivot=arr[lo];
//        int i=lo,j=hi;
//        while(i<j){
//            while(arr[i]<=pivot)
//                i++;
//            while(arr[j]>pivot)
//                j--;
//            if (i<=j){
//                swapArrelm(arr,i,j);
//                i++;
//                j--;
//            }
//        }
//        swapArrelm(arr,lo,j);
//
//        return j;
//    }
//    public static int secondLargest(int arr[]){
//        int largest=arr[0];
//        int slargest=-1;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i]>largest){
//                slargest=largest;
//                largest=arr[i];
//            }
//            else if (arr[i]>slargest&&arr[i]!=largest){
//                slargest=arr[i];}
//        }
//        return slargest;
//    }
//    public static int removeduplicate(int arr[]){
//        int i=0,j=1,count=1;
//        while(j<arr.length){
//            if (arr[i]!=arr[j]){
//                i++;
//                arr[i]=arr[j];
//                j++;
//                count++;
//            }else
//                j++;
//        }
//        return count;
//    }
//    public static void rotateNLeft(int arr[],int rotation){
//        rotation=rotation%arr.length;
//        reverseArr(arr,0,rotation-1);
//        reverseArr(arr,rotation,arr.length-1);
//        reverseArr(arr,0,arr.length-1);
//    }
//    public static void rotateNRight(int arr[],int rotation){
//        rotation=rotation%arr.length;
//        reverseArr(arr,0, arr.length-1);
//        reverseArr(arr,0,rotation-1);
//        reverseArr(arr,rotation,arr.length-1);
//    }
//    public static void reverseArr(int arr[],int s,int e){
//        while(s<=e){
//            int temp=arr[s];
//            arr[s]=arr[e];
//            arr[e]=temp;
//            s++;
//            e--;
//        }
//    }
//    public static void movezero(int arr[]){
//        int j=-1;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i]==0){
//                j=i;
//                break;
//            }
//        }
//        for (int i = j+1; i < arr.length; i++) {
//            if(arr[i]!=0){
//                swapArrelm(arr,i,j);
//                j++;
//            }
//        }
//    }
//    public static int linerSearch(int arr[],int tar){
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i]==tar)
//                return i;
//        }
//        return -1;
//    }
//    public static List<Integer> union(int a[],int b[]){
//        List<Integer> ls=new ArrayList<>();
//        int n1=a.length;
//        int n2=b.length;
//        int i=0,j=0;
//        while(i<n1&&j<n2){
//            if (a[i]<=b[j]){
//                if (ls.isEmpty()||a[i]!=ls.getLast()){
//                    ls.addLast(a[i]);
//                }
//                i++;
//            }else {
//                if (ls.isEmpty()||b[j]!=ls.getLast()){
//                    ls.addLast(b[j]);
//                }
//                j++;
//            }
//        }
//        while (i<n1){
//            if (ls.isEmpty()||a[i]!=ls.getLast()){
//                ls.addLast(a[i]);
//            }
//            i++;
//        }
//        while (j<n2){
//            if (ls.isEmpty()||b[j]!=ls.getLast()){
//                ls.addLast(b[j]);
//            }
//            j++;
//        }
//
//        return ls;
//    }
//    public static List<Integer> intersection(int a[],int b[]){
//        List<Integer> ls=new ArrayList<>();
//        int n1=a.length,n2=b.length,i=0,j=0;
//        while(i<n1 && j<n2){
//            if (a[i]<b[j])
//                i++;
//            else if (b[j]<a[i])
//                j++;
//            else {
//                ls.addLast(a[i]);
//                i++;
//                j++;
//            }
//        }
//        return ls;
//    }
//    public static int findmissing(int a[]){
//        int xor1=0,xor2=1;
//        for (int i = 0; i < a.length; i++) {
//            xor1=xor1^a[i];
//            xor2=xor2^i+2;
//        }
//
//        return xor1^xor2;
//    }

    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class Binarytree {
        static int idx = -1;

        public static Node buildtree(int[] values) {
            idx++;
            if (values[idx] == -1) {
                return null;
            }
            Node newnode = new Node(values[idx]);
            newnode.left = buildtree(values);
            newnode.right = buildtree(values);

            return newnode;
        }
    }
    static void inorder(Node root) {
        if (root == null)
            return;
        inorder(root.left);
        System.out.print(root.data + ",");
        inorder(root.right);
    }
    static void preorder(Node root) {
        if (root == null)
            return;
        System.out.print(root.data + ",");
        preorder(root.left);
        preorder(root.right);
    }
    static void postorder(Node root) {
        if (root == null)
            return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + ",");
    }
    static List<List<Integer>> bfs(Node root){
        List<List<Integer>> lss = new ArrayList<>();
        List<Integer> ls = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()){
            Node currNode= q.remove();
            if (currNode==null){
                lss.add(ls);
                ls =new ArrayList<>();
                if (q.isEmpty())
                    break;
                else
                    q.add(null);
            }else{
//                System.out.print(currNode.data+",");
                ls.add(currNode.data);
                if (currNode.left!=null)
                    q.add(currNode.left);
                if (currNode.right!=null)
                    q.add(currNode.right);
            }
        }
        return lss;
    }
    static List<List<Integer>> level(Node root){
        List<List<Integer>> lss = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()){
            List<Integer> ls = new ArrayList<>();
            int size = q.size();
            for (int i=0;i<size;i++){
                Node currNode= q.remove();
                ls.add(currNode.data);
                if (currNode.left!=null)
                    q.add(currNode.left);
                if (currNode.right!=null)
                    q.add(currNode.right);
            }
            lss.add(ls);
        }
        return lss;
    }
    static void iterativepre(Node root){
        Stack<Node> s = new Stack<>();
        s.add(root);
        while (!s.isEmpty()){
            Node currNode = s.pop();
            System.out.print(currNode.data+",");
            if (currNode.right!=null)
                s.add(currNode.right);
            if (currNode.left!=null)
                s.add(currNode.left);
        }
    }
    static List<Integer> iterativein(Node root){
        List<Integer> ls = new ArrayList<>();
        Stack<Node> s = new Stack<>();
        Node currNode = root;
        while (true){
            if (currNode!=null){
                s.add(currNode);
                currNode=currNode.left;
            }else{
                if (s.isEmpty())
                    break;
                currNode = s.pop();
//                System.out.print(currNode.data+",");
                ls.add(currNode.data);
                currNode= currNode.right;
            }
        }
        return ls;
    }
    static void iterativepost(Node root){
        Stack<Node> s = new Stack<>();
        List<Integer> order = new ArrayList<>();
        s.add(root);
        while (!s.isEmpty()){
            Node currNode =s.pop();
            if (currNode.left!=null)
                s.add(currNode.left);
            if (currNode.right!=null)
                s.add(currNode.right);
            order.add(currNode.data);
        }
        Collections.reverse(order);
        System.out.println(order);
    }

    static int count(Node root){
        if (root == null)
            return 0;
        int left=count(root.left);
        int right=count(root.right);
        return left+right+1;
    }
    static int sum(Node root){
        if (root == null)
            return 0;
        int left=sum(root.left);
        int right=sum(root.right);
        return left+right+root.data;
    }
    static int height(Node root){
        if (root == null)
            return 0;
        int left=height(root.left);
        int right=height(root.right);
        return max(left,right)+1;
    }
    static class Treeinfo{
        int ht;
        int dia;
        Treeinfo(int ht,int dia){
            this.dia=dia;
            this.ht=ht;
        }
    }
    static Treeinfo diameter(Node root){
        if (root==null)
            return new Treeinfo(0,0);

        Treeinfo left = diameter(root.left);
        Treeinfo right = diameter(root.right);

        int height = max(left.ht,right.ht)+1;

        int d1=left.dia;
        int d2=right.dia;
        int d3=left.ht+right.ht+1;

        int diameter=max(d3,max(d1,d2));

        return new Treeinfo(height,diameter);

    }






    public static void main(String[] args) {
//        System.out.println(reverse(1534236469));
//        System.out.println(HCF(42,78 ));
//        System.out.println(HCFR(29,37 ));
//        counting(5);
//        multinames(5);
//        System.out.println(sum(5));
//        System.out.println(fact(5));
//        int[] arr={1,2,3,4,5};
//        reveserARR(arr,0);
//        System.out.println(Arrays.toString(arr));
//        System.out.println(palindromeS("midam",0));
//        System.out.println(fibbonaci(4)); //0 1 1 2 3 5 8 13 21
//        int arr[] ={1,2,2,4,5,7,8,4,36,873,373,29467,483,374,39,3,4,7,65,98,56,3};
//        hash(arr);
//        System.out.println(hasht[4]);
//        char arr[] ={'a','b','u','o','h','f','t','b','u','o','h','f','t','a','h','t','x','j'};  // char array
//        charhash("Himanshu Jawla ");
//        char c=' ';
//        System.out.println(chasht[c]);
//        int arr[]={1,4,6,2,3,9,7,2};
//        selectionSort(arr);
//        System.out.println(Arrays.toString(arr));
//        int arr1[]={1,4,6,2,3,9,7,2};
//        bubbleSort(arr1);
//        System.out.println(Arrays.toString(arr1));
//        int arr1[]={1,4,6,2,3,9,7,2};
//        insertionSort(arr1);
//        System.out.println(Arrays.toString(arr1));
//        int[] arr={3,7,5,4,6,1,0,2,4};
//        mergeSort(arr);
//        System.out.println(Arrays.toString(arr));
//        int arr[]={2,8,6,7,3,0,4,1,5,3};
//        quicksort(arr,0, arr.length-1);
//        System.out.println(Arrays.toString(arr));
//        int []arr={1,2,4,7,7,6,9,12,5};
//        System.out.println(secondLargest(arr));
//        int[] arr={1,1,2,2,2,2,3,3,4,5,6,6};
//        int len=removeduplicate(arr);
//        for (int i = 0; i < len; i++) {
//            System.out.print(arr[i]+", ");
//        }
//        int[] arr={1,2,3,4,5,6,7,8};
//        rotateNLeft(arr,2);
//        System.out.println(Arrays.toString(arr));
//        int[] arr1={1,2,3,4,5,6,7,8};
//        rotateNRight(arr1,2);
//        System.out.println(Arrays.toString(arr1));
//        int arr[] ={1,0,2,3,0,0,3,2,0,2};
//        movezero(arr);
//        System.out.println(Arrays.toString(arr));
//        int a[]={1,1,1,1,1,1,2,2};
//        int b[]={2,2,2,2,2,2,2};
//        System.out.println(union(a,b));
//        int a[]={1,3,3,3,4,7,7};
//        int b[]={2,2,5,5,6,8,9,9,10,11,12};
//        System.out.println(intersection(a,b));
//        int arr[]={1,2,3,4,5,6,8};
//        System.out.println(findmissing(arr));
//        int treeEle[] = {1, 2, 4, -1, -1, 5, 8, -1, -1, -1, 3, 6, -1, -1, 7, 9, -1, -1, 10, -1, -1};
//        int tree1[]={1,6,3,9,-1,-1,12,-1,-1,4,8,15,-1,-1,14,-1,-1,11,-1,-1,2,-1,-1,5,7,-1,-1,10,-1,-1};
//        Binarytree tree = new Binarytree();
//        Node root = tree.buildtree(tree1);
//        int tree2[]={4,8,15,-1,-1,14,-1,-1,11,-1,-1};
//        Binarytree tre2 = new Binarytree();
//        Node root2 = tre2.buildtree(tree2);

//        System.out.println(count(root));
//        System.out.println(sum(root));
//        System.out.println(height(root))
//        Treeinfo t=diameter(root);
//        System.out.println("diameter : "+t.dia+" , height is : "+t.ht);
//        Treeinfo t1=diameter(root2);
//        System.out.println("diameter : "+t1.dia+" , height is : "+t1.ht);

//        inorder(root);
//        System.out.println();
//        preorder(root);
//        System.out.println();
//        postorder(root);
//        System.out.println();
//        List<List<Integer>> ls = level(root);
//        System.out.println(ls);
//        List<Integer> ls = iterativein(root);
//        System.out.println(ls);
//        iterativepre(root);
//        System.out.println();
//        iterativepost(root);
//        Stack<Pair> st = new Stack<Pair>();
//        int[] arr={0,1};
//        System.out.println(missingNumber(arr));





    }

//    static  public int missingNumber(int[] a) {
//        int xor1=0,xor2=0;
//        for (int i = 0; i < a.length; i++) {
//            xor1=xor1^a[i];
//            xor2=xor2^i+1;
//        }
//
//        return xor1^xor2;
//    }
}
