package com.homework.workshophomework.accountpkg;


import java.text.DecimalFormat;

public class SavingAccount extends Account{
    private double dailyInterest;
    private int daysOfYear;

    // Parameterized constructor
    public SavingAccount(String accNo, String name, String accType, double bal, int daysOfYear){
        super(accNo,name,accType,bal); // from parent ( Account.java )
        this.daysOfYear = daysOfYear;
    }

    // Calculate daily interests

    public double calculateInterest(){
        // Tính tiền lãi từ thằng double balance
        // và interestRate từ thằng Bank.java
        dailyInterest = (super.getBalance() * com.homework.workshophomework.bankpkg.Bank.interestRate / 100) / daysOfYear;

        // Khởi tạo class DecimalFormat với 2 số 0 đằng sau
        DecimalFormat twoDForm = new DecimalFormat("#.00");

        // Return
        return Double.valueOf(twoDForm.format(dailyInterest));
    }
}
