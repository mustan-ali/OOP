package Exercise2;

public class Book {
    public int BookId;
    public int NoOfPages;
    public int Price;

    public void setBookId(int bookId) {
        BookId = bookId;
    }

    public void setNoOfPages(int noOfPages) {
        NoOfPages = noOfPages;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public int getPrice() {
        return Price;
    }

    public int getBookId() {
        return BookId;
    }

    public int getNoOfPages() {
        return NoOfPages;
    }

    public void showDetails() {
        System.out.println("Book Id: " + getBookId() + "\nNo. of Pages: " + getNoOfPages() + "\nPrice: $" + getPrice());
    }
}
