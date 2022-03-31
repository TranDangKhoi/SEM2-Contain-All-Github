package com.selfpractice.phonenumber;

import java.util.ArrayList;
import java.util.Scanner;

public class NumberList {
    static ArrayList<PhoneNumber> numberList;
    private static String lastFound;

    public NumberList() {
        numberList = new ArrayList<PhoneNumber>();
    }

    public void add(PhoneNumber phoneNumber) {
        numberList.add(phoneNumber);
    }

    public ArrayList<PhoneNumber> findByName(String name) {
        boolean found = false;
        ArrayList<PhoneNumber> matches = new ArrayList<>();
        for (PhoneNumber phoneNumber : numberList) {
            String fullName = new String(phoneNumber.getName().toLowerCase());
            if (fullName.matches("(.*)" + name.toLowerCase() + "(.*)")) {
                matches.add(phoneNumber);
                found = true;
                lastFound = name.toLowerCase();
            }
        }
        if (found == false) {
            System.out.println("Not found");
        }
        return matches;
    }

    public static void remove() {
        boolean found = false;
        try {
            for (PhoneNumber phoneNumber : numberList) {
                if (phoneNumber.getName().toLowerCase() == lastFound.toLowerCase()) {
                    int choice;
                    System.out.println("Are you sure deleting this phone number? 1.Yes 2.No");
                    choice = new Scanner(System.in).nextInt();
                    if (choice == 1)
                        numberList.remove(phoneNumber);
                    found = true;
                }
            }
            if (found == false) {
                throw new RuntimeException("You haven't look up any names");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    public void showList() {
        for (PhoneNumber s : numberList) {
            s.printInfo();
        }
    }

    public void showList(ArrayList<PhoneNumber> slist) {
        for (PhoneNumber s : slist) {
            s.printInfo();
        }
    }
}
