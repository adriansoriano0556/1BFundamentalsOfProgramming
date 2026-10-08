import java.util.Scanner;
import java.util.InputMismatchException;

public class ScannerCollegeScholarship {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int salary;
        int nsat;
        int exam;
        try {
            System.out.print("Please enter your parent's salary:");
            salary = input.nextInt();
            System.out.print("Please enter your NSAT score:");
            nsat = input.nextInt();
            System.out.print("Please enter your exam score:");
            exam = input.nextInt();
            double average = (nsat + exam) / 2.0;
            if (salary > 10000 || nsat < 90 || exam < 85 ) {
                System.out.println("Rejected");
            }else if (salary <= 3500 && average >= 91){
                System.out.println("Accepted");
            }else {
                System.out.println("For further study ");
            }
        }catch (InputMismatchException e) {
            System.out.println("Please enter a valid number");
        }
    }
}