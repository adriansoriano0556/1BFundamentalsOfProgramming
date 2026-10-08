import javax.swing.JOptionPane;

public class JOptionPanePay {
    public static void main(String[] args){
        String payInput;
        payInput = JOptionPane.showInputDialog("Please enter your hourly pay rate");
        double pay = Double.parseDouble(payInput);
        String rateInput;
        rateInput = JOptionPane.showInputDialog("Please enter your working hours");
        double rate = Double.parseDouble(rateInput);
        double grossPay = pay * rate;
        JOptionPane.showMessageDialog(null,"Gross Pay: " + grossPay);
        if (grossPay <= 2000){ // 10%
            double tax = grossPay * 0.10;
            JOptionPane.showMessageDialog(null,"Withholding Tax: " + tax );
            double net = grossPay - tax;
            JOptionPane.showMessageDialog(null, "Net pay: " + net);
        }
        else if (grossPay >= 2001 && grossPay <= 4000){// 12%
            double tax = grossPay * 0.12;
            JOptionPane.showMessageDialog(null,"Withholding Tax: " + tax );
            double net = grossPay - tax;
            JOptionPane.showMessageDialog(null, "Net pay: " + net);
        }
        else if (grossPay >= 4001 && grossPay <= 10000) {// 15%
            double tax = grossPay * 0.15;
            JOptionPane.showMessageDialog(null,"Withholding Tax: " + tax );
            double net = grossPay - tax;
            JOptionPane.showMessageDialog(null, "Net pay: " + net);
        }
        else if (grossPay >= 10001 && grossPay <= 1000000) {// 20%
            double tax = grossPay * 0.20;
            JOptionPane.showMessageDialog(null,"Withholding Tax: " + tax );
            double net = grossPay - tax;
            JOptionPane.showMessageDialog(null, "Net pay: " + net);
        }
    }
}
