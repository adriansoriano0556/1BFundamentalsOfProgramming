import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BufferedReaderCollegeScholarship {
    public static void main(String[] args) throws IOException {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        String salaryInput = "";
        System.out.print("Please enter your parent's salary:");
        salaryInput = dataIn.readLine();
        String nsatInput = "";
        System.out.print("Please enter your NSAT score:");
        nsatInput = dataIn.readLine();
        String examInput = "";
        System.out.print("Please enter your exam score:");
        examInput = dataIn.readLine();
        try {
            int salary = Integer.parseInt(salaryInput);
            int nsat = Integer.parseInt(nsatInput);
            int exam = Integer.parseInt(examInput);
            double average = (nsat + exam) / 2.0;
            if (salary > 10000 || nsat < 90 || exam < 85 ) {
                System.out.println("Rejected");
            }else if (salary <= 3500 && average >= 91 ){
                System.out.println("Accepted");
            }else {
                System.out.println("For further study ");
            }
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid number.");
        }
    }
}