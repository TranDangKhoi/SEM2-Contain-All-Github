package com.examplecar;

public class RacingCar extends Thread {
    int finish;
    String name;

    public RacingCar(int finish, String name) {
        this.finish = finish;
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < finish; i++) {
            System.out.println(name + " has gone " + (i + 1) + " km");
            try {
                Thread.sleep(Math.round(Math.random() * 50000));
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        System.out.println();
    }
}
