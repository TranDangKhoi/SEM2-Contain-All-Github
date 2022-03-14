package com.homework.entities;

public abstract class Player {
    private String name;

    public Player(){
        this.name = "Player";
    }

    public Player(String name){
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void displayDetails();
    
}
