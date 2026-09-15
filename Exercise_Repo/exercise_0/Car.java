package exercises.exercise_0;

public class Car {
    public String brand;
    public String color;
    public String productYear;
    
    public Car(String brand, String color, String productYear) {
        this.brand = brand;
        this.color = color;
        this.productYear = productYear;
    }
    
    public void displayInfo() {
        System.out.println(this.brand + " " + this.color + " " + this.productYear);
    }
}
