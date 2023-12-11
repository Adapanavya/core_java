package com.navya.corejava.MethodOverriding;

public class Parent {
   private int id;
   private String name;
   protected int ruleNo;

    public int getRuleNo() {
        return ruleNo;
    }

    public void setRuleNo(int ruleNo) {
        this.ruleNo = ruleNo;
    }

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

    public String print(){
        return "parent print";
    }

}
