package Exercise2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Book b = new Book();
        b.setBookId(123);
        b.setNoOfPages(25);
        b.setPrice(10);

        b.showDetails();
    }
}
