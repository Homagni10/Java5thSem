public class ArrayExceptionHandler {
        public static void main(String[] args) {
            int[] numbers = { 10, 20, 30 };
            try {
                int value = numbers[5]; // Invalid index
                System.out.println("Value: " + value);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Exception caught: Array index is out of bounds.");
            }
        }
    }
