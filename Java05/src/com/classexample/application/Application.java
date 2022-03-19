package com.classexample.application;

import com.classexample.model.StudentList;
import com.classexample.entity.Student;

import java.util.*;

public class Application {

        private static Scanner input = new Scanner(System.in);
        private static StudentList list;
        public static void menu(){
            System.out.println("\n1. Add a new student");
            System.out.println("2. Delete a student");
            System.out.println("3. Search by student's name");
            System.out.println("4. Search by ID");
            System.out.println("5. Print student details in desc order of mark");
            System.out.println("6. Exit");
        }
        public static void main(String[] args) {
            list = new StudentList();
            menu();

            while(true){
                int choice;
                System.out.println("#:");
                choice = input.nextInt();
                if (choice == 1){
                    addStudent();
                    menu();
                } else if (choice == 2){
                    deleteStudent();
                    menu();
                } else if (choice == 3){
                    searchByName();
                    menu();
                } else if ( choice == 4 ){
                    searchByID();
                    menu();
                } else if (choice == 5){
                    printSorted();
                    menu();
                } else if ( choice == 6){
                    System.exit(0);
                }
            }
        }
        public static void addStudent(){
            int id = 0;
            String fn;
            String ln;
            double mark;
            System.out.print("Enter student ID:");
            id = input.nextInt();
            System.out.print("Enter first name:");
            fn = input.next();
            System.out.print("Enter last name:");
            ln = input.next();
            System.out.print("Enter mark: ");
            mark = input.nextDouble();
            Student s = new Student(id, fn, ln, mark);
            list.add(s);
        }

        public static void deleteStudent(){
            int id;
            System.out.print("Enter student ID:");
            id = input.nextInt();
            list.remove(id);
        }

        public static void searchByName(){
            String name;
            System.out.print("Enter a name:");
            name = input.next();
            ArrayList<Student> found = list.findByName(name);
            list.showList(found);
        }

        public static void searchByID(){
            int id;
            System.out.print("Enter student ID: ");
            id = input.nextInt();
            Student s = list.findByID(id);
            if (s==null){
                System.out.print("Not found");
            } else{
                s.printInfo();
            }
        }

        public static void printSorted(){
            list.sortByMarks();
            list.showList();
        }
}
