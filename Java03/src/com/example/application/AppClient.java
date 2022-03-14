package com.example.application;

import com.example.entities.Animal;
import com.example.entities.Cat;

public class AppClient {
    public static void main(String[] args) {
        Animal cat = new Cat("Tom",3);
        cat.getName(); // Animal.java
        cat.setName("Muop"); // Animal.java
        Cat cat1 = new Cat("Meo tam the",5);
        cat1.getName(); // Cat.java
        cat1.getAnimalName(); // Cat.java
    }
}
