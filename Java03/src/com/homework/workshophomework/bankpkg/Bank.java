package com.homework.workshophomework.bankpkg;

import java.util.ArrayList;
import java.util.Iterator;

public class Bank {
    
        String bankID;
        String bankName;
        String branch;
        //Declare and initialize an ArrayList
        public ArrayList bankDetails = new ArrayList();
        public static final float interestRate = 3.5F;

        public Bank(){
        this.bankID = "Not specified";
        this.bankName = "Not specified";
        this.branch = "Not specified";
        }

        public Bank(String bankID, String bankName, String branch){
            this.bankID = bankID;
            this.bankName = bankName;
            this.branch = branch;
        }

        public void addBankDetails(String[] details){
            System.out.println("Adding Bank Details. Please wait...");
            for (int i = 0; i < details.length; i++){
            bankDetails.add(details[i]);
            }
        }

        public void displayBankDetails(){
            System.out.println("Bank Details:");
            System.out.println("BankID\tBankName  Branch\tInterests");
            Iterator iBank = bankDetails.iterator();
            while (iBank.hasNext()){
                System.out.print(iBank.next() + "\t");
            }
            System.out.print(interestRate);
            System.out.println("");
        }
}
