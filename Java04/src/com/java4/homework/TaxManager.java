package com.java4.homework;

public class TaxManager{
    private static final int MAX = 100;
    private TaxPayer[] list = new TaxPayer[MAX];
    private int count = 0;
    
    public boolean addTaxPayer(TaxPayer taxPayer){
        if(count >= MAX){
            return false;
        }
        list[count++] = taxPayer;
        return true;
    }

    public double getTax(){
        double sum = 0;
        for(int i = 0; i < count;i++){
            //method pay is polymorphic because we do not
            // know exact object is instance of which class
            sum += list[i].pay();
        }

        return sum;
    }
}
