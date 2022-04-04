package com.example.jp2.thread;

public class DemoThread extends Thread {

    @Override
    public void run() {
        // TODO Auto-generated method stub
        // super.run();
        int index = 1;
        for (int i = 0; i < 20; i++) {
            System.out.println("DemoThread is running " + index++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
