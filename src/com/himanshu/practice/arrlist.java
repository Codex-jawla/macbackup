package com.himanshu.practice;

import java.util.Arrays;

class arraylist<t>{
    private Object[] arlist;
    private int defaultSize=10;
    private int size=0;

    arraylist() {
        arlist = new Object[defaultSize];
    }

    public boolean isEmpty(){
        if (size==defaultSize)
            return true;

        return false;
    }
    private void doublelist(){
        Object temp[]= new Object[arlist.length*2];
        for (int i=0;i< arlist.length;i++){
            temp[i]=arlist[i];
        }
        arlist=temp;
    }

    public void add(t value){
        if (isEmpty()){
            doublelist();
        }
        arlist[size++]=value;
    }

    public void remove(int idx){
        if (isEmpty()){
            System.out.println("List is empty !! ");
        }
        for (int i=idx;i<size;i++){
            arlist[i]=arlist[i+1];
        }
        size--;
    }
    public void set(int idx ,t value){
        arlist[idx]=value;
    }
    public Object get(int idx){
        return arlist[idx];
    }
    public int size(){
        return size;
    }

    @Override
    public String toString() {
        return "arlist=" + Arrays.toString(arlist);
    }
}
public class arrlist {
    public static void main(String[] args) {
        arraylist<Integer> li  =new arraylist<>();
        li.add(10);
        li.add(15);
        li.add(20);
        li.add(25);
        li.add(30);
        li.add(35);
        li.add(40);
        li.add(45);
        li.add(50);
        li.add(55);
        li.add(60);
        li.add(65);
        li.add(70);
        System.out.println(li);
        li.remove(4);
        li.remove(11);
        System.out.println(li);
        System.out.println(li.get(5));
        System.out.println(li.size());
        li.set(8,54);
        System.out.println(li);

    }
}
