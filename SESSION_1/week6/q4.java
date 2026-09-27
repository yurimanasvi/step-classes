package SESSION_1.week6;
class IdCard {
    String name;
    int booksIssued;

    IdCard(String name, int booksIssued) {
        this.name = name;
        this.booksIssued = booksIssued;
    }
}

public class q4 {
    public static void main(String[] args) {

        IdCard ravi = new IdCard("Ravi", 0);

        IdCard duplicate = ravi;

        duplicate.booksIssued = 3;

        System.out.println(
            "Books issued through ravi: " + ravi.booksIssued
        );

        System.out.println(
            "duplicate == ravi: " + (duplicate == ravi)
        );

        IdCard separate = new IdCard("Ravi", 3);

        System.out.println(
            "separate == ravi: " + (separate == ravi)
        );
    }
}
