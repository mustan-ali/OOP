package com.company;

public class Car implements Vehicle {
    private int speed;
    private int gear;

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public void changeGear(int newGear) {
        this.gear = newGear;
    }

    public void speedUp(int increment) {
        this.speed += increment;
    }

    public void applyBrakes(int decrement) {
        this.speed -= decrement;
    }

    public void printState() {
        System.out.println("Current Speed of Car: " + speed);
        System.out.println("Current Gear of Car: " + gear);
    }
}
