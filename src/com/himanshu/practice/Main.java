package com.himanshu.practice;

//
//public class com.himanshu.practice.Main{
//    int n,j;
//    void getdata(int i){
//        n=i;
//        j=i;
//    }
//    void reverse(){
//        int rev=0;
//        while(n>0){
//            rev=(rev*10)+n%10;
//            n=n/10;
//        }
//        System.out.println("REVERSE of "+j+" is : "+rev);
//    }
//
//        public static void main(String[] args){
//            Scanner sc = new Scanner(System.in);
//            com.himanshu.practice.Main mn= new com.himanshu.practice.Main();
//            System.out.println("Enter no. to reverse");
//            int input= sc.nextInt();
//            mn.getdata(input);
//            mn.reverse();
//
//    }
//    }


//public class com.himanshu.practice.Main{
//    int n;
//    void getdata(int i){
//        n=i;
//    }
//    void checkPrime(){
//        int count=0;
//        for(int i=2;i<n;i++){
//            if(n%i==0){
//                count++;
//            }
//        }
//        if(count==0){
//            System.out.println(n+" is prime number");
//        }else{
//            System.out.println(n+" is not a prime number");
//        }
//    }
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        com.himanshu.practice.Main mn= new com.himanshu.practice.Main();
//        System.out.println("Enter no. to check prime");
//        int input= sc.nextInt();
//        mn.getdata(input);
//        mn.checkPrime();
//    }
//}

//public class com.himanshu.practice.Main{
//    int rollno;
//    String name;
//    static String clgname="MAIT";
//    com.himanshu.practice.Main(int a,String b){
//        rollno=a;
//        name=b;
//    }
//    void display(){
//        System.out.println("NAME : "+ name+"\nROll No. : "+rollno+"\nCOLLAGE NAME : "+clgname+"\n");
//    }
//    public static void main(String[] args){
//
//        Scanner sc = new Scanner(System.in);
//        com.himanshu.practice.Main sd1= new com.himanshu.practice.Main(11,"Himanshu Jawla");
//        com.himanshu.practice.Main sd2= new com.himanshu.practice.Main(6,"Piyush Thakur");
//        com.himanshu.practice.Main sd3= new com.himanshu.practice.Main(13,"Raj Kumar");
//        System.out.println("Student derails : ");
//        sd1.display();
//        sd2.display();
//        sd3.display();
//    }
//}



//class first{
//    int a,b;
//    void input(){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter values of a and b :");
//        a =sc.nextInt();
//        b =sc.nextInt();
//    }
//    void add(int x,int y){
//        System.out.println("Sum is : "+(x+y));
//    }
//}
//class second extends first{
//    void modulus(int x, int y){
//        System.out.println("Modulas is : "+(x%y));
//    }
//}
//class third extends second{
//void subtract(int x,int y){
//    System.out.println("Difference is : "+(x-y));
//}
//void multiply(int x,int y){
//    System.out.println("Product is : "+(x*y));
//}
//}
//public class com.himanshu.practice.Main{
//    public static void main(String[] args){
//        third bs= new third();
//        bs.input();
//        int a1= bs.a;
//        int b1= bs.b;
//        bs.add(a1,b1);
//        bs.subtract(a1,b1);
//        bs.multiply(a1,b1);
//        bs.modulus(a1,b1);
//    }
//}


//class Animal {
//    public void eat() {
//        System.out.println("The animal is eating.");
//    }
//}
//
//class Dog extends Animal {
//    public void bark() {
//        System.out.println("The dog is barking.");
//    }
//}
//
//public class com.himanshu.practice.Main {
//    public static void main(String args[]) {
//        Dog myDog = new Dog();
//        myDog.eat();
//        myDog.bark();
//    }
//}
//class stack{
//    static int top = -1;
//    static int stak[] = new int[50];
//    int siz = stak.length - 1;
//    void push(int data) {
//        if (top==siz) {
//            System.out.println("Stack overflow !!!");
//            return;
//        } else {
//            top++;
//            stak[top] = data;
//        }
//    }
//    void pop() {
//        if (top ==-1) {
//            System.out.println("Stack underflow !!!");
//            return;
//        } else {
//            top--;
//        }
//    }
//    void seek() {
//        if (top==-1) {
//            System.out.println("Stack underflow !!!");
//            return;
//        }
//        System.out.println("Top element in Stack : " + stak[top]);
//    }
//}
//public class com.himanshu.practice.Main {
//    public static void main(String[] args) {
//        stack sk=new stack();
//        sk.push(5);
//        sk.push(17);
//        sk.push(13);
//        sk.seek();
//        sk.pop();
//        sk.seek();
//        sk.push(32);
//        sk.seek();
//    }
//}

