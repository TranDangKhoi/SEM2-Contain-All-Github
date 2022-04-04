package com.example.jp2.run;

public class RunnableDemo implements Runnable {

    @Override
    public void run() {
        int index = 1;
        for (int i = 0; i < 5; i++) {
            System.out.println("RunnableDemo is running " + index++);
            //Ngu khoang 3 giay
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
