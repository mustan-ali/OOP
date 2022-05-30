package com.company;

import java.util.ArrayList;

public class University {
    private String name;
    private ArrayList<Department> departments;

    public University(String name, ArrayList<Department> departments) {
        this.name = name;
        this.departments = departments;
    }

    public int getNumberOfStudents() {
        int noOfStudents = 0;
        ArrayList<Student> students;
        for (Department dept : departments) {
            students = dept.getStudents();
            for (Student s : students) {
                noOfStudents++;
            }
        }
        return noOfStudents;
    }


}
