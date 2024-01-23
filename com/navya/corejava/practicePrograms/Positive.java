package com.java.practice.practicePrograms;

public class Positive {
    public boolean isPositive(int a){
        return a>0;
    }
    public static void main(String[] args){
        Positive p=new Positive();
        boolean b=p.isPositive(4);
        System.out.println(b);
    }
}
