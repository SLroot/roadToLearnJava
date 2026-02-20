package exercises.exercise_4;

public class Dog extends Animal{
    
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println("Dog makes sound");
    }
}
