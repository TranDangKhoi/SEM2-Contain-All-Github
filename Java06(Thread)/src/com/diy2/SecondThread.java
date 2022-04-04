package com.diy2;

public class SecondThread extends Thread {

    @Override
    public void run() {
        for (int finish = 5; finish > 0; finish--) {
            System.out.println("Second:" + finish);

            try {
                Thread.sleep(1100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Second thread exitted");
    }

}
