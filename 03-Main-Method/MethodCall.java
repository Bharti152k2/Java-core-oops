public class MethodCall {

    void display() {

        System.out.println("Non-static method called");
    }

    public static void main(String[] args) {

        MethodCall obj = new MethodCall();

        obj.display();
    }
}