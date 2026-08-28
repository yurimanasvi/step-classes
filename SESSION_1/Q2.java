package SESSION_1;
import java.util.Scanner;

class Q2 {

    void classifyNumber(int number) {

        if (number > 0) {
            System.out.println("Positive");
        } else if (number < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        Q2 n = new Q2();
        n.classifyNumber(number);
        sc.close();
    }
}