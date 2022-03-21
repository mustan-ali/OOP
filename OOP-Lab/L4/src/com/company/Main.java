package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Car[] c = new Car[]{
                new Car("toyota", 5000, 2011, "Red", new String[]{"Wheels", "Key"}),
                new Car("nissan", 9000, 2020, "Black", new String[]{"Wheels", "Key"}),
                new Car("honda", 15000, 2022, "Grey", new String[]{"Wheels", "Key"})
        };

        Dealership d = new Dealership();
        for (int i = 0; i < c.length; i++) {
            d.setC(c[i], i);
        }

        System.out.print("What is your budget? ");
        double budget = input.nextDouble();
        input.nextLine();
        System.out.print("What make of car do you want? ");
        String make = input.nextLine();

        System.out.println(d.search(make, budget));


        System.out.println("-------------------------------------------------------");
/*

        System.out.print("How many Rectangles do you want to save: ");
        int limit = input.nextInt();

        Rectangle[] r = new Rectangle[limit];   //Object Array with custom index

        for (int i = 0; i < r.length; i++) {
            System.out.print("Do you want to enter Width & Height (Y/N): ");
            char choice = input.next().charAt(0);

            if (choice == 'Y' || choice == 'y') {
                r[i] = new Rectangle(input.nextDouble(), input.nextDouble());
            } else if (choice == 'N' || choice == 'n') {
                r[i] = new Rectangle();
            } else {
                System.out.println("Invalid Input");
            }

        }

        for (int i = 0; i < r.length; i++) {
            System.out.println("Rectangle [" + i +"] Information: " +"\n" + r[i] + "\n");   //r[i] will call toString function
//          If we print any object, Java compiler internally invokes the toString() method on the object.
//          System.out.println("Rectangle [" + i +"] Information: " +"\n" + r[i].toString() + "\n");    //will generate same output
        }
*/

    }
}
