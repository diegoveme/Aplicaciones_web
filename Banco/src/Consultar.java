public class Consultar {
     private String clientName;
    private String accountNumber;
    private double balance;

    public Consultar(String clientName, String accountNumber, double balance) {
        this.clientName = clientName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    
    public void execute() {
        System.out.println("Client: " + clientName);
        System.out.println("Account: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }
}