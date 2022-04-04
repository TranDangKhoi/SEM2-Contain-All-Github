package com.example.jp2.deamon;

public class DeamonThread extends Thread {
    @Override
    public void run() {
        int count = 0;
        while (true) {
            System.out.println("Deamon Thread is running " + count++);
            try {
                sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
