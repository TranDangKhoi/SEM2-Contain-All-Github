package jdbcuserdemo.view;

import java.io.PrintStream;
import java.sql.SQLException;
import java.util.Scanner;
import static java.nio.charset.StandardCharsets.UTF_8;

import jdbcuserdemo.controller.LoginController;
import jdbcuserdemo.entity.User;

public class LoginConsole {
    PrintStream out = new PrintStream(System.out, true, UTF_8);
    LoginController loginController = new LoginController();
    User users = new User();
    private final Scanner sc;

    public LoginConsole() {
        this.sc = new Scanner(System.in);
    }

    public int menu() {
        out.println("---Menu---");
        out.println("1. Đăng nhập với Statement");
        out.println("2. Đăng nhập với PreparedStatement");
        out.println("3. Thoát chương trình");
        int choice = readInt(1, 3);
        return choice;
    }

    public int readInt(int min, int max) {
        int choice;
        while (true) {
            try {
                choice = Integer.parseInt(sc.nextLine());
                if (choice >= min || choice <= max) {
                    return choice;
                } else {
                    throw new NumberFormatException("Please enter a valid number");
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
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

    public void loginStatement() throws ClassNotFoundException, SQLException {
        out.print("Nhập vào username: ");
        String username = sc.nextLine();
        users.setUsername(username);
        out.print("Nhập vào password: ");
        String password = sc.nextLine();
        users.setPassword(password);
        String msg = loginController.loginStatement(users);
        out.println(msg);
    }

    public void loginPrepareStatement() throws ClassNotFoundException, SQLException {
        out.print("Nhập vào username: ");
        String username = sc.nextLine();
        users.setUsername(username);
        out.print("Nhập vào password: ");
        String password = sc.nextLine();
        users.setPassword(password);
        String msg = loginController.loginPrepareStatement(users);
        out.println(msg);
    }
}
