package cs3231.lab.extra.one;

public class HandPhoneTester {
    public static void main(String[] args) {

        HandPhone hp1 = new HandPhone();
        System.out.println(hp1);
        System.out.println();

        HandPhone hp2 = new HandPhone("Apple", "iPhoneX", 999.9);
        System.out.println(hp2);
        System.out.println();

        HandPhone hp3 = new HandPhone("Hua Wei", "Pro10", 699);
        System.out.println(hp3);
        System.out.println();

        hp2.setTalktime(1999);
        System.out.println(hp2);
        System.out.println();

        HandPhone hp4 = new HandPhone("Xiao Mi", "Red", 299);
        System.out.println(hp4);
        System.out.println();
    }

}