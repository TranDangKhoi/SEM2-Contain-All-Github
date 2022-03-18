package com.java4.homework3;

public class MoveablePoint implements Moveable {
    private int x;
    private int y;

    public MoveablePoint(){
        this.x = 0;
        this.y = 0;
    }

    public MoveablePoint(int x,int y){
        this.x = x;
        this.y = y;
    }

    public String getPointX(){
        return "X is:" + this.x;
    }
    public String getPointY(){
        return "Y is:" + this.y;
    }
    public String getPointXY(){
        return "X is: " + this.x + "\nY is" + this.y;
    }

    @Override
    public void moveUp() {
        y++; 
    }

    @Override
    public void moveDown() {
        y--;
        
    }

    @Override
    public void moveRight() {
        // TODO Auto-generated method stub
        x++;
       
    }

    @Override
    public void moveLeft() {
        x--;
          
    }
    
}
