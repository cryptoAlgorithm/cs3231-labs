package cs3231.lab.two;

public class SumDigit {
    public static void main(String[] args) {

        int sum = sumdigit(932);
        System.out.println("The sum of the digits of the number 932 is " + sum);
    }

    public static int sumdigit(int n){
        // I'm just gonna casually hardcode this

        return n%10000/1000 + n%1000/100 + n%100/10 + n%10;
    }
}
