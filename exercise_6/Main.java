package exercises.exercise_6;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("saeid", 1);
        student.setGrae(15);
        System.out.println(student.getGrade());
        student.printInfo();
        student.getLetterGrade();
    }
}
