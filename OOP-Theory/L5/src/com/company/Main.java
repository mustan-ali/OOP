package com.company;

public class Main {

    public static void main(String[] args) {

        Reptile r = new Reptile("Snake", 10, 15, true);
        System.out.println(r.toString());

        System.out.print("----------------------------------------");

        Circle c = new Circle();

        c.setRadius(1.2);
        c.get_Circle_Details();

    }
}
