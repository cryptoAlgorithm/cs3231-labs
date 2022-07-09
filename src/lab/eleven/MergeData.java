package lab.eleven;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MergeData {
    public static void main(String[] args) {
        mergeData("data1.txt", "data2.txt");
    }

    public static void mergeData(String filename1, String filename2){
        //Complete your code here. Ensure your sorted merge file is named "merge.txt"
        ArrayList<Integer> l1 = new ArrayList<>(), l2 = new ArrayList<>(), m = new ArrayList<>();
        try {
            Scanner s1 = new Scanner(new File(filename1));
            Scanner s2 = new Scanner(new File(filename2));
            while (s1.hasNextLine()) l1.add(Integer.parseInt(s1.nextLine()));
            while (s2.hasNextLine()) l2.add(Integer.parseInt(s2.nextLine()));
            s1.close();
            s2.close();

            Collections.sort(l1);
            Collections.sort(l2);

            // i didnt read up on merge sort
            int i = 0;
            if (l2.get(0) < l1.get(0)) {
                m.add(l2.get(0)); i++;
            }
            for (int d = 0; d < l1.size(); d++) {
                m.add(l1.get(d));
                while (i < l2.size() && d+1 < l1.size() && l2.get(i) <= l1.get(d+1)) {
                    m.add(l2.get(i));
                    i++;
                }
            }

            try {
                FileWriter w1 = new FileWriter("data1sorted.txt");
                FileWriter w2 = new FileWriter("data2sorted.txt");
                FileWriter mg = new FileWriter("merge.txt");
                for (Integer n : l1) w1.write(n + "\n");
                for (Integer n : l2) w2.write(n + "\n");
                for (Integer n : m) mg.write(n + "\n");
                w1.close();
                w2.close();
                mg.close();
            } catch (IOException ignored) { }
        } catch (IOException ignored) { }
    }
}
