public class AbstractClass {

    abstract static class Animal {

        abstract void sound();

        void sleep() {

            System.out.println("Animal is sleeping");
        }
    }

    static class Dog extends Animal {

        @Override
        void sound() {

            System.out.println("Dog barks");
        }
    }

    public static void main(String[] args) {

        Animal animal = new Dog();

        animal.sound();
        animal.sleep();
    }
}

//Abstract Class
//↓
//Animal
//↓
//Concrete Subclass
//↓
//Dog