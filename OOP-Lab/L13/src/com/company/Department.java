package com.company;

import java.util.ArrayList;

public class Department {
    private String name;
    private ArrayList<Student> students;

    public Department(String name, ArrayList<Student> students) {
        this.name = name;
        this.students = students;
    }

    public ArrayList<Student> getStudents() {
        return this.students;
    }
}
