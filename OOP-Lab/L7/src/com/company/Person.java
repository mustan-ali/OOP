package com.company;

public class Person {

    private String Name, Address;

    public Person(String name, String address) {
        Name = name;
        Address = address;
    }

    public String getName() {
        return Name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String toString() {
        return getName() + " ( " + getAddress() + " )";
    }
}