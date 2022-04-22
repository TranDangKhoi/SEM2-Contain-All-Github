package com.doctorapp;

public class Doctor implements Comparable {
    private String name = "";

    private int task = 0;

    public Doctor() {

    }

    public Doctor(String name, int task) {
        this.name = name;
        this.task = task;
    }

    public int compareTo(Object o) {
        // Create a Doctor object
        Doctor doc = (Doctor) o;

        int a = 0;
        int b = 0;
        a = this.task;
        b = doc.task;

        // Highest number determines the highest priority for the appointments
        if (a < b)
            return -1;
        if (a > b)
            return 1;
        return 0;

    }

    public String toString() {
        return "\nThe Doctor is appointed for = " + name + "\nThe prority  for the appointment is = " + task;
    }

}
