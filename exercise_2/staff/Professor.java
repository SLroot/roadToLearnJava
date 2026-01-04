package exercises.exercise_2.staff;

public class Professor extends Person {
    
    public Professor(String name, int age) {
        super(name, age);
    }

    public void teach() {
        System.out.println(this.name + " is study");
    }
}
