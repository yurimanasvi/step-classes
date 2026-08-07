import java.util.Scanner;

public class CLASS1_Q4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] sectionA = new int[3];
        int[] sectionB = new int[3];

        System.out.println("Enter quantities for Section A:");
        for (int i = 0; i < 3; i++) {
            sectionA[i] = sc.nextInt();
        }

        System.out.println("Enter quantities for Section B:");
        for (int i = 0; i < 3; i++) {
            sectionB[i] = sc.nextInt();
        }

        int totalA = 0;
        int totalB = 0;

        for (int i = 0; i < 3; i++) {
            totalA = totalA + sectionA[i];
            totalB = totalB + sectionB[i];
        }

        int max = sectionA[0];
        String section = "A";
        int item = 1;

        for (int i = 0; i < 3; i++) {

            if (sectionA[i] > max) {
                max = sectionA[i];
                section = "A";
                item = i + 1;
            }

            if (sectionB[i] > max) {
                max = sectionB[i];
                section = "B";
                item = i + 1;
            }
        }

        System.out.println("Section A Total: " + totalA);
        System.out.println("Section B Total: " + totalB);

        if (totalA == totalB) {
            System.out.println("Status: Balanced");
        } else {
            System.out.println("Status: Not Balanced");
        }

        System.out.println("Highest Quantity: " + max +
                           " (Section " + section + ", Item " + item + ")");
                           sc.close();
    }
}