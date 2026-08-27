import java.io.IOException;

public class ThrowAndThrows {

    static void checkAge(int age) {

        if (age < 18) {

            throw new IllegalArgumentException("Age must be 18 or above");
        }

        System.out.println("Eligible");
    }

    static void readData() throws IOException {

        System.out.println("Method may throw IOException");
    }

    public static void main(String[] args) {

        try {

            checkAge(15);

        } catch (IllegalArgumentException e) {

            System.out.println(e.getMessage());
        }

        try {

            readData();

        } catch (IOException e) {

            System.out.println("IOException handled");
        }
    }
}