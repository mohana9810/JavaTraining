import java.util.*;

class Student {
    private String name;
    private int id;
    private Map<String, Double> grades;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.grades = new HashMap<>();
    }

    public void addGrade(String assignment, double score) {
        grades.put(assignment, score);
    }

    public Map<String, Double> getGrades() {
        return grades;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", grades=" + grades +
                '}';
    }
}

class Assignment {
    private String name;

    public Assignment(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class GradebookManager {
    private List<Student> students;
    private List<Assignment> assignments;

    public GradebookManager() {
        this.students = new ArrayList<>();
        this.assignments = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addAssignment(Assignment assignment) {
        assignments.add(assignment);
    }

    public void recordGrade(Student student, Assignment assignment, double score) {
        student.addGrade(assignment.getName(), score);
    }

    public void generateReport() {
        for (Student student : students) {
            System.out.println("Student: " + student.getName() + ", ID: " + student.getId());
            System.out.println("Grades:");
            for (Map.Entry<String, Double> entry : student.getGrades().entrySet()) {
                System.out.println("- " + entry.getKey() + ": " + entry.getValue());
            }
            System.out.println("-------------");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        GradebookManager manager = new GradebookManager();

      
        Student student1 = new Student("Alice", 1);
        Student student2 = new Student("Bob", 2);
        manager.addStudent(student1);
        manager.addStudent(student2);

      
        Assignment assignment1 = new Assignment("Homework 1");
        Assignment assignment2 = new Assignment("Homework 2");
        manager.addAssignment(assignment1);
        manager.addAssignment(assignment2);

   
        manager.recordGrade(student1, assignment1, 90.0);
        manager.recordGrade(student1, assignment2, 85.0);
        manager.recordGrade(student2, assignment1, 80.0);
        manager.recordGrade(student2, assignment2, 88.0);

     
        manager.generateReport();
    }
}