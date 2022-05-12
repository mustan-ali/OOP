package com.company;

public class ECAP extends Employee {
    public ECAP(String name, String address, int number) {
        super(name, address, number);
    }

    public ECAP() {
    }

    @Override
    public void Pay() {
        System.out.println("$50000");
    }

}
