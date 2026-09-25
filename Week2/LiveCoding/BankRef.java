import java.util.Scanner;
public class BankRef {
    static String normalizeReference(String raw) {
        raw = raw.trim();
        String bank = raw.substring(0, 3).toUpperCase();
        String rest = raw.substring(3);
        return bank + rest;
    }
    static String validateAndFormat(String ref) {
        if (ref.length() != 14)
            return "Invalid: wrong length";
        for (int i = 0; i < 3; i++) {
            if (!Character.isLetter(ref.charAt(i)))
                return "Invalid: bank code must be 3 letters";
        }
        for (int i = 3; i < 14; i++) {
            if (!Character.isDigit(ref.charAt(i)))
                return "Invalid: body must contain digits";
        }
        String bank = ref.substring(0, 3);
        String date = ref.substring(3, 9);
        String seq = ref.substring(9);
        String formattedDate = date.substring(0, 2) + "/" + date.substring(2, 4) + "/" + date.substring(4, 6);
        return "[" + bank + "] DATE: " + formattedDate + " | SEQ: " + seq;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter reference: ");
        String raw = sc.nextLine();
        String ref = normalizeReference(raw);
        System.out.println(validateAndFormat(ref));
    }
}