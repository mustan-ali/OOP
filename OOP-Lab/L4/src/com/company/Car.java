package com.company;

import java.util.Arrays;

public class Car {
    private String make;
    private double price;
    private int year;
    private String color;
    private String[] parts;     //String Array

    public Car(String make, double price, int year, String color, String[] parts) {
        this.make = make;
        this.price = price;
        this.year = year;
        this.color = color;
        this.parts = Arrays.copyOf(parts, parts.length);
//      Arrays.copyOf() method copies specified array into a new array with specified length.
//      CopiedArray = Array.copyOf(OriginalArray Name ,newLength)
    }

    public Car(Car source) {
        this.make = source.make;
        this.color = source.color;
        this.price = source.price;
        this.year = source.year;
        this.parts = Arrays.copyOf(source.parts, source.parts.length);
    }

    public String getMake() {
        return make;
    }

    public double getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public void setMake(String m) {
        this.make = m;
    }

    public void setPrice(double p) {
        this.price = p;
    }

    public void setYear(int y) {
        this.year = y;
    }

    public void setColor(String c) {
        this.color = c;
    }

    public void drive() {
        System.out.println("You bought car from year " + getYear() + " of color "
                + getColor() + " manufactured by " + getMake() + " with price of $" + getPrice());
        System.out.println("Please drive your car to nearest exit.");
    }

    public String toString() {
        return "Make: " + getMake() + "\n" + "Price: $" + getPrice() + "\n" +
                "Year: " + getYear() + "\n" + "Color: " + getColor() + "\n" +
                "Parts: " + Arrays.toString(parts);
    }
}
