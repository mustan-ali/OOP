package com.company;

public class Dog extends Animal {       //subclass (child)
    //The extends keyword extends a class (indicates that a class is inherited from another class).
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String skinCoat;

    public Dog(String name, int body, int size, int weight, int brain, int eyes, int legs, int tail, int teeth, String skinCoat) {
        super(name, body, size, weight, brain);     //To access superclass (Animal) constructor
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.skinCoat = skinCoat;
    }

    public void chew() {
        System.out.println("Dog chew its food");
    }

    public void walk() {
        System.out.println("Dog.walk() is called");
        move(5);        //called from superclass(Animal)
    }

    public void run() {
        System.out.println("Dog.run() is called");
        move(15);       //called from superclass(Animal)
    }

    public void eat() {
        System.out.println("Dog.eat() is called");
        super.eat();
        //super is used because eat (same name function) is present in Animal & Dog Class (super.eat will call function from Animal Class)
    }

}
