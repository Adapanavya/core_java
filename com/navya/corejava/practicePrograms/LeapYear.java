package com.java.practice.practicePrograms;

public class LeapYear {
    public boolean leapYearOrNot(int a){

        return a%4==0;
    }
    public static void main(String[] args){
        LeapYear l=new LeapYear();
        boolean i=l.leapYearOrNot(1901);
        System.out.println(i);
    }
}
