package com.java.practice.practicePrograms;

public class Array3 {
    int a=1;


    public static void main(String[] args){
        String[] daysOfTheWeek=new String[]{"Monday","TuseDay","WednesDay", "Thur", "Friday","Satr","Sund" };
       //forward direction
       /* for(int index=0;index<=daysOfTheWeek.length-1;index++){
            System.out.println(daysOfTheWeek[index]);
        }
*/
        //backward direction
        for(int index=6;index>=0;index--){
            System.out.println(daysOfTheWeek[index]);
        }

    }
}
