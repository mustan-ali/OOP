package com.company;

public class Bike extends Vehicle {

    @Override
    public void Move() {
//      super.Move();  calls Move() from Parent Class
        System.out.println("Riding a bike...");
    }
}
