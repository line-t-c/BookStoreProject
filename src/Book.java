public class Book {

    int BookId;
    String Title;
    String Author;
    int Price;

    //Constructor for book.
    public Book(int bookId, String title, String author, int price) {
        BookId = bookId;
        Title = title;
        Author = author;
        Price = price;
    }

    //Prints the details of book.

    public String toString (){
        return "Book ID: " + this.BookId + ". Title: " + this.Title + ". Author: " + this.Author + ". Price: " + this.Price;
    }


    //Getters and setters for the variables of Book.
    public int getBookId() {
        return BookId;
    }

    public void setBookId(int bookId) {
        BookId = bookId;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }
}
