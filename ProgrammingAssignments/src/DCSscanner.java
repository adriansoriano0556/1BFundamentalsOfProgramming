import java.util.Scanner;
import java.util.InputMismatchException;

public class DCSscanner {
    public static void main(String []args) {
        int year;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your year:");
        try {
        year = input.nextInt();
        if (year % 400 == 0 || year % 100 != 0 && year % 4 == 0) {
            System.out.println("Leap year.");
        } else {
            System.out.println("Not leap year.");
        }
    }catch (InputMismatchException e){
        System.out.println("Please enter a whole number.");
    }
  }
}
