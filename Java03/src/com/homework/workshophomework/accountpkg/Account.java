package com.homework.workshophomework.accountpkg;

import java.util.ArrayList;
import java.util.Iterator;

public class Account {
    // Store account number
    private String accountNumber;
    // Store account holder name
    private String accountHolderName;
    //Store type of account
    private String accountType;
    // Store account's balance
    private double balance;
    // Array list
    private ArrayList accDetails = new ArrayList();
    // arrayList = ["accNo","accHolderName","accType",balance];

    public Account(){
        this.accountNumber = "Not specified";
        this.accountHolderName = ("Not specified");
        this.accountType = "Not specified";
        this.balance = 0.0;
    }

   

    public Account(String accNo, String name, String accType, double bal){
        System.out.println("Parameterized Constructor:");
        this.accountNumber = accNo;
        this.setAccountHolderName(name);
        this.accountType = accType;
        this.balance = bal;
    }

    public void addDetails(String[] details){
        for (int i = 0; i < details.length; i++){
            accDetails.add(details[i]);
        }
    }

    public String getAccNo(){
        return this.accountNumber;
    }

    public void setAccNo(String accNo){
        this.accountNumber = accNo;
    }

     public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public String getAccountType() {
        return this.accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    public void displayDetails(){
        System.out.println("Account Number:" + accountNumber);
        System.out.println("Account Holder Name:" + accountHolderName);
        System.out.println("Account Type:" + accountType);
        System.out.println("Balance:" + balance);
    }
}
