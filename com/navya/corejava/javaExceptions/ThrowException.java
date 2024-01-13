package com.java.practice.javaExceptions;

public class ThrowException {
    public static void main(String[] args){
        //System.out.println(10/0);  //internally
        throw new ArithmeticException("");  //externally
    }
}
