package exercises.exercise_5;

// import exercises.exercise_5.staff.Person;
import exercises.exercise_5.staff.Proffessor;
import exercises.exercise_5.student.Student;
import exercises.exercise_5.student.UniversityInfo;;;

public class Main {
    public static void main(String[] args) {
        // Person person = new Person("saeid", 22);

        // We can create person but we can not access to its fields. 
        // System.out.println(person.name);

        Proffessor proffessor = new Proffessor("sajjad", 23);
        proffessor.teach();

        //01010101001010100101010100101010

        Student student = new Student("mamad", 23);
        student.study();

        UniversityInfo.printInfo();
    }
}
