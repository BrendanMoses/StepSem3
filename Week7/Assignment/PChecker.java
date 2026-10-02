class PasswordChecker {
    private final String password;
    PasswordChecker(String password) {
        this.password = password;
    }
    String getStrength() {
        if (password.length() < 6)
            return "Weak";
        else if (password.length() < 10)
            return "Medium";
        else
            return "Strong";
    }
}
public class PChecker {
    public static void main(String[] args) {
        PasswordChecker p = new PasswordChecker("abcd");
        System.out.println(p.getStrength());
        PasswordChecker p2 = new PasswordChecker("abcdefghij");
        System.out.println(p2.getStrength());
    }
}