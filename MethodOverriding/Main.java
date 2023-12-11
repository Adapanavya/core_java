package com.navya.corejava.MethodOverriding;

public class Main {
    public static void main(String[] args) {
        Parent p = new Parent();
        System.out.println(p.print());
        //

        Child c = new Child();
        System.out.println(c.print());
    }
}
