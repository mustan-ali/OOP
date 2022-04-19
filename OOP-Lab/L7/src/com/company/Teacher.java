package com.company;

public class Teacher extends Person {

    private int numOfCourses;
    private String[] courses;
    private static final int MAX_COURSES = 5;

    public Teacher(String name, String address) {
        super(name, address);
        this.numOfCourses = 0;
        courses = new String[MAX_COURSES];
    }

    public String toString() {
        return "Teacher--> " + super.toString();    //super.toString() will call toString from super class
    }

    public Boolean addCourse(String course) {
        for (int i = 0; i < numOfCourses; i++) {    //Checks if course name passed as parameter already exists
            if (courses[i].equals(course)) {
                return false;
            }
        }
        courses[numOfCourses] = course;
        numOfCourses++;
        return true;
    }

    public Boolean removeCourse(String course) {
        boolean found = false;

        int courseIndex = 0;
        for (int i = 0; i < numOfCourses; i++) {
            if (courses[i].equals(course)) {
                courseIndex = i;
                found = true;
                break;
            }
        }
        if (found) {        //found = true
            for (int i = courseIndex; i < numOfCourses; i++) {
                courses[i] = courses[i - 1];
            }
            numOfCourses--;
            return true;
        } else {
            return false;
        }
    }

    public void printAllCourses() {
        for (int i = 0; i < numOfCourses; i++) {
            System.out.println(courses[i]);
        }
    }
}
