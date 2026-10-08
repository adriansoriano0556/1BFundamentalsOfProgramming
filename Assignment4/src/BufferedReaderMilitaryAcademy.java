import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BufferedReaderMilitaryAcademy {
    public static void main(String[] args) throws IOException {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please enter your height in cm:");
        int height = Integer.parseInt(dataIn.readLine());

        System.out.print("What is your age?");
        int age = Integer.parseInt(dataIn.readLine());

        String citizen1 = "";
        System.out.print("Are you a citizen (C/N)?");
        citizen1 = dataIn.readLine();

        String reco1 = "";
        System.out.print("Are you a recommendee (R/N)?");
        reco1 = dataIn.readLine();

        if ((height >= 200 && age >= 21 && age <=25 && citizen1.equalsIgnoreCase("C"))
            || reco1.equalsIgnoreCase("R")) {
            System.out.println("Accepted");
        } else System.out.println("Rejected");
    }
}