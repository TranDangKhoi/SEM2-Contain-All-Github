package com.diy1;

import com.example.jp2.thread.DemoThread;

public class MainThread {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        System.out.println("Thread's current name is: " + myThread.getName());
        myThread.setName("myJavaThread");
        System.out.println("Thread's changed name is: " + myThread.getName());
        myThread.run();

    }

}
