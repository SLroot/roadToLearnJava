package exercises.exercise_1;

import exercises.exercise_1.Animals.Animals;
import exercises.exercise_1.Animals.Dog;
import exercises.exercise_1.Animals.Cat;

public class Main {
    public static void main(String[] args) {
        Animals animal = new Animals("pepe", 1);
        Cat cat = new Cat("jack", 2);
        Dog dog = new Dog("subzero",3);

        animal.makeSound();
        cat.makeSound();
        dog.makeSound();
    }   
}
