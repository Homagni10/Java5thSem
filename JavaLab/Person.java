class Person {
        String name;
        int age;
    }

    class Teacher extends Person {
        String subject;
        double salary;

        Teacher(String n, int a, String s, double sal) {
            name = n;
            age = a;
            subject = s;
            salary = sal;
        }

        void display() {
            System.out.println(name + " " + age + " " + subject + " " + salary);
        }

        public static void main(String[] args) {
            Teacher t = new Teacher("Homagni", 25, "Math", 35000);
            t.display();
        }
    }

