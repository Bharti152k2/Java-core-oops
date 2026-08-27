public class CopyConstructor {

    static class Student {

        String name;
        int age;

        Student(String name, int age) {

            this.name = name;
            this.age = age;
        }

        Student(Student other) {

            this.name = other.name;
            this.age = other.age;
        }

        void display() {

            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        }
    }

    public static void main(String[] args) {

        Student student1 = new Student("Bharti", 24);

        Student student2 = new Student(student1);

        System.out.println("Student 1:");
        student1.display();

        System.out.println();

        System.out.println("Student 2:");
        student2.display();
    }
}