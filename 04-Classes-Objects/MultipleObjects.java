public class MultipleObjects {

    String name;
    int age;

    void display() {

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println();
    }

    public static void main(String[] args) {

        MultipleObjects student1 = new MultipleObjects();
        MultipleObjects student2 = new MultipleObjects();
        MultipleObjects student3 = new MultipleObjects();

        student1.name = "Rahul";
        student1.age = 20;

        student2.name = "Amit";
        student2.age = 21;

        student3.name = "Priya";
        student3.age = 19;

        student1.display();
        student2.display();
        student3.display();
    }
}