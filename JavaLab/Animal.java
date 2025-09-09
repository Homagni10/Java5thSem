public class Animal {
        void sound() {
            System.out.println("Animal sound");
        }
    }

    class Dog extends Animal {
        void sound() {
            System.out.println("Woof");
        }
    }

    class Cat extends Animal {
        void sound() {
            System.out.println("Meow");
        }
    }

    class Cow extends Animal {
        void sound() {
            System.out.println("Moo");
        }
    }

    class Test1{
        public static void main(String[] args) {
            Animal a;
            a = new Dog(); a.sound();
            a = new Cat(); a.sound();
            a = new Cow(); a.sound();
        }
    }
