package com.company;

public class Calculator implements functions {

    @Override
    public float add(float a, float b) {
        return a + b;
    }

    @Override
    public float subtract(float a, float b) {
        return a - b;
    }

    @Override
    public float multiply(float a, float b) {
        return a * b;
    }

    @Override
    public float divide(float a, float b) {
        return a / b;
    }
}
