package com.java.practice.array;

public class Average {
    public static double findAverageOfArrayElements(int[] numArray){
        int sum=0;
        for (Integer elements:numArray){
            sum=sum+elements;
            double numbers=(double)sum/numArray.length;
        }
        double numbers=(double)sum/numArray.length;
        return numbers;
    }
    public static void main(String[] args){
        int[] array={2,4,6,8,10};
        System.out.println(findAverageOfArrayElements(array));
    }
}
