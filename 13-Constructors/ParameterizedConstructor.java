public class ParameterizedConstructor {

    static class Student {

        String name;
        int age;

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

        Student student = new Student("Bharti", 24);

        student.display();
    }
}