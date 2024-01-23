package com.java.practice.practicePrograms;

public class GreaterThanMiddle {
    public boolean greaterThanMiddle(int fNum,int mNum,int lNum){
        return mNum>fNum && mNum>lNum;
    }
    public static void main(String[] args){
        GreaterThanMiddle g=new GreaterThanMiddle();
        boolean b=g.greaterThanMiddle(2,5,3);
        System.out.println(b);
    }
}
