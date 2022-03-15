package com.homework.workshophomework;

public class TestAccount {
    public static void main(String[] args) {
        Account objAccount1;
        objAccount1 = new Account();

        System.out.println("Account number: " + objAccount1.accountNumber);

        // Truyen gia tri vao object moi:

        Account objAccount2;
        objAccount2 = new Account("7677110620033","Tran Dang Khoi","Savings",6500);
        System.out.println("Account Number: " + objAccount2.accountNumber);
    }
}
