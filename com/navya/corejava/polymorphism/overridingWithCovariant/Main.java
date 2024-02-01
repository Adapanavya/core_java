package com.java.practice.polymorphism.overridingWithCovariant;

import com.java.practice.polymorphism.overridingWithCovariant.OverridingWithCovariant;

public class Main {
    public static void main(String[] args){
        OverridingWithCovariant print=new OverridingWithCovariant();
        //OverridingWithCovariant print1=new OverridingWithCovariant.C();
        System.out.println(print.methodName());
    }
}
