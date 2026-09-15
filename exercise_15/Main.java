
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfNumbers = 0;
        int sumOfNumbers = 0;

        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 0) {
                break;
            } else {
                numberOfNumbers = numberOfNumbers + 1;
                sumOfNumbers = sumOfNumbers + number;
            }
        }
        double average = (double)sumOfNumbers / numberOfNumbers;
        System.out.println("Average of the numbers: " + average);
    }
}
