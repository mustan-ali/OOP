package com.company;

public class Book {
    private String title;
    private String author;
    private String publisher;
    private String copyright;
    private double price;
    private int quantity;

    public Book(String title, String author, String publisher, String copyright, double price, int quantity) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.copyright = copyright;
        this.price = price;
        this.quantity = quantity;
    }

    //Copy Constructor
    public Book(Book source) {      //copy Object stored in in Book Class
        this.title = source.title;
        this.author = source.author;
        this.publisher = source.publisher;
        this.copyright = source.copyright;
        this.price = source.price;
        this.quantity = source.quantity;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getPublisher() {
        return this.publisher;
    }

    public String getCopyright() {
        return this.copyright;
    }

    public double getPrice() {
        return this.price;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void purchase(Book book) {
        System.out.println("\nYou bought a book " + book.getTitle() + " for price $" + book.getPrice());
        System.out.println("Thank You for purchasing!");
    }

    public String toString() {
        return "Book Information-->" + "\nBook Title: " + getTitle() + "\nAuthor: " + getAuthor() + "\nPublisher: "
                + getPublisher() + "\nCopyright Date: " + getCopyright() + "\nPrice: $" + getPrice();
    }
}
