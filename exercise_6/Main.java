package exercises.exercise_6;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("saeid", 1, 17);
        System.out.println(student.getGrade());
        student.getLetterGrade();
        student.setGrade(19);
        student.getLetterGrade();
        student.printInfo();
        student.updateGrade(18);
    }
}
