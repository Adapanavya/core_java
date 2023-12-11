package com.navya.corejava.polimorphism;

public class Family {
    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getbName() {
        return bName;
    }

    public void setbName(String bName) {
        this.bName = bName;
    }

    private String mName;
    private String fName;
    private String bName;

    public String name(){
        return "Family names";
    }
}
