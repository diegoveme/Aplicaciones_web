import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter client name: ");
        String name = scanner.nextLine();

        System.out.print("Enter account number: ");
        String account = scanner.nextLine();

        double balance = 0.0;
        boolean running = true;

        while (running) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Consult");
            System.out.println("4. Exit");

            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    Depositar deposit = new Depositar(depositAmount);
                    balance = deposit.execute(balance);
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = scanner.nextDouble();
                    Retirar withdraw = new Retirar(withdrawAmount);
                    balance = withdraw.execute(balance);
                    break;
                case 3:
                    Consultar consult = new Consultar(name, account, balance);
                    consult.execute();
                    break;
                case 4:
                    running = false;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}