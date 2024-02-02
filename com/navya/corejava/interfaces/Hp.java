package com.java.practice.interfaces;

public class Hp implements Laptop{
    @Override
    public void read() {
        System.out.println("hiii Hp");
    }

    @Override
    public void write() {
        System.out.println("Hello Hp");

    }
}
