package com.company;

public class Student extends Person {

    private int numOfCourses;
    private String[] courses;
    private int[] grades;
    private static final int MAX_COURSES = 10;

    public Student(String name, String address) {
        super(name, address);
        this.numOfCourses = 0;
        courses = new String[MAX_COURSES];
        grades = new int[MAX_COURSES];
    }

    public String toString() {
        return "Student--> " + super.toString();    //super.toString() will call toString from super class
    }

    public void addCourseGrade(String course, int grade) {
        courses[numOfCourses] = course;
        grades[numOfCourses] = grade;
        numOfCourses++;
    }

    public void printGrades() {
        //System.out.println(this);
        for (int i = 0; i < numOfCourses; i++) {
            System.out.println(" " + courses[i] + " : " + grades[i]);
        }
    }

    public double getAverage() {
        int sum = 0;
        for (int i = 0; i < numOfCourses; i++) {
            sum += grades[i];
        }
        return (double) sum / numOfCourses;
    }
}
