package Exercise1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int number = input.nextInt();

        if (number >= 0 && number <= 9) {
            System.out.println("Number lies between 0 to 9");
        } else if (number >= 10 && number <= 19) {
            System.out.println("Number lies between 10 to 19");
        } else if (number >= 20 && number <= 29) {
            System.out.println("Number lies between 20 to 29");
        } else {
            System.out.println("None of the categories");
        }
    }
}
