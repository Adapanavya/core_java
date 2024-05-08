package com.java.practice.array;

public class FindMaxArrayElement {
    public static int findMaxElement(int[] numArray){
        int max=numArray[0];
        for (Integer arrayElement:numArray){
            if (arrayElement>max) {
                max = arrayElement;
            }
        }
        return max;
    }
    public static void main(String[] args){
        int[] array={12,3,14,4,6};
        System.out.println(findMaxElement(array));
    }
}
