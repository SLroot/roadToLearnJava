
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.valueOf(scanner.nextLine());

        if (number < 0) {
            int absolute = number * (-2);
            System.out.println(absolute + number);
        } else {
            System.out.println(number);
        }
    }
}
