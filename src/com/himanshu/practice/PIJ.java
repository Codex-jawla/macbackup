package com.himanshu.practice;

import java.util.HashSet;
import java.util.Set;

class student {
    private int roll;
    private String name;
    private float marks;
   static int no_of_student;
    student(int rl,String nm,float mks){
        this.roll=rl;
        this.name=nm;
        this.marks=mks;
        student.no_of_student += 1 ;
    }
}
public class PIJ {
    public static void main(String[] args) {
        Set<Integer> t =new HashSet<>();
        t.add(7);
        t.add(10);
//        System.out.println(t);
        t.remove(27);
//        System.out.println(t);
        student Kanishq =new student(1,"Kanishq ",80.2f);
        student Aditya =new student(2,"Aditya ",84.5f);
        student Tushar =new student(4,"Tushar ",82.4f);
        student Khalid =new student(5,"Khalid ",72.6f);
        student Piyush =new student(6,"Piyush ",80.8f);
        student Hardik =new student(7,"Hardik ",76.6f);
        student Manish =new student(8,"Manish ",85.5f);
        student Dhruv =new student(9,"Dhurv ",73.9f);
        student Sandeep =new student(10,"Sandeep ",88.3f);
        student himanshu =new student(11,"Himanshu Jawla",70.2f);
        student Harsh =new student(12,"Harsh ",95.7f);
        student Raj =new student(13,"Raj ",74.1f);

//        System.out.println(student.no_of_student);

        int[][] ar2d={
                {1,3,5},
                {2,4,6},
                {1,2,3,4,5,6}
                };

        for (int i=0;i< ar2d.length;i++){
            for (int j=0;j< ar2d[i].length;j++){
                if(ar2d[i][j]==6)
                    break;
                System.out.print(ar2d[i][j]+", ");
            }
            System.out.println();
        }


    }
}
