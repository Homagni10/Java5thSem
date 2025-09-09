import java.util.Scanner;
class StudentDetails {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter name: ");
            String name = sc.nextLine();

            System.out.print("Enter roll number: ");
            int roll = sc.nextInt();

            System.out.print("Enter marks in 3 subjects: ");
            int m1 = sc.nextInt();
            int m2 = sc.nextInt();
            int m3 = sc.nextInt();

            int total = m1 + m2 + m3;
            double avg = total / 3.0;

            System.out.println("Name: " + name);
            System.out.println("Roll: " + roll);
            System.out.println("Total Marks: " + total);
            System.out.println("Average: " + avg);

            sc.close();
        }
    }
