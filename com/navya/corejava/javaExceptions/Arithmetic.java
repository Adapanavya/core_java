package com.java.practice.javaExceptions;

public class Arithmetic {
        public static void main(String[] args) {
            int num1 = 10;
            int num2 = 0;

            try {
                int result = num1 / num2;
                System.out.println(result);
            } catch (ArithmeticException a){

                System.out.println("Error: Division by zero is not allowed.");
            }
        }
}
