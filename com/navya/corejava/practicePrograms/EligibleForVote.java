package com.java.practice.practicePrograms;

public class EligibleForVote {
     public static void eligibleOrNot(int a){
        if (a>=18) {
            System.out.println("you are eligible for vote");
        }
        else {
            System.out.println("you are not eligible for vote");
        }
    }
    public static void main(String[] args){
         eligibleOrNot(18);

    }
}
