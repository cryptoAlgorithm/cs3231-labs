package cs3233.lab.twoPointTwo;

public class Mammal {
    private String name;

    public Mammal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String say() {
        return "What does the " + name + " say";
    }
}