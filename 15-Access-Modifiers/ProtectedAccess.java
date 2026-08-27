public class ProtectedAccess {

    static class Parent {

        protected int number = 100;
    }

    static class Child extends Parent {

        void display() {

            System.out.println(number);

            System.out.println(super.number);
        }
    }

    public static void main(String[] args) {

        Child child = new Child();

        child.display();
    }
}