package com.navya.corejava.polimorphism;

import javax.swing.plaf.synth.SynthTextAreaUI;

public class Main {
    public static void main(String[] args){
        Family f1=new Family();
        System.out.println(f1.name());

        Mother m=new Mother();
        System.out.println(m.name());

        Father f=new Father();
        System.out.println(f.name());

        Family b=new Brother();
        System.out.println(b.name());
    }
}
