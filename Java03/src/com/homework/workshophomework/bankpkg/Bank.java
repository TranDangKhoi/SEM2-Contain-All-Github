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
}
