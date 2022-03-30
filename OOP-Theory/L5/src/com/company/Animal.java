package com.company;

public class Animal {
    public String name;
    public int size;
    public int weight;


    public Animal(String name,  int size, int weight) {
        this.name= name;
        this.size = size;
        this.weight = weight;
    }

    public String getName() {
        return this.name;
    }

    public int getSize() {
        return this.size;
    }

    public int getWeight() {
        return this.weight;
    }
}
