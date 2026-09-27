package SESSION_1.week7;
public class q4 {

    private String code;
    private final int lockerNumber;

    q4(int lockerNumber, String code) {
        this.lockerNumber = lockerNumber;
        this.code = code;
    }

    void changeCode(String currentCode, String newCode) {

        if (code.equals(currentCode)) {
            code = newCode;
            System.out.println("Code changed successfully");
        } else {
            System.out.println("Code change rejected");
        }
    }

    public static void main(String[] args) {

        q4 l = new q4(101, "1234");

        l.changeCode("1234", "5678");

        l.changeCode("0000", "9999");
    }
}