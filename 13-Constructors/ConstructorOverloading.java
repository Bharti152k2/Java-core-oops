public class ConstructorOverloading {

    static class Student {

        String name;
        int age;

        Student() {

            name = "Unknown";
            age = 0;
        }

        Student(String name) {

            this.name = name;
            age = 0;
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

        Student student1 = new Student();
        Student student2 = new Student("Bharti");
        Student student3 = new Student("Rahul", 25);

        student1.display();
        student2.display();
        student3.display();
    }
}