package com.lab.example;

public class Counter {
    int value;

    // The forward-count method, that increases the value from 0 to 9,
    // print out the value in each steps (with 300ms aka 0.3s delay)
    public void count() {
        value = 0;
        while (value < 10) {
            System.out.println("Count:" + (++value));
            pause(300);
        }
    }

    // The downward-count method, that decreases the value from 10 to 0,
    // print out the value in each steps (with 200ms delay)
    public void countdown() {
        value = 10;
        while (value >= 0) {
            System.out.println("Countdown: " + (value--));
            pause(200);
        }
    }

    // Sleep method
    private void pause(long time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
        }
    }
}
