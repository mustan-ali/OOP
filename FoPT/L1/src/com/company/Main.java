package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello\n");

        //Authenticator is the class & auth is the object

        Authenticator auth = new Authenticator();
        auth.username = "test";
        auth.password = "abc123";

        Authenticator auth1 = new Authenticator();
        auth1.username = "hello";
        auth1.password = "world";

        // System.out.println(auth.username + " " + auth.password);
        // System.out.println(auth1.username + " " + auth1.password);
        // auth.PrintData();
        // auth1.PrintData();

        triangle tri = new triangle();
        tri.PrintTriangle();
    }
}
