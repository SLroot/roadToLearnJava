
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int numberOfNumbers = 0;
        int evenNumbers = 0;
        int oddNumbers = 0;
        while (true) {
            System.out.println("Give numbers:");
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                System.out.println("Thx!Bye!");
                break;
            } else {
                sum = sum + number;
                numberOfNumbers = numberOfNumbers + 1;
            }
            if (number % 2 == 0) {
                evenNumbers = evenNumbers + 1;
            } 

            if (number % 2 == 1) {
                oddNumbers = oddNumbers + 1;
            }
        }

        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + numberOfNumbers);
        double average = (double) sum / numberOfNumbers;
        System.out.println("Average: " + average);
        System.out.println("Even: " + evenNumbers);
        System.out.println("Odd: " + oddNumbers);
    }
}
