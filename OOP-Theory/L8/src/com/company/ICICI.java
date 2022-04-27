package com.company;

public class ICICI extends Bank {
    @Override
    public float getRateOfInterest() {
        float x = 7.3f;
        System.out.println(x);
        return x;
    }

    public void print(){
        System.out.println("ICICI Bank");
    }
}
