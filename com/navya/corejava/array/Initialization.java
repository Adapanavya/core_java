package com.java.practice.array;
public class Initialization {
    public static void setValues(int[] array){
        for (int i=0;i<=array.length-1;i++){
            System.out.println(array[i]);
        }
    }
    public static void main(String[] args){
        int[] set={1,24,5,4,5};
        setValues(set);
    }
}
