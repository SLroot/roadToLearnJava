package exercises.a_exercise_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter your first name: ");
        String name0 = scanner.nextLine();

        System.out.print("enter your second name: ");
        String name1 = scanner.nextLine();
        
        boolean bool = false;

        if (name0.length() != name1.length()) {
            System.out.println("Two names are not equal");
        } else {
            char[] char0 = toChar(name0);
            char[] char1 = toChar(name1);


            for (int i = 0; i < char0.length; i++) {
                if (char0[i] != char1[i]) {
                    bool = false;
                    break;
                } else {
                    bool = true;
                }
            }
            
            if (bool) System.out.println("The names are same and equal");
            else System.out.println("The names aren't same");
        }

        scanner.close();

    }

    static char[] toChar(String str) {
        char[] chart = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            chart[i] += str.charAt(i);
        }
        return chart;
    }
}