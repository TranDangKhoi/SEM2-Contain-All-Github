package com.selfpractice.studentnamestore;

public class Student {
    private String name;

    public Student() {
        this.name = "Not specified";
    }

    public Student(String name) {
        this.name = name;
    }

    public String getStuName() {
        return this.name;
    }

    public void printInfo() {
        System.out.printf("%s\n", getStuName());
    }
}
