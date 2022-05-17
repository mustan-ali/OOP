package com.company;

public class Main {

    public static void main(String[] args) {

        DeskPhone dp = new DeskPhone(111);
        dp.powerOn();
        dp.dial(222);
        dp.callPhone(111);
        dp.answer();
        System.out.println("isRinging: " + dp.isRinging());

        MobilePhone mp = new MobilePhone(111);
        mp.powerOn();
        mp.dial(222);
        mp.callPhone(111);
        mp.answer();
        System.out.println("isRinging: " + mp.isRinging());

        System.out.println("-----------------------------------------------");

        Car c = new Car();
        c.setSpeed(0);
        c.speedUp(50);
        c.setGear(2);
        c.printState();
        c.applyBrakes(20);
        c.changeGear(1);
        c.printState();

        Bike b = new Bike();
        b.setSpeed(0);
        b.speedUp(20);
        b.setGear(2);
        b.printState();
        b.applyBrakes(10);
        b.changeGear(1);
        b.printState();
    }
}
