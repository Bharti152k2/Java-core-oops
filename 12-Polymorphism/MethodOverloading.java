public class MethodOverloading {

    void display(int number) {

        System.out.println("Integer: " + number);
    }

    void display(String name) {

        System.out.println("String: " + name);
    }

    void display(int number, String name) {

        System.out.println("Number: " + number);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {

        MethodOverloading obj = new MethodOverloading();

        obj.display(10);
        obj.display("Bharti");
        obj.display(24, "Bharti");
    }
}