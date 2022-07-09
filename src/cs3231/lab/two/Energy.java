package cs3231.lab.two;

import java.util.Scanner;

public class Energy {
    public static void main(String[] args) {

        Scanner i = new Scanner(System.in);
        System.out.print("Enter the amount of water in kilograms: ");
        double w = i.nextDouble(); 	//complete code here with scanner
        System.out.print("Enter the initial temperature: ");
        double it = i.nextDouble(); 	//complete code here with scanner
        System.out.print("Enter the final temperature: ");
        double ft = i.nextDouble(); 	//complete code here with scanner

        double energy = calculateEnergy(w,it,ft);

        System.out.printf("The energy needed is %.1f", energy); //complete code here to format printout
    }

    public static double calculateEnergy(double w, double i, double f){
        //complete code here for calculation
        return w * (f - i) * 4184;
    }

}
