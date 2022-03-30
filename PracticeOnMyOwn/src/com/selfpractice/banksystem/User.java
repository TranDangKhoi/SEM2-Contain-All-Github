package com.selfpractice.banksystem;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class User {
    private long id;
    private String username;
    private String email;
    private String password;
    private String accNum;
    private double balance;

    public User(long id, String accNum, String username, String email, String password, double balance) {
        this.id = id;
        this.accNum = accNum;
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

    public String getaccNum() {
        return accNum;
    }

    public void setaccNum(String accNum) {
        this.accNum = accNum;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setUserName(String username) {
        this.username = username;
    }

    public String getUsername() {
        return this.username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public class Formatter {
        public String formatDate() {
            Calendar objNow = Calendar.getInstance();

            SimpleDateFormat objFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            return objFormat.format(objNow.getTime());
        }

        public double decimalFormat(double balance) {
            DecimalFormat twoDForm = new DecimalFormat("###,###,##0.00");
            return Double.valueOf(twoDForm.format(balance));
        }
    }

    @Override
    public String toString() {
        return id + " - " + username + " - " + " - " + email + " - " + password;
    }
}
