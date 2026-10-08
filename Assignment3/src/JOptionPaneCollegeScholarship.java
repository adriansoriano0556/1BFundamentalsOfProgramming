import javax.swing.JOptionPane;

public class JOptionPaneCollegeScholarship {
    public static void main(String[] args) {
        String salaryInput = "";
        salaryInput = JOptionPane.showInputDialog("Please enter your parent's salary");
        String nsatInput = "";
        nsatInput = JOptionPane.showInputDialog("Please enter your NSAT score");
        String examInput = "";
        examInput = JOptionPane.showInputDialog("Please enter your exam score");
        try {
            int salary = Integer.parseInt(salaryInput);
            int nsat = Integer.parseInt(nsatInput);
            int exam = Integer.parseInt(examInput);
            double average = (nsat + exam) / 2.0;
            if (salary > 10000 || nsat < 90 || exam < 85 ){
                String msg = "Rejected";
                JOptionPane.showMessageDialog(null, msg);
            } else if(salary <= 3500 && average >= 91) {
                String msg2 = "Accepted";
                JOptionPane.showMessageDialog(null, msg2);
            }else {
                JOptionPane.showMessageDialog(null,"For further study");
            }
        }catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please input a valid number");
        }
    }
}
