package com.java.practice.array;

public class BinarySearch {
    public static int binarySearch(int[] array,int numToFind){
        int start=0;
        int end=array.length-1;

        while (start<=end) {
        int middlePosition=start+end/2;
        int middleNumber=array[middlePosition];

        if (numToFind==middleNumber){
            return middlePosition;
        }
        if (numToFind<middleNumber){
            end= middlePosition-1;
        }else {
            start=middlePosition+1;
        }
        }
        return 0;
    }
    public static void main(String[] args){
        int[] numArray={1,2,3,4,5,6,7,8,9};
        System.out.println(binarySearch(numArray,4));
    }
}