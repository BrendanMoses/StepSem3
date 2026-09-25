public class Inventory {
    static void analyzeInventory(int[] A, int[] B) {
        int totalA = 0;
        int totalB = 0;
        for (int i = 0; i < A.length; i++) {
            totalA = totalA + A[i];
            totalB = totalB + B[i];
        }
        int highest = A[0];
        String section = "Section A";
        int index = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] > highest) {
                highest = A[i];
                section = "Section A";
                index = i;
            }
            if (B[i] > highest) {
                highest = B[i];
                section = "Section B";
                index = i;
            }
        }
        System.out.println("Section A Total: " + totalA);
        System.out.println("Section B Total: " + totalB);
        if (totalA == totalB)
            System.out.println("Status: Balanced");
        else
            System.out.println("Status: Not Balanced");
        System.out.println(
            "Highest Quantity: " + highest +
            " (" + section + ", Item " + (index + 1) + ")"
        );
    }
    public static void main(String[] args) {
        int[] A = {20, 15, 30};
        int[] B = {25, 10, 30};
        analyzeInventory(A, B);
    }
}