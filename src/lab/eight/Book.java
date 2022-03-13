package lab.eight;

public class Book {
    private static int numBook = 0;
    private final String bookid;
    private final String name;
    private Author author;
    private double price;
    private int qty;

    public Book(String name, Author author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;

        this.bookid = String.format("%03d", ++Book.numBook) + "-" + this.author.getName().toUpperCase().substring(0, 3);
    }

    public Book(String name, Author author, double price, int qty) {
        this(name, author, price);
        this.qty = qty;
    }

    public Author getAuthor() {
        return new Author(author);
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Book[id=" + bookid + ", name=" + name + "," + author.toString() + ",price=" + price + ",qty=" + qty + "]";
    }

    public boolean hasSameAuthor(Book b) {
        Author a = b.getAuthor();
        return a.getName().equals(author.getName()) && a.getGender() == author.getGender() && a.getEmail().equals(author.getEmail());
    }

    public Book comparePrice(Book b) {
        return b.getPrice() > price ? b : this;
    }
}
