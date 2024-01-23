package com.java.practice.practicePrograms;

public class IsPositive {
    public boolean isBothPositive(int a, int b){
        return a>0 || b>0;
    }
    public static void main(String[] args){
        IsPositive i=new IsPositive();
        boolean b=i.isBothPositive(2,-43);
        System.out.println(b);
    }
}
