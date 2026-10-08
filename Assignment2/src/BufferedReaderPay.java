import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BufferedReaderPay {
    public static void main(String[] args) throws IOException {
        BufferedReader payment = new BufferedReader(new InputStreamReader(System.in));
        String payInput = "";
        System.out.print("Please enter your hourly pay rate:");
        payInput = payment.readLine();
        String rateInput = "";
        System.out.print("Please enter your working hours:");
        rateInput = payment.readLine();
        double pay = Double.parseDouble(payInput);
        double hours = Double.parseDouble(rateInput);
        double grossPay = pay * hours;
        System.out.println("GrossPay:" + grossPay);

        if (grossPay <= 2000){ // 10%
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