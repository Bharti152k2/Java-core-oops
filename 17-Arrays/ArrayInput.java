import java.util.Scanner;

public class ArrayInput {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter array size: ");

        int size = scanner.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter " + size + " numbers:");

        for (int i = 0; i < numbers.length; i++) {

            numbers[i] = scanner.nextInt();
        }

        System.out.println("Array elements:");

        for (int number : numbers) {

            System.out.print(number + " ");
        }

        scanner.close();
    }
}