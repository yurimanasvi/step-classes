package SESSION_1.week1.week2;
import java.util.Scanner;

public class assq1 {

    // Method to check PIN length
    static void checkPinLength(String pin) {

        if (pin.length() != 4) {
            System.out.println("Invalid PIN — must be exactly 4 digits.");
        } else {
            System.out.println("PIN length OK.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your PIN: ");
        String pin = sc.nextLine();

        // Call the method
        checkPinLength(pin);

        sc.close();
    }
}