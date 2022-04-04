package com.diy1;

public class MyThread extends Thread {
    @Override
    public void run() {
        // super.run();
        for (int i = 0; i < 20; i++) {
            if (i % 2 != 0) {
                System.out.printf("%d\n", i);
            }
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
