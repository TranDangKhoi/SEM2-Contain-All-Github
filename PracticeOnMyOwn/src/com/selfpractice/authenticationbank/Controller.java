package com.selfpractice.authenticationbank;

import java.util.List;
import java.util.Scanner;

public class Controller {
    String username;
    String password;
    Repository repo = new Repository();
    List<User> users = repo.getData();
    Scanner scanner = new Scanner(System.in);

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public void home() {
        Menu.mainMenu();

        int choice = scanner.nextInt();
        scanner.nextLine();
        switch (choice) {
            case 1:
                clearScreen();
                login();
                break;
            case 2:
                clearScreen();
                createAccount();
                break;
            case 3:
                System.exit(1);
                break;
        }
    }

    public void login() {
        boolean checkLogin = false;
        while (!checkLogin) {
            int count = 0;
            System.out.print("Your username: ");
            username = scanner.nextLine();
            for (int i = 0; i < users.size(); i++) {
                if (username.equals(users.get(i).getUsername())) {
                    count++;
                    System.out.print("Your password: ");
                    password = scanner.nextLine();
                    if (password.equals(users.get(i).getPassword())) {
                        loginSuccess();
                        checkLogin = true;
                    } else {
                        loginFail();
                        break;
                    }
                }
            }
            if (count == 0) {
                System.out.println("Tên tài khoản không tồn tại");
            }
        }
    }

    public void createAccount() {
        boolean checkCreate = false;
        long id = 0;
        String newUsername = null;
        String newaccNum = null;
        String newEmail = null;
        String newPassword = null;
        double newBalance = 0.00;
        String reconfirmPassword = null;
        while (!checkCreate) {
            try {
                id = users.size() + 1;
                System.out.print("Enter your username:");
                newUsername = scanner.nextLine();
                for (int i = 0; i < users.size(); i++) {
                    if (newUsername.equals(users.get(i).getUsername()))
                        throw new RuntimeException("This username had existed, please choose another username");
                }
                System.out.print("Enter your email: ");
                newEmail = Validation.validateEmail(scanner.nextLine());
                for (int i = 0; i < users.size(); i++) {
                    if (newEmail.equals(users.get(i).getEmail()))
                        throw new RuntimeException("This email had existed, please choose another email");
                }
                System.out.print("Enter your password: ");
                newPassword = Validation.validatePassword(scanner.nextLine());
                System.out.print("Please re-confirm your password: ");
                reconfirmPassword = Validation.validatePassword(scanner.nextLine());
                if (reconfirmPassword.equals(newPassword)) {
                    System.out.print("Enter your account number:");
                    newaccNum = Validation.validateaccNum(scanner.nextLine());
                    for (int i = 0; i < users.size(); i++) {
                        if (newaccNum.equals(users.get(i).getaccNum()))
                            throw new RuntimeException(
                                    "This bank number had existed, please choose another bank number");
                    }
                } else {
                    throw new RuntimeException(
                            "The re-confirm password and your password is not the same, please try again");
                }
                checkCreate = true;
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
        }
        users.add(new User(id, newaccNum, newUsername, newEmail, newPassword, newBalance));
        Controller.clearScreen();
        System.out.println("Registered successfully! Please re-login into your account");
        login();
    }

    public void loginSuccess() {
        Controller.clearScreen();
        System.out.println("Welcome! " + username + ", please select a method you want to do: ");
        Menu.loginSuccessMenu();
        while (true) {
            int choice;
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    clearScreen();
                    changePassword();
                    break;
                case 2:
                    clearScreen();
                    checkBalance();
                    break;
                case 3:
                    clearScreen();
                    transferMoney();
                    break;
                case 4:
                    clearScreen();
                    withdrawMoney();
                    break;
                case 5:
                    clearScreen();
                    depositMoney();
                    break;
                case 6:
                    clearScreen();
                    home();
                    break;
                case 0:
                    System.exit(1);
                default:
                    break;
            }
        }
    }

