package com.navya.corejava.oops;

import com.navya.corejava.inheritance.Child;
import com.navya.corejava.inheritance.Parent;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        MethodOverloading m = new MethodOverloading();
        m.add(1,2 );
        m.add(1,2,3 );
    }
}
