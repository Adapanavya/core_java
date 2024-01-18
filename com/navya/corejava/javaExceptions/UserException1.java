package com.java.practice.javaExceptions;

import jdk.jfr.StackTrace;

import static com.java.practice.javaExceptions.Throw.e;

class UserException1 extends Exception {
    public UserException1(String str) {
        super(str);
    }
    static class CustomExceptionExample {

        public static void main(String[] args) {
            try {
                throw new UserException1("this is a customException");
            } catch (UserException1 u) {
                System.out.println("catch:"+u.getMessage());
            }
        }
    }
}
