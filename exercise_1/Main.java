package exercises.exercise_1;

import exercises.exercise_1.Animals.Animals;
import exercises.exercise_1.Animals.Dog;
import exercises.exercise_1.Animals.Cat;

public class Main {
    public static void main(String[] args) {
        Animals animal = new Animals();
        Cat cat = new Cat();
        Dog dog = new Dog();

        animal.makeSound();
        cat.makeSound();
        dog.makeSound();
    }   
}