//
//class Queue{
//    static int rear = 0;
//    static int front=0;
//    static int queue[] = new int[50];
//    int siz = queue.length - 1;
//    void enqueue(int data) {
//        if (rear==siz) {
//            System.out.println("Queue overflow !!!");
//            return;
//        } else {
//            queue[rear] = data;
//            rear++;
//        }
//    }
//    void dequeue() {
//        if (front==rear) {
//            System.out.println("Queue underflow !!!");
//            return;
//        } else {
//            for (int i=0;i<rear-1;i++){
//                queue[i]=queue[i+1];
//            }
//            rear--;
//        }
//    }
//    void print() {
//        if (front==rear) {
//            System.out.println("Queue underflow !!!");
//            return;
//        }else {
//         for (int i=0;i<rear;i++){
//             System.out.print(queue[i]+", ");
//         }
//            System.out.println();
//        }
//        }
//}
//public class com.himanshu.practice.Main {
//    public static void main(String[] args) {
//        Queue q=new Queue();
//        q.enqueue(5);
//        q.enqueue(17);
//        q.enqueue(13);
//        q.print();
//        q.dequeue();
//        q.print();
//        q.enqueue(32);
//        q.print();
//    }
//}

//interface addition{
//    void add(int a,int b);
//}
//interface subtraction{
//    void diff(int a,int b);
//}
//class product{
//    void prod(int a,int b){
//        System.out.println("Product of a,b is : "+(a*b));
//    }
//}
//class exp8 extends product implements addition,subtraction{
//    public void add(int a,int b){
//        System.out.println("Sum of a,b is :"+(a+b));
//    }
//    public void diff(int a,int b){
//        System.out.println("Difference of a,b is :"+(a-b));
//    }
//}
//public class Main{
//public static void main(String[]args){
//        exp8 aa=new exp8();
//        aa.add(25,18);
//        aa.diff(18,11);
//        aa.prod(15,6);
//        }
//}

//public class Main {
//    static boolean checkpalindrome(String s){
//        int st=0,end=s.length()-1;
//        while(st<=end){
//            if(s.charAt(st)!=s.charAt(end))
//            return false;
//
//            st++;
//            end--;
//        }
//        return true;
//    }
//    public static void main(String[] args) {
//        String s=new String("HImaNshu jawla");
//        System.out.println(s.hashCode());
//        s=s+"h";
//        System.out.println(s.hashCode());
//        String a="nittrtin";
//        System.out.println(checkpalindrome(a));
//    }
//}

public class Main {

//    static int findunique(int arr[]){
//        int unique=0;
//        for(int n :arr){
//            unique^=n;
//        }
//        return unique;
//    }


//    static int rightsetbit(int num){
//        int count=0;
//        while (true){
//            count++;
//            int ans=num&1;
//            if (ans==0)
//                num=num>>1;
//            else
//                break;
//
//        }
//        return count;
//    }

//    static int findbit(int num, int i){
//        int ans=num&(1<<i-1);
//        if (ans==0)
//            return 0;
//        else
//            return 1;
//    }

//    static int candy(int[] ratings) {
//        int ans=1,a=1;
//        for(int i=1;i<ratings.length-1;i++){
//            if(ratings[i]<ratings[i+1]||ratings[i]>ratings[i-1]){
//                ans+=a+1;
//                a++;
//            }else{
//                ans++;
//                a=1;
//            }
//        }
//        if(ratings[ratings.length-1]<ratings[ratings.length-2])
//            ans++;
//        else
//            ans+=2;
//        return ans;
//    }
//    static int magicnumber(int num){
//        int magic=0,ans,i=1;
//        while(num!=0){
//            ans=num&1;
//            magic+=(int) (Math.pow(5,i)*ans);
//            num=num>>1;
//            i++;
//        }
//        return magic;
//    }

    static float sqrt(int num,int p){
        float ans=0;
        int lo=0,hi=num;
        while(lo<hi){
            int mid=lo+(hi-lo)/2;
            if (mid*mid==num)
                return mid;
            if (mid*mid>num)
                hi=mid-1;
            else {
                lo = mid + 1;
                ans = mid;
            }
        }
        double inc=0.1;
        for (int i=0;i<p;i++){
            while (ans*ans<num) {
                ans += inc;
            }
                ans-=inc;
            inc/=10;
        }
        return ans;
    }

    public static void main(String[] args) {
//        int[] arr={2,3,4,3,2,5,4,6,6};
//        System.out.println(findunique(arr));
//        System.out.println(findbit(20,4));
//        System.out.println(rightsetbit(8));
//        int arr[]={1,2,87,87,87,2,1};
//        int arr2[]={1,0,2};
//        System.out.println(candy(arr));
//        System.out.println(magicnumber(6));
        System.out.printf("%.3f",sqrt(40,3));

    }
}




