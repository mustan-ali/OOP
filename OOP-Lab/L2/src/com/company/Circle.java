package com.company;

public class Circle {
    private double radius;
    private String color;

    //Default Constructor
    public Circle() {
        this.radius = 1.2;
        this.color = "Red";
    }

    public Circle(double r) {
        this.radius = r;
        this.color = "Blue";
    }

    //Parameterized Constructor
    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public Circle(double r, String c) {
        this.radius = r;
        this.color = c;
    }

}
