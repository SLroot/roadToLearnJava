package exercises.exercise_1;

public class Student {
    public String name;
    public double rank_1;
    public double rank_2;

    public Student(String name, double rank_1, double rank_2) {
        this.name = name;
        this.rank_1 = rank_1;
        this.rank_2 = rank_2;
    }

    public double getAverage() {
        double average = (this.rank_1 + this.rank_2) / 2;
        return average;
    }

    public void printStatus() {
        double avg = getAverage();
        if (avg >= 12) System.out.println("Pass");
        else System.out.println("Fail"); 
    }
}
