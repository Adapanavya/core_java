package com.java.practice.genericExample;

public class Generic <T> {
    public T name;
    public Generic(T name) {
        this.name = name;
    }

    public Generic() {

    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    //public T name;
    public static <T> void printName(Generic<T>generic) {
        T mynNme=generic.getName();
        System.out.println(mynNme);

    }


}