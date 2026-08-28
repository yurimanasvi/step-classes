package SESSION_1;
import java.util.Scanner;

class Q3 {

    void printNumbersUpToN(int n) {

        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Q3 q = new Q3();
        q.printNumbersUpToN(n);
        sc.close();
    }
}