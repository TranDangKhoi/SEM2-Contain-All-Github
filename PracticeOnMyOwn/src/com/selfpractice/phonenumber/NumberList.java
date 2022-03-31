package com.selfpractice.phonenumber;

import java.util.ArrayList;

public class NumberList {
    ArrayList<PhoneNumber> numberList;

    public NumberList() {
        numberList = new ArrayList<PhoneNumber>();
    }

    public void add(PhoneNumber phoneNumber) {
        numberList.add(phoneNumber);
    }
}
