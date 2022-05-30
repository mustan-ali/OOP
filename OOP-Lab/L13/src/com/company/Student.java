package com.company;

public class Student {
    private String name;
    private int id;
    private String department;

    public Student(String name, int id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }

    public String getName() {
        return this.name;
    }

    public int getId() {
        return this.id;
    }

    public String getDepartment() {
        return this.department;
    }

    @Override
    public String toString() {
        return "Student Name: " + getName() +
                " Student ID: " + getId() +
                " Student Department: " + getDepartment();
    }
}
