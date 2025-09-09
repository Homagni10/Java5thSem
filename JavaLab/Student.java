import java.util.Scanner;
class Student {
        String name;
        int id;
        double marks;

        // Method to input details
        void inputDetails() {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter student name: ");
            name = sc.nextLine();

            System.out.print("Enter student ID: ");
            id = sc.nextInt();

            System.out.print("Enter student marks: ");
            marks = sc.nextDouble();
        }

        // Method to display details
        void displayDetails() {
            System.out.println("\n--- Student Details ---");
            System.out.println("Name: " + name);
            System.out.println("ID: " + id);
            System.out.println("Marks: " + marks);
        }
    }

    // Main class
    class StudentMain {
        public static void main(String[] args) {
            // Create object
            Student s1 = new Student();

            // Call methods
            s1.inputDetails();
            s1.displayDetails();
        }
    }
