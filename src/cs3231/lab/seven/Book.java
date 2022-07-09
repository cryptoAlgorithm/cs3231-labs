package cs3231.lab.seven;

public class Book {
    private String title = "Java for Dummies";
    private String author = "The Guru";
    private double price = 99.9;

    public double getPrice() {
        return price * 1.07;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }
}
