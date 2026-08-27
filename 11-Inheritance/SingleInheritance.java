public class SingleInheritance {

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

    public static void main(String[] args) {

        Dog dog = new Dog();

        dog.eat();
        dog.bark();
    }
}