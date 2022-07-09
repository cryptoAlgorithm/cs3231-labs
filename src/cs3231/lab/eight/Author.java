package cs3231.lab.eight;

import java.util.regex.Pattern;

public class Author {
    private final String name;
    private String email;
    private final char gender;

    public Author(String name, char gender) {
        this.email = name + "@mybook.com";
        this.gender = gender;
        this.name = name;
    }

    public Author(String name, char gender, String email) {
        this(name, gender);
        if (checkEmail(email)) this.email = email;
        else this.email = name + "@mybook.com";
    }

    public Author(Author a) {
        this(a.getName(), a.getGender(), a.getEmail());
    }

    @Override
    public String toString() {
        return "Author[" +
                "name=" + name +
                ",email=" + email +
                ",gender=" + gender +
                ']';
    }

    static boolean checkEmail(String email) {
        return Pattern.compile("^[a-zA-Z\\d]+@mybook\\.com$").matcher(email).matches();
    }

    public char getGender() {
        return gender;
    }
    public String getEmail() {
        return email;
    }
    public String getName() {
        return name;
    }

    public void setEmail(String email) {
        if (checkEmail(email)) this.email = email;
        else this.email = name + "@mybook.com";
    }
}
