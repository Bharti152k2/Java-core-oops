public class ArrayTraversal {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("Using normal for loop:");

        for (int i = 0; i < numbers.length; i++) {

            System.out.println(numbers[i]);
        }

        System.out.println();

        System.out.println("Using enhanced for loop:");

        for (int number : numbers) {

            System.out.println(number);
        }
    }
}