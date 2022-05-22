package com.company;

public class Main {

    public static void main(String[] args) {

        Circle c = new Circle();
        c.input();
        c.calculate_Area();

        Rectangle r = new Rectangle();
        r.input();
        r.calculate_Area();

    }
}

//    Modifier	    Description
//    Default	    declarations are visible only within the package (package private)
//    Private	    declarations are visible within the class only
//    Protected	    declarations are visible within the package or all subclasses
//    Public	    declarations are visible everywhere

//    AccessModifier--> within class - within package - outside package by subclass only + outside package
//    Private-->Y-N-N-N
//    Default-->Y-Y-N-N
//    Protected-->Y-Y-Y-N
//    Public-->Y-Y-Y-Y
