package com.java.practice.practicePrograms;

public class StrngLength {
    public int stringLength(String a,String b,String c){
        String s=a.concat(b);
        String s1=s.concat(c);
        return s1.length();
    }

    public static void main(String[] args){
        StrngLength str=new StrngLength();
        int result=str.stringLength("navya","adapa","abc");
        System.out.println(result);


        StrngLength add=new StrngLength();
    }
}
