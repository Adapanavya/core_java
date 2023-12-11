package com.navya.corejava.modifiers;

import java.util.Arrays;
import java.util.Collections;

public class AccessModifiers {
    private String m1() {
        String[] list = {"navya" , "adapa" , "abc" , "xyz"};
        System.out.println(Arrays.toString(list));
        String[] names = {"navya" , "adapa" , "abc" , "xyz"};
        Arrays.sort(names);
        System.out.println("sorted list:"+Arrays.toString(names));
        return null;
    }
    private void m2(){
        String[] strLegth = {"abc" , "xyz" , "navya" , "adapa"};
        System.out.println("String legth is:"+strLegth.length);

        String[] name = {"navya" , "adapa" , "abc" , "xyz"};
        Arrays.sort(name , Collections.reverseOrder() );
        System.out.println("Reverse order:"+Arrays.toString(name));
    }
    public int m3() {
        int[] order = {2,1,6,4,3,8,};
        Arrays.sort(order);
        System.out.println("Ascending order:"+Arrays.toString(order));
        return 0;
    }
    /*public String m4() {
        String[] names = {"navya" , "adapa" , "abc" , "xyz"};
        System.out.println(Arrays.toString(names));
        return null;
    }*/

    private String name = "Navya";
    private int x = 10;

        public static void main(String[] arg){

        AccessModifiers b = new AccessModifiers();
            System.out.println(b.x);
            System.out.println(b.name);
            b.m1();
            b.m2();
            b.m3();


            String s1 = "abc";
            String s2 = "abe";
            System.out.println(s2.compareTo(s1));
            System.out.println(s1.compareTo(s2));


    }

}
