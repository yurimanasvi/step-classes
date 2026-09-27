package SESSION_1.week7;
public class q1 {

    private double savings;
    private final String id;

    q1(String id) {
        this.id = id;
        savings = 0;
    }

    void deposit(double amount) {
        savings = savings + amount;
    }

    void withdraw(double amount) {
        if (amount > savings) {
            System.out.println("Withdrawal rejected");
        } else {
            savings = savings - amount;
        }
    }

    double getSavings() {
        return savings;
    }

    public static void main(String[] args) {

        q1 pb = new q1("PB-1");

        pb.deposit(100);
        System.out.println("Savings: " + pb.getSavings());

        pb.withdraw(30);
        System.out.println("Savings: " + pb.getSavings());

        pb.withdraw(500);
        System.out.println("Savings: " + pb.getSavings());
    }
}
