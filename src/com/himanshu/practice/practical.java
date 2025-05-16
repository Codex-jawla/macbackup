import javax.swing.*;
import java.util.*;
//public class practical implements EventListener{
//
//    public static void main(String[] args) {
//       Scanner sc=new Scanner(System.in);
//}
//}
//
//import java.util.concurrent.ExecutorService;
//import java.util.concurrent.Executors;
//
//class Customer implements Runnable {
//    private final String name;
//
//    public Customer(String name) {
//        this.name = name;
//    }
//
//    public void run() {
//        System.out.println(name + " is placing an order.");
//        try {
//            Thread.sleep(10000);  // Simulating time taken to place an order
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println(name + "'s order is ready.");
//    }
//}
//
//public class practical {
//    public static void main(String[] args) {
//        ExecutorService executor = Executors.newFixedThreadPool(3);  // Create a thread pool with 3 baristas
//
//        // Create multiple customers
//        Customer customer1 = new Customer("JAAT SHAB");
//        Customer customer2 = new Customer("Alice");
//        Customer customer3 = new Customer("Bob");
//
//        // Submit customer orders to the thread pool for processing
//        executor.submit(customer1);
//        executor.submit(customer2);
//        executor.submit(customer3);
//
//        // Shutdown the executor
//        executor.shutdown();
//    }
//}




//reverse number
/*
System.out.print("Enter Number to Reverse : ");
        int a=sc.nextInt();
        int res=0;
        while (a>0){
            res= (res*10)+ a%10;
            a=a/10;
        }
        System.out.println("Number after reverse : "+res);
*/

//Sum of digits of number
/*
System.out.print("Enter Number to sum of its digits : ");
        int a=sc.nextInt();
        int res=0;
        while (a>0){
            res= res+ a%10;
            a=a/10;
        }
        System.out.println("Sum of entered number : "+res);
*/

//Sum of even and product of odd digits of a number
/*
System.out.print("Enter Number : ");
        int a=sc.nextInt();
        int res=0,SEven=0,POdd=1;
        while (a>0){
            res=a%10;
            if ((res%2)==0){
                SEven +=res;
            }else{
                POdd *=res;
            }
            a=a/10;
        }
        System.out.println("Sum of Even : "+SEven +" Product of Odd : "+POdd);
 */

//Check palindrome
/*
System.out.print("Enter Number to check palindrome : ");
        int a=sc.nextInt();
        int pal=a;
        int res=0;
        while (a>0){
            res= (res*10)+ a%10;
            a=a/10;
        }
        if (pal==res) {
            System.out.println("Entered number is palindrome");
        }else{
            System.out.println("Entered number is not palindrome");
        }
 */

//prime check
/*
  System.out.println("Enter number to check prime : ");
        int n= sc.nextInt();
        int count=0,i=2;
        while(i<n) {
            if (n % i == 0) {
                count += 1;
            }
            i++;
        }
        if (count==0){
            System.out.println("Entered number is prime");
        }else {
            System.out.println("Entered number is not prime");
        }
 */

//Prime b/w 1 to 100
/*
System.out.println("Prime b/w 1 to 100 : ");
        for (int i=1;i<100;i++){
        int count=0;
            for (int j=1;j<i;j++){
            if (i % j == 0) {
                count += 1;
            }

            }
        if (count==1){
            System.out.print(i+", ");
        }
        }
 */


//Armstrong number
/*
int count=0;
        System.out.print("Enter number to check armstrong number : ");
        int num = sc.nextInt();
        int numc=num;
        while (numc>0){
            count++;
            numc/=10;
        }
        numc=num;
        int res=0,result=0;
       while (numc>0){
           res=numc%10;
           result += (int) pow(res,count);
           numc/=10;
       }
       if (result==num){
           System.out.println("Number is armstrong ");
       }else {
           System.out.println("Not armstrong");
       }
 */

// Fibonacci series

/*
System.out.print("Enter number till fibonacci series printed : ");
        int n= sc.nextInt();
        int ft=0,st=1,tt;
        System.out.print(ft+" ,"+st);
        for (int i=2;i<n;i++){
            tt=ft+st;
            System.out.print(" ,"+tt);
            ft=st;
            st=tt;
        }
 */

//Down right angle pattern
/*
int n=5;
        for (int i=n;i>0;i--){
            for (int j=i;j>0;j--){
                System.out.print("Content to be printed");
            }
            System.out.println("");
        }
 */

//Right angle pattern
/*
int n=5;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print("Content to be printed");
            }
            System.out.println("");
        }
 */

//Pyramid pattern
/*
 int n=5;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int k=1;k<=(2*i-1);k++){
                System.out.print("*");
            }
            System.out.println("");
        }
 */

//Down Pyramid pattern
/*
 int n=5;
        for (int i=n;i>0;i--){
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int k=1;k<=(2*i-1);k++){
                System.out.print("*");
            }
            System.out.println("");
        }
 */