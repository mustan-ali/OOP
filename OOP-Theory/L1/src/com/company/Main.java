package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello\n");

        //Authenticator is the class & auth is the object

        Authenticator auth = new Authenticator();  //Instantiating a new Authenticator Object
        auth.username = "test";     //Setting attribute
        auth.password = "abc123";

        Authenticator auth1 = new Authenticator();
        auth1.username = "hello";
        auth1.password = "world";

        System.out.println("Username: " + auth.username + "   " + "Password: " + auth.password);
        // System.out.println("Username: " + auth1.username + "   " + "Password: " + auth1.password);
        // auth.PrintData();
        auth1.PrintData();      //Printing using function inside class

        PrintTriangle tri = new PrintTriangle();
        tri.printTriangle();
    }
}
