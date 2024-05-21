package com.java.practice.arrayList;

import java.util.ArrayList;

public class RemoveElement {
    public static ArrayList<String > removeElementFromArrayList(ArrayList<String> array,int removeElement){
        array.remove(removeElement);
        return array;
    }
    public static void main(String[] args){
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("BITS");
        arrayList.add("JITS");
        arrayList.add("JNTU");

        ArrayList<String> remove=removeElementFromArrayList(arrayList,2);
        System.out.println(remove);
    }
}
