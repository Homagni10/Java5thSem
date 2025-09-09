class Parent { }

    class Child extends Parent { }

    class Test2 {
        public static void main(String[] args) {
            Parent p = new Child();

            System.out.println(p instanceof Parent);
            System.out.println(p instanceof Child);
        }
    }

