package com.java.practice.practicePrograms;

public class FibonacciSeries {
    private int fibonacci(int a) {
        int firstTerm = 0;
        int secondTerm = 1;


        for (int i = 0; i < a; i++) {

            System.out.println(firstTerm);
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
        return firstTerm;

    }

    public static void main(String[] args){
        FibonacciSeries t=new FibonacciSeries();
        int fibonacciSeries=t.fibonacci(5);
        System.out.println(fibonacciSeries);
    }
}
