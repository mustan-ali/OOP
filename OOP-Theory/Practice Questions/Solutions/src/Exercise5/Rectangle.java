package Exercise5;

import java.util.Scanner;

public class Rectangle {
    private double length;
    private double width;

    Scanner input = new Scanner(System.in);

    public Rectangle() {
        length = 1;
        width = 1;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double l) {
        if (l > 0.0 && l < 20.0) {
            this.length = l;
        } else {
            System.out.println("Length should be between 0.0 to 20.0");
            System.out.print("Enter Length: ");
            setLength(input.nextDouble());
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double w) {
        if (w > 0.0 && w < 20.0) {
            this.width = w;
        } else {
            System.out.println("Width should be between 0.0 to 20.0");
            System.out.print("Enter Width: ");
            setWidth(input.nextDouble());
        }
    }

    public void Calculate() {
        System.out.println("Area: " + (length * width));
        System.out.println("Perimeter: " + (2 * length + 2 * width));
    }


}
