package com.java.practice.genericExample;

import com.java.practice.genericExample.Generic;

public class GenericMain {
    public static void main(String[] args){
        Generic<String> str=new Generic<>("navya");
        String get=str.getName();
        System.out.println(get);


    }

}
