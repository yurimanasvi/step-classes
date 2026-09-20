package SESSION_1.week1;
import java.util.Scanner;

public class assq3 {

    // Method to find the longest streak
    static void findLongestStreak(String signalLog) {

        // Check if the string is empty
        if (signalLog.length() == 0) {
            System.out.println("Signal log is empty.");
            return;
        }

        char longestColor = signalLog.charAt(0);
        int longestStreak = 1;

        char currentColor = signalLog.charAt(0);
        int currentStreak = 1;

        // Start checking from the second character
        for (int i = 1; i < signalLog.length(); i++) {

            // If current character is same as previous
            if (signalLog.charAt(i) == currentColor) {
                currentStreak++;
            } else {

                // Check whether current streak is the longest
                if (currentStreak > longestStreak) {
                    longestStreak = currentStreak;
                    longestColor = currentColor;
                }

                // Start a new streak
                currentColor = signalLog.charAt(i);
                currentStreak = 1;
            }
        }

        // Check the last streak
        if (currentStreak > longestStreak) {
            longestStreak = currentStreak;
            longestColor = currentColor;
        }

        // Print the result
        System.out.println("Longest Streak: '" + longestColor
                + "' repeated " + longestStreak + " times");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the signal log (R, Y, G): ");
        String signalLog = sc.nextLine();

        // Convert input to uppercase
        signalLog = signalLog.toUpperCase();

        // Call the method
        findLongestStreak(signalLog);

        sc.close();
    }
}
