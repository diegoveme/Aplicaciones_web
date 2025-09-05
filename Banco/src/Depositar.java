public class Depositar {
    private double amount;

    public Depositar(double amount) {
        this.amount = amount;
    }
    public double execute(double currentBalance) {
        if (amount > 0) {
            double newBalance = currentBalance + amount;
            System.out.println("Deposit successful. Total balance: $" + newBalance);
            return newBalance;
        } else {
            System.out.println("Invalid deposit amount.");
            return currentBalance;
        }
    }
}