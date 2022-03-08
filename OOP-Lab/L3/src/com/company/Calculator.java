package com.company;

public class Calculator {

    public static void add(int x, int y) {
        System.out.println("Addition  " + x + " + " + y + " = " + (x + y));
    }

    public static void subtract(int x, int y) {
        System.out.println("Subtraction " + x + " - " + y + " = " + (x - y));
    }

    public static void multiply(int x, int y) {
        System.out.println("Multiplication " + x + " * " + y + " = " + x * y);
    }

    public static void divide(int x, int y) {
        System.out.println("Division " + x + " / " + y + " = " + x / y);
    }

}