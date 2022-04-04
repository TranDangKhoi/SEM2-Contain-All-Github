package com.diy2;

public class ThreadDemo extends Thread {
    private String threadName;

    public ThreadDemo(String name) {
        threadName = name;
    }

    public void run() {
        System.out.println("New Thread: " + Thread.currentThread());
        for (int i = 5; i > 0; i--) {
            System.out.println(threadName + ":" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Thread " + threadName + " exitting");
    }

    public void start() {
        new Thread(this, threadName).start();
    }
}
