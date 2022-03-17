package com.java4.homework2;

public class Rectangle extends Shape {

    private int length;
    private int width;
    public Rectangle(String color, int length, int width){
        super(color);
        this.length = length;
        this.width = width;
    }
    
    @Override
    public int getArea() {
        // TODO Auto-generated method stub
        return length*width;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Length:" + length + "\nWidth:" + width; 
    }
    
}
