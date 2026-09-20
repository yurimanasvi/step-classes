package SESSION_1.week1;
import java.util.Scanner;

public class assq2 {

    // Method to check typing accuracy
    static void checkTypingAccuracy(String original, String typed) {

        int matched = 0;
        int firstMismatch = -1;

        // Compare characters one by one
        for (int i = 0; i < original.length(); i++) {

            if (original.charAt(i) == typed.charAt(i)) {
                matched++;
            } else {

                // Store the first mismatch position
                if (firstMismatch == -1) {
                    firstMismatch = i;
                }
            }
        }

        // Calculate accuracy percentage
        double accuracy = (matched * 100.0) / original.length();

        // Print matched characters and accuracy
        System.out.println("\nMatched: " + matched + "/" + original.length());
        System.out.printf("Accuracy: %.2f%%%n", accuracy);

        // Print first mismatch
        if (firstMismatch == -1) {
            System.out.println("No Mismatches");
        } else {
            System.out.println(
                "First Mismatch at position " + (firstMismatch + 1)
                + " ('" + original.charAt(firstMismatch)
                + "' vs '" + typed.charAt(firstMismatch) + "')"
            );
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the original passage: ");
        String original = sc.nextLine();

        System.out.print("Enter the typed passage: ");
        String typed = sc.nextLine();

        // Check whether both strings have equal length
        if (original.length() != typed.length()) {
            System.out.println(
                "Error: Both strings must have the same length."
            );
        } else {
            checkTypingAccuracy(original, typed);
        }

        sc.close();
    }
}