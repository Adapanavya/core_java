package com.java.practice.javaExceptions;

public class FinallyWithReturns {
    public static void main(String[] args){
        System.out.println(m1());
    }
    static int m1(){

        try {
            return 355;
        }
        catch (Exception e){
            return 300;
        }
        finally {
            return 200;
        }
    }
}
