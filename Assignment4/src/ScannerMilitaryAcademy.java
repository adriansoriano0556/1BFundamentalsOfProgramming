import java.util.Scanner;
import java.util.InputMismatchException;

public class ScannerMilitaryAcademy {
    public static void main(String[] args) throws InputMismatchException{
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your height in cm:");
        int height = input.nextInt();
        System.out.print("What is your age?");
        int age = input.nextInt();

        input.nextLine();

        String reco1 = "";
        String citizen1 = "";

        System.out.print("Are you a citizen (C/N)?");
        citizen1 = input.nextLine();
        System.out.print("Are you a recommendee (R/N)?");
        reco1 = input.nextLine();

        if ((height >= 200 && age >= 21 && age <=25 && citizen1.equalsIgnoreCase("C"))
                || reco1.equalsIgnoreCase("R")) {
            System.out.println("Accepted");
        } else System.out.println("Rejected");
    }
}