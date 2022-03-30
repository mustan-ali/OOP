package com.company;

public class Circle extends Shapes {
    public double circumference;
    public double diameter;
    public double area;


    public void setCircumference() {
        this.circumference = 2 * Math.PI * getRadius();
    }


    public double getCircumference() {
        return circumference;
    }

    public void setDiameter() {
        this.diameter = getRadius() * 2;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setArea() {
        this.area = Math.PI * Math.pow(getRadius(), 2);
    }

    public double getArea() {
        return area;
    }

    public void get_Circle_Details() {
        setArea();
        setCircumference();
        setDiameter();
        System.out.println("\nRadius: " + getRadius() + "" +
                "\nDiameter: " + getDiameter() +
                "\nArea: " + getArea() +
                "\nCircumference: " + getCircumference());
    }

}
