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
        String newUsername;
        String newBankNum;
        String newEmail;
        String newPassword;
        double newBalance;
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
                newBankNum = Validation.validateBankNum(scanner.nextLine());
                newBalance = 0;
                for (int i = 0; i < users.size(); i++) {
                    if (newUsername.equals(users.get(i).getUsername()))
                        throw new RuntimeException("This username had existed, please choose another username");
                    if (newEmail.equals(users.get(i).getEmail()))
                        throw new RuntimeException("This email had existed, please choose another email");
                    if (newBankNum.equals(users.get(i).getBankNum()))
                        throw new RuntimeException("This bank number had existed, please choose another bank number");
                }
                checkCreate = true;
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
        }
        users.add(new User(id, newBankNum, newUsername, newEmail, newPassword, newBalance));
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
            switch (choice) {
                case 1:
                    clearScreen();
                    changePassword();
                    break;
                case 2:
                    clearScreen();
                    checkBalance();
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
    }

    public void checkBalance() {
        for (int i = 0; i < users.size(); i++) {
            System.out.println("Your current balance is: " + users.get(i).getBalance());
        }
    }

    public void transferMoney() {
        int count = 0;
        String bankNumTransfer = null;
        boolean checkTransfer = false;
        while (!checkTransfer) {
            System.out.print("Please enter the account number you want to transfer to: ");
            bankNumTransfer = scanner.nextLine();
            for (int i = 0; i < users.size(); i++) {
                if (bankNumTransfer.equals(users.get(i).getBankNum())) {
                    count++;
                    double transferAmount;
                    try {
                        System.out.print("Please enter the amount of money you want to transfer: ");
                        transferAmount = scanner.nextDouble();
                        if (users.get(i).getBalance() < transferAmount)
                            throw new RuntimeException("Your balance is not enough to transfer");
                    } catch (RuntimeException e) {
                        System.out.println(e.getMessage());
                    }
                }
                if (count == 0) {
                    System.out.println("The bank number you entered is not existed, please try again");
                }
            }
        }
    }

    public void withdrawMoney() {

    }
}
