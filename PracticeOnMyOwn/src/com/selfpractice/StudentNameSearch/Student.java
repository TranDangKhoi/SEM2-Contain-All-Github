package com.selfpractice.StudentNameSearch;

public class Student {
    private String name;
    public Student(){

    }

    public Student(String name){
        this.name = name;
    }

    public void printInfo(){
        System.out.printf("%s\n", getStuName());
    }

    public String getStuName(){
        return this.name;
    }
}
