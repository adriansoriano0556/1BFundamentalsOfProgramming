import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BufferedReaderLoop {
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter Number 1:");
        int num = Integer.parseInt(input.readLine());

        int highest = num;
        int lowest = num;

        for (int i = 1; i <= 9; i++){
                System.out.print("Enter number" + (i + 1) +": " );
                num = Integer.parseInt(input.readLine());
        if (num > highest){
            highest = num;
        }
        if (num < lowest) {
            lowest = num;
          }
        }
        System.out.println("Highest number:" + highest);
        System.out.println("Lowest Number:" + lowest);
    }
}