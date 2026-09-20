package SESSION_1.week1;
import java.util.Scanner;

class q5 {

    // Method to reverse the customer name
    static String reverseCustomerName(String customerName) {

        String reversedName = "";

        // Traverse the string from last character to first
        for (int i = customerName.length() - 1; i >= 0; i--) {
            reversedName = reversedName + customerName.charAt(i);
        }

        return reversedName;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take customer name as input
        System.out.print("Enter customer name: ");
        String customerName = sc.nextLine();

        // Call the method to reverse the name
        String reversedName = reverseCustomerName(customerName);

        // Print original and reversed names
        System.out.println("Original Name: " + customerName);
        System.out.println("Reversed Name: " + reversedName);

        sc.close();
    }
}