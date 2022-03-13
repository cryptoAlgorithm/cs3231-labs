package lab.extra.one;

public class FanTester {
    /** Main method */
    public static void main(String[] args) {
        final int SLOW = 1;		// Fan speed slow
        final int MEDIUM = 2;	// Fan speed medium
        final int FAST = 3;		// Fan speed fast

        // 1. Create two Fan objects f1 and f2
        Fan f1 = new Fan();
        Fan f2 = new Fan();

        // 2. Assign maximum speed, radius 10, color yellow and turn it on for Fan f1
        f1.changeRadius(10);
        f1.changeColor("yellow");
        f1.turnOn(true);
        f1.changeSpeed(FAST);

        // 3. Assign medium speed, radius 5, color blue and turn it off for Fan f2
        f2.changeRadius(5);
        f2.changeColor("blue");
        f2.turnOn(false);
        f2.changeSpeed(MEDIUM);

        // 4. Display the objects by invoking their toString method
        System.out.println(f1);
        System.out.println(f2);
    }
}