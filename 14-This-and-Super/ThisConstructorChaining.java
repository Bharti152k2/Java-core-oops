public class ThisConstructorChaining {

    static class Student {

        String name;
        int age;

        Student() {

            this("Unknown");
        }

        Student(String name) {

            this(name, 0);
        }

        Student(String name, int age) {

            this.name = name;
            this.age = age;
        }

        void display() {

            System.out.println(name + " - " + age);
        }
    }

    public static void main(String[] args) {

        Student student = new Student();

        student.display();
    }
}