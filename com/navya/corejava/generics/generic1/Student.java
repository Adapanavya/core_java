package com.java.practice.generic1;

public class Student <T, U>{
    public T name;
    public U roNo;

    public Student(T name, U roNo) {
        this.name = name;
        this.roNo = roNo;
    }



    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public U getRoNo() {
        return roNo;
    }

    public void setRoNo(U roNo) {
        this.roNo = roNo;
    }

    public Student() {
    }
    public static<V,W> void printData(Student<V,W>student){
        W studentRollNo=student.getRoNo();
        System.out.println(studentRollNo);

        V studentName=student.getName();
        System.out.println(studentName);

    }
}
