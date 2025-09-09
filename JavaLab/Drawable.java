interface Drawable {
        void draw();   // abstract method (no body)
    }

    // Implementing interface in Circle
    class Circle1 implements Drawable {
        @Override
        public void draw() {
            System.out.println("Drawing a Circle.");
        }
    }

    // Implementing interface in Square
    class Square implements Drawable {
        @Override
        public void draw() {
            System.out.println("Drawing a Square.");
        }
    }

    // Main class to test
    class Main1 {
        public static void main(String[] args) {
            // Using interface reference
            Drawable d1 = new Circle1();
            Drawable d2 = new Square();

            d1.draw();  // Calls Circle's implementation
            d2.draw();  // Calls Square's implementation
        }
    }
