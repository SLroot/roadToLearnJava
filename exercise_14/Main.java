
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumOfNumbers = 0;
        int numberOfNumbers = 0;

        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {
                break;
            } else {
                sumOfNumbers = sumOfNumbers + number;
                numberOfNumbers = numberOfNumbers + 1;
            }
        }

        System.out.println("Number of numbers: " + numberOfNumbers);
        System.out.println("Sum of the numbers: " + sumOfNumbers);
    }
}
