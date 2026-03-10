package exercises.exercise_6;

public class Student {
    private String name;
    private int id;
    private float grade;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void setGrade(float grade) {
        if (grade <= 20 && grade >= 0) this.grade = grade;
        else this.grade = 0;
    }

    public float getGrade() {
        return this.grade;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public char getLetterGrade() {
        if (this.grade > 17 && this.grade <= 20) return 'A';
        else if (this.grade <= 17 && this.grade > 14) return 'B';
        else return 'C';
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
