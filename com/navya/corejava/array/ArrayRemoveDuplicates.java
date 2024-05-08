package com.java.practice.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayRemoveDuplicates {

    private static List<Integer> removeDuplicateMoreThanTwo(List<Integer> inputArray) {
        List<Integer> outputArray = new ArrayList<>();
        for (Integer inputElement : inputArray) {
            if (Collections.frequency(outputArray, inputElement) >= 1) {
                continue;
            } else {
                outputArray.add(inputElement);
            }
        }
        return outputArray;
    }

    public static void main(String[] args) {
        List<Integer> inputElements = Arrays.asList(2, 2, 2, 3, 4, 4, 4, 4, 5, 5);
        System.out.println(removeDuplicateMoreThanTwo(inputElements));

    }
}
