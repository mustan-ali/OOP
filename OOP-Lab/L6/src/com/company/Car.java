package com.company;

public class Car extends Vehicle {      //subclass (child)
    private int wheels;
    private int door;
    private int gears;
    private boolean isManual;
    private int currentGear;

    public Car(String name, String size, int wheels, int doors, int gears, boolean isManual) {
        super(name, size);      //To access superclass (Vehicle) constructor
        this.wheels = wheels;
        this.door = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Car.changeGear: Change Gear to " + this.currentGear + " gear");
    }

    public void changeVelocity(int speed, int direction) {
        move(speed, direction);     //called from superclass(Vehicle)
        System.out.println("Car.changeVelocity(): Velocity " + speed + " Direction " + direction + " degrees");
    }
}
