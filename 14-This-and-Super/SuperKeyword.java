public class SuperKeyword {

    static class Parent {

        int value = 10;

        void show() {

            System.out.println("Parent show()");
        }
    }

    static class Child extends Parent {

        int value = 20;

        @Override
        void show() {

            System.out.println("Child show()");
        }

        void display() {

            System.out.println("Child value: " + value);

            System.out.println("Parent value: " + super.value);

            super.show();
        }
    }

    public static void main(String[] args) {

        Child child = new Child();

        child.display();
    }
}