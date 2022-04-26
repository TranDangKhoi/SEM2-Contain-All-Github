package com.jbdcdemo.view;

import java.sql.SQLException;
import java.util.Scanner;

import com.jbdcdemo.controller.LoginController;
import com.jbdcdemo.entity.User;

public class LoginConsole {
    LoginController loginController = new LoginController();
    User users = new User();
    private final Scanner sc;

    public LoginConsole() {
        this.sc = new Scanner(System.in);
    }

    public int menu() {
        System.out.println("---Login---");
        System.out.println("1. Login statement");
        System.out.println("2. Login prepare statement");
        System.out.println("3. End program");
        int choice = readInt(1, 3);
        return choice;
    }

    public int readInt(int min, int max) {
        int choice;
        while (true) {
            try {
                choice = Integer.parseInt(sc.nextLine());
                if (choice >= min && choice <= max) {
                    break;
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
        return choice;
    }

    public void start() throws ClassNotFoundException, SQLException {
        while (true) {
            int choice = menu();
            switch (choice) {
                case 1:
                    loginStatement();
                    break;
                case 2:
                    loginPrepareStatement();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }
    }

    private void loginStatement() throws ClassNotFoundException, SQLException {
        // Enter username and password
        System.out.print("Enter username:");
        String username = sc.nextLine();

        users.setUsername(username);
        System.out.print("Enter password:");
        String password = sc.nextLine();
        users.setPassword(password);

        String result = loginController.loginStatementController(users);
        System.out.println(result);
    }

    private void loginPrepareStatement() throws ClassNotFoundException, SQLException {
        // Enter username and password
        System.out.print("Enter username:");
        String username = sc.nextLine();
        users.setUsername(username);
        System.out.print("Enter password:");
        String password = sc.nextLine();
        users.setPassword(password);

        String result = loginController.loginPrepareStatementController(users);
        System.out.println(result);
    }
}
