package lab.eleven;

import java.io.File;
import java.util.Scanner;

public class RandomTxtReader {
    public static void main(String[] args) {
        System.out.println(processFile("random.txt"));
    }
    public static String processFile(String filename){
        // Enter your code here. Ensure you include the relevant imports in your Coursemology submission.
        try {
            Scanner s = new Scanner(new File(filename));
            double c=0, su=0; // bad practices 101
            while (s.hasNextLine()) {
                c++;
                su += Integer.parseInt(s.nextLine());
            }
            return String.format("%.0f %.0f %.2f", c, su, su/c);
        } catch (Exception ignored) {
            return "Error in file reading.";
        }
    }
}
