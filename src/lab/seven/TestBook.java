package lab.seven;

public class TestBook {
    public static void main(String[] args) {
        Book b = new Book();
        System.out.println("Title = " + b.getTitle());
        System.out.println("Author = " + b.getAuthor());
        System.out.printf("Price after GST = $%.2f", b.getPrice());
    }
}
