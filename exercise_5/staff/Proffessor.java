package exercises.exercise_5.staff;

public class Proffessor extends Person {
    
    public Proffessor(String firstName, int age) {
        super(firstName, age);
    }
    
    public void teach() {
        System.out.println("professor is teaching.");
    }
}
