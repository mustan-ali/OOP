package com.company;

public class Main {

    public static void main(String[] args) {

        Student s1 = new Student("Jack", 20, "Fair", "Male");

        Student s2 = new Student("HelloWorld", 17, "Dark");

        Student s3 = new Student("Color", "Male");

//        s1.name = "Ali";
//        s1.age = 21;
//        s1.color = "Fair";
//        s1.gender = "Male";
//        s1.Student("Jack",20,"Fair","Male");

        s1.Eating("cookie");
        s1.Drinking("water");
        s1.Running("fast");

        System.out.println("----------------------");

        s2.Eating("cookie");
        s2.Drinking("water");
        s2.Running("fast");

        System.out.println("----------------------");

        s3.Eating("cookie");
        s3.Drinking("water");
        s3.Running("fast");

    }
}

