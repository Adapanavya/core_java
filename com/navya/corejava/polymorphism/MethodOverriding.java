package com.java.practice.polymorphism;

public class MethodOverriding {
    public void create(){
        System.out.println("hii");
    }
    static class Student extends MethodOverriding{
        public void create(){
            System.out.println("hello student");
        }
    }
    static class Teacher extends MethodOverriding{
        public void create(){
            System.out.println("hello Teacher");
        }
    }

    public static void main(String[] args){
        MethodOverriding m=new MethodOverriding.Teacher();
        MethodOverriding m1=new MethodOverriding.Student();
        MethodOverriding m2=new MethodOverriding();
        m.create();
        m1.create();
        m2.create();

    }
}
