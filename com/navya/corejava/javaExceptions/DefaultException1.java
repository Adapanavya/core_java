package com.java.practice.javaExceptions;

import static com.java.practice.javaExceptions.DefaultException.method2;

public class DefaultException1 {
    public static void main(String args[]){
        method1();
    }

    private static void method1() {
        method2();
        System.out.println(10/0);
    }

    private static void method2() {
        System.out.println("HELLO");
    }
}
