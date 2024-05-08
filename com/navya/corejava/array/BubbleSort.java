package com.java.practice.array;

import java.util.Arrays;

public class BubbleSort {
    public static int[] sortAnArray(int[] array){
        for (int i=0;i<array.length-1;i++){
            for (int j=0;j<array.length-i-1;j++){
                if (array[j]>array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        return array;
    }
    public static void main(String[] args){
        int[] numArray={1,2,3,5,9,6,4};
        System.out.println(Arrays.toString(numArray));
        sortAnArray(numArray);
        System.out.println(Arrays.toString(numArray));
    }
}
