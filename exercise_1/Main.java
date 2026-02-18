package exercises.exercise_1;

public class Main {
   public static void main(String[] args) {
        Student student = new Student("saeid", 14, 15);
        double average = student.getAverage();
        System.out.println(average);

        student.printStatus();

        System.out.println();

        Student student_1 = new Student("Ziba", 10, 11);
        average = student_1.getAverage();
        System.out.println(average);

        student_1.printStatus();
   } 
}
