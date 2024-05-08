package com.java.practice.array;

import java.util.Arrays;

public class Split2Parts {
    public static int[] splitAnArrayIntoTwoParts(int[] array,int split){
        int[] index=new int[array.length];
        for (int i=0;i<split;i++){
            index[i]=array[i];
        }
        for (int i=split;i<array.length;i++){
            index[i]=array[i];
        }

        return index;
    }
    public static void main(String[] args){
        int[] numArray={1,2,3,4,5,6,7,8,9};
        int[] splitAry=splitAnArrayIntoTwoParts(numArray,2);
        System.out.println(Arrays.toString(Arrays.copyOfRange(numArray, 1, 4)));
        System.out.println(Arrays.toString(Arrays.copyOfRange(numArray, 2, numArray.length)));
    }
}
