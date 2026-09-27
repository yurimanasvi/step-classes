package SESSION_1.week4;
import java.util.Scanner;

public class q3 {

    static boolean containsDuplicate(int[] nums) {

        // Compare every pair of elements
        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                // Check if two different positions have the same value
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        boolean result = containsDuplicate(nums);

        System.out.println(result);

        sc.close();
    }
}