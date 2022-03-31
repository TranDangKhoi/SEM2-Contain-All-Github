package com.selfpractice.phonenumber;

import java.util.ArrayList;
import java.util.Scanner;

import javax.naming.NameNotFoundException;

import com.selfpractice.clearscreen.Clear;

public class Controller {
    Scanner input = new Scanner(System.in);
    ArrayList<PhoneNumber> list = new ArrayList<PhoneNumber>();

    public void menu() {
        int choice;
        System.out.println("Select one method:");
        System.out.println("1. Insert new phone number");
        System.out.println("2. Search phone number");
        System.out.println("3. Delete phone number");
        System.out.println("4. Exit");
        switch (choice) {
            case 1:
                Clear.clearScreen();
                insert();
                break;
            case 2:
                Clear.clearScreen();
                lookUp(null);
                break;
            case 3:
                Clear.clearScreen();
                delete();
                break;
            case 4:
                System.exit(1);
                break;
            default:
                System.out.println("There is no such choice");
                break;
        }
    }

    public void insert() {
        String name;
        String number;
        System.out.print("Enter name:");
        name = input.next();
        System.out.print("Enter phone number");
        number = input.next();
        PhoneNumber phoneNumber = new PhoneNumber(name, number);
        list.add(phoneNumber);
    }

    public ArrayList<PhoneNumber> lookUp(String name) {
        boolean found = false;
        ArrayList<PhoneNumber> matches = new ArrayList<>();
        try {
            for (PhoneNumber phoneNumber : list) {
                String fullName = new String(phoneNumber.getName().toLowerCase());
                if (fullName.matches("(.*)" + name.toLowerCase() + "(.*)")) {
                    matches.add(phoneNumber);
                    found = true;
                }
                if (found == false) {
                    throw new NameNotFoundException("Can't find that name");
                }
            }
        } catch (NameNotFoundException e) {
            System.out.println(e.getMessage());
        }

        return matches;
    }

    public void delete() {
        boolean found = false;
    }
}
