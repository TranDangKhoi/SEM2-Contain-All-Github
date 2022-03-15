package com.homework.workshophomework;

public class Account {
    // Store account number
    String accountNumber;
    // Store account holder name
    String accountHolderName;
    //Store type of account
    String accountType;
    // Store account's balance
    double balance;

    public Account(){
        System.out.println("An empty constructor:");
    }

    public Account(String accNo, String name, String accType, double bal){
        System.out.println("Parameterized Constructor:");
        accountNumber = accNo;
        accountHolderName = name;
        accountType = accType;
        balance = bal;
    }


}
