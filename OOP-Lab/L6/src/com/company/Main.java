package com.company;

public class Main {

    public static void main(String[] args) {

        Outlander outlander = new Outlander(36);
        outlander.steer(45);
        outlander.changeGear(2);
        outlander.changeVelocity(30,20);

        System.out.println("-------------------------------------------");

        Dog dog = new Dog("Tommy", 100, 50, 40, 1, 2, 4, 1, 32, "Brown Fur");
        dog.eat();
        dog.chew();
        dog.walk();
        dog.run();

        Fish fish = new Fish("Gold Fish", 1, 15, 10, 1, 5, 2, 2);
        fish.swim(4);
        fish.rest();
    }

}
