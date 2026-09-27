package SESSION_1.week7;
public class q5 {

    private String[] students;
    private int count;

    q5(int size) {
        students = new String[size];
        count = 0;
    }

    void markPresent(String name) {

        if (isPresent(name)) {
            return;
        }

        if (count < students.length) {
            students[count] = name;
            count++;
        }
    }

    int getPresentCount() {
        return count;
    }

    boolean isPresent(String name) {

        for (int i = 0; i < count; i++) {

            if (students[i].equals(name)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        q5 sheet = new q5(30);

        sheet.markPresent("Ana");
        sheet.markPresent("Ben");
        sheet.markPresent("Ana");

        System.out.println("Present count: " + sheet.getPresentCount());

        System.out.println("Ben present: " + sheet.isPresent("Ben"));

        System.out.println("Chen present: " + sheet.isPresent("Chen"));
    }
}