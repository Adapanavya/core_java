package com.java.practice.practicePrograms;

public class Strng {
    public String addName(String fName, String lName ){
        return fName.concat(lName);
    }

    public static void main(String[] args){

        Strng add=new Strng();
        String result=add.addName("Navya","Adapa");
        System.out.println(result);

    }
}
