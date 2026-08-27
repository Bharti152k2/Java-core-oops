public class CompileTimePolymorphism {

    static class Calculator {

        int multiply(int a, int b) {

            return a * b;
        }

        double multiply(double a, double b) {

            return a * b;
        }

        int multiply(int a, int b, int c) {

            return a * b * c;
        }
    }

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        System.out.println(calculator.multiply(2, 3));

        System.out.println(calculator.multiply(2.5, 4.0));

        System.out.println(calculator.multiply(2, 3, 4));
    }
}