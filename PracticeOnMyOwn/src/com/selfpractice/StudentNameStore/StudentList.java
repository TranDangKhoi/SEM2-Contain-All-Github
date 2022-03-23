package com.selfpractice.StudentNameStore;

import java.util.ArrayList;


public class StudentList {
    ArrayList<Student> myStudentsList;

    public StudentList(){
        myStudentsList = new ArrayList<Student>();
    }

    public void add(Student student){
        myStudentsList.add(student);
    }

  

    public void showNameList(){
        System.out.println("\t\tAll Students's Names");
        for(Student myStudent: myStudentsList){
            myStudent.printInfo();
        }
    }

    
}
