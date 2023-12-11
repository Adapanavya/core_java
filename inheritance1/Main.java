package com.navya.corejava.inheritance1;

public class Main {
    public static void main(String[] args){
        Superclass s=new Subclass();
        s.setId(1);
        s.setName("Navya");
        s.setSalary(40000);

        Subclass s1=new Subclass();
        s1.setId(2);
        s1.setName("Sai");
        s1.setSalary(50000);

    }
}
