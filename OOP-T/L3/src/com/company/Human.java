package com.company;

public class Human {

//  Encapsulation is used to hide the values inside a class, preventing unauthorized direct access to them.

    private double weight, height, BMI;     //Encapsulation

    public Human() {     //needed because of custom constructor
    }

    public Human(double h, double w) {      //assigning value using constructor
        this.height = h;
        this.weight = w;
    }

    public void setWeight(double w) {       //assigning value using setter
        this.weight = w;
    }

    public void setHeight(double h) {
        this.height = h;
    }

    public void setBMI() {
        BMI = weight / Math.pow(height, 2);
    }

    public double getBMI() {
        setBMI();       //calling setBMI function to calculate BMI
        return BMI;
    }

}
