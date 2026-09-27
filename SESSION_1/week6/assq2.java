package SESSION_1.week6;
public class assq2 {

    private double basicSalary;
    private double bonus;

    public assq2(double basicSalary) {

        if (basicSalary < 0) {
            System.out.println("Invalid basic salary");
            this.basicSalary = 0;
        } else {
            this.basicSalary = basicSalary;
        }

        bonus = 0;
    }

    public void creditBonus(double amount) {

        if (amount <= 0) {
            System.out.println("Bonus rejected");
        } else {
            bonus = bonus + amount;
            System.out.println("Bonus credited: Rs " + amount);
        }
    }

    public void deductTax(double percent) {

        if (percent < 0 || percent > 100) {
            System.out.println("Invalid tax percentage");
        } else {
            basicSalary = basicSalary - (basicSalary * percent / 100);
            System.out.println("Tax deducted: " + percent + "%");
        }
    }

    public double getNetSalary() {
        return basicSalary + bonus;
    }

    public static void main(String[] args) {

        assq2 account = new assq2(50000);

        account.creditBonus(5000);

        account.deductTax(10);

        System.out.println("Net salary: Rs " + account.getNetSalary());
    }
}