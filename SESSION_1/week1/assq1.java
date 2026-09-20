package SESSION_1.week1;
public class assq1 {

    // Method to check duplicate seat numbers
    static void checkDuplicateSeats(int[] seatNumbers) {

        boolean duplicateFound = false;

        // Compare every seat number with the remaining seat numbers
        for (int i = 0; i < seatNumbers.length; i++) {

            for (int j = i + 1; j < seatNumbers.length; j++) {

                if (seatNumbers[i] == seatNumbers[j]) {
                    System.out.println(
                        "Duplicate Seat Number Found: " + seatNumbers[i]
                    );

                    duplicateFound = true;
                }
            }
        }

        // If no duplicate is found
        if (duplicateFound == false) {
            System.out.println("No Duplicate Seats Found");
        }
    }

    public static void main(String[] args) {

        // Array of seat numbers
        int[] seatNumbers = {101, 102, 103, 102, 105};

        // Call the method
        checkDuplicateSeats(seatNumbers);
    }
}
