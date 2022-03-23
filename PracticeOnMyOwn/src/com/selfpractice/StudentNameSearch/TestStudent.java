package com.selfpractice.StudentNameSearch;

import java.util.ArrayList;
import java.util.Scanner;

public class TestStudent {
    private static StudentList list;
    private static Scanner input = new Scanner(System.in);

    public static void menu(){
        System.out.println("\t\tMenu");
        System.out.println("1. Add a student's name");
        System.out.println("2. Search student by name");
        System.out.println("3. Show all students's name");
        System.out.println("4. Exit program");
        System.out.print("Your choice is: ");
    }

    public static void addStudent(){
        String name;
        System.out.print("Enter student's name:");
        name = input.next();
        Student myStudent = new Student(name);
        list.add(myStudent);
    }

    public static void searchStudentByName(){
        String name;
        System.out.print("Enter the student's name you want to find:");
        name = input.next();
        ArrayList<Student> foundName = list.findByName(name);
        list.show(foundName);
    }

    public static void clearScreen(){
        System.out.print("\033[H\033[2J");  
        System.out.flush(); 
    }

    public static void showAll(){
        list.show();
    }
    public static void main(String[] args) {
        list = new StudentList();
        menu();
        
        while(true){
        int choice;
        choice = input.nextInt();
            switch(choice){
                case 1:
                clearScreen();
                addStudent();
                clearScreen();
                menu();
                break;
                case 2:
                clearScreen();
                searchStudentByName();
                menu();
                break;
                case 3:
                clearScreen();
                showAll();
                menu();
                break;
            }
        }
    }
}
