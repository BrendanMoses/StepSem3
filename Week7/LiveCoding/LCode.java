class Locker {
    private final int lockerNumber;
    private String code;
    Locker(int number, String code) {
        lockerNumber = number;
        this.code = code;
    }
    void changeCode(String oldCode, String newCode) {
        if (code.equals(oldCode)) {
            code = newCode;
            System.out.println("Success");
        }
        else {
            System.out.println("Rejected");
        }
    }
}
public class LCode {
    public static void main(String[] args) {
        Locker l = new Locker(101, "1234");
        l.changeCode("1234", "5678");
        l.changeCode("0000", "9999");
    }
}