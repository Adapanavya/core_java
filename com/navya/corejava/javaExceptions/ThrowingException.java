package com.java.practice.javaExceptions;

import java.util.jar.Attributes;
public class ThrowingException extends Exception{
    public static void main(String[] args) {
        try {
            throw new ThrowingException();
        }
        catch (ThrowingException ex) {
            System.out.println("hello");
        }
    }
}
