package com.selfpractice.netflix;

import com.selfpractice.clearscreen.*;
import com.selfpractice.netflix.model.*;
import com.selfpractice.netflix.repository.*;
import com.selfpractice.netflix.controller.*;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Clear.clearScreen();
        Repository repo = new Repository();
        Controller controller = new Controller(); // Object to call method from another package
        repo.getData();
        Scanner scanner = new Scanner(System.in);
        List<Movie> list = repo.MovieList;

        mainMenu();
        int choice = scanner.nextInt();
        scanner.nextLine();
        switch (choice) {
            case 1:
                Clear.clearScreen();
                controller.showAll();
                break;
            case 2:
                Clear.clearScreen();
                System.out.println("Here are the sorted movies list:");
                controller.sortAndShow();
                break;
            case 3:
                Clear.clearScreen();
                System.out.print("Enter the movie's name: ");
                String name = scanner.nextLine().toLowerCase();
                System.out.println("Here are the movies with the name " + name + ":");
                controller.searchByName(list, name);
                break;
            case 4:
                Clear.clearScreen();
                String category = scanner.nextLine();
                System.out.println("Here are the movies with the category" + category + ":");
                controller.searchByCategory(list, category);
                break;
            case 5:
                Clear.clearScreen();
                String language = scanner.nextLine();
                System.out.println("Here are the movies with the language" + language + ":");
                controller.searchByLanguage(list, language);
                break;
            case 6:
                Clear.clearScreen();
                controller.showAllByCategory();
                break;
            case 7:
                System.exit(1);
                break;
            default:
                break;
        }
    }

    public static void mainMenu() {
        System.out.println("Select one method:");
        System.out.println("1 - Sort and show the movies in the alphabet order ");
        System.out.println("2 - Search movie by names");
        System.out.println("3 - Search movie by categories");
        System.out.println("4 - Search movie by language");
        System.out.println("5 - Show all the movies by categories");
        System.out.println("6 - Exit");
        System.out.print("Your choice is: ");
    }
}
