package com.homework.workshophomework.accountpkg;


import java.text.DecimalFormat;
import com.homework.workshophomework.bankpkg.Transaction;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class SavingAccount extends Account implements Transaction{
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

        return new Formatter().decimalFormat(dailyInterest);
    }

    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Daily interest: " + calculateInterest());
    }

    @Override
    public void checkBalance(String accountNumber) {
       System.out.println("--------------------");
       System.out.println("The balance is: " + super.getBalance());
       System.out.println("--------------------");
    }

    @Override
    public void depositCash(String accountNumber, double amount) {
        System.out.println("------------------");
        super.setBalance(super.getBalance() + amount);

        // Create Calendar class instance
        Calendar objNow = Calendar.getInstance();

        // Create SimpleDateFormat class instance to set the date format
        SimpleDateFormat objFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println("Date/Time:" + objFormat.format(objNow.getTime()));
        System.out.println("------------------");
    }

    @Override
    public void withdrawCast(String accountNumber, double amount) {
        System.out.println("------------------");
        super.setBalance(super.getBalance() - amount);
        System.out.println("Amouth withdrawn:" + amount);
        System.out.println("Date/Time:" + new Formatter().formatDate());
        System.out.println("------------------");
    }

    class Formatter{
        public String formatDate(){
            Calendar objNow = Calendar.getInstance();

            SimpleDateFormat objFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            return objFormat.format(objNow.getTime());
        }

        public double decimalFormat(double value){
            DecimalFormat twoDForm = new DecimalFormat("#.00");
            return Double.valueOf(twoDForm.format(value));
        }
    }
}
