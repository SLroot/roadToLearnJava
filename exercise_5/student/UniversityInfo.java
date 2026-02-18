package exercises.exercise_5.student;

public class UniversityInfo {
    static String universityName;

    public UniversityInfo(String universityName) {
        UniversityInfo.universityName = universityName;
    }

    public static void printInfo() {
        System.out.println("university name is: " + UniversityInfo.universityName);
    }
}