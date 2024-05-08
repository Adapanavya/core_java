package com.java.practice.array;

import java.util.Arrays;

public class Split {
    public static String[] splitArray(String name,String split){
        name=name.toLowerCase();
        split=split.toLowerCase();
        String[] splitString=name.split(split);
        return splitString;

    }
    public static void main(String[] args){
        String stringName="Nagalaxmi";
        String[] result=splitArray(stringName,"M");
        System.out.println(Arrays.toString(result));
    }

}
