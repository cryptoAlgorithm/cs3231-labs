package cs3231.lab.eleven;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PersonTester {
    static ArrayList<Person> personListM;
    static ArrayList<Person> personListF;

    public static void main(String[] args) {
        processFile("person.csv");
        System.out.println(personListM);
        System.out.println(personListF);
    }

    public static void processFile(String filename){
        personListF = new ArrayList<>();
        personListM = new ArrayList<>();
        try {
            Scanner s = new Scanner(new File(filename));
            while (s.hasNextLine()) {
                String[] f = s.nextLine().split(",");
                if (f[2].equals("F")) personListF.add(new Person(personListF.size()+1, f[1], f[0], f[2]));
                else personListM.add(new Person(personListM.size()+1, f[1], f[0], f[2]));
            }
            Collections.sort(personListF);
            Collections.sort(personListM);
            s.close();
        } catch (Exception ignored) {
        }
    }
}