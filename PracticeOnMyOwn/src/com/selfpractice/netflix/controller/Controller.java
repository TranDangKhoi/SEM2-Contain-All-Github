package com.selfpractice.netflix.controller;

import com.selfpractice.netflix.repository.Repository;
import com.selfpractice.netflix.*;
import com.selfpractice.clearscreen.*;

import java.util.List;
import java.util.Scanner;

public class Controller {
    Repository repo = new Repository();
    List<Movie> list = repo.getData();
    static Scanner scanner = new Scanner(System.in);

    public static void menu() {
        Menu.mainMenu();
        int choice = scanner.nextInt();
        scanner.nextLine();
        switch (choice) {
            case 1:
                Clear.clearScreen();
                sortAndShow();
                break;
            case 2:
                Clear.clearScreen();
                searchByName();
                break;
            case 3:
                Clear.clearScreen();
                searchByCategory();
                break;
            case 4:
                Clear.clearScreen();
                searchByLanguage();
                break;
            case 5:
                Clear.clearScreen();
                showAllByCategory();
                break;
            case 6:
                System.exit(1);
                break;
        }
    }

    public static void sortAndShow() {
        System.out.println("Hello");
    }

    public static void searchByName() {

    }

    public static void searchByCategory() {

    }

    public static void searchByLanguage() {

    }

    public static void showAllByCategory() {

    }
}
