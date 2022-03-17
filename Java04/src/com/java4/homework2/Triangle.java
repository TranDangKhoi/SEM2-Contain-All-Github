package com.java4.homework2;

public class Triangle extends Shape {

    private int height;
    private int base;


    @Override
    public int getArea() {
        // TODO Auto-generated method stub
        return (height*base)/2;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Base:" + base + "\nHeight:" + height ;
    }
    
}
