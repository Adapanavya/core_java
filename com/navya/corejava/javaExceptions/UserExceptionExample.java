package com.java.practice.javaExceptions;

public class UserExceptionExample extends Exception{
    public UserExceptionExample(String str){
        super();
    }
}
class UserException {
    public static void ageForVote(int age)throws UserExceptionExample{
        if (age<18){
            throw new UserExceptionExample("not eligible");

        }
        else {
            System.out.println("eligible");
        }
    }
    public static void main(String[] args){
        try {
            ageForVote(12);
        }
        catch (UserExceptionExample e){
            System.out.println(e.getMessage());
        }
    }
}

