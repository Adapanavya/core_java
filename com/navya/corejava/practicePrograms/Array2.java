package com.java.practice.practicePrograms;

public class Array2 {
    int a=1;


    public static void main(String[] args){
        String[] daysOfTheWeek=new String[7];
        daysOfTheWeek[0] ="Monday";
        daysOfTheWeek[1] ="TuseDay";
        daysOfTheWeek[2] ="WednesDay";
        daysOfTheWeek[3] ="Thur";
        daysOfTheWeek[4] ="Friday";
        daysOfTheWeek[5] ="Satr";
       daysOfTheWeek[6] ="Sund";
       //forward direction
        for(int index=0;index<=daysOfTheWeek.length-1;index++){
            System.out.println(daysOfTheWeek[index]);
        }

        //backward direction
        for(int index=6;index>=0;index--){
            System.out.println(daysOfTheWeek[index]);
        }

    }
}
