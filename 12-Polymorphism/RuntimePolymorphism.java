public class RuntimePolymorphism {

    static class Animal {

        void sound() {

            System.out.println("Animal makes a sound");
        }
    }

    static class Dog extends Animal {

        @Override
        void sound() {

            System.out.println("Dog barks");
        }
    }

    static class Cat extends Animal {

        @Override
        void sound() {

            System.out.println("Cat meows");
        }
    }

    public static void main(String[] args) {

        Animal animal;

        animal = new Dog();
        animal.sound();

        animal = new Cat();
        animal.sound();
    }
}