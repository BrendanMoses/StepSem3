class PiggyBank {
    private double savings;
    private final String id;
    PiggyBank(String id) {
        this.id = id;
        savings = 0;
    }
    void deposit(double amount) {
        savings = savings + amount;
    }
    void withdraw(double amount) {
        if (amount <= savings)
            savings = savings - amount;
        else
            System.out.println("Withdrawal rejected");
    }
    double getSavings() {
        return savings;
    }
}
public class PBank {
    public static void main(String[] args) {
        PiggyBank pb = new PiggyBank("PB-1");
        pb.deposit(100);
        pb.withdraw(30);
        pb.withdraw(500);
        System.out.println("Savings: " + pb.getSavings());
    }
}