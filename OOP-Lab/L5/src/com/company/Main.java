package com.company;

public class Main {

    public static void main(String[] args) {

        Flight[] flights = new Flight[]{
                new Flight("PIA-001", "Lahore", "Islamabad", 300),
                new Flight("PIA-002", "America", "Pakistan", 400),
                new Flight("PIA-003", "Karachi", "Toronto", 350)
        };

        AirLine airLine = new AirLine();
        airLine.insertFlights(flights);

        airLine.assign("PIA123");
        airLine.assign("PIA-001");


        System.out.println("-------------------------------------------------------");


        Book[] books = new Book[]{
                new Book("java", "Jack", "Stanford", "1/1/2022", 10, 10),
                new Book("c", "John", "Stanford", "2/2/2022", 20, 10),
                new Book("python", "Jeff", "Stanford", "3/3/2022", 30, 10),
                new Book("c++", "John", "Stanford", "4/4/2022", 40, 10)
        };

        BookStore bookStore = new BookStore();
        bookStore.insertBook(books);

        System.out.println(bookStore.search("java"));
        bookStore.sell("java", 3);
    }

}

