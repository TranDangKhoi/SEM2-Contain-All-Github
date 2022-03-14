package com.example.entities;

public class Cat extends Animal{
    
    private int age;
    public Cat(int age){
        super();
        this.age = age;
    }

    public Cat(String name, int age){
        super(name); // goi den lop cha va su dung constructor cua lop cha
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }

    @Override // ghi đè lên hành vi của class super aka class cha (Animal.java)
    public String getAnimalName() {
        return "Meo meo meo rửa mặt như mèo";
    }

}
