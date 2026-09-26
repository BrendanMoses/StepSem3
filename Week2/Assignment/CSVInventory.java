import java.util.Scanner;
public class CSVInventory {
    static void parseInventoryRecord(String csv) {
        String[] data = csv.split(",");
        if (data.length != 3) {
            System.out.println("Invalid Record");
        }
        else {
            System.out.println("Product: " + data[0]);
            System.out.println("SKU: " + data[1]);
            System.out.println("Qty: " + data[2]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter inventory record: ");
        String csv = sc.nextLine();
        parseInventoryRecord(csv);
    }
}