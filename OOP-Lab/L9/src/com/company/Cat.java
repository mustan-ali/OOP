package com.company;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating.");
    }

    @Override
    public void breathe() {
        System.out.println(getName() + " is breathing.");
    }

    @Override
    public void sound() {
        System.out.println(getName() + " says meow.");
    }

    public void superSleep() {
        sleep();    //calling non-abstract method from super class
    }

}
