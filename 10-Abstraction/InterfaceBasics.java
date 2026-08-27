public class InterfaceBasics {

    interface Vehicle {

        void start();
    }

    static class Car implements Vehicle {

        @Override
        public void start() {

            System.out.println("Car starts");
        }
    }

    public static void main(String[] args) {

        Vehicle vehicle = new Car();

        vehicle.start();
    }
}