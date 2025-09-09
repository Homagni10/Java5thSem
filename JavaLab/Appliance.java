abstract class Appliance {
        // Abstract method
        abstract void start();
    }

    // Concrete class Fan
    class Fan extends Appliance {
        @Override
        void start() {
            System.out.println("Fan has started spinning.");
        }
    }

    // Concrete class WashingMachine
    class WashingMachine extends Appliance {
        @Override
        void start() {
            System.out.println("Washing machine has started washing clothes.");
        }
    }

    // Main class to test
    class Main {

        public static void main(String[] args) {
            // Using abstract class reference
            Appliance a1 = new Fan();
            Appliance a2 = new WashingMachine();

            a1.start(); // Calls Fan's start()
            a2.start(); // Calls WashingMachine's start()
        }
    }

