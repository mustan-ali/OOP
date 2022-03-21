package com.company;

import java.util.Scanner;

public class Dealership {

    Scanner input = new Scanner(System.in);
    private Car[] c;        //Creating Array of class Car

    public Dealership() {
        this.c = new Car[3];
    }

    public void setC(Car c, int index) {
        this.c[index] = new Car(c);     //Executing Copy constructor
    }

    public Car getC(int index) {
        return this.c[index];
    }

    public void sell(int index) {
        this.c[index].drive();
        this.c[index] = null;   //empty parking space
    }

    public String search(String make, double budget) {
        for (int i = 0; i < this.c.length; i++) {
            if (this.c[i] == null) {
                continue;
            } else if (this.c[i].getMake().equals(make) && this.c[i].getPrice() <= budget) {
                System.out.println("\nWe found one in spot: " + i + "\n" + this.c[i].toString());
//              System.out.println("\nWe found one in spot: " + i + "\n" + getC(i));   //will give same output
                System.out.print("\nDo you want to buy this car? ");
                char choice = input.next().charAt(0);
                if (choice == 'Y' || choice == 'y') {
                    sell(i);
                } else if (choice == 'N' || choice == 'n') {
                    break;
                } else {
                    System.out.println("Sorry, We couldn't find any car on your requirement");
                }
            }

        }
        return "";
    }
}