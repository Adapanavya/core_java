package com.java.practice.polymorphism;

public class MethodOverloading {
    public int add(int a,int b){
        return a+b;
    }
    public int add(int a,int b,int c){
       return a+b+c;
    }
    public void add(int a,String b){

    }
    public void add(int a,double b){

    }

    public static void main(String[] rags){
        MethodOverloading m=new MethodOverloading();
        m.add(20,20);
        m.add(1,2,3);
        m.add(1,1.2);

    }
}
