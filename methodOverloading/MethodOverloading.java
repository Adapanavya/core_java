package com.navya.corejava.methodOverloading;

public class MethodOverloading {
    // method overloading with add method - same method name with different argument types/ no of arguments
    public int add(int i, int j){
        return i+j;
    }

    public long add(long i, int j){
        return i+j;
    }

    public int add(int i, int j, int k){
        return i+j+k;
    }
}
