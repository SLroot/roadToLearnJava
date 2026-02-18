package exercises.exercise_2;

public class BankAccount {
    public String firstName;
    public String lastName;
    public double balance;

    public BankAccount(String firstName, String lastName, double balance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= this.balance) this.balance -= amount;
        else System.out.println("balance is low");
    }

    public void display() {
        System.out.println(this.firstName + " " + this.lastName + "  " + this.balance);
    }
}
