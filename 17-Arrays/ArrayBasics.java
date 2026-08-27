public class ArrayBasics {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40};

        System.out.println("First element: " + numbers[0]);
        System.out.println("Second element: " + numbers[1]);

        numbers[1] = 50;

        System.out.println("Updated second element: " + numbers[1]);

        System.out.println("Array length: " + numbers.length);
    }
}