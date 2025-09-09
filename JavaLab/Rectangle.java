import java.util.Scanner;
class Rectangle {
        double length;
        double breadth;

        // Method to input values
        void inputDimensions() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter length: ");
            length = sc.nextDouble();
            System.out.print("Enter breadth: ");
            breadth = sc.nextDouble();
        }

        // Method to calculate area
        double calculateArea() {
            return length * breadth;
        }

        // Method to calculate perimeter
        double calculatePerimeter() {
            return 2 * (length + breadth);
        }

        // Method to display details
        void display() {
            System.out.println("\n--- Rectangle Details ---");
            System.out.println("Length: " + length);
            System.out.println("Breadth: " + breadth);
            System.out.println("Area: " + calculateArea());
            System.out.println("Perimeter: " + calculatePerimeter());
        }
    }

    // Main class
    class RectangleMain {
        public static void main(String[] args) {
            Rectangle rect = new Rectangle();
            rect.inputDimensions();
            rect.display();
        }
    }
