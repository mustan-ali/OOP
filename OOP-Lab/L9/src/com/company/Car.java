package com.company;

public class Car {

    private boolean engine;
    private int cylinder;
    private int wheels;
    private String name;

    public Car(int cylinder, String name) {
        this.cylinder = cylinder;
        this.wheels = 4;
        this.name = name;
        this.engine = true;
    }

    public int getCylinder() {
        return this.cylinder;
    }

    public String getName() {
        return this.name;
    }

    public String startEngine() {
        return "Car --> startEngine()";
    }

    public String accelerate() {
        return "Car --> accelerate()";
    }

    public String brake() {
        return "Car --> brake()";
    }

}
