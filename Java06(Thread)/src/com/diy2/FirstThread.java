package com.diy2;

public class FirstThread extends Thread {

    @Override
    public void run() {
        for (int finish = 5; finish > 0; finish--) {
            System.out.println("First:" + finish);
            try {
                Thread.sleep(1000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("First thread exitted");
    }
}
