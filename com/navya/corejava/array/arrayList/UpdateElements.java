package com.java.practice.arrayList;

import java.util.ArrayList;

public class UpdateElements {
    public static void main(String[] args){
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("c");
        arrayList.add("java");
        arrayList.add("python");
        arrayList.add("frontend");
        arrayList.addLast("backend");
        arrayList.remove(2);
        arrayList.set(2,"reactJS");
        System.out.println(arrayList.contains("c"));
        System.out.println(arrayList);
    }
}
