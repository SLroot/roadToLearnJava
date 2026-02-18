package exercises.exercise_4.Animals;

public class Dog extends Animals {
 
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Dog makes sound");
    }
}
