package com.diy2;

public class ThirdThread extends Thread {

    @Override
    public void run() {
        for (int finish = 5; finish > 0; finish--) {
            System.out.println("Third:" + finish);

            try {
                Thread.sleep(1200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Third thread exitted");
    }
}
