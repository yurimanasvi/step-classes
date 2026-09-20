package SESSION_1.week1.week2;
import java.util.Scanner;

public class assq4 {

    // Method to normalize the code
    static String normalizeCode(String raw) {

        // Remove leading and trailing spaces
        raw = raw.trim();

        // Check if the code has at least 3 characters
        if (raw.length() < 3) {
            return raw;
        }

        // Convert only the first 3 characters to uppercase
        String publisherCode = raw.substring(0, 3).toUpperCase();

        // Keep the remaining characters unchanged
        String remaining = raw.substring(3);

        // Join both parts
        return publisherCode + remaining;
    }


    // Method to validate and format the code
    static String validateAndFormat(String code) {

        // Check the length
        if (code.length() != 13) {
            return "Invalid: code must be exactly 13 characters";
        }

        // Check whether the first 3 characters are letters
        for (int i = 0; i < 3; i++) {

            if (!Character.isLetter(code.charAt(i))) {
                return "Invalid: publisher code must be 3 letters";
            }
        }

        // Check whether the remaining 10 characters are digits
        for (int i = 3; i < 13; i++) {

            if (!Character.isDigit(code.charAt(i))) {
                return "Invalid: code body must contain only digits";
            }
        }

        // Extract publisher code
        String publisherCode = code.substring(0, 3);

        // Extract year (4 digits)
        String year = code.substring(3, 7);

        // Extract catalog number (6 digits)
        String catalog = code.substring(7, 13);

        // Build formatted output using StringBuilder
        StringBuilder result = new StringBuilder();

        result.append("[");
        result.append(publisherCode);
        result.append("] YEAR: ");
        result.append(year);
        result.append(" | CATALOG: ");
        result.append(catalog);

        return result.toString();
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ISBN-style code: ");
        String raw = sc.nextLine();

        // Normalize the code
        String code = normalizeCode(raw);

        // Validate and format the code
        String result = validateAndFormat(code);

        System.out.println(result);

        sc.close();
    }
}
