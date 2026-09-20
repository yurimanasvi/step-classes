package SESSION_1.week1;
import java.util.Scanner;
import java.util.HashMap;

class q4 {

    // Method to find the first non-repeating character
    static char findFirstNonRepeatingChar(String text) {

        HashMap<Character, Integer> frequency = new HashMap<>();

        // Count the frequency of every character
        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            if (frequency.containsKey(ch)) {
                frequency.put(ch, frequency.get(ch) + 1);
            } else {
                frequency.put(ch, 1);
            }
        }

        // Find the first character with frequency 1
        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            if (frequency.get(ch) == 1) {
                return ch;
            }
        }

        // Return a special character if none is found
        return '\0';
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word or sentence: ");
        String text = sc.nextLine();

        char result = findFirstNonRepeatingChar(text);

        if (result == '\0') {
            System.out.println("No Non-Repeating Character Found");
        } else {
            System.out.println(
                "First Non-Repeating Character: '" + result + "'"
            );
        }

        sc.close();
    }
}
