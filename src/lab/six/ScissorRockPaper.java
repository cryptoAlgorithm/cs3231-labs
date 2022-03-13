package lab.six;

import java.util.Scanner;

public class ScissorRockPaper {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        System.out.print("scissor (0), rock (1), paper (2): ");
        int c = s.nextInt();
        int r = (int) Math.floor(Math.random() * 3);
        System.out.printf("Computer is %s. %s", r == 0 ? "scissor" : (r == 1 ? "rock" : "paper"), getWinner(c, r));
    }
    public static String getWinner(int p, int c) {
        return p == c ? "Draw" : (((p == 0 && c == 1) || (p == 1 && c == 2)) ? "You lose" : "You win");
    }
}
