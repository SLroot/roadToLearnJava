package exercises.exercise_2;

public class Main {
    public static void main(String[] args) {
        BankAccount bank_1 = new BankAccount("saeid", "lotfi", 22500);
        bank_1.display();

        bank_1.deposit(500);
        bank_1.display();

        bank_1.withdraw(23000);
        bank_1.display();

        bank_1.withdraw(1);
    }
}
