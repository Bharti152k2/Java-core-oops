public class AbstractMethod {

    abstract static class Shape {

        abstract void draw();
    }

    static class Circle extends Shape {

        @Override
        void draw() {

            System.out.println("Drawing Circle");
        }
    }

    static class Rectangle extends Shape {

        @Override
        void draw() {

            System.out.println("Drawing Rectangle");
        }
    }

    public static void main(String[] args) {

        Shape circle = new Circle();
        Shape rectangle = new Rectangle();

        circle.draw();
        rectangle.draw();
    }
}