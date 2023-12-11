package com.navya.corejava.singleInheritance;

public class Parent {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int id;
    protected String name;

    public String name(){
        return "This is Single Inheritance";
    }

}
