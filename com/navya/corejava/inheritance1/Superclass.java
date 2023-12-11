package com.navya.corejava.inheritance1;

public class Superclass {
    private int id;
    private String name;
    private float salary;

    public int getId() {
        return id;
    }

    public boolean setId(int id) {
        this.id = id;
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}
