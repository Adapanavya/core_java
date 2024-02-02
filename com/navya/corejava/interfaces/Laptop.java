package com.java.practice.interfaces;

public interface Laptop {
    public void read();
    public void write();
    default void addMethod(){
        add1();
        System.out.println("user can update the code");// 1.8 version
    }
    static void add(){
        add1();
        System.out.println("this is static keyword and it introduced in 1.8");
    }
    private static void add1(){
        System.out.println(" this is private");//1.9
    }
}
