package com.selfpractice.phonenumber;

import java.util.ArrayList;
import java.util.Scanner;

import com.selfpractice.clearscreen.Clear;

public class Application {
    private static Scanner input = new Scanner(System.in);
    private static NumberList list;

    public static void menu() {
        int choice;
        while (true) {
            System.out.println("Select one method:");
            System.out.println("1. Insert new phone number");
            System.out.println("2. Search phone number");
            System.out.println("3. Delete phone number");
            System.out.println("4. Exit");
            System.out.print("Your choice is:");
            choice = input.nextInt();
            input.nextLine();
            switch (choice) {
                case 1:
                    Clear.clearScreen();
                    insert();
                    break;
                case 2:
                    Clear.clearScreen();
                    lookUp();
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
    }

    public static void insert() {
        String name;
        String number;
        System.out.print("Enter name:");
        name = input.next();
        System.out.print("Enter phone number:");
        number = input.next();
        PhoneNumber phoneNumber = new PhoneNumber(name, number);
        list.add(phoneNumber);
    }

    public static void lookUp() {
        String name;
        System.out.print("Enter a name:");
        name = input.next();
        ArrayList<PhoneNumber> foundName = list.findByName(name);
        list.showList(foundName);
    }

    public static void delete() {
        NumberList.remove();
    }

    public static void main(String[] args) {
        list = new NumberList();
        menu();
    }
}
