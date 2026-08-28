package SESSION_1;
import java.util.Scanner;

class Q1 {

    void checkVotingEligibility(int age) {

        boolean eligible = age >= 18;

        if (eligible) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible to vote");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();

        Q1 q = new Q1();
        q.checkVotingEligibility(age);
         sc.close();

    }
}
