package com.java.practice.javaExceptions;

public class DefaultException {
    public static void main(String args[]){
        method1();
    }

    private static void method1() {
        method2();
    }

    static void method2() {
        System.out.println(10/0);
    }
}
