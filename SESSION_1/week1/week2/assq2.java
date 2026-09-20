package SESSION_1.week1.week2;
import java.util.Scanner;

public class assq2 {

    // Method to reverse each word in the sentence
    static String reverseEachWord(String sentence) {

        // Split the sentence into words
        String[] words = sentence.split(" ");

        StringBuilder result = new StringBuilder();

        // Process each word
        for (int i = 0; i < words.length; i++) {

            StringBuilder reversedWord = new StringBuilder();

            // Reverse the current word using a loop
            for (int j = words[i].length() - 1; j >= 0; j--) {
                reversedWord.append(words[i].charAt(j));
            }

            // Add reversed word to result
            result.append(reversedWord);

            // Add space between words
            if (i < words.length - 1) {
                result.append(" ");
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        // Call the method
        String result = reverseEachWord(sentence);

        System.out.println("Reversed sentence: " + result);

        sc.close();
    }
}
