package SESSION_1.week1.week2;
import java.util.Scanner;

class q2 {

    // Method to parse and display the student record
    static void parseStudentRecord(String csvLine) {

        // Split the CSV line using comma
        String[] fields = csvLine.split(",");

        // Check if exactly 3 fields are present
        if (fields.length != 3) {
            System.out.println("Invalid Record");
            return;
        }

        // Print formatted student record
        System.out.println("Name: " + fields[0]
                + " | Roll No: " + fields[1]
                + " | Dept: " + fields[2]);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter student record in CSV format:");
        System.out.println("Name,RollNumber,Department");

        String csvLine = sc.nextLine();

        // Call the method
        parseStudentRecord(csvLine);

        sc.close();
    }
}
