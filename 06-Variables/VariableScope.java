public class VariableScope {

    static int classVariable = 100;

    public static void main(String[] args) {

        int localVariable = 10;

        System.out.println("Local variable: " + localVariable);
        System.out.println("Static variable: " + classVariable);

        if (localVariable > 5) {

            int blockVariable = 20;

            System.out.println("Inside block:");
            System.out.println("Local variable: " + localVariable);
            System.out.println("Block variable: " + blockVariable);
            System.out.println("Static variable: " + classVariable);
        }

        System.out.println();
        System.out.println("Outside block:");
        System.out.println("Local variable: " + localVariable);
        System.out.println("Static variable: " + classVariable);

        // blockVariable cannot be accessed here
    }
}