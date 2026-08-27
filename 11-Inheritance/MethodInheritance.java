public class MethodInheritance {

    static class Parent {

        void show() {

            System.out.println("Method from Parent");
        }
    }

    static class Child extends Parent {

        void display() {

            System.out.println("Method from Child");
        }
    }

    public static void main(String[] args) {

        Child child = new Child();

        child.show();
        child.display();
    }
}