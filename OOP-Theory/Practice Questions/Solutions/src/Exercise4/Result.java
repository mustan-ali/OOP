package Exercise4;

import javax.xml.namespace.QName;
import java.util.Scanner;

public class Result {
    public int RollNumber;
    public String Name;
    public double[] Marks = new double[3];

    public void Input() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Roll Number: ");
        RollNumber = input.nextInt();
        input.nextLine();

        System.out.print("Enter Name: ");
        Name = input.nextLine();

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter Marks " + (i + 1) + ": ");
            Marks[i] = input.nextDouble();
        }
    }

    public double Total() {
        double total = 0;
        for (int i = 0; i < 3; i++) {
            total += Marks[i];
        }
        return total;
    }

    public double Average() {
        return Total() / 3;
    }

    public void Show() {
        System.out.println("Student Name: " + Name + "\nRoll Number: " + RollNumber);
        for (int i = 0; i < 3; i++) {
            System.out.println("Marks " + (i+1) + ": " + Marks[i]);
        }
        System.out.println("Total: " + Total());
        System.out.println("Average: " + Average());
    }
}
