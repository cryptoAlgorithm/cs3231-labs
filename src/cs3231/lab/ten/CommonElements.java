package cs3231.lab.ten;

import java.util.ArrayList;

public class CommonElements {
    public static void main(String[] args) {
        ArrayList<String> l1 = new ArrayList<>();
        l1.add("apple"); l1.add("pear");
    }

    public static ArrayList<String> getCommonElements(ArrayList<String> list1, ArrayList<String> list2) {
        ArrayList<String> c = new ArrayList<>();
        for (String s : list1) if (list2.contains(s)) c.add(s);
        for (String s : c) {
            list2.remove(s);
            list1.remove(s);
        }
        return c;
    }
}
