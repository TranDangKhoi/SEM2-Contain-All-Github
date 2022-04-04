package com.diy2;

public class MainThread {
    public static void main(String[] args) throws InterruptedException {
        ThreadDemo t1 = new ThreadDemo("First");
        ThreadDemo t2 = new ThreadDemo("Second");
        ThreadDemo t3 = new ThreadDemo("Third");

        t1.start();
        t2.start();
        t3.start();
    }
}
