package SESSION_1.week6;
public class assq5 {

    String empName;
    double salary;

    static String companyName = "Bright Horizon Technologies";
    static int employeeCount = 0;

    assq5(String empName, double salary) {

        this.empName = empName;
        this.salary = salary;

        employeeCount++;
    }

    static void printCompanyInfo() {

        System.out.println(companyName);
        System.out.println("Employees on record: " + employeeCount);
    }

    public static void main(String[] args) {

        assq5 e1 = new assq5("Ravi", 50000);
        assq5 e2 = new assq5("Anitha", 60000);
        assq5 e3 = new assq5("Karthik", 55000);

        assq5.printCompanyInfo();
    }
}