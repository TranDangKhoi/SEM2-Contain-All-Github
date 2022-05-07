package com.jsonwrite;

public class Account {
    private int id;
    private String name;
    private String[] address;
    private String email;
    private boolean isActive;

    public Account() {

    }

    public Account(int id, String name, String[] address, String email, boolean isActive) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.email = email;
        this.isActive = isActive;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getAddress() {
        return this.address;
    }

    public void setAddress(String[] address) {
        this.address = address;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isIsActive() {
        return this.isActive;
    }

    public boolean getIsActive() {
        return this.isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

}
