import javax.swing.JOptionPane;

public class JOptionLoop3 {
    public static void main(String[] args){

        double balance = 20000.00;

        double amount = Double.parseDouble(JOptionPane.showInputDialog("Enter amount (0 to stop)"));

        while ( amount != 0){
            if(amount > 0){
                balance += amount;
            }else {
                if(balance >= Math.abs(amount)){
                    balance += amount;
                }else {
                    JOptionPane.showMessageDialog(null,"Insufficient Fund!");
                }
            }
            JOptionPane.showMessageDialog(null,String.format("Outstanding Balance: %.2f%n",balance));
            amount = Double.parseDouble(JOptionPane.showInputDialog("Enter amount (0 to stop)"));
        }
        JOptionPane.showMessageDialog(null,"Program Terminated");
    }
}
