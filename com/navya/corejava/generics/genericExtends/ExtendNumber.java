package com.java.practice.genericExtends;

import java.util.ArrayList;

public class ExtendNumber<T extends Number>{
    ArrayList<T> list=new ArrayList<>();
    public void addElement(T name1){
        list.add(name1);
    }
    public void delElement(T name2){
        list.add(name2);
    }
    @Override
    public String toString() {
        return list.toString();
    }

    public T get(int i) {
        return list.get(i);
    }
}
