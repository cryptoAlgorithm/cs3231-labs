package cs3233.lab.twoPointTwo;

public class Cat extends Mammal {
    public Cat() {
        super("Cat");
    }
    @Override
    public String say() {
        return "Meow";
    }
}