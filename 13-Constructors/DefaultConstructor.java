public class DefaultConstructor {

    static class Student {

        String name;
        int age;
    }

    public static void main(String[] args) {

        Student student = new Student();

        System.out.println("Name: " + student.name);
        System.out.println("Age: " + student.age);
    }
}

//Understand what happens when no constructor is written.
//
//Java provides a default constructor.
//
//The instance variables receive their default values:
//
//String → null
//int    → 0