package com.homework.workshophomework;

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

    public Account(){
        System.out.println("An default constructor with no arguments:");
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
        System.out.println("Account Details:");
        System.out.println("AccNo.   Name \t\t Type\tBalance");
        Iterator iAccount = accDetails.iterator();
        while (iAccount.hasNext()){
            System.out.print(iAccount.next() + "\t");
        }
        System.out.println("");
    }
}
