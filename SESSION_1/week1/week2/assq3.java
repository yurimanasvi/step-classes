package SESSION_1.week1.week2;
import java.util.Scanner;

public class assq3 {

    // Method to parse and display the inventory record
    static void parseInventoryRecord(String csvLine) {

        // Split the CSV line using comma
        String[] fields = csvLine.split(",");

        // Check if exactly 3 fields are present
        if (fields.length != 3) {
            System.out.println("Invalid Record");
            return;
        }

        // Print formatted inventory record
        System.out.println("Product: " + fields[0]
                + " | SKU: " + fields[1]
                + " | Qty: " + fields[2]);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter inventory record:");
        System.out.println("Format: ProductName,SKU,Quantity");

        String csvLine = sc.nextLine();

        // Call the method
        parseInventoryRecord(csvLine);

        sc.close();
    }
}
