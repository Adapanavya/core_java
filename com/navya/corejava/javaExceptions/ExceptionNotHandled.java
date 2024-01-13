package com.java.practice.javaExceptions;

public class ExceptionNotHandled {
    public static void main(String[] args){
        try{
            System.out.println("try");
            System.out.println(10/0);
        }
        catch (NullPointerException e) //Exception is not matched
        {
            System.out.println("catch");
        }
        finally {
            System.out.println("finally");
        }

    }
}
