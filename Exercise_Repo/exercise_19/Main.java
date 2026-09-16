import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        System.out.println("First number?");
        int firtsNumber = Integer.valueOf(scanner.nextLine());

        System.out.println("Second number?");
        int secondNumber = Integer.valueOf(scanner.nextLine());

        for (int i = firtsNumber; i <= secondNumber; i++) {
            sum = sum + i;
        }

        System.out.println("The sum is: " + sum);
    }
}
