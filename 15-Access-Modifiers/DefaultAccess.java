public class DefaultAccess {

    static class Student {

        int age = 24;
    }

    public static void main(String[] args) {

        Student student = new Student();

        System.out.println(student.age);
    }
}