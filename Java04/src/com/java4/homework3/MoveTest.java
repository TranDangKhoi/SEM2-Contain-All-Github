package com.java4.homework3;

public class MoveTest {
    public static void main(String[] args) {

        MoveablePoint movePoint = new MoveablePoint();
        movePoint.moveUp();
        movePoint.moveRight();
        movePoint.moveUp();
        System.out.println(movePoint.getPointXY());
    }
    
}
