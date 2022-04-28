package com.jbdcdemo.entity;

public class Product {
    private int id;
    private String productName;
    private String productDesc;
    private double price;

    public int getId() {
        return this.id;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Product() {

    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", productName='" + getProductName() + "'" +
                ", productDesc='" + getProductDesc() + "'" +
                ", price='" + getPrice() + "'" +
                "}";
    }

}
