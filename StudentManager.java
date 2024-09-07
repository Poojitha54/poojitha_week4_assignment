import java.util.ArrayList;
import java.util.Scanner;

class Student {
    String name;
    int rollNumber;

    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }
}

public class StudentManager {
    private ArrayList<Student> students;

    public StudentManager() {
        this.students = new ArrayList<>();
    }

    public void addStudent(String name, int rollNumber) {
        Student newStudent = new Student(name, rollNumber);
        students.add(newStudent);
    }

    public void removeStudent(int rollNumber) {
        for (Student student : students) {
            if (student.rollNumber == rollNumber) {
                students.remove(student);
                System.out.println("Student removed successfully!");
                return;
            }
        }
        System.out.println("Student not found!");
    }

    public void displayStudents() {
        for (Student student : students) {
            System.out.println("Name: " + student.name + ", Roll Number: " + student.rollNumber);
        }
    }

    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Display Students");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.next();
                    System.out.print("Enter roll number: ");
                    int rollNumber = scanner.nextInt();
                    studentManager.addStudent(name, rollNumber);
                    break;
                case 2:
                    System.out.print("Enter roll number to remove: ");
                    int rollNumberToRemove = scanner.nextInt();
                    studentManager.removeStudent(rollNumberToRemove);
                    break;
                case 3:
                    studentManager.displayStudents();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option!");
            }
        }
    }
}
