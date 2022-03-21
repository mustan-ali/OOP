package com.company;

public class BookStore {
    private Book[] books;   //Creating Array of class Book

    public BookStore() {
        this.books = new Book[100]; //Creating Object of class Book
    }

    private void setBooks(Book book, int index) {   //(Book book, ) will call Copy Constructor
        this.books[index] = new Book(book);
    }

    public Book getBook(int index) {
        return this.books[index];
    }

    public void sell(String title, int quantity) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].getTitle().equals(title)) {
                this.books[i].purchase(this.books[i]);  //Selling required book
                this.books[i].setQuantity(this.books[i].getQuantity() - quantity);  //Updating Stock
                break;
            } else if (books[i] == null) {
                System.out.println("Required Book not Available");
                break;
            }
        }
    }

    public String search(String titile) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                continue;
            } else if (this.books[i].getTitle().equals(titile)) {
                return "Book Available in store!" + "\nQuantity Available: " + this.books[i].getQuantity() +
                        "\n\n" + this.books[i].toString();
            }
        }
        return "Sorry! Your required book is not found";
    }

    public void insertBook(Book[] books) {
        for (int i = 0; i < books.length; i++) {
            setBooks(books[i], i);      //Passing Value to setBook
        }
    }

}