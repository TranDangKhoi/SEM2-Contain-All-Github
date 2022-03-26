package com.selfpractice.authenticationbank;

public class Application {
    public static void main(String[] args) throws Exception {
        Controller.clearScreen();
        Controller controller = new Controller();
        controller.home();
    }
}
