package com.java.practice.practicePrograms;

public class Palindrome {
    public boolean palindromeOrNot(int a){
        //int n=a;
        int r,sum=0,temp=a;
        //temp=n;

        while(a>0){
            r=a%10;
            sum=(sum*10)+r;
            a=a/10;
        }
        return (temp==sum);
    }
    public static void main(String[] args){
        Palindrome p=new Palindrome();
        boolean b=p.palindromeOrNot(33533);
        System.out.println(b);
    }

}
