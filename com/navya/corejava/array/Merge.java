package com.java.practice.array;

public class Merge {
    public static int[] mergeTwoArrays(int[] array1,int[] array2) {
        int arrays = array1.length + array2.length;
        int[] mergeArray = new int[arrays];
        for (int i = 0; i < array1.length; i++) {
            mergeArray[i] = array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            mergeArray[array1.length + i] = array2[i];
        }
        for (int element:mergeArray){
            System.out.println(element);
        }
        return mergeArray;
    }
    public static void main(String[] args){
        int[] numArray={1,3,4,5};
        int[] numArray1={5,6,7,8};
        int[] mergedArray = mergeTwoArrays(numArray, numArray1);

    }
}
