package com.java.practice.polymorphism.overridingWithExceptions;

import java.io.IOException;

public class SuperClass {
    public void methodName()throws Exception {
        return;
    }
    static class A extends SuperClass{
        public void methodName()throws IOException{
            return;
        }
    }
    static class B extends SuperClass{
        public void methodName(){

        }
    }
}
