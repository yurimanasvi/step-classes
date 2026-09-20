package SESSION_1.week1.week2;
import java.util.Scanner;

class q3 {

    // Method to validate the file extension
    static String validateFileExtension(String filename) {

        // Find the position of the last dot
        int dotIndex = filename.lastIndexOf('.');

        // Check if a valid extension exists
        if (dotIndex == -1 || dotIndex == filename.length() - 1) {
            return "Rejected — invalid file type";
        }

        // Extract the extension
        String extension = filename.substring(dotIndex + 1);

        // Check accepted extensions (case-insensitive)
        if (extension.equalsIgnoreCase("pdf")
                || extension.equalsIgnoreCase("docx")
                || extension.equalsIgnoreCase("zip")) {

            return "Accepted";
        } else {
            return "Rejected — invalid file type";
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the filename: ");
        String filename = sc.nextLine();

        // Call the validation method
        String result = validateFileExtension(filename);

        System.out.println(result);

        sc.close();
    }
}