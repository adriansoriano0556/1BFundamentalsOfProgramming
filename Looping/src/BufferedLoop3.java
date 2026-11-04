import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BufferedLoop3 {
    public static void main(String[] args) throws IOException {

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        double balance = 20000.00;

        System.out.print("Enter amount (0 to stop): ");
        double amount = Double.parseDouble(input.readLine());

        while (amount != 0) {

            if (amount > 0) {
                balance += amount;
            } else {
                if (balance >= Math.abs(amount)) {
                    balance += amount;
                } else {
                    System.out.println("INSUFFICIENT FUNDS!");
                }
            }

            System.out.printf("Outstanding Balance: %.2f%n", balance);

            System.out.print("Enter Amount (0 to stop): ");
            amount = Double.parseDouble(input.readLine());
        }

        System.out.println("Program Terminated.");
    }
}