package com.himanshu.dsa;

import java.util.Scanner;

public class LL {
    private Node head;
    private Node tail;
    private int size;

    LL() {
        this.size = 0;
    }

    static class Node {
        private Node next;
        private int data;

        Node(int data) {
            this.data = data;
        }
    }
    public  Node reverseList(Node head) {
        Node pre =null;
        Node curr = head;
        while(curr!=null){
            Node next = curr.next;
            curr.next =pre;
            pre=curr;
            curr=next;
        }
        return pre;
    }
    public static Node mergeInBetween(Node list1, int a, int b, Node list2) {
        int count=0;
        Node t1=list1;
        Node t2=list1;
        while(t1!=null){
            count++;
            if(count==a){
                t2=t1;
                if(a==b)
                    t1=t1.next;
                else
                    t1=t1.next.next;
                t2.next=list2;
                while(t2.next!=null){
                    t2=t2.next;
                }
                continue;
            }
            if(a==b&&count==a){
                a--;
                count--;
            }

            if(count==b){
                t2.next=t1.next;
                t2=t2.next;
                t1=t2;
                break;

            }
            t1=t1.next;
        }
        return list1;
    }

    public static Node rotateRight(Node head, int k) {
        if(head==null||head.next==null||k==0)
            return head;
        Node temp=head;
        Node tail;
        int count=1;
        while(temp.next!=null){
            count++;
            temp=temp.next;
        }
        tail=temp;
        temp=head;
        if(k<count)
            count=count-k-1;
        else{
             count=k%count;
        }
        while(count>0){
            temp=temp.next;
            count--;
        }
        tail.next=head;
        head=temp.next;
        temp.next=null;

        return head;
    }
    
    public  boolean isPalindrome(Node head) {
        if(head.next==null)
            return true;
        long num1=0;
        Node temp=head;
        num1+=temp.data;
        temp=temp.next;
        while(temp!=null){
            num1*=10;
            num1+=temp.data;
            temp=temp.next;
        }
        temp=reverseList(head);
        long num2=0;
        num2+=temp.data;
        temp=temp.next;
        while(temp!=null){
            num2*=10;
            num2+=temp.data;
            temp=temp.next;
        }
        if(num1==num2)
            return true;
        else
            return false;
    }
    public Node headrt(){
        return head;
    }

    public void insertFront(int data) {
        Node nd = new Node(data);
        if (head != null)
            nd.next = head;
        head = nd;
        if (tail == null)
            tail = head;
        size++;
    }

    public void reversell(){
        if (size<=1)
            return;
        if (size==2){
            head.next.next=head;
            head.next=null;
            return;
        }
        Node pre = head;
        Node curr = head.next;
        Node nxt = curr.next;

        do {
            curr.next=pre;
            pre=curr;
            curr=nxt;
            nxt=nxt.next;
        }while (nxt!=null);

        curr.next=pre;
        pre=curr;
        tail=head;
        head.next=null;
        head=pre;
    }

    public void deleteFront() {
        head = head.next;
        if (head == null)
            tail = null;
        size--;
    }

    public void insertBetween(int data, int pos) {
        Node nd = new Node(data);
        Node temp = head;
        int i = 1;
        while (i < pos - 1) {
            temp = temp.next;
            i++;
        }
        nd.next = temp.next;
        temp.next = nd;
        size++;
    }

    public void deleteBetween(int pos) {
        Node temp = head;
        int i = 1;
        while (i < pos - 1) {
            temp = temp.next;
            i++;
        }
        Node temp2 = temp.next;
        temp.next = temp.next.next;
        temp2 = null;
        size--;
    }

    public void insertEnd(int data) {
        Node nd = new Node(data);
        tail.next = nd;
        tail = nd;
        size++;
    }