    public void loginFail() {
        Controller.clearScreen();
        Menu.loginFailMenu();
        while (true) {
            int choice;
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    clearScreen();
                    login();
                    break;
                case 2:
                    clearScreen();
                    forgotPassword();
                    break;
                default:
                    break;
            }
        }
    }

    public void changePassword() {
        System.out.print("Please enter the old password: ");
        password = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < users.size(); i++) {
            if (password.equals(users.get(i).getPassword())) {
                count++;
                String newPassword = null;
                String reConfirmPassword = null;
                boolean check = false;
                while (!check) {
                    try {
                        System.out.print("Please enter the new password: ");
                        newPassword = Validation.validatePassword(scanner.nextLine());
                        System.out.print("Please re-confirm your password: ");
                        reConfirmPassword = Validation.validatePassword(scanner.nextLine());
                        if (reConfirmPassword.equals(newPassword)) {
                            check = true;
                        } else {
                            System.out.println("Wrong re-confirm password, please try again");
                        }
                    } catch (RuntimeException e) {
                        System.out.println(e);
                    }
                }
                users.get(i).setPassword(newPassword);
                System.out.println("Password changed successfully, please try logging in");
                login();
                password = newPassword;
            }
        }
        if (count == 0) {
            System.out.println("The password you have entered is invalid, please try again");
        }
    }

    public void checkBalance() {
        for (int i = 0; i < users.size(); i++) {
            if (username.equals(users.get(i).getUsername()))
                System.out.println("Your current balance is: " + users.get(i).getBalance());
        }
        System.out.println("1 - Return to login menu");
        System.out.println("2 - Exit");
        int choice;
        choice = scanner.nextInt();
        scanner.nextLine();
        switch (choice) {
            case 1:
                clearScreen();
                Menu.loginSuccessMenu();
                break;
            case 2:
                clearScreen();
                System.exit(1);
            default:
                break;
        }
    }

    public void transferMoney() {
        boolean checkTransfer = false;
        int count = 0;
        String accNumTransfer = null;
        double newBalance = 0.0;
        while (!checkTransfer) {
            try {
                System.out.print("Please enter the account number you want to transfer to: ");
                accNumTransfer = scanner.nextLine();
                for (int i = 0; i < users.size(); i++) {
                    if (accNumTransfer.equals(users.get(i).getaccNum())) {
                        count++;
                        double transferAmount;
                        System.out.print("Please enter the amount of money you want to transfer: ");
                        transferAmount = scanner.nextDouble();
                        if (transferAmount > 0) {
                            clearScreen();
                            System.out.println("Money has been transfered to " + users.get(i).getUsername());
                            newBalance = users.get(i).getBalance() + transferAmount;
                            users.get(i).setBalance(newBalance);
                            for (int j = 0; j < users.size(); j++) {
                                if (username.equals(users.get(j).getUsername())) {
                                    checkTransfer = true;
                                    System.out.println(
                                            "Your current balance is: " + (users.get(j).getBalance() - transferAmount));
                                    newBalance = users.get(j).getBalance() - transferAmount;
                                    users.get(j).setBalance(newBalance);
                                }
                            }
                        } else {
                            throw new RuntimeException("Your balance is not enough to be transfered");
                        }
                    }
                }
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
            if (count == 0) {
                System.out.println("Can't find that account number, please try again");
            }
        }
        System.out.println("1 - Return to login menu");
        System.out.println("2 - Exit");
        int choice;
        choice = scanner.nextInt();
        scanner.nextLine();
        switch (choice) {
            case 1:
                clearScreen();
                Menu.loginSuccessMenu();
                break;
            case 2:
                clearScreen();
                System.exit(1);
            default:
                break;
        }
    }

    public void withdrawMoney() {
        double withdrawAmount;
        boolean checkWithdraw = false;
        double newBalance = 0.0;
        while (!checkWithdraw) {
            try {
                System.out.print("Enter the amount of money you want to withdraw: ");
                withdrawAmount = scanner.nextDouble();
                for (int i = 0; i < users.size(); i++) {
                    if (users.get(i).getBalance() > withdrawAmount) {
                        if (username.equals(users.get(i).getUsername())) {
                            checkWithdraw = true;
                            System.out.println("Withdraw successfully! Your balance is now: "
                                    + (users.get(i).getBalance() - withdrawAmount));
                            newBalance = users.get(i).getBalance() - withdrawAmount;
                            users.get(i).setBalance(newBalance);
                        }
                    } else {
                        throw new RuntimeException("Your balance is not enough to be withdrawed");
                    }
                }
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("1 - Return to login menu");
        System.out.println("2 - Exit");
        int choice;
        choice = scanner.nextInt();
        scanner.nextLine();
        switch (choice) {
            case 1:
                clearScreen();
                Menu.loginSuccessMenu();
                break;
            case 2:
                clearScreen();
                System.exit(1);
            default:
                break;
        }
    }

    public void depositMoney() {
        double depositAmount;
        double newBalance;
        for (int i = 0; i < users.size(); i++) {
            if (username.equals(users.get(i).getUsername())) {
                System.out.print("Enter the amount you want to deposit: ");
                depositAmount = scanner.nextDouble();
                System.out.println(
                        "Deposit successfully! Your balance is now: " + (users.get(i).getBalance() + depositAmount));
                newBalance = users.get(i).getBalance() + depositAmount;
                users.get(i).setBalance(newBalance);
            }
        }
        System.out.println("1 - Return to login menu");
        System.out.println("2 - Exit");
        int choice;
        choice = scanner.nextInt();
        scanner.nextLine();
        switch (choice) {
            case 1:
                clearScreen();
                Menu.loginSuccessMenu();
                break;
            case 2:
                clearScreen();
                System.exit(1);
            default:
                break;
        }
    }

    public void forgotPassword() {
        String recoveryEmail = null;
        int count = 0;
        System.out.print("Enter your account's email: ");
        recoveryEmail = Validation.validateEmail(scanner.nextLine());
        for (int i = 0; i < users.size(); i++) {
            if (recoveryEmail.equals(users.get(i).getEmail())) {
                boolean checkValidate = false;
                count++;
                while (!checkValidate) {
                    try {
                        String newPassword;
                        System.out.print("Enter your new password: ");
                        newPassword = Validation.validatePassword(scanner.nextLine());
                        users.get(i).setPassword(newPassword);
                        System.out.println("Changed password successfully!");
                        checkValidate = true;
                    } catch (RuntimeException e) {
                        System.out.println(e.getMessage() + ", please re-enter a valid password");
                    }
                    if (checkValidate = true) {
                        clearScreen();
                        System.out.println("Please log-in again");
                        login();
                    }
                }
            }
        }
        if (count == 0) {
            System.out.println("The email you entered is invalid, please try again");
        }
        System.out.println("1 - Try again");
        System.out.println("2 - Exit");
        int choice;
        choice = scanner.nextInt();
        scanner.nextLine();
        switch (choice) {
            case 1:
                clearScreen();
                forgotPassword();
                break;
            case 2:
                clearScreen();
                System.exit(1);
                break;
            default:
                break;
        }
    }
}
