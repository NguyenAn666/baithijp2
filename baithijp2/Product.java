package Assigiment2.baithijp2;

public class Product {
    private int BookId;
    private String BookName;
    private String Author;
    private int Price;

    public Product(int bookId, String bookName, String author, int price) {
        BookId = bookId;
        BookName = bookName;
        Author = author;
        Price = price;
    }

    public int getBookId() {
        return BookId;
    }

    public void setBookId(int bookId) {
        BookId = bookId;
    }

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String bookName) {
        BookName = bookName;
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

    @Override
    public String toString() {
        return "Product{" +
                "BookId=" + BookId +
                ", BookName='" + BookName + '\'' +
                ", Author='" + Author + '\'' +
                ", Price=" + Price +
                '}';
    }
}