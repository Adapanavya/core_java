package com.java.practice.arrayList;

import java.util.ArrayList;

public class AddElement {
    public static ArrayList<Integer> addElementToAnArraylist(ArrayList<Integer> array, int addElement){
        array.add(addElement);
        return array;
    }
    public static void main(String[] args){
        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        ArrayList<Integer> addElement=addElementToAnArraylist(arrayList,8);
        System.out.println(addElement);
    }
}
