package com.navya.corejava.inheritance;

public class Main {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.setId(1);
        p.setName("parent");
        //

        Child c = new Child();
        c.setId(2);// as public method
        c.setName("child");
        c.setRuleNo(3);// protected
    }
}
