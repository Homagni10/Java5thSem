public class Person1 {
        Person1() {
            System.out.println("Person constructor");
        }
    }

    class Employee extends Person {
        Employee() {
            System.out.println("Employee constructor");
        }
    }

    class Manager extends Employee {
        Manager() {
            System.out.println("Manager constructor");
        }

        public static void main(String[] args) {
            Manager m = new Manager();
        }
    }
