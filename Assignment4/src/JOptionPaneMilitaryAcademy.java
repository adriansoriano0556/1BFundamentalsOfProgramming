import javax.swing.JOptionPane;

public class JOptionPaneMilitaryAcademy {
    public static void main(String[] args) {
        String height1 = "";
        height1 = JOptionPane.showInputDialog("Please enter your height in cm");
        String age1 = "";
        age1 = JOptionPane.showInputDialog("What is your age?");
        String citizen1 = "";
        citizen1 = JOptionPane.showInputDialog("Are you a citizen (C/N)?");
        String reco1 = "";
        reco1 = JOptionPane.showInputDialog("Are you a recommendee (R/N)?");
        int height = Integer.parseInt(height1);
        int age = Integer.parseInt(age1);
        if ((height >= 200 && age >= 21 && age <=25 && citizen1.equalsIgnoreCase("C"))
                || reco1.equalsIgnoreCase("R")) {
            JOptionPane.showMessageDialog(null,"Accepted");
        } else JOptionPane.showMessageDialog(null,"Rejected");
    }
}