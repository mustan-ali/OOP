package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Account a1 = new Account("PK123-007007", "Hello World");
        a1.information();
        a1.depositAmount(50000);
        a1.withdrawAmount(1000);

        System.out.println("------------------------------------------------");

        Circle C = new Circle();
        System.out.println("Radius: " + C.getRadius());
        System.out.println("Area: " + C.getArea());
        System.out.println("Color: " + C.getColor());

        Circle C1 = new Circle( 1.03);
        System.out.println("Radius: " + C1.getRadius());
        System.out.println("Area: " + C1.getArea());
        System.out.println("Color: " + C1.getColor());

        Circle C2 = new Circle(0.99,"green");
        System.out.println("Radius: " + C2.getRadius());
        System.out.println("Area: " + C2.getArea());
        System.out.println("Color: " + C2.getColor());

        System.out.println("------------------------------------------------");

        Scanner s = new Scanner(System.in);

        String qualification, Name;
        int age;
        System.out.println("Enter Name: ");
        Name = s.nextLine();             //String Name=s.next();

        System.out.println("Enter Age:");
        age = s.nextInt();

        s.nextLine(); //Clearing Input Buffer(used when data type of upcoming input is not same)

        System.out.println("Enter Qualification");
        qualification = s.nextLine();

        System.out.println("Name: " + Name);
        System.out.println("Age: " + age);
        System.out.println("Qualification: " + qualification);

    }
}
