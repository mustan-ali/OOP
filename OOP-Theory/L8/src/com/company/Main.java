package com.company;

public class Main {

    public static void main(String[] args) {

        Bike bike = new Bike();
        Boat boat = new Boat();
        Vehicle vehicle = new Vehicle();
        Vehicle v = new Bike(); //calls methods which are overridden in Vehicle by Bike
        bike.Move();
        boat.Move();
        vehicle.Move();
        v.Move();

        System.out.println("-----------------------------------");

        Bank bank = new Bank();
        Bank sbi = new SBI();
        Bank icici = new ICICI();
        Bank axis = new AXIS();

        bank.getRateOfInterest();
        sbi.getRateOfInterest();
        axis.getRateOfInterest();
        icici.getRateOfInterest();
//      icici.print(); cannot be called since  Bank icici = new ICICI(); will call only overridden methods

        System.out.println("-----------------------------------");

        Animal animal = new Animal();
        Animal bird = new Bird();
        Animal mammal = new Mammal();

        animal.SkinType();
        animal.Move();
        bird.SkinType();
        bird.Move();
        mammal.SkinType();
        mammal.Move();
    }
}
