package com.selfpractice.authenticationbank;

public class User {
    private long id;
    private String username;
    private String email;
    private String password; 
    private String bankNum;
    private double balance;

    public User(long id, String bankNum , String username, String email, String password, double balance){
        this.id = id;
        this.bankNum = bankNum;
        this.username = username;
        this.email = email;
        this.password = password;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getBankNum() {
        return bankNum;
    }

    public void setBankNum(String bankNum) {
        this.bankNum = bankNum;
    }

    

    public long getId(){return id;}
    public void setId(long id){this.id = id;}
    public void setUserName(String username){this.username = username;}
    public String getUsername(){return this.username;}
    public void setEmail(String email){this.email = email;}
    public String getEmail(){return email;}
    public String getPassword(){return password;}
    public void setPassword(String password){this.password = password;}

    @Override
    public String toString(){
        return id + " - " + username + " - " + " - " + email + " - " + password;
    }
}
