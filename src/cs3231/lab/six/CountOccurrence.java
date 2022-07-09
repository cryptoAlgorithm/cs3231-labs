package cs3231.lab.six;

import java.util.Scanner;

public class CountOccurrence {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a SSN: ");
        String ss = s.nextLine();
        System.out.print("Enter a character: ");
        char c = s.nextLine().toCharArray()[0];

        System.out.printf("The number of occurrences of '%s' in \"%s\" is %d", c, ss, count(ss, c));
    }
    public static int count(String x, char a) {
        int t = 0;
        for (char c: x.toCharArray()) {
            if (c == a) t++;
        }
        return t;
    }
}
