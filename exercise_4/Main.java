package exercises.exercise_4;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("pepsi", 2);
        animal.makeSound();

        Dog dig = new Dog("jack", 3);
        dig.makeSound();

        Cat cat = new Cat("garfild", 4);
        cat.makeSound();
    }
}
