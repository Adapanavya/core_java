package com.navya.corejava.multilevelInheritace;

public class School {
    public int getsId() {
        return sId;
    }

    public void setsId(int sId) {
        this.sId = sId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    private int sId;
    private String sName;

    public String name(){
        return "Welcome to School";
    }
}
