package com.classexample.entity;


public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private double mark;
    public Student (){

    }
    public Student(int id, String firstName, String lastName, double mark) {

         this.id = id;
         this.firstName = firstName;
         this.lastName = lastName;
         this.mark = mark;
    }

    
        public void printInfo() {
    System.out.printf("%3d|%3s%3s|%5f\n", getId(), getFirstName(), getLastName(), getMark());
        }
    public String getFirstName() {
        return firstName;  
    }
    public String getLastName () {
        return lastName;
    }
    public int getId() {
        return id;
    }
    public double getMark() {
       return mark;
    }
    
    
}
    