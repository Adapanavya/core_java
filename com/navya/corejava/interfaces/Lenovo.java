package com.java.practice.interfaces;

public class Lenovo implements Laptop{
    @Override
    public void read() {
        System.out.println("hii lenovo");
    }

    @Override
    public void write() {
        System.out.println("hello lenovo ");

    }
    public void add(){
        System.out.println("you can update here");
    }
}