import java.util.Scanner;

public class CLASS1_Q3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter signal: ");
        String signal = sc.nextLine();

        int count = 1;
        int max = 1;
        char color = signal.charAt(0);

        for (int i = 1; i < signal.length(); i++) {

            if (signal.charAt(i) == signal.charAt(i - 1)) {
                count++;
            } else {
                count = 1;
            }

            if (count > max) {
                max = count;
                color = signal.charAt(i);
            }
        }

        System.out.println("Longest Streak: '" + color +
                           "' repeated " + max + " times");
                           sc.close();
    }
}