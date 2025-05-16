package com.himanshu.dsa;

import java.util.Scanner;

import static com.himanshu.dsa.LL.mergeInBetween;
import static com.himanshu.dsa.LL.rotateRight;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        System.out.println("Select Linked List type -- ");
//        System.out.println("Press 1 for singly or 2 for doubly or 3 for circular ");
//        int a=sc.nextInt();
//        int a=1;
//        if (a==1){
        LL list1=new LL();

        list1.add(0);
        list1.add(1);
        list1.add(2);
        list1.print();
//        LL list=new LL();
//        list.add(10000);
//        list.add(10001);
//        list.add(10002);
//        list.add(10003);
//        list.print();
        rotateRight(list1.headrt(),4);
        list1.print();

//    mergeInBetween(list1.headrt(),a,b,list.headrt());

//        list1.add(5);
//        list1.add(7);
//        list1.add(5);
//        list1.add(3);
//        list1.add(8);
//        list1.add(9);
//        list1.add(0);
//        list1.add(6);
//        list1.add(5);
//        list1.add(9);
//        list1.add(6);
//        list1.add(9);
//        list1.add(2);
//        list1.add(1);
//        list1.add(3);
//        list1.add(0);
//        list1.add(8);
//        list1.add(8);
//        list1.add(4);
//        list1.add(8);
//        list1.add(9);
//        list1.add(0);
//        list1.add(3);
//        list1.add(5);
//        list1.add(6);
//        list1.add(8);
//        list1.add(9);
//        list1.add(0);
//        list1.add(1);
//        list1.add(0);
//        list1.add(9);
//        list1.add(8);
//        list1.add(6);
//        list1.add(5);
//        list1.add(3);
//        list1.add(0);
//        list1.add(9);
//        list1.add(8);
//        list1.add(4);
//        list1.add(8);
//        list1.add(8);
//        list1.add(0);
//        list1.add(3);
//        list1.add(1);
//        list1.add(2);
//        list1.add(9);
//        list1.add(6);
//        list1.add(9);
//        list1.add(5);
//        list1.add(6);
//        list1.add(0);
//        list1.add(9);
//        list1.add(8);
//        list1.add(3);
//        list1.add(5);
//        list1.add(7);
//        list1.add(5);
//        list1.add(1);
//        list1.add(2);
//        list1.add(2);
//        list1.add(1);
//        LL.Node head = list1.headrt();
//            System.out.println(list1.isPalindrome(head));
//        int i=1;
//        do {
//            System.out.println("Enter choice");
//            System.out.println("For sequential data 'addition' press 1");
//            System.out.println("For specific position data 'addition' press 2");
//            System.out.println("For sequential data 'deletion' press 3");
//            System.out.println("For specific position data 'deletion' press 4");
//            System.out.println("For data 'Updation' press 5");
//            System.out.println("To print linkedlist press 6");
//            System.out.println("To print size of Linkedlist press 7");
//            System.out.println("To reverse linked List press 8");
//            System.out.println("To exit press 0");
//            int ans= sc.nextInt();
//            int data,pos;
//            i=ans;
//            switch (i){
//                case 1:
//                    System.out.println("Enter data to add : ");
//                    data=sc.nextInt();
//                    list1.add(data);
//                    break;
//                case 2:
//                    System.out.println("Enter data and position to add : ");
//                    data=sc.nextInt();
//                    pos=sc.nextInt();
//                    list1.add(data,pos);
//                    break;
//                case 3:
//                    list1.remove();
//                    break;
//                case 4:
//                    System.out.println("Enter position to delete data : ");
//                    pos=sc.nextInt();
//                    list1.remove(pos);
//                    break;
//                case 5:
//                    System.out.println("Enter new data value and position to update : ");
//                    data=sc.nextInt();
//                    pos=sc.nextInt();
//                    list1.update(data,pos);
//                    break;
//                case 6:
//                    list1.print();
//                    break;
//                case 7:
//                    list1.Size();
//                    break;
//                case 8:
//                    list1.reversell();
//                    break;
//                case 0:
//                    break;
//                default:
//                    System.out.println("Invalid input");
//                    System.out.println("Invalid input");
//                    break;
//            }
//        }while(i!=0);
//    } else if (a==2) {
//            DLL list1=new DLL();
//            list1.add(1);
//            list1.add(2);
//            list1.add(3);
//            list1.add(33);
//            list1.add(6);
//            int i=1;
//            do {
//                System.out.println("Enter choice");
//                System.out.println("For sequential data 'addition' press 1");
//                System.out.println("For specific position data 'addition' press 2");
//                System.out.println("For sequential data 'deletion' press 3");
//                System.out.println("For specific position data 'deletion' press 4");
//                System.out.println("For data 'Updation' press 5");
//                System.out.println("To print linkedlist press 6");
//                System.out.println("To print size of Linkedlist press 7");
//                System.out.println("To exit press 0");
//                int ans= sc.nextInt();
//                int data,pos;
//                i=ans;
//                switch (i){
//                    case 1:
//                        System.out.println("Enter data to add : ");
//                        data=sc.nextInt();
//                        list1.add(data);
//                        break;
//                    case 2:
//                        System.out.println("Enter data and position to add : ");
//                        data=sc.nextInt();
//                        pos=sc.nextInt();
//                        list1.add(data,pos);
//                        break;
//                    case 3:
//                        list1.remove();
//                        break;
//                    case 4:
//                        System.out.println("Enter position to delete data : ");
//                        pos=sc.nextInt();
//                        list1.remove(pos);
//                        break;
//                    case 5:
//                        System.out.println("Enter new data value and position to update : ");
//                        data=sc.nextInt();
//                        pos=sc.nextInt();
//                        list1.update(data,pos);
//                        break;
//                    case 6:
//                        list1.print();
//                        break;
//                    case 7:
//                        list1.Size();
//                        break;
//                    case 0:
//                        break;
//                    default:
//                        System.out.println("Invalid input");
//                        System.out.println("Invalid input");
//                        break;
//                }
//            }while(i!=0);
//        } else if (a==3) {
//            CLL list1=new CLL();
//            list1.add(1);
//            list1.add(2);
//            list1.add(3);
//            list1.add(33);
//            list1.add(6);
//            int i=1;
//            do {
//                System.out.println("Enter choice");
//                System.out.println("For sequential data 'addition' press 1");
//                System.out.println("For specific position data 'addition' press 2");
//                System.out.println("For sequential data 'deletion' press 3");
//                System.out.println("For specific position data 'deletion' press 4");
//                System.out.println("For data 'Updation' press 5");
//                System.out.println("To print linkedlist press 6");
//                System.out.println("To print size of Linkedlist press 7");
//                System.out.println("To exit press 0");
//                int ans= sc.nextInt();
//                int data,pos;
//                i=ans;
//                switch (i){
//                    case 1:
//                        System.out.println("Enter data to add : ");
//                        data=sc.nextInt();
//                        list1.add(data);
//                        break;
//                    case 2:
//                        System.out.println("Enter data and position to add : ");
//                        data=sc.nextInt();
//                        pos=sc.nextInt();
//                        list1.add(data,pos);
//                        break;
//                    case 3:
//                        list1.remove();
//                        break;
//                    case 4:
//                        System.out.println("Enter position to delete data : ");
//                        pos=sc.nextInt();
//                        list1.remove(pos);
//                        break;
//                    case 5:
//                        System.out.println("Enter new data value and position to update : ");
//                        data=sc.nextInt();
//                        pos=sc.nextInt();
//                        list1.update(data,pos);
//                        break;
//                    case 6:
//                        list1.print();
//                        break;
//                    case 7:
//                        list1.Size();
//                        break;
//                    case 0:
//                        break;
//                    default:
//                        System.out.println("Invalid input");
//                        System.out.println("Invalid input");
//                        break;
//                }
//            }while(i!=0);
//        } else {
//            System.out.println("Invalid input !");
//        }
    }

}