import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class DCSBufferedreader {
    public static void main(String []args) throws IOException {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        String yearInput = "";
        System.out.print("Please enter your year:");
        try {
            yearInput = dataIn.readLine();

            int year = Integer.parseInt(yearInput);

            if (year % 400 == 0 || year % 100 != 0 && year % 4 == 0) {
                System.out.println("Leap Year");
            } else {
                System.out.println("Not leap year");
            }
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid number.");
        }
    }
}