public class Retirar {
    private double amount;

    public Retirar(double amount) {
        this.amount = amount;
    }
    public double execute(double currentBalance) {
        System.out.println("Current balance: $" + currentBalance);
        if (amount > 0 && amount <= currentBalance) {
            double newBalance = currentBalance - amount;
            System.out.println("Withdrawal successful. Remaining balance: $" + newBalance);
            return newBalance;
        } else {
            System.out.println("Invalid withdrawal amount.");
            return currentBalance;
        }
    }
}