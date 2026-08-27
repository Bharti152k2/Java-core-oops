public class MultipleInterfaces {

    interface Printable {

        void print();
    }

    interface Scannable {

        void scan();
    }

    static class Machine implements Printable, Scannable {

        @Override
        public void print() {

            System.out.println("Printing...");
        }

        @Override
        public void scan() {

            System.out.println("Scanning...");
        }
    }

    public static void main(String[] args) {

        Machine machine = new Machine();

        machine.print();
        machine.scan();
    }
}