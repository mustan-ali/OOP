package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        String value = "100";
        int x = Integer.parseInt(value);      //Used to convert String to Integer
        System.out.println("String " + value + " converted into Integer : " + x);

        System.out.println("----------------------------------------");

        int[] A1 = {1, 5, 3, 4, 2, 6, 9, 8, 7};
        char[] A3 = {'H', 'A', 'C', 'G', 'D', 'E', 'B', 'F'};
//      int A2[] = new int[10];     //Creating Array using built-in class
//      A2[0] = 1;

        Arrays.sort(A1);    //Integer Array Sorting
        System.out.print("Sorted Int Array : ");
        for (int i : A1) {
            System.out.print(i + " ");
        }

        Arrays.sort(A3);    //Character Array Sorting
        System.out.print("\nSorted String Array : ");
        for (int i = 0; i < A3.length; i++) {
            System.out.print(A3[i] + " ");
        }

        System.out.println("\n----------------------------------------");

        System.out.println("A1 Length: " + A1.length);  //Array Length

        System.out.print("Array A1: ");
        for (int i = 0; i < A1.length; i++) {
            System.out.print(A1[i] + " ");
        }

        System.out.println("\n----------------------------------------");

        int[] Even = new int[A1.length];
        int[] Odd = new int[A1.length];
        int E_Index = 0;
        int O_Index = 0;

        int[] A2 = new int[A1.length];
        int Start = 0;
        int Mid = (A1.length) / 2;

        for (int i = 0; i < A1.length; i++) {
            if (A1[i] % 2 == 0) {
                Even[E_Index] = A1[i];
                E_Index++;
            } else if (A1[i] % 2 == 1) {
                Odd[O_Index] = A1[i];
                O_Index++;
            }
        }

        System.out.print("Even Array: ");
        for (int i : Even) {
            System.out.print(i + " ");
        }

        System.out.print("\nOdd Array: ");
        for (int i : Odd) {
            System.out.print(i + " ");
        }

        System.out.println("\n----------------------------------------");

        System.out.print("[Even][Odd] Array : ");
        for (int i = 0; i < A1.length; i++) {
            if (A1[i] % 2 == 0) {
                A2[Start] = A1[i];
                Start++;
            } else if (A1[i] % 2 == 1) {
                A2[Mid] = A1[i];
                Mid++;
            }
        }

        for (int i : A2) {
            System.out.print(i + " ");
        }

    }
}