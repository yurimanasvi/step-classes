package SESSION_1.week7;
public class assq3 {

    private final String password;

    assq3(String password) {
        this.password = password;
    }

    String getStrength() {

        int length = password.length();

        if (length < 6) {
            return "Weak";
        } else if (length <= 9) {
            return "Medium";
        } else {
            return "Strong";
        }
    }

    public static void main(String[] args) {

        assq3 pc = new assq3("abcd");

        assq3 pc2 = new assq3("abcdefghij");

        System.out.println("Password 1: " + pc.getStrength());
        System.out.println("Password 2: " + pc2.getStrength());
    }
}
