package com.company;

public class Main {

    public static void main(String[] args) {

        //Object
        Car Mycar = new Car();

        Mycar.setDoors(4);
        System.out.println("No. of Doors = " + Mycar.getDoors());

        Mycar.setWheels(4);
        System.out.println("No. of Wheels = " + Mycar.getWheels());

        Mycar.setMake("Honda");
        System.out.println("Make = " + Mycar.getMake());

        Mycar.setModel("Civic");
        System.out.println("Model = " + Mycar.getModel());

        Mycar.setColour("Black");
        System.out.println("Colour = " + Mycar.getColour());
    }
}


