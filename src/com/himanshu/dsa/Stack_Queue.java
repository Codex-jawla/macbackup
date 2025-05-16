package com.himanshu.dsa;
import java.util.ArrayList;

class stack<t>{

    private int top=-1,size;
    private ArrayList<t> st= new ArrayList<>();
    stack(int siz){
        this.size=siz;
    }

    public void push(t data){
        if(top+1==size) {
            System.out.println("Stack overflow !!!");
        }else {
            top++;
            st.add(top,data);
            System.out.println(st.get(top)+" Pushed successfully");
        }
    }

    public void pop(){
        if(top==-1) {
            System.out.println("Stack underflow !!!");
        }else {
            System.out.println(st.get(top)+ " Popped successfully");
            st.remove(top);
            top--;
        }
    }

    public void printst(){
        System.out.println(st);
    }
}

class queue<t>{

    private int front=0,rear=0,size;
    private ArrayList<t> qe= new ArrayList<>();
    queue(int siz){
        this.size=siz;
    }

    public void enqueue(t data){
        if(rear==size) {
            System.out.println("Queue overflow !!!");
        }else {
            qe.add(rear,data);
            System.out.println(qe.get(rear)+" Pushed successfully");
            rear++;
        }
    }

    public void dequeue(){
        if(rear==-1) {
            System.out.println("Queue underflow !!!");
        }else {
            System.out.println(qe.get(front)+ " Removed successfully");
            qe.remove(front);
            rear--;
        }
    }

    public void printqe(){
        System.out.println(qe);
    }
}

public class Stack_Queue {
    public static void main(String[] args) {
        stack<Integer> st = new stack<>(5);
        st.push(2);
        st.push(4);
        st.push(6);
        st.push(8);
        st.push(10);
        st.push(12);
        st.printst();
        st.pop();
        st.pop();
        st.pop();
        st.pop();
        st.pop();
        st.pop();
        st.pop();
        queue<Integer> qe = new queue<>(5);
        qe.enqueue(2);
        qe.enqueue(4);
        qe.enqueue(6);
        qe.enqueue(8);
        qe.enqueue(10);
        qe.enqueue(12);
        qe.printqe();
        qe.dequeue();
        qe.dequeue();
        qe.dequeue();
        qe.dequeue();
        qe.dequeue();
        qe.dequeue();
        qe.dequeue();
}
}
