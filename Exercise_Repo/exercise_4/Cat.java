package exercises.exercise_4;

public class Cat extends Animal{
    
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println("Cat mekes sound");
    }
}
