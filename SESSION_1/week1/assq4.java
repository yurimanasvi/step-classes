package SESSION_1.week1;
public class assq4 {

    // Method to analyze the inventory
    static void analyzeInventory(int[] sectionA, int[] sectionB) {

        int totalA = 0;
        int totalB = 0;

        int highestQuantity = sectionA[0];
        String highestSection = "Section A";
        int highestIndex = 0;

        // Calculate total of Section A and find highest quantity
        for (int i = 0; i < sectionA.length; i++) {

            totalA = totalA + sectionA[i];

            if (sectionA[i] > highestQuantity) {
                highestQuantity = sectionA[i];
                highestSection = "Section A";
                highestIndex = i;
            }
        }

        // Calculate total of Section B and find highest quantity
        for (int i = 0; i < sectionB.length; i++) {

            totalB = totalB + sectionB[i];

            if (sectionB[i] > highestQuantity) {
                highestQuantity = sectionB[i];
                highestSection = "Section B";
                highestIndex = i;
            }
        }

        // Print totals
        System.out.println("Section A Total: " + totalA);
        System.out.println("Section B Total: " + totalB);

        // Check whether both sections are balanced
        if (totalA == totalB) {
            System.out.println("Status: Balanced");
        } else {
            System.out.println("Status: Not Balanced");
        }

        // Print highest quantity
        System.out.println("Highest Quantity: " + highestQuantity
                + " (" + highestSection
                + ", Item " + (highestIndex + 1) + ")");
    }

    public static void main(String[] args) {

        // Inventory quantities in Section A
        int[] sectionA = {20, 15, 30};

        // Inventory quantities in Section B
        int[] sectionB = {25, 10, 30};

        // Call the method
        analyzeInventory(sectionA, sectionB);
    }
}