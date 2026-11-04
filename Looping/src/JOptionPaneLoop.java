import javax.swing.JOptionPane;

public class JOptionPaneLoop {
    public static void main(String[] args){
        String output = "";
        int num = Integer.parseInt(JOptionPane.showInputDialog("Enter Number 1:"));

        int highest = num;
        int lowest = num;

        for(int i = 1; i <= 9; i++){
            num = Integer.parseInt(JOptionPane.showInputDialog("Enter number" + (i + 1) + ":"));

            if(num > highest){
                highest = num;
            }
            if (num < lowest){
                lowest = num;
            }

        }
        output += "Highest Number: " + highest + "\n";
        output += "lowest Number: " + lowest;

        JOptionPane.showMessageDialog(null,output);
    }
}
