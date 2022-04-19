package com.company;

public class Point_3D extends Point_2D {
    private int z;

    public Point_3D() {
        super();
        this.z = 0;
    }

    public Point_3D(int x, int y, int z) {
        super(x, y);    //Calling Point_2D(int x, int y)
        this.z = z;

    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public String toString() {
        return "(" + getX() + "," + getY() + "," + getZ() + ")";    //getX() & getY() called from super class
    }
}
