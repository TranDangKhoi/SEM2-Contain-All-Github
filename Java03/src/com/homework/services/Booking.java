package com.homework.services;

import com.homework.entities.Player;

public class Booking extends Player {

    public Booking(String name){
        super(name);
    }

    @Override
    public void displayDetails() {   
        System.out.println("Player name is: " + this.getName());
    }
}
