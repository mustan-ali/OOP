package com.company;

public class Animal {       //superclass (parent)
    //Generic States
    private String name;
    private int body;
    private int size;
    private int weight;
    private int brain;


    public Animal(String name, int body, int size, int weight, int brain) {
        this.name = name;
        this.body = body;
        this.size = size;
        this.weight = weight;
        this.brain = brain;
    }

    public void eat() {
        System.out.println("Animal.eat() is called");
    }

    public void move(int speed) {
        System.out.println("Animal.move() is called.\nAnimal is moving at speed " + speed + "mph");
    }

    public String getName() {
        return this.name;
    }

    public int getBody() {
        return this.body;
    }

    public int getSize() {
        return this.size;
    }

    public int getWeight() {
        return this.weight;
    }

    public int getBrain() {
        return brain;
    }

}