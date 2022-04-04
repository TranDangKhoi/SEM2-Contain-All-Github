package com.example.jp2.deamon;

public class NonDeamonThread extends Thread {

    @Override
    public void run() {
        // TODO Auto-generated method stub
        // super.run();
        int i = 0;
        while (i < 10) {
            System.out.println("NonDeamonThread is running " + i++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("NonDeadmonThread stopped ");
    }

}
