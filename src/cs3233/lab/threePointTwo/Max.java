package cs3233.lab.threePointTwo;

//Max.java: Find a maximum object
class Max {
    /** Return the maximum of two objects */
    public static ComparableCircle max(ComparableCircle o1, ComparableCircle o2) {
        if (o1.compareTo(o2) > 0) {
            return o1;
        } else {
            return o2;
        }
    }
}