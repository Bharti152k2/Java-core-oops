public class MainMethodParameters {

    public static void main(String[] args) {

        System.out.println("Number of arguments: " + args.length);

        for (int i = 0; i < args.length; i++) {
            System.out.println("args[" + i + "] = " + args[i]);
        }
    }
    
//    Run → Run Configurations → Arguments
//
//    For example, enter:
//
//    Hello Java 2026
//
//    Then the output will be similar to:
//
//    Number of arguments: 3
//    args[0] = Hello
//    args[1] = Java
//    args[2] = 2026
}