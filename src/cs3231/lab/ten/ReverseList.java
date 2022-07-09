package cs3231.lab.ten;

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseList {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = s.nextInt();
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            nums.add((int) (Math.floor(Math.random() * 101) - 50));
        }
        System.out.println("Contents of Original Array:");
        for (Integer i: nums) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Contents of Reversed Array:");
        for (Integer i: reverseList(nums)) {
            System.out.print(i + " ");
        }
    }

    public static ArrayList<Integer> reverseList(ArrayList<Integer> a) {
        ArrayList<Integer> na = new ArrayList<>();
        for (int i = 0; i < a.size(); i++) {
            na.add(a.get(a.size() - i - 1));
        }
        return na;
    }
}
