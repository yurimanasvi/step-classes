package SESSION_1.week6;
public class assq3 {

    String empId;
    String empName;
    double salary;
    boolean isIntern;

    public assq3(String empId, String empName, double salary) {

        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
        this.isIntern = false;
    }

    public assq3(String empId, String empName) {

        this(empId, empName, 0);
        this.isIntern = true;
    }

    void printProfile() {

        System.out.println(empId + " | " + empName
                + " | Rs " + salary
                + " | Intern: " + isIntern);
    }

    public static void main(String[] args) {

        assq3 employee1 = new assq3(
                "E-101", "Divya", 65000
        );

        assq3 employee2 = new assq3(
                "E-102", "Arjun"
        );

        employee1.printProfile();
        employee2.printProfile();
    }
}