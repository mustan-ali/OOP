package com.company;

public class Rectangle {

    private double height;
    private double width;

    public Rectangle() {    //These are the default values
        this.height = 5.2;
        this.width = 10.3;
    }

    public Rectangle(double h, double w) {
        this.height = h;
        this.width = w;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getParameter() {
        return 2 * (this.height + this.width);
    }

    public double getHeight() {
        return this.height;
    }

    public double getWidth() {
        return this.width;
    }

    public void setHeight(double h) {
        this.height = h;
    }

    public void setWidth(double w) {
        this.width = w;
    }

    public String toString() {      //this will be utilized when object is printed by its name
        return "Width: " + this.width + "\n" + "Height: " + this.height + "\n" +
                "Area: " + this.getArea() + "\n" + "Parameter: " + this.getParameter();
    }
}

