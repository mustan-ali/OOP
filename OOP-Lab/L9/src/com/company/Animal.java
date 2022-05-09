package com.company;

public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void eat();     //abstract method, no method body

    public abstract void breathe();

    public abstract void sound();

    public void sleep() {       //non-abstract method, method body
        System.out.println(getName() + " is sleeping...");
    }

    public String getName() {
        return this.name;
    }

}

//Data abstraction is the process of hiding certain details and showing only essential information to the user.
//Abstraction can be achieved with either abstract classes or interfaces.

//Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).
//Abstract method: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).