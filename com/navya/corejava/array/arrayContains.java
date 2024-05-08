package com.java.practice.array;

import org.w3c.dom.html.HTMLAreaElement;

public class arrayContains {
    public static boolean arrayContainsGivenValueOrNot(int[] array,int targetValue) {
        for (int element : array) {
            if (element == targetValue) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        int[] numArray={1,2,3,4,5,6};
        int value=8;
        System.out.println(arrayContainsGivenValueOrNot(numArray,value));
    }
}
