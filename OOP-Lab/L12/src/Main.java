import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {


        Province province = new Province("Sindh");
        City city = new City("Karachi");
        City city1 = new City("Hyderabad");
        City city2 = new City("Sukkur");

        ArrayList<City> cities = new ArrayList<>();
        cities.add(city);
        cities.add(city1);
        cities.add(city2);

        province.setCities(cities);

        System.out.println(province.getCities() + " are cities of " + province.getName());

        System.out.println("--------------------------------------");

        boolean quit = false;       //flag
        int choice = 0;
        printInstructions();
        while (!quit) {
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit = true;    //flag value raised
            }
        }

        ArrayList<String> Cars = new ArrayList<String>();
        Cars.add("Toyota");
        Cars.add("Honda");
        Cars.add("Audi");
        Cars.add("BMW");

        for (String i : Cars) {
            System.out.println(i);
        }

        Collections.sort(Cars);
        System.out.println(Cars);

    }

    public static void printInstructions() {
        System.out.println("Press Key for Relevant Operation");
        System.out.println("\t 0 - Print Menu");
        System.out.println("\t 1 - Print List");
        System.out.println("\t 2 - Add Item");
        System.out.println("\t 3 - Modify Item");
        System.out.println("\t 4 - Remove Item");
        System.out.println("\t 5 - Search Item");
        System.out.println("\t 6 - Quit");
    }

    public static void addItem() {
        System.out.print("Enter the grocery item: ");
        groceryList.addGroceryItem(scanner.nextLine());     //nextline used because it can contain spaces.
    }

    public static void modifyItem() {
        groceryList.printGroceryList();
        System.out.print("Enter item number to modify: ");
        int itemNumber = scanner.nextInt();
        scanner.nextLine();     //to clear buffer
        System.out.print("Enter replacement item: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryList(itemNumber, newItem);
    }

    public static void removeItem() {
        System.out.println("Enter item number to remove: ");
        int itemNumber = scanner.nextInt();
        scanner.nextLine();      //to clear buffer
        groceryList.removeGroceryList(itemNumber - 1);
    }

    public static void searchForItem() {
        System.out.println("Enter Item to search for ? : ");
        String searchItem = scanner.nextLine();
        if (groceryList.findItem(searchItem) != null) {
            System.out.println("Found " + searchItem + " in your grocery list.");
        } else {
            System.out.println(searchItem + " not found in your grocery list.");
        }
    }
}
