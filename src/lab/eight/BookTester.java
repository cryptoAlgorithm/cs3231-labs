package lab.eight;

public class BookTester {

    public static void main(String[] args){
        Author a1 = new Author("Mary", 'f');
        Author a2 = new Author("Jane", 'f', "jane123@mybook.com");

        Book b1 = new Book("Java 101", a1, 99.5);
        System.out.println(b1); //test case 1 in Coursemology

        a1.setEmail("maryhasalittlelamb@mybook.com");
        System.out.println(b1); //test case 2 in Coursemology

        Author someauthor = b1.getAuthor();
        someauthor.setEmail("someemail@mybook.com");
        System.out.println(someauthor);
        System.out.println(b1); //b1's author's email should remain unchanged
        //test case 3 in Coursemology

        Book b2 = new Book("Python for Dummies", a2, 109.5);
        System.out.println(b2);

        System.out.println(b2.comparePrice(b1).getName() + " is the more expensive book."); //test case 4 in Coursemology
    }
}
