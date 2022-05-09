package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Car c = new Car(8, "Base Class");
        System.out.println(c.startEngine());
        System.out.println(c.accelerate());
        System.out.println(c.brake());

        Mitsubishi m = new Mitsubishi(6, "Eclipse");
        System.out.println(m.startEngine());
        System.out.println(m.accelerate());
        System.out.println(m.brake());

        Ford f = new Ford(6, "Mustang");
        System.out.println(f.startEngine());
        System.out.println(f.accelerate());
        System.out.println(f.brake());

        System.out.println("---------------------------------");

        Dog dog = new Dog("Dog");
        dog.eat();
        dog.breathe();
        dog.sound();

        Cat cat = new Cat("Cat");
        cat.eat();
        cat.breathe();
        cat.sound();
        cat.superSleep();

        System.out.println("---------------------------------");

        Calculator calculator = new Calculator();
        System.out.println(calculator.add(1.0f, 2.0f));
        System.out.println(calculator.subtract(1.0f, 2.0f));
        System.out.println(calculator.multiply(1.0f, 2.0f));
        System.out.println(calculator.divide(1.0f, 2.0f));
    }
}
