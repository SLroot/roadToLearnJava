package exercises.exercise_3;

public class Main {
    public static void main(String[] args) {
        Rectangle rect_1 = new Rectangle(4, 2);
        
        double area = rect_1.area();
        double perimeter = rect_1.perimeter();

        System.out.println("area: " + area + "\n" + "perimeter " + perimeter);
    }
}
