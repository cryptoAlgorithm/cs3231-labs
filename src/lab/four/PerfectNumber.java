package lab.four;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter n: ");

        int n = s.nextInt();
        System.out.printf("%d is%s a perfect number", n, isPerfect(n) ? "" : " not");
    }
    public static boolean isPerfect(int n) {
        List<Integer> divisors = new ArrayList<>();
        for (int i = 1; i < n; i++) {
            if (n % i == 0) divisors.add(i);
        }
        int s = 0;
        for (Integer divisor : divisors) s += divisor;
        return s == n;
    }
}
