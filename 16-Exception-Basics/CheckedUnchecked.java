import java.io.FileReader;
import java.io.IOException;

public class CheckedUnchecked {

    public static void main(String[] args) {

        // Checked exception

        try {

            FileReader file = new FileReader("test.txt");

            file.close();

        } catch (IOException e) {

            System.out.println("Checked exception: " + e.getMessage());
        }


        // Unchecked exception

        try {

            int result = 10 / 0;

            System.out.println(result);

        } catch (ArithmeticException e) {

            System.out.println("Unchecked exception: " + e.getMessage());
        }
    }
}