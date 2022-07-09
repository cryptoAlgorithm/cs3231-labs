package cs3231.lab.eleven;

public class Person implements Comparable<Person>{
    private int index;
    private String firstName;
    private String lastName;
    private String gender;

    public Person(int index, String firstName, String lastName, String gender){
        this.index = index;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return gender + "" + index + ") " + firstName + " " + lastName + "\n";
    }

    @Override
    public int compareTo(Person obj) {
        //sort in ascending order
        return this.firstName.compareTo(obj.firstName);
    }
}
