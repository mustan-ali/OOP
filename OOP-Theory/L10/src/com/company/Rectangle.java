package com.company;

public class Rectangle implements Shapes {
    public double base;
    public double height;

    @Override
    public void input() {
        height = 2;
        base = 3;
    }

    @Override
    public void calculate_Area() {
        System.out.println(base * height);
    }
}
