package com.company;

public class Main {

    public static void main(String[] args) {

        int[] array = new int[2];

        try {       //try block includes the code that might generate an exception.
            System.out.println(array[2]);       //2nd index is not present in an array, so it will generate an error
        } catch (Exception e) {     //catch block includes the code that is executed when there occurs an exception inside the try block.
            System.out.println("Error: " + e.getMessage());     //getMessage() prints the description of the exception.
            System.out.println("Error: " + e);  //It prints the name of the exception & its description
        }

        System.out.println("------------------------------------------");

        int[] A1 = new int[2];
        Integer[] A2 = new Integer[2];
        System.out.println("Integer Array (null value)--> " + A2[1]);     //Integer uses "null" to show null value
        System.out.println("int Array (null value)--> " + A1[1]);      //int uses "0" to show null value



        /*
        Description	                   |   int	                    |          Integer
        Type	                       |   Primitive Data type	    |          Integer Wrapper class
        Memory Usage	               |   4 bytes	                |          16 bytes
        Type casting to String	       |   Not Possible	            |          Possible
        Conversion to other base class |   Not Possible	            |          Possible
        Can use built-in methods	   |   No	                    |          Yes
        Provides Flexibility	       |   No	                    |          Yes
        */
    }
}
