package com.java.practice.generic1;

import static com.java.practice.generic1.Student.*;

public class Main {
    public static void main(String [] args){
        Student<String,Integer> studentName=new Student<>("navya",1);
        //String str=studentName.getName();
        Student.printData(studentName);
        System.out.println(str);
    }
}
