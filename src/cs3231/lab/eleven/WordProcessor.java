package cs3231.lab.eleven;

import java.io.File;
import java.util.Scanner;

public class WordProcessor {
    public static void main(String[] args) {
        System.out.println(processFile("Lincoln.txt"));
    }
    public static String processFile(String filename){
        try {
            Scanner s = new Scanner(new File(filename));
            int st=0, w=0, ch=0;
            while (s.hasNextLine()) {
                String l = s.nextLine();
                w += l.split(" ").length;
                ch += l.replaceAll("[, .]", "").length();
                for (char c : l.toCharArray()) if (c == '.') st++;
            }
            s.close();
            return String.format("%d %d %d", st, w, ch);
        } catch (Exception ignored) {
            return "Error in file reading.";
        }
    }
}
