public class ThisWithMethod {

    static class Student {

        String name;

        void show() {

            System.out.println("Student: " + this.name);
        }

        void display() {

            this.show();
        }
    }

    public static void main(String[] args) {

        Student student = new Student();

        student.name = "Bharti";

        student.display();
    }
}