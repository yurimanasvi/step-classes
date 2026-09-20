package SESSION_1.week1;
import java.util.Scanner;

public class assq5 {

    // Method to classify words according to their length
    static void classifyWordLengths(String review) {

        // Split the review into individual words
        String[] words = review.split("\\s+");

        int shortWords = 0;
        int mediumWords = 0;
        int longWords = 0;

        // Check every word
        for (int i = 0; i < words.length; i++) {

            int length = words[i].length();

            if (length >= 1 && length <= 4) {
                shortWords++;
            }
            else if (length >= 5 && length <= 8) {
                mediumWords++;
            }
            else {
                longWords++;
            }
        }

        // Print the final counts
        System.out.println("\nShort: " + shortWords);
        System.out.println("Medium: " + mediumWords);
        System.out.println("Long: " + longWords);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a movie review:");
        String review = sc.nextLine();

        // Call the method
        classifyWordLengths(review);

        sc.close();
    }
}
