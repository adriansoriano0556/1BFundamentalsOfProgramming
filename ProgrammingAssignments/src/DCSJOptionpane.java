import javax.swing.JOptionPane;

public class DCSJOptionpane {
    public static void main(String []args){
        String yearIput = "";
        yearIput = JOptionPane.showInputDialog("Please enter your year");
        try {
            int year = Integer.parseInt(yearIput);
            if (year % 400 == 0 || year % 100 != 0 && year % 4 == 0) {
                String msg = "Leap year.";
                JOptionPane.showMessageDialog(null, msg);
            } else {
                String msg2 = "Not leap year";
                JOptionPane.showMessageDialog(null, msg2);
            }
        }catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please input a whole number");
            }
    }
}