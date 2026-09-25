import java.util.*;
public class Palindrome {
    static boolean iterative(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i))
                return false;
        }
        return true;
    }
    static boolean recursive(String s) {
        if (s.length() <= 1)
            return true;
        if (s.charAt(0) != s.charAt(s.length() - 1))
            return false;
        return recursive(s.substring(1, s.length() - 1));
    }
    static boolean array(String s) {
        char[] a = s.toCharArray();
        for (int i = 0; i < a.length / 2; i++) {
            if (a[i] != a[a.length - 1 - i])
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        System.out.println("Iterative: " +
                (iterative(s) ? "Palindrome" : "Not Palindrome"));
        System.out.println("Recursive: " +
                (recursive(s) ? "Palindrome" : "Not Palindrome"));
        System.out.println("Array: " +
                (array(s) ? "Palindrome" : "Not Palindrome"));
    }
}