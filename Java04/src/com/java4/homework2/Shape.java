package com.java4.homework2;

public abstract class Shape {
    private String color;

    public Shape(){
        this.color = "red";
    }

    public Shape(String color){
        this.color = color;
    }

    public abstract int getArea();
    public abstract String toString();
}
