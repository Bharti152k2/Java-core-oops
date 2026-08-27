public class StaticVsInstanceMethod {

    public static void main(String[] args) {

        // Calling static method directly
        showStaticMessage();

        // Creating object for instance method
        StaticVsInstanceMethod obj =
                new StaticVsInstanceMethod();

        obj.showInstanceMessage();
    }

    static void showStaticMessage() {

        System.out.println("This is a static method.");
    }

    void showInstanceMessage() {

        System.out.println("This is an instance method.");
    }
}