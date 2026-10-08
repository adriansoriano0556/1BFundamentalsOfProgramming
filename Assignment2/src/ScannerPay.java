import java.util.Scanner;
import java.util.InputMismatchException;

public class ScannerPay {
    public static void main(String[] args) throws InputMismatchException {
        Scanner input = new Scanner(System.in);
        int pay;
        System.out.print("Please enter your hourly pay rate:");
        pay = input.nextInt();
        int rate;
        System.out.print("Please enter your working hours:");
        rate = input.nextInt();
        double grossPay = pay * rate;
        System.out.println("Gross Pay:" + grossPay);
    if (grossPay <= 2000) { // 10%
            double tax = grossPay * 0.10;
            System.out.println("Withholding tax:" + tax);
            double net = grossPay - tax;
            System.out.println("Net pay:" + net);
        }
        else if (grossPay >= 2001 && grossPay <= 4000){// 12%
            double tax = grossPay * 0.12;
            System.out.println("Withholding tax:" + tax);
            double net = grossPay - tax;
            System.out.println("Net pay:" + net);
        }
        else if (grossPay >= 4001 && grossPay <= 10000) {// 15%
            double tax = grossPay * 0.15;
            System.out.println("Withholding tax:" + tax);
            double net = grossPay - tax;
            System.out.println("Net pay:" + net);
        }
        else if (grossPay >= 10001 && grossPay <= 1000000) {// 20%
            double tax = grossPay * 0.20;
            System.out.println("Withholding tax:" + tax);
            double net = grossPay - tax;
            System.out.println("Net pay:" + net);
        }
    }
}