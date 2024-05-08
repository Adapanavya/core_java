package com.java.practice.array;

import java.util.ArrayList;
import java.util.List;

public class ArrayToList {
    public static List<Integer> convertArrayToArrayList(int[] array){
        ArrayList<Integer> arrayList=new ArrayList<>();
        for (Integer element:array){
            arrayList.add(element);
        }
        return arrayList;
    }
    public static void main(String[] args){
        int[] numArray={1,2,3,4,45,5};
        List<Integer> list=convertArrayToArrayList(numArray);
        System.out.println(list);
    }
}
