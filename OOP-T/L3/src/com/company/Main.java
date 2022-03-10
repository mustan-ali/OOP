package com.company;

public class Main {

    public static void main(String[] args) {

//      Human h = new Human(5.9,80);        //assigning value using constructor
        Human h = new Human();

//      h.weight=5.7;   //will not work because variable is private in class
        h.setHeight(5.7);
        h.setWeight(75);

        System.out.println("-------------------------------------------------");

        System.out.println("BodyMassIndex: " + h.getBMI());

        System.out.println("-------------------------------------------------");

        Circle c = new Circle();
        c.setRadius(2.3);
        System.out.println("Radius: " + c.getRadius());
        System.out.println("Diameter: " + c.getDiameter());
    }
}
