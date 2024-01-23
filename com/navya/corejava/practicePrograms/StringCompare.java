package com.java.practice.practicePrograms;

public class StringCompare {
    public boolean CompareTwoStrings(String a,String b){
        return a.equalsIgnoreCase(b);

    }
    public static void main(String[] args){
        StringCompare s=new StringCompare();
        boolean result=s.CompareTwoStrings("navYa","navya");
        System.out.println(result);
    }
}
