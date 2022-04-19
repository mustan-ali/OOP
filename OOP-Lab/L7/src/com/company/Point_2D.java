package com.company;

public class Point_2D {

    private int x, y;

    public Point_2D() {     //Default constructor
        this.x = 0;
        this.y = 0;
    }

    public Point_2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String toString() {
        return "(" + getX() + "," + getY() + ")";
    }
}
