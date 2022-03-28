package com.company;

public class Outlander extends Car {        //subclass (child)
    private int roadServiceMonth;

    public Outlander(int roadServiceMonth) {
        super("Outlander", "4WD", 4, 5, 6, false);
        this.roadServiceMonth = roadServiceMonth;
    }
}
