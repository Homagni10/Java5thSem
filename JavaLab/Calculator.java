class Calculator {

        // Method to multiply two integers
        int multiply(int a, int b) {
            return a * b;
        }

        // Overloaded method to multiply two doubles
        double multiply(double a, double b) {
            return a * b;
        }
    }

    // Main class
    class OK {
        public static void main(String[] args) {
            Calculator calc = new Calculator();

            // Calling integer version
            int intResult = calc.multiply(5, 4);
            System.out.println("Multiplication of integers: 5 * 4 = " + intResult);

            // Calling double version
            double doubleResult = calc.multiply(5.5, 4.2);
            System.out.println("Multiplication of doubles: 5.5 * 4.2 = " + doubleResult);
        }
    }
