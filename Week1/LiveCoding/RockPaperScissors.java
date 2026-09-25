import java.util.*;
public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        String[] moves = {"Rock", "Paper", "Scissors"};
        int wins = 0, losses = 0, draws = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter Rock, Paper or Scissors: ");
            String player = sc.next();
            String computer = moves[r.nextInt(3)];
            System.out.println("Computer: " + computer);
            if (player.equals(computer)) {
                System.out.println("Draw");
                draws++;
            }
            else if ((player.equals("Rock") && computer.equals("Scissors")) ||
                     (player.equals("Paper") && computer.equals("Rock")) ||
                     (player.equals("Scissors") && computer.equals("Paper"))) {

                System.out.println("Player Wins");
                wins++;
            }
            else {
                System.out.println("Computer Wins");
                losses++;
            }
            System.out.println();
        }
        System.out.println("----- FINAL SCORE -----");
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
        System.out.println("Draws: " + draws);
        double percentage = wins / 5.0 * 100;
        System.out.println("Win Percentage: " + percentage + "%");
    }
}