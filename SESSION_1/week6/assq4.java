package SESSION_1.week6;
public class assq4 {

    String studentName;
    int seatNumber;

    assq4(String studentName, int seatNumber) {
        this.studentName = studentName;
        this.seatNumber = seatNumber;
    }

    public static void main(String[] args) {

        assq4 priya = new assq4("Priya", 0);

        assq4 copy = priya;

        copy.seatNumber = 45;

        assq4 separate = new assq4("Priya", 45);

        System.out.println(
                "Priya's seatNumber (via first variable):"
        );

        System.out.println(priya.seatNumber);

        System.out.println("copy == priya: " + (copy == priya));

        System.out.println(
                "separate == priya: " + (separate == priya)
        );
    }
}
