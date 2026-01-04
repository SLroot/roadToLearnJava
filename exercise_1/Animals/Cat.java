package exercises.exercise_1.Animals;

public class Cat extends Animals {

    public Cat(String name, int age) {
        super(name, age);
    }
    
    @Override
    public void makeSound() {
        System.out.println("Cat makes sound");
    }
}
