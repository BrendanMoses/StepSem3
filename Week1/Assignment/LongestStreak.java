import java.util.Scanner;
public class LongestStreak {
    static void findLongestStreak(String s) {
        int count = 1;
        int max = 1;
        char longest = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            }
            else {
                count = 1;
            }
            if (count > max) {
                max = count;
                longest = s.charAt(i);
            }
        }
        System.out.println(
            "Longest Streak: '" + longest +
            "' repeated " + max + " times"
        );
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter signal log: ");
        String s = sc.nextLine();
        findLongestStreak(s);
    }
}