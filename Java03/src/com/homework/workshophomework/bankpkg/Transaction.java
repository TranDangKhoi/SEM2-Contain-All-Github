package com.homework.workshophomework.bankpkg;

public interface Transaction {
    public void checkBalance(String accountNumber);
    public void depositCash(String accountNumber, double amount);
    public void withdrawCast(String accountNumber, double amount);
}
