import java.util.ArrayList;
import java.util.Scanner;

public class Main {
        static ArrayList<String> names = new ArrayList<String>();
        static ArrayList<Double> grades = new ArrayList<Double>();
        static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("----------");
            System.out.println("1) Add student");
            System.out.println("2) List students");
            System.out.println("3) Show statistics");
            System.out.println("4) Search by name");
            System.out.println("5) Remove student");
            System.out.println("0) Exit\n----------");
            
            int number = Integer.valueOf(scanner.nextLine()); 
            
            if (number == 1) {
                System.out.print("\nenter name: ");
                String name = scanner.nextLine();
                System.out.print("enter grade: ");
                double grade = Double.valueOf(scanner.nextLine());

                if (grade < 0 || grade > 20) {
                    System.out.println("the number is invalid");
                } else {
                    add(name, grade);
                    System.out.println();
                }
            } else if (number == 2) {
                listOfStudents(names, grades);
            } else if (number == 3) {
                statistics(names, grades);
            } else if(number == 4) {
                searchByName(names, grades);
            } else if (number == 5) {
                removeStudent(names, grades);
            } else if (number == 0) {
                System.out.println("have a good time");
                break;
            } else {
                System.out.println("invalid number!!!");
                continue;
            }
        }
        
    }

    // add method
    public static void add(String name, double grade) {
        names.add(name);
        grades.add(grade);
    }
    
    // list of students method
    public static void listOfStudents(ArrayList<String> names, ArrayList<Double> grades) {
        System.out.println("----------");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i) + " - " + grades.get(i));
        }
        System.out.println("----------");
    }

    // statistics (min, max, average)
    public static void statistics(ArrayList<String> names, ArrayList<Double> grades) {
        if (grades.isEmpty()) {
            System.out.println("No students yet!!");
            return;
        }

        double max = grades.get(0);
        String maxStudent = names.get(0);
        double min = grades.get(0);
        String minStudent = names.get(0);
        double sum = 0;
        
        // get max
        for (int i = 0; i < names.size(); i++) {
            if (grades.get(i) > max){
                max = grades.get(i);
                maxStudent = names.get(i);
            } 
        }

        // get min
        for (int i = 0; i < names.size(); i++) {
            if (grades.get(i) < min) {
                min = grades.get(i);
                minStudent = names.get(i);
            }
        }

        // average part
        for (int i = 0; i < names.size(); i++) {
            sum = sum + grades.get(i);
        }

        double average = sum / names.size();

        System.out.println("max grade: " + maxStudent + " - " +  max);
        System.out.println("min grade: " + minStudent + " - " + min);
        System.out.println("The average is: " + average);
    }

    // search part
    public static void searchByName(ArrayList<String> names, ArrayList<Double> grades) {
        System.out.print("enter the name you want search: ");
        String name = scanner.nextLine();
        if (names.contains(name)) {
            for (int i = 0; i < names.size(); i++) {
                if (name.equals(names.get(i))) {
                    System.out.println(names.get(i) + " " + grades.get(i));
                }
            }
        } else {
            System.out.println("the name is not found");
        }
    }

    // remove student
    public static void removeStudent(ArrayList<String> names, ArrayList<Double> grades) {
        System.out.print("enter the name that you want remove: ");
        String name = scanner.nextLine();
        int index = names.indexOf(name);
        if (index == -1) {
            System.out.println("This name does not exist.");
                return;
            }
            names.remove(index);
            grades.remove(index);
        }
    }
    

