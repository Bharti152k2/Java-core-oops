public class ArrayOperations {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        int sum = 0;
        int max = numbers[0];

        for (int number : numbers) {

            sum += number;

            if (number > max) {

                max = number;
            }
        }

        System.out.println("Sum: " + sum);
        System.out.println("Maximum: " + max);
    }
}