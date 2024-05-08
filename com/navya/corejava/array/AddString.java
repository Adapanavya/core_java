package com.java.practice.array;

public class AddString {
    public String stringOperations(String fName,String mName,String lName){
        String rp=fName.concat(mName);
        String rp1=rp.concat(lName);
        return rp1.replace("java","c");
    }
    public static void main(String[] args){
        AddString a=new AddString();
        String result=a.stringOperations("java","is my","favorate lang");
        System.out.println(result);
    }
}
