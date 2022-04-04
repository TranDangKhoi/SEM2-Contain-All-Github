package com.example.jp2.deamon;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("Main thread runnning");

        Thread deamonThread = new DeamonThread();
        deamonThread.setDaemon(true); //luồng ngầm định
        deamonThread.start();

        NonDeamonThread nonDeamonThread = new NonDeamonThread();
        nonDeamonThread.start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread stopped");
    }
}
