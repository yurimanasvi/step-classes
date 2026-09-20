package SESSION_1.week1.week2;
import java.util.Scanner;

class q1 {

    // Method to count vowels and consonants
    static void countVowelsAndConsonants(String text) {

        int vowels = 0;
        int consonants = 0;

        // Loop through every character
        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            // Convert character to lowercase
            ch = Character.toLowerCase(ch);

            // Ignore spaces
            if (ch == ' ') {
                continue;
            }

            // Check if character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u') {

                vowels++;
            } else {
                consonants++;
            }
        }

        // Print the results
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a book title: ");
        String text = sc.nextLine();

        // Call the method
        countVowelsAndConsonants(text);

        sc.close();
    }
}