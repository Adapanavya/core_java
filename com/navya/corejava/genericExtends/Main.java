package com.java.practice.genericExtends;
import com.java.practice.generics.Class1;
import java.util.ArrayList;
import java.util.List;

public class Main {
    /*static <U> U doubleValue(U value){
        return value;
    }*/

    static <U extends List> void duplicateList(U list){
        list.addAll(list);
        //list.removeAll(list);
    }

    public static void main(String [] args){
        /*String value1=doubleValue(new String());
        Integer num1=(Integer.valueOf(2));
        ArrayList[] number=doubleValue(new ArrayList[4]);*/

        ArrayList<Integer> numbers=new ArrayList<>(List.of(1,2,3));
        duplicateList(numbers);
        System.out.println(numbers);

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
