package cs3231.lab.extra.one;


public class StopWatchTester {
    /** Main method */
    public static void main(String[] args) {
        // 1. Write code to create a StopWatch object
        StopWatch w = new StopWatch();

        // Given: create array of 100,000 random numbers
        int[] randomArray = getArray();

        // 2. Write code to invoke the start method in StopWatch class
        w.start();

        // Given: Sort array
        selectionSort(randomArray);

        // 3. Write code to invoke the stop method in StopWatch class
        w.stop();

        // 4. Remove the blank, fill in code to display the execution time
        System.out.println("The execution time of sorting 100,000 " +
                "numbers using selection sort: " + w.getElapsedTime() +
                " milliseconds");
    }

    /** Given: getArray creates and returns an array of 100,000 random numbers */
    public static int[] getArray() {
        // Create an array of length 100,000
        int[] array = new int[100000];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 100000);
        }
        return array;
    }

    /** Given: selectionSort performs a selection sort on an array */
    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = array[i];
            int minIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minIndex = j;
                }
            }

            if (i != minIndex) {
                array[minIndex] = array[i];
                array[i] = min;
            }
        }
    }
}
