package com.java.practice.array;

import java.util.ArrayList;
import java.util.List;

public class CommonElements {
    public static List<Integer> findCommonElement(int[] array1,int[] array2){
       List<Integer> arrayList=new ArrayList<>();
        for (Integer element:array1){
            arrayList.add(element);
        }
        List<Integer> arrayList1=new ArrayList<>();
        for (Integer element:array2){
            arrayList1.add(element);
        }
        List<Integer> commonElement=new ArrayList<>();
        for (Integer element:array1){
            if (arrayList1.contains(element)){
                commonElement.add(element);
            }
        }
        return commonElement;
    }
    public static void main(String[] args){
        int[] numArray1={1,2,3};
        int[] numArray2={1,3,5,2,4,6};
        System.out.println(findCommonElement(numArray1,numArray2));
    }
}
