package com.java.practice.javaExceptions;

import javax.swing.text.Style;

public class DefaultException2 {
    public static void main(String args[]){
        method1();
        System.out.println(10/0);
    }
    public static void method1(){
        method2();
        System.out.println("hello");
    }
    public static void method2(){
        System.out.println("Hiiii");
    }
}
