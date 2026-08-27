public class InstanceVariables {

    String name;
    int age;

    public static void main(String[] args) {

        InstanceVariables student1 = new InstanceVariables();
        InstanceVariables student2 = new InstanceVariables();

        student1.name = "Rahul";
        student1.age = 20;

        student2.name = "Amit";
        student2.age = 22;

        System.out.println("Student 1:");
        System.out.println(student1.name);
        System.out.println(student1.age);

        System.out.println();

        System.out.println("Student 2:");
        System.out.println(student2.name);
        System.out.println(student2.age);
    }
}