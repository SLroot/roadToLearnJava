package exercises.exercise_5.student;
import exercises.exercise_5.staff.Person;

public class Student extends Person {
    
    public Student(String name, int age) {
        super(name, age);
    }

    public void study() {
        System.out.println(this.name + " is a student and he is study");
    }
}
