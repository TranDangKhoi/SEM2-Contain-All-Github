package com.example.jp2.thread;

public class MainThread {
    public static void main(String[] args) throws InterruptedException {
        int index = 1;
        for (int i = 0; i < 5; i++) {
            System.out.println("MainThread is running " + index++);
            Thread.sleep(2000); // Sleep 2s
        }
        DemoThread demoThread = new DemoThread();

        demoThread.start(); // Chạy thread
        for (int i = 0; i < 5; i++) {
            System.out.println("MainThread is running " + index++);
            Thread.sleep(2000); // Sleep 2s
        }

        System.out.println("Main thread stopped");
    }
}
