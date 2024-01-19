package com.java.practice.generics;

public class Main {
    public static void main(String [] args){
        Class1<String> list=new Class1<>();
        list.addElement("navya");
        list.delElement("adapa");
        String value=list.get(0);
        System.out.println(value);

        Class1<Integer> list2=new Class1<>();
        list2.addElement(Integer.valueOf(2));
        list2.delElement(Integer.valueOf(4));
        Integer num=list2.get(1);
        System.out.println(num);
    }

}
