package com.company;

//Method Overloading (same function name with different parameter or different return type)
public class Calculator {
    public int add(int x, int y) {
        return x + y;
    }

    public double add(double x, double y) {
        return x + y;
    }

    public int add(int x, int y, int z) {
        return x + y + z;
    }

    public double add(double x, double y, double z) {
        return x + y + z;
    }
}
