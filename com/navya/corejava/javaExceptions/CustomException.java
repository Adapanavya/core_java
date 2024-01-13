package com.java.practice.javaExceptions;
class MyException extends Exception{
    public MyException(String s){

    }
}
public class CustomException {
    public static void main(String[] args){
        int i=20;
        int j=0;
        try{
            j=18/i;
            if (j==0)
                throw new MyException("false");
        }
        catch (ArithmeticException e){
            j=18/1;
            System.out.println( "default output");
        }
        catch (Exception e){
            System.out.println("it will print");
        }
        System.out.println(j);
    }


}
