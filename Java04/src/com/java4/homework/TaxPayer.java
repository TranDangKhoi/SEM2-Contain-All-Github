package com.java4.homework;

public abstract class TaxPayer {
    private String id;

    public String getId(){
        return this.id;
    }

    public abstract double pay();
}
