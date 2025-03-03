import java.util.Random;
import java.util.Scanner;

public class Rock_paper_scissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int computer_choice = random.nextInt(3);
        String opponent;

        if (computer_choice == 0) {
            opponent = "Rock";
        } else if (computer_choice == 1) {
            opponent = "Paper";
        } else {
            opponent = "Scissors";
        }

        System.out.print("Enter what you want to choose (Rock, Paper, Scissors): ");
        String player = sc.next();


        if (opponent.equals(player)) {
            System.out.println("Opponent: " + opponent + " | Player: " + player + " | This round is a draw!");
        } else if (
                (opponent.equals("Rock") && player.equals("Paper")) ||
                        (opponent.equals("Paper") && player.equals("Scissors")) ||
                        (opponent.equals("Scissors") && player.equals("Rock"))
        ) {
            System.out.println("Opponent: " + opponent + " | Player: " + player + " | Player won this round!");
        } else if (
                (opponent.equals("Rock") && player.equals("Scissors")) ||
                        (opponent.equals("Paper") && player.equals("Rock")) ||
                        (opponent.equals("Scissors") && player.equals("Paper"))
        ) {
            System.out.println("Opponent: " + opponent + " | Player: " + player + " | Opponent won this round!");
        } else {
            System.out.println("Invalid input! Please enter Rock, Paper, or Scissors.");
        }

        sc.close(); // Close scanner to prevent memory leaks
    }
}
