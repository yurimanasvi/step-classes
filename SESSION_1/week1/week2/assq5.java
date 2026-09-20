package SESSION_1.week1.week2;
import java.util.Scanner;
import java.util.HashMap;

public class assq5 {

    static void printFilteredWordFrequency(String feedback) {

        // Convert to lowercase
        feedback = feedback.toLowerCase();

        // Remove punctuation
        feedback = feedback.replace(".", "");
        feedback = feedback.replace(",", "");

        // Split into words
        String[] words = feedback.split("\\s+");

        // Stop words
        String[] stopWords = {
            "the", "was", "and", "a", "is", "of", "in"
        };

        HashMap<String, Integer> frequency = new HashMap<>();

        // Check every word
        for (int i = 0; i < words.length; i++) {

            boolean stop = false;

            // Check if the word is a stop word
            for (int j = 0; j < stopWords.length; j++) {

                if (words[i].equals(stopWords[j])) {
                    stop = true;
                    break;
                }
            }

            // Count the word if it is not a stop word
            if (stop == false) {

                if (frequency.containsKey(words[i])) {
                    frequency.put(words[i],
                            frequency.get(words[i]) + 1);
                } else {
                    frequency.put(words[i], 1);
                }
            }
        }

        // Print all words and their frequencies
        System.out.println("\nFiltered Word Frequency:");

        for (String word : frequency.keySet()) {
            System.out.println(word + ": " + frequency.get(word));
        }
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter feedback text:");
        String feedback = sc.nextLine();

        printFilteredWordFrequency(feedback);

        sc.close();
    }
}
