package SESSION_1.week1;
import java.util.Scanner;

class q2 {

    // Approach 1: Iterative method
    static boolean isPalindromeIterative(String text) {

        int left = 0;
        int right = text.length() - 1;

        while (left < right) {

            if (text.charAt(left) != text.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }


    // Approach 2: Recursive method
    static boolean isPalindromeRecursive(String text) {

        // Base case
        if (text.length() <= 1) {
            return true;
        }

        // Compare first and last characters
        if (text.charAt(0) != text.charAt(text.length() - 1)) {
            return false;
        }

        // Recursive call with smaller substring
        return isPalindromeRecursive(
                text.substring(1, text.length() - 1)
        );
    }


    // Approach 3: Array Reversal method
    static boolean isPalindromeArrayReversal(String text) {

        char[] characters = text.toCharArray();
        char[] reversed = new char[characters.length];

        // Reverse the array
        for (int i = 0; i < characters.length; i++) {
            reversed[i] = characters[characters.length - 1 - i];
        }

        // Convert reversed array into String
        String reversedText = new String(reversed);

        // Compare original and reversed strings
        return text.equals(reversedText);
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word or text: ");
        String text = sc.nextLine();

        // Convert to lowercase for easier comparison
        text = text.toLowerCase();

        // Check using all three approaches
        boolean iterativeResult = isPalindromeIterative(text);
        boolean recursiveResult = isPalindromeRecursive(text);
        boolean arrayResult = isPalindromeArrayReversal(text);

        // Display results
        System.out.println("\n--- PALINDROME RESULTS ---");

        if (iterativeResult) {
            System.out.println("Iterative: Palindrome");
        } else {
            System.out.println("Iterative: Not Palindrome");
        }

        if (recursiveResult) {
            System.out.println("Recursive: Palindrome");
        } else {
            System.out.println("Recursive: Not Palindrome");
        }

        if (arrayResult) {
            System.out.println("Array Reversal: Palindrome");
        } else {
            System.out.println("Array Reversal: Not Palindrome");
        }

        sc.close();
    }
}