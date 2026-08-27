public class StaticVariables {

    static String college = "ABC College";

    String name;

    public static void main(String[] args) {

        StaticVariables student1 = new StaticVariables();
        StaticVariables student2 = new StaticVariables();

        student1.name = "Rahul";
        student2.name = "Amit";

        System.out.println(student1.name);
        System.out.println(student1.college);

        System.out.println();

        System.out.println(student2.name);
        System.out.println(student2.college);

        System.out.println();

        StaticVariables.college = "XYZ College";

        System.out.println(student1.college);
        System.out.println(student2.college);
    }
}