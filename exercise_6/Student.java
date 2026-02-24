package exercises.exercise_6;

public class Student {
    private String name;
    private int id;
    private float grade;

    public Student(String name, int id, float grade) {
        this.name = name;
        this.id = id;
        if (grade >= 0 && grade <= 20) this.grade = grade;
        else System.out.println("grade is invalid");
    }

    public void getLetterGrade() {
        if (this.grade > 17 && this.grade <= 20) {
            System.out.println("A");
        } else if (this.grade >= 14 && this.grade <= 17) {
            System.out.println("B");
        } else {
            System.out.println("C");
        }
    }
    public float getGrade() {
        return this.grade;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }

    public void printInfo() {
        System.out.println(this.name + " " + this.id + " " + this.grade);
    }

    public void updateGrade(float newGrade) {
        if (newGrade > this.grade) {
            if (newGrade >= 0 && newGrade <= 20) {
                this.grade = newGrade;
            }
        } else {
            System.out.println("not valid");
        }
    }
}
