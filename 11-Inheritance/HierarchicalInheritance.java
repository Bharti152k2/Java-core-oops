public class HierarchicalInheritance {

    static class Animal {

        void eat() {

            System.out.println("Animal eats");
        }
    }

    static class Dog extends Animal {

        void bark() {

            System.out.println("Dog barks");
        }
    }

    static class Cat extends Animal {

        void meow() {

            System.out.println("Cat meows");
        }
    }

    public static void main(String[] args) {

        Dog dog = new Dog();

        dog.eat();
        dog.bark();

        Cat cat = new Cat();

        cat.eat();
        cat.meow();
    }
}