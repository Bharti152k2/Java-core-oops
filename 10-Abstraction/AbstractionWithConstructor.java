public class AbstractionWithConstructor {

    abstract static class Animal {

        Animal() {

            System.out.println("Animal constructor");
        }

        abstract void sound();
    }

    static class Dog extends Animal {

        Dog() {

            System.out.println("Dog constructor");
        }

        @Override
        void sound() {

            System.out.println("Dog barks");
        }
    }

    public static void main(String[] args) {

        Dog dog = new Dog();

        dog.sound();
    }
}