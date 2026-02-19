package exercises.exercise_3;

public class Rectangle {
    public double width;
    public double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    // مساحت
    public double area() {
        return this.width * this.length;
    }

    // محیط
    public double perimeter() {
        return (this.length + this.width) * 2;
    }
}
