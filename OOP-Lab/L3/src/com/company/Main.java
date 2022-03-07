package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("---------------------------------------------------------------------");

        Employee.companyName="HelloWorld";      //since companyName is static, object-name is not compulsory in the syntax we can use class

        Employee e1 = new Employee(101, "Jack", "Sparrow", "JS", 100000);
        e1.setAge((byte) 20);
        e1.setAddress("123 Street");
        System.out.println("Salary after Increment: Rs." + e1.raiseSalary(15));
        System.out.println(e1.toString());

        System.out.println("---------------------------------------------------------------------");
//      byte -> short -> char -> int -> long -> float -> double     [automatic typecast] [Widening Type Casting]
//      double -> float -> long -> int -> char -> short -> byte     [manual typecast] [Narrowing Type Casting]

        int myInt = 150;
        double myDouble = myInt;  //small data type to big data type compiler will do typecasting automatically
        float myFloat = myInt;
        byte myByte = (byte) myInt;   //big data type to small data type compiler will not do typecasting automatically (data can be loss)^
        //^Stores whole numbers from -128 to 127

        System.out.println("Int Value: " + myInt);
        System.out.println("Double Value after assigning Int Value to it: " + myDouble);
        System.out.println("Float Value after assigning Int Value to it: " + myFloat);
        System.out.println("Byte Value after assigning Int Value to it: " + myByte);     //print wrong number due to data loss

        System.out.println("---------------------------------------------------------------------");

        Dog d1 = new Dog("Rex");
        Dog d2 = new Dog("Tom");       //rex will be overwritten by tom since it is static variable

        d1.printName();
        d2.printName();

        System.out.println("---------------------------------------------------------------------");

        System.out.println("Select Operator: [ + - * / ] ");
        char operator = input.next().charAt(0);     //charAt(0) is used to take only 1st char of string


        switch (operator) {
            case '+':
                System.out.println("Enter 2 Number: ");
                Calculator.add(input.nextInt(), input.nextInt());
                break;

            case '-':
                System.out.println("Enter 2 Number: ");
                Calculator.subtract(input.nextInt(), input.nextInt());
                break;

            case '*':
                System.out.println("Enter 2 Number: ");
                Calculator.multiply(input.nextInt(), input.nextInt());
                break;

            case '/':
                System.out.println("Enter 2 Number: ");
                Calculator.divide(input.nextInt(), input.nextInt());
                break;

            default:
                System.out.println("Invalid Input");
        }

        System.out.println("---------------------------------------------------------------------");


//      int[] array = {1, 2, 3};        //1st Method to declare array       //1st Method to assign values to an array
        int[] array = new int[3];       //2nd Method to declare array

        array[0] = 1;     //2nd Method to assign values to an array
        array[1] = 2;
        array[2] = 3;

//      System.out.println(array[0]);       //print element 0
//      System.out.println(array[1]);
//      System.out.println(array[2]);
//      System.out.println(array[3]);       //it will print 0 [default value] because no value is assigned


        System.out.println("Enter Size of Array: ");        //Array with custom size
        int size = input.nextInt();
        int[] array3 = new int[size];


        for (int i = 0; i < size; i++) {        //assigning values to an array using for-loop
            System.out.println("Enter Value for element[" + i + "]: ");
            int value = input.nextInt();
            array3[i] = value;
        }

        for (int i = 0; i < size; i++) {        //printing values of an array using for-loop
            System.out.println("Value at element[" + i + "]: " + array3[i]);
        }
    }
}
