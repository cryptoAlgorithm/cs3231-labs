package lab.six;

import java.util.Scanner;
import java.util.regex.Pattern;

public class SSN {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a SSN: ");

        String ss = s.nextLine();
        System.out.printf("%s is %s staff security number", ss,
                isValidSSN(ss) ? "a valid" : "an invalid");
    }
    public static boolean isValidSSN(String s) {
        return Pattern.compile("\\d{3}-[a-zA-Z]{2}-\\d{3}-[m-vM-V]").matcher(s).matches();
    }
}
