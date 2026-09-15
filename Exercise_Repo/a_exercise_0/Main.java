package exercises.a_exercise_0;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        if (name.contains("a")) {
            System.out.println("Yes contains");
        }
        else {
            System.out.println("Not contains");
        }

        scanner.close();
    }
}
