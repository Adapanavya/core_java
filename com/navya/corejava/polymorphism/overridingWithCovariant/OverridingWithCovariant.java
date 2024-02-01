package com.java.practice.polymorphism.overridingWithCovariant;

public class OverridingWithCovariant {
    public Object methodName(){
        return "hii ";
    }
    static class C extends OverridingWithCovariant{
        public String methodName(){
            return "hello";
        }
    }
}
