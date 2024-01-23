package com.java.practice.practicePrograms;

public class AscendingOrder {
    public boolean acendingOrder(int a,int b,int c){
        return a < b && b < c ;
    }
    public static void main(String[] args){
        AscendingOrder ascending=new AscendingOrder();
        boolean result=ascending.acendingOrder(2,3,4);
        System.out.println(result);
    }
}
