package com.java.practice.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseArray {
    public static List<int[]> reverseAnArray(int[] array){
        List<int[]> list= Arrays.asList(array);
        Collections.reverse(list);
        return list;
    }
    public static void main(String[] args){
        int[] numArray={1,2,3,4,5};
        System.out.println(reverseAnArray(numArray));
        System.out.println(" Nagalaxmi");
        System.out.println(" ");
    }
}
