package com.company;

public class Student {
    public String name;
    public String color;
    public String gender;
    public int age;

    public Student() {
        //Empty Default Constructor
        //If we create custom constructor then it is necessary to create empty constructor
    }

    public Student(String n, int a, String c, String g) {  //Custom Constructor
        this.name = n;
        this.age = a;
        this.color = c;
        this.gender = g;
    }

    public Student(String n, int a, String c) {
        this.name = n;
        this.age = a;
        this.color = c;
    }

    public Student(String c, String g) {
        this.color = c;
        this.gender = g;
    }


    public void Eating(String Value) {
        System.out.println(name + " is eating " + Value);
    }

    public void Drinking(String Value) {
        System.out.println(name + " is drinking " + Value);
    }

    public void Running(String Value) {
        System.out.println(name + " is running " + Value);
    }

}
