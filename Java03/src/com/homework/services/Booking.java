package com.homework.playerhomework;

public class Booking extends Player {

    public Booking(String name){
        super(name);
    }

    @Override
    public void displayDetails() {   
        System.out.println("Player name is: " + this.getName());
    }
}
