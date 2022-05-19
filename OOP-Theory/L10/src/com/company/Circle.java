package com.company;

public class Circle implements Shapes {

    public double radius;

    @Override
    public void input() {
        radius = 2.5;
    }

    @Override
    public void calculate_Area() {
        System.out.println(Math.PI * (radius * radius));
    }
}
