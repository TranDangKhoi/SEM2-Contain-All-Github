package com.selfpractice.authenticationbank;

public class Menu {
    public static void mainMenu() {
        System.out.println("Select one: ");
        System.out.println("1 - Sign in");
        System.out.println("2 - Sign up");
        System.out.println("3 - Exit");
        System.out.println("Your choice is: ");
    }

    public static void loginFailMenu() {
        System.out.println("Wrong password, please try again: ");
        System.out.println("1 - Re-logging in");
        System.out.println("2 - Forgot your password");
        System.out.print("Your choice is: ");

    }

    public static void loginSuccessMenu() {
        System.out.println("1 - Change your password");
        System.out.println("2 - Check your balance");
        System.out.println("3 - Transfer money");
        System.out.println("4 - Withdraw money");
        System.out.println("5 - Deposit money");
        System.out.println("6 - Sign out");
        System.out.println("0 - Exit");
        System.out.print("Your choice is: ");
    }
}
