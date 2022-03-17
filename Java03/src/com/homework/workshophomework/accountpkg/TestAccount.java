package com.homework.workshophomework.accountpkg;

import com.homework.workshophomework.bankpkg.Bank;
import java.util.Scanner;


public class TestAccount {
    public static void main(String[] args) {

        // this String[] array is used to store account details
       String[] accountDetails = new String[5];
       String[] bankDetails = new String[3];
       // Instantiate the Scanner class
       Scanner input = new Scanner(System.in);

       // Enter details for account
       System.out.print("Enter Acc Number:");
       accountDetails[0] = input.nextLine();
       System.out.print("Enter Acc Holder Name:");
       accountDetails[1] = input.nextLine();
       System.out.print("Enter Acc Type:");
       accountDetails[2] = input.nextLine();
       System.out.print("Enter Balance:");
       accountDetails[3] = input.nextLine();
       System.out.print("Enter number of days:");
       accountDetails[4] = input.nextLine();
        

       // Enter details for Bank
       System.out.print("Enter Bank ID:");
       bankDetails[0] = input.nextLine();
       System.out.print("Enter Bank Name:");
       bankDetails[1] = input.nextLine();
       System.out.print("Enter Branch:");
       bankDetails[2] = input.nextLine();
       

       // Declare and instantiate object of type Account;
       SavingAccount objAccount1 = new SavingAccount(accountDetails[0],accountDetails[1],accountDetails[2],Double.parseDouble(accountDetails[3]),Integer.parseInt(accountDetails[4]));
       objAccount1.displayDetails();
       // Add the details of objAccount1 object. -> Truyen tham so vao object bang scanner
       objAccount1.addDetails(accountDetails);

       // Display account detail

       objAccount1.displayDetails();
       

       // Declare and instantiate object of type Bank
       Bank objBank1 = new Bank();
    
       // Add the details of objBank1 object. -> Truyen tham so vao cho object objBank1 bang scanner 
       objBank1.addBankDetails(bankDetails);

       // Display bank info
       objBank1.displayBankDetails();
       System.out.println("Enter Deposit Amount:");
       double deposit = Double.parseDouble(input.nextLine());
       objAccount1.depositCash(accountDetails[0], deposit);
       System.out.println("Enter Withdraw Amount:");
       double withdraw = Double.parseDouble(input.nextLine());
       objAccount1.withdrawCast(accountDetails[0], withdraw);
       input.close();

    }

    
}