    public void deleteEnd() {
        Node temp = head;
        while (temp.next != tail) {
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
        size--;
    }

    public void add(int data) {
        if (tail == null)
            insertFront(data);
        else
            insertEnd(data);
    }

    public void remove() {
        deleteEnd();
    }

    public void add(int data, int pos) {
        if (pos == 1) {
            insertFront(data);
        } else if (pos == size + 1) {
            insertEnd(data);
        } else {
            insertBetween(data, pos);
        }
    }

    public void remove(int pos) {
        if (pos == 1) {
            deleteFront();
        } else if (pos == size + 1) {
            deleteEnd();
        } else {
            deleteBetween(pos);
        }
    }

    public void update(int newdata, int pos) {
        Node temp = head;
        int i = 1;
        while (i < pos) {
            temp = temp.next;
            i++;
        }
        temp.data = newdata;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public void findAndDeleteLastNth(int n){
        Node temp =head;
        int i = size-n-1;
        int j=0;
        while(j<i){
            temp=temp.next;
        }
    }

    public void Size() {
        System.out.println(size);
    }

    }

    class DLL {
        private NodeD head;
        private NodeD tail;
        private int size;

        DLL() {
            this.size = 0;
        }

        static class NodeD {
            private NodeD next;
            private NodeD pre;
            private int data;

            NodeD(int data) {
                this.data = data;
            }
        }

        public void insertFront(int data) {
            NodeD nd = new NodeD(data);
            if (head != null) {
                nd.next = head;
                head.pre = nd;
            }
            head = nd;
            if (tail == null)
                tail = head;
            size++;
        }

        public void deleteFront() {
            head = head.next;
            head.pre = null;
            if (head == null)
                tail = null;
            size--;
        }

        public void insertBetween(int data, int pos) {
            NodeD nd = new NodeD(data);
            NodeD temp = head;
            int i = 1;
            while (i < pos) {
                temp = temp.next;
                i++;
            }
            temp.pre.next = nd;
            nd.next = temp;
            nd.pre = temp.pre;
            temp.pre = nd;
            size++;
        }

        public void deleteBetween(int pos) {
            NodeD temp = head;
            int i = 1;
            while (i < pos) {
                temp = temp.next;
                i++;
            }
            temp.pre.next = temp.next;
            temp.next.pre = temp.pre;
            size--;
        }

        public void insertEnd(int data) {
            NodeD nd = new NodeD(data);
            tail.next = nd;
            nd.pre = tail;
            tail = nd;
            size++;
        }

        public void deleteEnd() {

            tail = tail.pre;
            tail.next = null;
            size--;
        }

        public void add(int data) {
            if (tail == null)
                insertFront(data);
            else
                insertEnd(data);
        }

        public void remove() {
            deleteEnd();
        }

        public void add(int data, int pos) {
            if (pos == 1) {
                insertFront(data);
            } else if (pos == size + 1) {
                insertEnd(data);
            } else {
                insertBetween(data, pos);
            }
        }

        public void remove(int pos) {
            if (pos == 1) {
                deleteFront();
            } else if (pos == size + 1) {
                deleteEnd();
            } else {
                deleteBetween(pos);
            }
        }

        public void update(int newdata, int pos) {
            NodeD temp = head;
            int i = 1;
            while (i < pos) {
                temp = temp.next;
                i++;
            }
            temp.data = newdata;
        }

        public void print() {
            NodeD temp = head;
            while (temp != null) {
                System.out.print(temp.data + " <--> ");
                temp = temp.next;
            }
            System.out.println("NULL");
        }

        public void Size() {
            System.out.println(size);
        }
    }

    class CLL {
        private NodeC head;
        private NodeC tail;
        private int size;

        CLL() {
            this.size = 0;
        }

        static class NodeC {
            private NodeC next;
            private int data;

            NodeC(int data) {
                this.data = data;
            }
        }

        public void insertFront(int data) {
            NodeC nd = new NodeC(data);
            if (head == null) {
                head = tail = nd;
                nd.next = nd;
                return;
            }

            tail.next = nd;
            nd.next = head;
            head = nd;
            size++;
        }

        public void deleteFront() {
            tail.next = head.next;
            head = tail.next;
            size--;
        }

        public void insertBetween(int data, int pos) {
            NodeC nd = new NodeC(data);
            NodeC temp = head;
            int i = 1;
            while (i < pos - 1) {
                temp = temp.next;
                i++;
            }
            nd.next = temp.next;
            temp.next = nd;
            size++;
        }

        public void deleteBetween(int pos) {
            NodeC temp = head;
            int i = 1;
            while (i < pos - 1) {
                temp = temp.next;
                i++;
            }
            temp.next = temp.next.next;
            size--;
        }

        public void insertEnd(int data) {
            NodeC nd = new NodeC(data);
            tail.next = nd;
            nd.next = head;
            tail = nd;
            size++;
        }

        public void deleteEnd() {
            NodeC temp = head;
            while (temp.next != tail) {
                temp = temp.next;

            }
            temp.next = head;
            temp = tail;
            size--;
        }

        public void print() {
            NodeC temp = head;
            while (temp != tail) {
                System.out.print(temp.data + " --> ");
                temp = temp.next;
            }
            System.out.println(head.data);
        }

        public void add(int data) {
            if (tail == null)
                insertFront(data);
            else
                insertEnd(data);
        }

        public void remove() {
            deleteEnd();
        }

        public void add(int data, int pos) {
            if (pos == 1) {
                insertFront(data);
            } else if (pos == size + 1) {
                insertEnd(data);
            } else {
                insertBetween(data, pos);
            }
        }

        public void remove(int pos) {
            if (pos == 1) {
                deleteFront();
            } else if (pos == size + 1) {
                deleteEnd();
            } else {
                deleteBetween(pos);
            }
        }

        public void update(int newdata, int pos) {
            NodeC temp = head;
            int i = 1;
            while (i < pos) {
                temp = temp.next;
                i++;
            }
            temp.data = newdata;
        }

        public void Size() {
            System.out.println(size);
        }


    }

