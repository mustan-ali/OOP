package com.company;

public class Main {

    public static void main(String[] args) {

        Point_2D p2D = new Point_2D();

        System.out.println(p2D);    //Print value from default constructor

        Point_2D p2D1 = new Point_2D(4,6);
        System.out.println(p2D1);

        Point_3D p3D = new Point_3D();
        System.out.println(p3D);        //Print value from default constructor

        Point_3D p3D1 = new Point_3D(4,6,7);
        System.out.println(p3D1);

        System.out.println("-----------------------------------------");

        Student s = new Student("Haxor", "123 Street");

        System.out.println(s);      //Prints toString() since object is printed.

        s.addCourseGrade("CS120", 99);
        s.addCourseGrade("CS121", 98);
        s.addCourseGrade("CS122", 97);

        s.printGrades();
        System.out.println("Average Grade = " + s.getAverage() + "\n");

        Teacher t = new Teacher("Hxr", "321 Street");
        System.out.println(t);
        t.addCourse("CS120");
        t.addCourse("CS121");
        t.addCourse("CS121");       //this will be not added because course with this name already exist

        t.printAllCourses();

        System.out.println("\n");

        t.removeCourse("CS121");

        t.printAllCourses();

    }
}
