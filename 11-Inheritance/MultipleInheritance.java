public class MultipleInheritance {

    interface A {

        void showA();
    }

    interface B {

        void showB();
    }

    static class C implements A, B {

        @Override
        public void showA() {

            System.out.println("Method from A");
        }

        @Override
        public void showB() {

            System.out.println("Method from B");
        }
    }

    public static void main(String[] args) {

        C object = new C();

        object.showA();
        object.showB();
    }
}