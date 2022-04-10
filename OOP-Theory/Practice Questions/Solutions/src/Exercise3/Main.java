package Exercise3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Building b = new Building();
        b.Area=300;
        b.Occupants=50;
        b.Floors=2;

        System.out.println("Area Per Person: "+b.AreaPerPerson());
    }
}
