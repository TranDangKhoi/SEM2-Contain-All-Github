package jdbcuserdemo2.view;

import java.sql.SQLException;
import java.util.Scanner;

import jdbcuserdemo.controller.LoginController;
import jdbcuserdemo.entity.User;

public class LoginConsole {
    private final Scanner sc;
    LoginController loginController = new LoginController();
    User user1 = new User();

    public LoginConsole() {
        sc = new Scanner(System.in);
    }

    public int menu() {
        int choice;
        System.out.println("---Login Screen---");
        System.out.println("1. Login with Statement");
        System.out.println("2. Login with PreparedStatement");
        System.out.println("3. Exit program");
        choice = readInt(1, 3);
        return choice;
    }

    public int readInt(int min, int max) {
        int choice;
        while (true) {
            try {
                choice = Integer.parseInt(sc.nextLine());
                if (choice >= 1 && choice <= 3) {
                    return choice;
                } else {
                    throw new NumberFormatException("Please enter a valid number");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void start() throws ClassNotFoundException, SQLException {
        while (true) {
            int choice;
            choice = menu();
            switch (choice) {
                case 1:
                    loginStatement();
                    break;
                case 2:
                    loginPrepareStatement();
                    break;
                case 3:
                    System.exit(0);
                default:
                    break;

            }
        }

    }

    public void loginStatement() throws ClassNotFoundException, SQLException {
        System.out.print("Enter username: ");
        String username = sc.nextLine();
        user1.setUsername(username);
        System.out.print("Enter password: ");
        String password = sc.nextLine();
        user1.setPassword(password);
        String msg = loginController.loginStatement(user1);
        System.out.println(msg);
    }

    public void loginPrepareStatement() throws ClassNotFoundException, SQLException {
        System.out.print("Enter username: ");
        String username = sc.nextLine();
        user1.setUsername(username);
        System.out.print("Enter password: ");
        String password = sc.nextLine();
        user1.setPassword(password);
        String msg = loginController.loginPrepareStatement(user1);
        System.out.println(msg);
    }
}
