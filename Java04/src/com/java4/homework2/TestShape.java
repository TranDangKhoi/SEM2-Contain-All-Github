package com.java4.homework2;

import java.util.Scanner;

public class TestShape{
    public static void main(String[] args) {
    Shape myRect = new Rectangle("red",3,4);
    System.out.println(myRect.getArea());
    System.out.println(myRect.toString());
    }
}
