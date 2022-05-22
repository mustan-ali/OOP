package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> Cars = new ArrayList<>();

        Cars.add("Toyota");
        Cars.add("Honda");
        Cars.add("Audi");
        Cars.add("BMW");
        System.out.println(Cars);


        Teacher t = new Teacher("John", 29, "Male", "MSCS", 4);
        System.out.println(t);

        SoftwareEngineer se = new SoftwareEngineer("Cena", 24, "Male", "Web Developer", 2);
        System.out.println(se);


    }
}
