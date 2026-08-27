public class SuperConstructor {

    static class Parent {

        Parent() {

            System.out.println("Parent constructor");
        }

        Parent(int number) {

            System.out.println("Parent parameterized constructor: " + number);
        }
    }

    static class Child extends Parent {

        Child() {

            super(100);

            System.out.println("Child constructor");
        }
    }

    public static void main(String[] args) {

        Child child = new Child();
    }
}