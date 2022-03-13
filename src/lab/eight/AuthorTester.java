package lab.eight;

public class AuthorTester {

    public static void main(String[] args){
        Author a1 = new Author("Mary", 'f');
        System.out.println(a1);

        Author a2 = new Author("Jane", 'f', "jane123@mybook.com");
        System.out.println(a2);

        Author a3 = new Author(a2);
        System.out.println(a3);

        Author a4 = new Author("Leon", 'm', "Leon12$_hi@mybook.com");
        System.out.println(a4);

        a4.setEmail("?%leon@mybook.com");
        System.out.println(a4.getEmail());

    }
}


