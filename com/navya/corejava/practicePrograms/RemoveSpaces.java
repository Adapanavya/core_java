package com.java.practice.practicePrograms;

public class RemoveSpaces {
    public String SpaceRemove(String a){
        return a.strip();
    }
    public static void main(String[] args){
        RemoveSpaces r=new RemoveSpaces();
        String result=r.SpaceRemove("java  fhg");
        System.out.println(result);
    }
}
