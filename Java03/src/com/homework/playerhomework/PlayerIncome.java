package com.homework.playerhomework;
import com.homework.playerhomework.Tax;

public class PlayerIncome extends Player implements Tax {
    private double income;

    public PlayerIncome(){
        this.income = "Not specified";
    }

    public PlayerIncome(double value){
        this.income = value;
    }

    public void calculateTax() {
        
        
    }

    @Override
    public void displayDetails() {
        // TODO Auto-generated method stub
        
    }
    
}
