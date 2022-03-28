package com.selfpractice.studentnamesearch;

import java.util.ArrayList;

public class StudentList {
    ArrayList<Student> myStuList;

    public StudentList() {
        myStuList = new ArrayList<Student>();
    }

    public void add(Student myStudent) {
        myStuList.add(myStudent);
    }

    public ArrayList<Student> findByName(String name) {
        boolean found = false;
        ArrayList<Student> matches = new ArrayList<>();
        for (Student myStudent : myStuList) {
            String studentName = new String(myStudent.getStuName().toLowerCase());
            if (studentName.matches("(.*)" + name.toLowerCase() + "(.*)")) {
                found = true;
                matches.add(myStudent);
            }
        }
        if (found == false) {
            System.out.println("Can't find those students");
        }
        return matches;
    }

    public void show() {
        System.out.println("All Students's Names:");
        for (Student myStudent : myStuList) {
            myStudent.printInfo();
        }
    }

    public void show(ArrayList<Student> nlist) {
        System.out.println("Student's found names:");
        for (Student myStudent : nlist) {
            myStudent.printInfo();
        }
    }
}
