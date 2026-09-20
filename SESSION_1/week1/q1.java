package SESSION_1.week1;
import java.util.Scanner;
import java.util.Random;

class q1 {

    // Method to determine the winner of one round
    static String playRound(String playerMove, String computerMove) {

        if (playerMove.equals(computerMove)) {
            return "Draw";
        }

        if ((playerMove.equals("Rock") && computerMove.equals("Scissors")) ||
            (playerMove.equals("Paper") && computerMove.equals("Rock")) ||
            (playerMove.equals("Scissors") && computerMove.equals("Paper"))) {

            return "Player Wins";
        } else {
            return "Computer Wins";
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        String[] moves = {"Rock", "Paper", "Scissors"};

        int rounds = 5;

        // Arrays to store round details
        String[] playerMoves = new String[rounds];
        String[] computerMoves = new String[rounds];
        String[] results = new String[rounds];

        int wins = 0;
        int losses = 0;
        int draws = 0;

        System.out.println("=== ROCK PAPER SCISSORS GAME ===");

        // Play N rounds
        for (int i = 0; i < rounds; i++) {

            System.out.println("\nRound " + (i + 1));

            System.out.print("Enter your move (Rock/Paper/Scissors): ");
            String playerMove = sc.next();

            // Generate random computer move
            String computerMove = moves[random.nextInt(3)];

            // Convert first letter to uppercase and remaining to lowercase
            playerMove = playerMove.substring(0, 1).toUpperCase()
                    + playerMove.substring(1).toLowerCase();

            // Check for valid input
            if (!playerMove.equals("Rock") &&
                !playerMove.equals("Paper") &&
                !playerMove.equals("Scissors")) {

                System.out.println("Invalid move! Please enter Rock, Paper, or Scissors.");
                i--;
                continue;
            }

            // Store moves
            playerMoves[i] = playerMove;
            computerMoves[i] = computerMove;

            // Determine result
            results[i] = playRound(playerMove, computerMove);

            System.out.println("Player: " + playerMove);
            System.out.println("Computer: " + computerMove);
            System.out.println("Result: " + results[i]);

            // Count wins, losses, and draws
            if (results[i].equals("Player Wins")) {
                wins++;
            } else if (results[i].equals("Computer Wins")) {
                losses++;
            } else {
                draws++;
            }
        }

        // Calculate win percentage
        double winPercentage = (wins * 100.0) / rounds;

        // Final summary table
        System.out.println("\n=== FINAL SUMMARY ===");

        System.out.println("------------------------------------------------");
        System.out.printf("%-10s %-15s %-18s %-15s%n",
                "Round", "Player Move", "Computer Move", "Result");
        System.out.println("------------------------------------------------");

        for (int i = 0; i < rounds; i++) {
            System.out.printf("%-10d %-15s %-18s %-15s%n",
                    (i + 1),
                    playerMoves[i],
                    computerMoves[i],
                    results[i]);
        }

        System.out.println("------------------------------------------------");

        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
        System.out.println("Draws: " + draws);
        System.out.printf("Win Percentage: %.1f%%%n", winPercentage);

        sc.close();
    }
}