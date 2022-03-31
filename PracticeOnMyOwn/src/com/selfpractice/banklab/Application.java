package com.selfpractice.banklab;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ValidateAccount validate = new ValidateAccount();
        Controller controller = new Controller();

        boolean isCheck = false;
        while (!isCheck) {
            System.out.println("Enter phone number:");
            String mobile = sc.nextLine();

            System.out.println("Enter password:");
            String password = sc.nextLine();

            isCheck = validate.checkAccount(mobile, password);

        }
        while (true) {
            menu();
            int choose = sc.nextInt();
            sc.nextLine();
            switch (choose) {
                case 1:
                    System.out.println("Balance: ");
                    long balance = controller.getBalanceNumber();
                    System.out.println(Controller.formatMoney(balance));
                    break;
                case 2:
                    controller.actionTransfer();
                    break;
                case 3:
                    System.out.println("Transaction history:");
                    controller.getHistory();
                    break;
                case 0:
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("There is no such choice");
                    break;
            }
        }
    }

    public static void menu() {
        System.out.println("Select one method:");
        System.out.println("1. Check balance");
        System.out.println("2. Transfer");
        System.out.println("3. Check transaction history");
    }
}
