package com.example.entities;



public class Dog extends Animal{

    private int weight;


    public int getWeight() {
        return this.weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Dog(String name, int weight) {
        super(name);
        this.setWeight(weight);
    }

    @Override
    public String getAnimalName() {
        // TODO Auto-generated method stub
        return "Ẳng ẳng gôu";
    }
    
}
