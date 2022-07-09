package cs3231.lab.three;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int yr = s.nextInt();

        System.out.printf("%d is a leap year? %b", yr, isLeap(yr));
    }

    public static boolean isLeap(int yr) {
        return (yr % 4 == 0 && yr % 100 != 0) || yr % 400 == 0;
    }
}
