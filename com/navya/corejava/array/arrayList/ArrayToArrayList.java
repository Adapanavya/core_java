package com.java.practice.arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToArrayList {
    public static ArrayList<Integer> convertArrayToArrayList(int[] array){
        ArrayList<Integer> arrayList=new ArrayList<>();
        for (Integer element:array){
            arrayList.add(element);
        }

        return arrayList;
    }
    public static void main(String[] args){
        int[] numArray={1,3,2,4,5};
        ArrayList<Integer> arrayList=convertArrayToArrayList(numArray);
        System.out.println(arrayList);
    }
}
