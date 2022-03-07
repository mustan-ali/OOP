package com.company;

public class Dog {

    private static String name;

    public Dog(String nameOfDog) {
        Dog.name = nameOfDog;
    }

    public void printName() {
        System.out.println("Name of Dog: " + name);
    }
}
