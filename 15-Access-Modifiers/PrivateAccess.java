public class PrivateAccess {

    static class Student {

        private int age = 24;

        void display() {

            System.out.println("Age: " + age);
        }
    }

    public static void main(String[] args) {

        Student student = new Student();

        student.display();

        // student.age = 25;
        // Error: age has private access
    }
}

//Understand:
//
//private → Same class only
//
//The main() method cannot directly access:
//
//student.age
//
//because main() belongs to PrivateAccess, not Student.