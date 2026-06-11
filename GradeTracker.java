import java.util.ArrayList;

public class GradeTracker {

    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(String name, double marks) {
        students.add(new Student(name, marks));
    }

    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No student records found.");
            return;
        }

        System.out.println("\n----- Student Records -----");

        for (Student student : students) {
            System.out.println(
                    "Name: " + student.getName() +
                            " | Marks: " + student.getMarks());
        }
    }

    public double getAverage() {
        if (students.isEmpty())
            return 0;

        double sum = 0;

        for (Student student : students) {
            sum += student.getMarks();
        }

        return sum / students.size();
    }

    public double getHighest() {
        if (students.isEmpty())
            return 0;

        double highest = students.get(0).getMarks();

        for (Student student : students) {
            if (student.getMarks() > highest) {
                highest = student.getMarks();
            }
        }

        return highest;
    }

    public double getLowest() {
        if (students.isEmpty())
            return 0;

        double lowest = students.get(0).getMarks();

        for (Student student : students) {
            if (student.getMarks() < lowest) {
                lowest = student.getMarks();
            }
        }

        return lowest;
    }
}
