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
            System.out.print("Hãy nhập vào tên tài khoản của bạn:");
            username = scanner.nextLine();
            for (int i = 0; i < users.size(); i++) {
                if (username.equals(users.get(i).getUsername())) {
                    count++;
                    System.out.print("Hãy nhập vào mật khẩu của bạn:");
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
        while (!checkCreate) {
            try {
                id = users.size() + 1;
                System.out.print("Nhập tên tài khoản:");
                newUsername = scanner.nextLine();
                System.out.print("Nhập email: ");
                newEmail = Validation.validateEmail(scanner.nextLine());
                System.out.print("Nhập mật khẩu: ");
                newPassword = Validation.validateEmail(scanner.nextLine());
                System.out.print("Nhập số tài khoản:");
                newaccNum = Validation.validateaccNum(scanner.nextLine());
                for (int i = 0; i < users.size(); i++) {
                    if (newUsername.equals(users.get(i).getUsername()))
                        throw new RuntimeException("This username had existed, please choose another username");
                    if (newEmail.equals(users.get(i).getEmail()))
                        throw new RuntimeException("This email had existed, please choose another email");
                    if (newaccNum.equals(users.get(i).getaccNum()))
                        throw new RuntimeException("This bank number had existed, please choose another bank number");
                }
                checkCreate = true;
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
        }
        users.add(new User(id, newaccNum, newUsername, newEmail, newPassword, newBalance));
        Controller.clearScreen();
        System.out.println("Đăng kí thành công vui lòng đăng nhập lại");
        login();
    }

    public void loginSuccess() {
        Controller.clearScreen();
        System.out.println("Chào mừng " + username + "quay trở lại, hãy chọn phương thức bạn muốn thực hiện:");
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
                    signOut();
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
        System.out.println("Please enter the old password: ");
        password = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < users.size(); i++) {
            if (password.equals(users.get(i).getPassword())) {
                count++;
                String newPassword = null;
                // String reConfirmPassword = null;
                boolean check = false;
                while (!check) {
                    try {
                        System.out.print("Please enter the new password: ");
                        newPassword = Validation.validatePassword(scanner.nextLine());
                        check = true;
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
        int count = 0;
        String accNumTransfer = null;
        boolean checkTransfer = false;
        while (!checkTransfer) {
            System.out.print("Please enter the account number you want to transfer to: ");
            accNumTransfer = scanner.nextLine();
            for (int i = 0; i < users.size(); i++) {
                if (accNumTransfer.equals(users.get(i).getaccNum())) {
                    count++;
                    double transferAmount;
                    try {
                        System.out.print("Please enter the amount of money you want to transfer: ");
                        transferAmount = scanner.nextDouble();
                        if (users.get(i).getBalance() > transferAmount) {
                            checkTransfer = true;
                            clearScreen();
                            System.out.println("Money has been transfered");
                            loginSuccess();
                        } else {
                            throw new RuntimeException("Your balance is not enough to be transfered");
                        }
                    } catch (RuntimeException e) {
                        System.out.println(e.getMessage());
                    }
                }
                if (count == 0) {
                    System.out.println("The account number you entered is not existed, please try again");
                }
            }
        }
    }

    public void withdrawMoney() {
        double withdrawAmount;
        boolean checkWithdraw = false;
        while (!checkWithdraw) {
            try {
                System.out.print("Enter the amount of money you want to withdraw: ");
                withdrawAmount = scanner.nextDouble();
                for (int i = 0; i < users.size(); i++) {
                    if (users.get(i).getBalance() > withdrawAmount && username.equals(users.get(i).getUsername())) {
                        checkWithdraw = true;
                        System.out.println("Withdraw successfully! Your balance is now: "
                                + (users.get(i).getBalance() - withdrawAmount));
                    } else {
                        throw new RuntimeException("Your balance is not enough to be withdrawed");
                    }
                }
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public void depositMoney() {
        double depositAmount;
        for (int i = 0; i < users.size(); i++) {
            if (username.equals(users.get(i).getUsername())) {
                System.out.print("Enter the amount you want to deposit: ");
                depositAmount = scanner.nextDouble();
                System.out.println(
                        "Deposit successfully! Your balance is now: " + (users.get(i).getBalance() + depositAmount));
            }
        }
    }

    public void signOut() {

    }

    public void forgotPassword() {
    }
}
