package SESSION_1.week4;
import java.util.Scanner;

public class q5 {

    static int[] rotateArray(int[] nums, int k) {

        // Reduce k if it is greater than array length
        k = k % nums.length;

        int[] newArray = new int[nums.length];

        // Place each element at its new position
        for (int i = 0; i < nums.length; i++) {
            newArray[(i + k) % nums.length] = nums[i];
        }

        return newArray;
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

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        int[] result = rotateArray(nums, k);

        System.out.println("Rotated array:");

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

        sc.close();
    }
}