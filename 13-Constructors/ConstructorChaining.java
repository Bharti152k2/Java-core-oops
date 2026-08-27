public class ConstructorChaining {

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

            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        }
    }

    public static void main(String[] args) {

        Student student1 = new Student();

        Student student2 = new Student("Bharti");

        Student student3 = new Student("Rahul", 25);

        student1.display();

        student2.display();

        student3.display();
    }
}