package com.company;

public class Reptile extends Animal {

    public boolean tail;

    public Reptile(String name, int size, int weight, boolean tail) {
        super(name, size, weight);
        this.tail = tail;
    }

    public boolean isTail() {
        return tail;
    }

    public String toString() {
        return "Name: " + getName() + " Size: " + "cm" + getSize() + " Weight: " + getWeight() + "gram" + " Has Tail: " + isTail();
    }
}
