package com.productjsondemo.entity;

public class Product {
    private int id;
    private String productName;
    private String productDesc;
    private double price;

    public Product() {

    }

    public Product(int id, String productName, String productDesc, double price) {
        this.id = id;
        this.productName = productName;
        this.productDesc = productDesc;
        this.price = price;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return this.productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDesc() {
        return this.productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
