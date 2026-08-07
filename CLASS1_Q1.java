import java.util.Scanner;

public class CLASS1_Q1 
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter seat numbers:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        boolean found = false;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                if (a[i] == a[j]) {
                    System.out.println("Duplicate Seat Number Found: " + a[i]);
                    found = true;
                }
            }
        }

        if (found == false) {
            System.out.println("No Duplicate Seats Found");
        }
        sc.close();
    }
}