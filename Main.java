import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        GradeTracker tracker = new GradeTracker();

        while (true) {

            System.out.println("\n===== Student Grade Tracker =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Show Average Marks");
            System.out.println("4. Show Highest Marks");
            System.out.println("5. Show Lowest Marks");
            System.out.println("6. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Student Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Marks: ");
                    double marks = sc.nextDouble();

                    tracker.addStudent(name, marks);

                    System.out.println("Student Added Successfully!");
                    break;

                case 2:
                    tracker.displayStudents();
                    break;

                case 3:
                    System.out.printf(
                            "Average Marks: %.2f%n",
                            tracker.getAverage());
                    break;

                case 4:
                    System.out.println(
                            "Highest Marks: " +
                                    tracker.getHighest());
                    break;

                case 5:
                    System.out.println(
                            "Lowest Marks: " +
                                    tracker.getLowest());
                    break;

                case 6:
                    System.out.println("Thank You!");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}