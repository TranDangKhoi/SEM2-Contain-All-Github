package com.homework.playerhomework;



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
    
    class Booking{
        public String nameStore(){
            return name;
        }
    }
    public abstract void displayDetails();
}
