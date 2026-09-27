package SESSION_1.week7;
public class assq4 {

    private String color;
    private final String id;

    assq4(String id) {
        this.id = id;
        color = "RED";
    }

    void next() {

        if (color.equals("RED")) {
            color = "GREEN";
        } else if (color.equals("GREEN")) {
            color = "YELLOW";
        } else {
            color = "RED";
        }
    }

    String getColor() {
        return color;
    }

    public static void main(String[] args) {

        assq4 t = new assq4("TL-9");

        System.out.println(t.getColor());

        t.next();
        System.out.println(t.getColor());

        t.next();
        System.out.println(t.getColor());

        t.next();
        System.out.println(t.getColor());
    }
}