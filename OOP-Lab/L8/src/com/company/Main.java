package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.print("Enter x: ");
        double x = getDouble();

        System.out.print("Enter y: ");
        double y = getDouble();

        System.out.println("Division of x/y = " + divideLBYL(x, y));
        divideEAFP(x, y);

        System.out.println("-------------------------------------");

        printNumbers();

        System.out.println("-------------------------------------");

        System.out.println(getDoubleLBYL());

        System.out.println("-------------------------------------");

        Calculator c = new Calculator();
//Static Polymorphism (Overwrite)
        System.out.println(c.add(1, 1));
        System.out.println(c.add(1, 2, 3));
        System.out.println(c.add(1.1, 2.0));
        System.out.println(c.add(1.1, 2.0, 3.0));

        System.out.println("-------------------------------------");

//Dynamic Polymorphism (Overridden) it requires inheritance
        for (int i = 1; i < 4; i++) {
            Movie m = randomMovie();
            System.out.println("Movie " + i + " : " + m.getName() + "\n" + "Plot : " + m.plot() + "\n");
        }
    }

    private static Movie randomMovie() {
//                         (int) (Math.random() * ( max - min + 1 ) + min);
        int randomNumber = (int) (Math.random() * (4 - 1 + 1) + 1);
        switch (randomNumber) {
            case 1:
                return new FastAndFurious();
            case 2:
                return new JohnWick();
            case 3:
                return new Matrix();
            case 4:
                return new MissionImpossible();
        }
        return null;
    }

    private static double getDouble() {
        Scanner input = new Scanner(System.in);
        return input.nextDouble();
    }

    private static double divideLBYL(double x, double y) {      //Look Before You Leave
        if (y != 0) {
            return x / y;
        } else {
            return 0;
        }
//      return x / y;   will return infinity
    }

    private static double divideEAFP(double x, double y) {      //Easy to Ask Forgiveness than Permission
        double result = 0;
        try {
            result = x / y;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Division of x/y = " + result);
        }
        return result;
    }

    private static void printNumbers() {
        int[] number = {1, 2, 3};
        try {
            System.out.println(number[3]);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Function Completed");
        }
    }

    private static double getDoubleLBYL() {
        Scanner s = new Scanner(System.in);
        boolean isValid = true;
        System.out.print("Please enter a Double Value: ");
        String input = s.next(); //Taking String Input
        for (int i = 0; i < input.length(); i++) {
            if (!Character.isDigit(input.charAt(i))) {  //Checks if there is Char at index i in input, '.' is treated as Char
                isValid = false;
                break;
            }
        }
        if (isValid) {
            return Double.parseDouble(input);   //Converting String input to Double
        }
        return 0; //function will return 0 if there is char in an input
    }
}

//  Overriding allows a subclass to provide a specific implementation of a method that is already provided by parent classes.

//  Polymorphism is the ability of an object to take on different forms. In Java, polymorphism refers to the ability of a class to
//  provide different implementations of a method, depending on the type of object that is passed to the method.

//  Method Overloading: When there are multiple functions with the same name but different parameters then these functions are said to
//  be overloaded. Functions can be overloaded by change in the number of arguments or/and a change in the type of arguments.

//  Method overriding, on the other hand, occurs when a derived class has a definition for one of the member functions of the base class.
//  That base function is said to be overridden.