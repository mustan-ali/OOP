package com.company;

public class Fish extends Animal {      //subclass (child)
    private int gills;
    private int eyes;
    private int fins;

    public Fish(String name, int body, int size, int weight, int brain, int gills, int fins, int eyes) {
        super(name, body, size, weight, brain);     //To access superclass (Animal) constructor
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    public void rest() {
        System.out.println("Fish.rest() is called");
    }

    public void moveMuscle() {
        System.out.println("Fish.moveMuscle() is called");
    }

    private void moveBackFin() {
        System.out.println("Fish.moveBackFin() is called");
    }

    public void swim(int speed) {
        moveMuscle();
        moveBackFin();
        System.out.println("Fish is swimming at " + speed + "mph");
    }

}
