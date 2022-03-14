package com.example.entities;
// Abstract KHÁC Abstraction
public abstract class Animal {
    private String name;
    public Animal(){

    }

    public Animal(String name){
        this.name = name;
    }

    //getter  / setter

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    // Implement o phia class con

    public abstract String getAnimalName();
}
