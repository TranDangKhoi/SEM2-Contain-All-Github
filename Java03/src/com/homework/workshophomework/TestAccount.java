package com.homework.workshophomework;

public class TestAccount {
    public static void main(String[] args) {
        Account objAccount1;
        objAccount1 = new Account();
        objAccount1.setAccNo("7839119394424");
        System.out.println("Account number: " + objAccount1.getAccNo());

        // Truyen gia tri vao object moi:
        if(args.length == 4){
        Account objAccount2 = new Account();

        // Set value for the object
        objAccount2.setAccNo(args[0]);
        objAccount2.setAccountHolderName(args[1]);
        objAccount2.setAccountType(args[2]);
        objAccount2.setBalance(Double.parseDouble(args[3]));
        // Display
        objAccount2.displayDetails();
        } else{
            System.out.println("Usasge: Java Test Account <a/c> ...");
        }
        // System.out.println("Account Number: " + objAccount2.getAccNo());

    }

    
}
