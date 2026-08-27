public class MultilevelInheritance {

    static class Animal {

        void eat() {

            System.out.println("Animal eats");
        }
    }

    static class Mammal extends Animal {

        void walk() {

            System.out.println("Mammal walks");
        }
    }

    static class Dog extends Mammal {

        void bark() {

            System.out.println("Dog barks");
        }
    }

    public static void main(String[] args) {

        Dog dog = new Dog();

        dog.eat();
        dog.walk();
        dog.bark();
    }
}