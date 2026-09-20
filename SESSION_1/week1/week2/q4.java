package SESSION_1.week1.week2;
import java.util.Scanner;

class q4 {

    // Method to validate and mask the phone number
    static String maskPhoneNumber(String phone) {

        // Check if the phone number contains exactly 10 digits
        if (phone.length() != 10) {
            return "Error: Phone number must contain exactly 10 digits.";
        }

        // Check whether every character is a digit
        for (int i = 0; i < phone.length(); i++) {

            if (!Character.isDigit(phone.charAt(i))) {
                return "Error: Phone number must contain only digits.";
            }
        }

        // Get the last 4 digits
        String lastFourDigits = phone.substring(6);

        // Build masked phone number using StringBuilder
        StringBuilder maskedNumber = new StringBuilder();

        maskedNumber.append("XXXXXX");
        maskedNumber.append("-");
        maskedNumber.append(lastFourDigits);

        return maskedNumber.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a 10-digit phone number: ");
        String phone = sc.nextLine();

        // Call the method
        String result = maskPhoneNumber(phone);

        System.out.println(result);

        sc.close();
    }
}