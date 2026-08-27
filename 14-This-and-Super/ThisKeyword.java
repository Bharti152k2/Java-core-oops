public class ThisKeyword {

    static class Student {

        String name;
        int age;

        Student(String name, int age) {

            this.name = name;
            this.age = age;
        }

        void display() {

            System.out.println("Name: " + this.name);
            System.out.println("Age: " + this.age);
        }
    }

    public static void main(String[] args) {

        Student student = new Student("Bharti", 24);

        student.display();
    }
}

//this.name → instance variable