package com.navya.corejava.MethodOverriding;

public class Child extends Parent {

   // method override parent class method name and args should be equal to child calss
    @Override
    public String print(){
        return "child print";
    }
}
