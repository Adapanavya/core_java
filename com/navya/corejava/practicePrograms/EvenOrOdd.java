package com.java.practice.practicePrograms;

public class EvenOrOdd {
    public boolean evenOrOdd(int a){
        return a%2==0;
    }
    public static void main(String[] args){
        EvenOrOdd e=new EvenOrOdd();
        boolean i=e.evenOrOdd(2);
        System.out.println(i);
    }
}
