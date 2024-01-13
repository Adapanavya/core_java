package com.java.practice.javaExceptions;

public class IfNoException {
    public static void main(String[] args){
        try{
            System.out.println(10/2);
            //System.out.println(10/0);
            //System.exit(0);
        }
        catch (ArithmeticException e){
            System.out.println("catch");
        }
        finally {
            System.out.println("finally");
        }
    }
}
