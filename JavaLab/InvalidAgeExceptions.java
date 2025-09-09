class InvalidAgeExceptions extends Exception{
        public InvalidAgeExceptions(String message) {
            super(message);
        }
    }

    class AgeValidator {
        static void validate(int age) throws InvalidAgeExceptions {
            if (age < 18) {
                throw new InvalidAgeExceptions("Age is not valid to vote.");
            } else {
                System.out.println("Welcome to vote!");
            }
        }

        public static void main(String[] args) {
            try {
                validate(16);
            } catch (InvalidAgeExceptions e) {
                System.out.println("Caught exception: " + e.getMessage());
            }
        }
    }
