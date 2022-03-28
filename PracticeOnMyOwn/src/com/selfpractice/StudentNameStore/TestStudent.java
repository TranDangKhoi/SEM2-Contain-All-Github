package com.selfpractice.studentnamestore;

import java.util.Scanner;

public class TestStudent {

    private static Scanner input = new Scanner(System.in);
    private static StudentList list;

    public static void menu() {
        System.out.println("\t\tMenu");
        System.out.println("1. Add a student's name");
        System.out.println("2. Show all student's names");
        System.out.println("3. Exit");
        System.out.print("Your choice:");
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void addStudent() {
        String name;
        System.out.print("Enter student's name:");
        name = input.next();
        Student myStudent = new Student(name);
        list.add(myStudent);
    }

    public static void showAll() {
        list.showNameList();
    }

    public static void exitProgram() {
        System.exit(0);
    }

    public static void main(String[] args) {
        list = new StudentList();
        menu();
        while (true) {
            int choice;
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    addStudent();
                    clearScreen();
                    menu();
                    break;
                case 2:
                    clearScreen();
                    showAll();
                    menu();
                    break;
                case 3:
                    clearScreen();
                    exitProgram();
                    break;
            }
        }
    }
}
