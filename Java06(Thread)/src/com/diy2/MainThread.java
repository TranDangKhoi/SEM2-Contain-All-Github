package com.diy2;

public class MainThread {
    public static void main(String[] args) throws InterruptedException {
        FirstThread firstThread = new FirstThread();
        SecondThread secondThread = new SecondThread();
        ThirdThread thirdThread = new ThirdThread();

        firstThread.start();
        secondThread.start();
        thirdThread.start();
    }
}
