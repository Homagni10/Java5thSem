class Shape {
        double area() {
            return 0;  // Default
        }
    }

    // Circle class
    class Circle extends Shape {
        double radius;
        Circle(double r) { radius = r; }

        double area() {
            return 3.14 * radius * radius;
        }
    }

    // Triangle class
    class Triangle extends Shape {
        double base, height;
        Triangle(double b, double h) { base = b; height = h; }

        double area() {
            return 0.5 * base * height;
        }
    }

    // Rectangle class
    class Rectangle1 extends Shape {
        double length, breadth;
        Rectangle1(double l, double b) { length = l; breadth = b; }

        double area() {
            return length * breadth;
        }
    }

    // Main class
    class AllShape {
        public static void main(String[] args) {
            Shape s;

            s = new Circle(5);
            System.out.println("Circle Area: " + s.area());

            s = new Triangle(10, 6);
            System.out.println("Triangle Area: " + s.area());

            s = new Rectangle1(8, 4);
            System.out.println("Rectangle Area: " + s.area());
        }
    }

