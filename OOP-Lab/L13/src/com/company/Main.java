package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Dimension dimension = new Dimension(20, 20, 50);
        Case theCase = new Case("A12da", "DELL", "240", dimension);
        Monitor theMonitor = new Monitor("27 Inch HD", "DELL", 27, new Resolution(1920, 1080));
        Motherboard theMotherboard = new Motherboard("XJ-21", "ASUS", 4, 2, "V1.20");

        PC thePC = new PC(theCase, theMonitor, theMotherboard);

        thePC.getTheCase().pressPowerButton();
        thePC.getTheMonitor().drawPixelArt(1500, 1200, "Red");
        thePC.getTheMotherboard().loadProgram("Windows 10");
        thePC.getTheCase().pressResetButton();

        System.out.println("-------------------------------------------------------------");

        Student s1 = new Student("Ali", 1, "BSCS");
        Student s2 = new Student("John", 2, "BSCS");
        Student s3 = new Student("Jack", 1, "BSSE");
        Student s4 = new Student("Jeff", 2, "BSSE");

        ArrayList<Student> cs_students = new ArrayList<>();
        ArrayList<Student> se_students = new ArrayList<>();

        cs_students.add(s1);
        cs_students.add(s2);
        se_students.add(s3);
        se_students.add(s4);

        Department CS = new Department("CS", cs_students);
        Department SE = new Department("SE", se_students);

        ArrayList<Department> departments = new ArrayList<>();
        departments.add(CS);
        departments.add(SE);

        University university = new University("SZABIST", departments);

        System.out.print("Total students count in University List: ");
        System.out.println(university.getNumberOfStudents());

        System.out.print("Total Students in CS Department: ");
        System.out.println(CS.getStudents());

        System.out.print("Total Students in SE Department: ");
        System.out.println(SE.getStudents());

    }
}

//1. Dependency: Aggregation implies a relationship where the child can exist independently of the parent.
//   For example, Bank and Employee, delete the Bank and the Employee still exist.
//   whereas Composition implies a relationship where the child cannot exist independent of the parent.
//   Example: Human and heart, heart don’t exist separate to a Human.
//2. Type of Relationship: Aggregation relation is “has-a” and composition is “part-of” relation.
//3. Type of association: Composition is a strong Association whereas Aggregation is a weak Association.

